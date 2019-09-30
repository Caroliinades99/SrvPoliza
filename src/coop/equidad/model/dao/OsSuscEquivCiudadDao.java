package coop.equidad.model.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import coop.equidad.config.ConfigProperties;
import coop.equidad.model.entity.S03010;
import coop.equidad.model.entity.S03sarlaft;
import coop.equidad.model.entity.SuscEquivCiudade;
import coop.equidad.servicios.constantes.CONSTANTES;
import coop.equidad.web.entity.Permiso;
import coop.laequidad.entity.S03080;

public class OsSuscEquivCiudadDao {
	private static final EntityManagerFactory emf = Persistence
			.createEntityManagerFactory(ConfigProperties.getProp("persistenceUnit"));
	private EntityManager em;

	/**
	 * 
	 * @param w_coddane
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public String getCodSucursal(String w_coddane) {
		String codSucursal = null;
		em = emf.createEntityManager();

		Query query = em.createNamedQuery("SuscEquivCiudade.getCodSucursal", String.class);
		query.setParameter("codDane", w_coddane);
		query.setMaxResults(CONSTANTES.MAX_RESULT_SINGLE);

		List<Object> codsSucursal = query.getResultList();

		if (codsSucursal.size() != 0) {
			codSucursal = (String) codsSucursal.get(0);
		}

		em.close();
		return codSucursal;
	}

	/**
	 * 
	 * @param w_coddane
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<SuscEquivCiudade> getCodSucursales() {
		List<SuscEquivCiudade> lista = null;
		try {
			em = emf.createEntityManager();
			Query query = em.createQuery("select p from SuscEquivCiudade p ");
			lista = (List<SuscEquivCiudade>) query.getResultList();

		} catch (Exception e) {

			e.printStackTrace();
		}
		return lista;
	}

	public List<S03080> getCabezaParametros() {

		try {
			em = emf.createEntityManager();
			Query query = em.createQuery("SELECT r FROM S03080 r ");

			List<S03080> ListaParametros = (List<S03080>) query.getResultList();

			return ListaParametros;
		} catch (Exception e) {

			e.printStackTrace();
		}
		return null;

	}

	public boolean getSaltarSarlaf(String codigo) {

		try {
			em = emf.createEntityManager();
			Query query = em.createNativeQuery("select a.* from osiris.s03502 a where codigo='" + codigo
					+ "' and coddet='0000858' and current_date < a.valdate");// arg0)("SELECT
																				// r
																				// FROM
																				// S03sarlaft
																				// r
																				// where
																				// r.codigo=:cod");

			// query.setParameter("cod", codigo);

			List<Object> ListaDetalles = (List<Object>) query.getResultList();
			if (ListaDetalles.size() > 0)
				return true;

			return false;

		} catch (Exception e) {

			e.printStackTrace();
		}
		return false;

	}

	public boolean getSarlaf(String codigo) {

		try {
			em = emf.createEntityManager();
			Query query = em.createNativeQuery("select a.* from osiris.s03sarlaft a where codigo='" + codigo
					+ "' and current_date between a.fecvincula and a.fecvincula+365");// arg0)("SELECT
																						// r
																						// FROM
																						// S03sarlaft
																						// r
																						// where
																						// r.codigo=:cod");

			// query.setParameter("cod", codigo);

			List<Object> ListaDetalles = (List<Object>) query.getResultList();
			if (ListaDetalles.size() > 0)
				return true;

			return false;

		} catch (Exception e) {

			e.printStackTrace();
		}
		return false;

	}

	public List<S03010> getDetalleParametros(String tipo, BigDecimal clase) {

		try {
			em = emf.createEntityManager();
			Query query = em
					.createQuery("SELECT r FROM S03010 r where r.s03010PK.tipo=:tipo and r.s03010PK.clase=:clase");

			query.setParameter("tipo", tipo);
			query.setParameter("clase", clase);

			List<S03010> ListaDetalles = (List<S03010>) query.getResultList();

			return ListaDetalles;

		} catch (Exception e) {

			e.printStackTrace();
		}
		return null;

	}

	public List<S03010> getDetalleParametrosPorCodigo(String tipo, BigDecimal clase, String codigo) {

		try {
			em = emf.createEntityManager();
			Query query = em
					.createQuery("SELECT r FROM S03010 r where r.s03010PK.tipo=:tipo and r.s03010PK.clase=:clase and r.s03010PK.codigo=:codigo");

			query.setParameter("tipo", tipo);
			query.setParameter("clase", clase);
			query.setParameter("codigo", codigo);

			List<S03010> ListaDetalles = (List<S03010>) query.getResultList();

			return ListaDetalles;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}
}
