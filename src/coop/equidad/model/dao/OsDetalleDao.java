package coop.equidad.model.dao;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import coop.equidad.config.ConfigProperties;
import coop.equidad.model.entity.OsDetalle;
import coop.laequidad.entity.S03104;
import coop.laequidad.entity.S03105;

public class OsDetalleDao {
	private static final EntityManagerFactory emf = Persistence
			.createEntityManagerFactory(ConfigProperties.getProp("persistenceUnit"));
	private EntityManager em;

	@SuppressWarnings("unchecked")
	public List<OsDetalle> getDetallesByPoliza(String w_sucur, String w_codpla, String w_certif, BigDecimal w_orden) {
		em = emf.createEntityManager();
		Query query = em.createNamedQuery("OsDetalle.findByPoliza", OsDetalle.class);
		query.setParameter("sucur", w_sucur);
		query.setParameter("codpla", w_codpla);
		query.setParameter("certif", w_certif);
		query.setParameter("orden", w_orden);

		List<OsDetalle> osDetalles = (List<OsDetalle>) query.getResultList();

		em.close();
		return osDetalles;
	}

	/**
	 * 
	 * @param w_sucur
	 * @param w_codpla
	 * @param w_certif
	 * @param coddet
	 * @return
	 */
	public long getNumDetallesByKey(String w_sucur, String w_codpla, String w_certif, String w_coddet) {
		long numDetalles = 0;

		em = emf.createEntityManager();
		Query query = em.createNamedQuery("OsDetalle.numDetallesByKey", OsDetalle.class);
		query.setParameter("sucur", w_sucur);
		query.setParameter("codpla", w_codpla);
		query.setParameter("certif", w_certif);
		query.setParameter("coddet", w_coddet);

		numDetalles = (Long) query.getSingleResult();

		em.close();
		return numDetalles;
	}

	/**
	 * 
	 * @param osDetalle
	 */
	public void crearDetalle(OsDetalle osDetalle) {
		EntityTransaction transaccion = null;

		em = emf.createEntityManager();
		transaccion = em.getTransaction();
		transaccion.begin();

		em.persist(osDetalle);

		transaccion.commit();
		em.close();
	}

	/**
	 * 
	 * @param osDetalles
	 */
	public void setDetalles(List<OsDetalle> osDetalles) {
		EntityTransaction transaccion = null;

		em = emf.createEntityManager();
		transaccion = em.getTransaction();
		transaccion.begin();

		for (OsDetalle osDetalle : osDetalles) {
			em.merge(osDetalle);
		}

		transaccion.commit();
		em.close();
	}

	public List<S03105> getValoresDetalleByKey() {

		em = emf.createEntityManager();
		Query query = em.createQuery("select a from S03105 a where a.s03105Pk.codpad !=null");

		List<S03105> result = (List<S03105>) query.getResultList();

		em.close();
		return result;
	}

	public List<S03104> getDetalleName() {

		em = emf.createEntityManager();
		Query query = em.createQuery("select a from S03104 a");

		List<S03104> result = (List<S03104>) query.getResultList();

		em.close();
		return result;
	}

	public Map<String, String> planesCompania() {

		Map<String, String> planesComp = new HashMap<String, String>();

		try {
			em = emf.createEntityManager();
			Query query = em.createNativeQuery("SELECT codpla, codcia FROM osiris.s03102  ");

			List<Object[]> lista = (List<Object[]>) query.getResultList();
			for (Object[] obj : lista) {

				planesComp.put((String) obj[0], (String) obj[1]);

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return planesComp;

	}
}
