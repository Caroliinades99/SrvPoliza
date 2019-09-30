package coop.equidad.model.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import coop.equidad.config.ConfigProperties;
import coop.equidad.model.entity.CaratulaPK;
import coop.equidad.model.entity.OsCaratula;
import coop.equidad.servicios.utils.UtilCommon;
import coop.equidad.servicios.utils.UtilVal;

public class OsCaratulaDao {
	protected static final EntityManagerFactory emf = Persistence
			.createEntityManagerFactory(ConfigProperties.getProp("persistenceUnit"));
	protected EntityManager em;

	/**
	 * 
	 * @param w_sucur
	 * @param w_codpla
	 * @param w_certif
	 * @param orden
	 * @return
	 */
	public OsCaratula getCaratula(String w_sucur, String w_codpla, String w_certif, int orden) {
		CaratulaPK caratulaPK = new CaratulaPK(w_sucur, w_codpla, w_certif, UtilCommon.getBigDecimalFromInt(orden));

		em = emf.createEntityManager();
		OsCaratula osCaratula = (OsCaratula) em.find(OsCaratula.class, caratulaPK);

		em.close();
		return osCaratula;
	}

	/**
	 * 
	 * @param osCaratula
	 */
	public void setCaratula(OsCaratula osCaratula) {
		EntityTransaction transaccion = null;

		em = emf.createEntityManager();
		transaccion = em.getTransaction();
		transaccion.begin();

		em.merge(osCaratula);

		transaccion.commit();
		em.close();
	}

	/**
	 * 
	 * @param w_asegurado
	 * @param w_sucur
	 * @param w_poliza
	 * @param w_certif
	 * @param w_codpla
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<OsCaratula> getCaratulasByParams(Long w_asegurado, String w_sucur, String w_poliza, String w_certif,
			String w_codpla) {
		em = emf.createEntityManager();
		StringBuilder sqsStr = new StringBuilder("SELECT * FROM osiris.s03201 WHERE 1=1");

		if (!UtilVal.validaVacioLongZero(w_asegurado)) {
			sqsStr.append(" AND asegurado = '" + w_asegurado.intValue() + "'");
		}

		if (!UtilVal.validaString(w_sucur)) {
			sqsStr.append(" AND sucur = '" + w_sucur + "'");
		}

		if (!UtilVal.validaString(w_poliza)) {
			sqsStr.append(" AND poliza = '" + w_poliza + "'");
		}

		if (!UtilVal.validaString(w_certif)) {
			sqsStr.append(" AND certif = '" + w_certif + "'");
		}

		if (!UtilVal.validaString(w_codpla)) {
			sqsStr.append(" AND codpla = '" + w_codpla + "'");
		}

		sqsStr.append(" AND ROWNUM <= " + ConfigProperties.getProp("dao.maxresult"));

		Query query = em.createNativeQuery(sqsStr.toString(), OsCaratula.class);
		List<OsCaratula> osCaratulas = (List<OsCaratula>) query.getResultList();

		em.close();
		return osCaratulas;
	}

	/**
	 * 
	 * @param w_sucur
	 * @param w_codpla
	 * @param w_certif
	 * @param w_orden
	 * @return
	 */
	public long getNumRegsCotizacion(String w_sucur, String w_codpla, String w_certif, BigDecimal w_orden) {
		long regsPoliza = 0;

		em = emf.createEntityManager();
		Query query = em.createNamedQuery("OsCaratula.countByKey");
		query.setParameter("sucur", w_sucur);
		query.setParameter("codpla", w_codpla);
		query.setParameter("certif", w_certif);
		query.setParameter("orden", w_orden);

		regsPoliza = (Long) query.getSingleResult();

		em.close();
		return regsPoliza;
	}

	/**
	 * 
	 * @param w_sucur
	 * @param w_codpla
	 * @param w_certif
	 * @param w_orden
	 * @return
	 */
	public OsCaratula getCaratula(String w_sucur, String w_codpla, String w_certif, BigDecimal w_orden) {
		List<OsCaratula> regsPoliza = null;

		em = emf.createEntityManager();
		Query query = em.createNamedQuery("OsCaratula.getCaratula");
		query.setParameter("sucur", w_sucur);
		query.setParameter("codpla", w_codpla);
		query.setParameter("certif", w_certif);
		query.setParameter("orden", w_orden);

		regsPoliza = (List<OsCaratula>) query.getResultList();
		if (regsPoliza != null && regsPoliza.size() > 0)
			return regsPoliza.get(0);
		em.close();
		return null;
	}
}
