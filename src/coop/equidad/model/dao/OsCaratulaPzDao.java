package coop.equidad.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import coop.equidad.config.ConfigProperties;
import coop.equidad.model.entity.CaratulaPK;
import coop.equidad.model.entity.OsCaratulaPz;
import coop.equidad.servicios.utils.UtilCommon;
import coop.equidad.servicios.utils.UtilVal;

public class OsCaratulaPzDao {
	private static final EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory(ConfigProperties.getProp("persistenceUnit"));
	private EntityManager em;	
	
	/**
	 * 
	 * @param w_sucur
	 * @param w_codpla
	 * @param w_certif
	 * @param w_poliza
	 * @return
	 */
	public OsCaratulaPz getCaratula(String w_sucur, String w_codpla, String w_certif, int w_orden) {
		CaratulaPK caratulaPzPK = new CaratulaPK(w_sucur, w_codpla, w_certif, 
				UtilCommon.getBigDecimalFromInt(w_orden));
		
		em = emf.createEntityManager();
		OsCaratulaPz osCaratula = (OsCaratulaPz)em.find(OsCaratulaPz.class, caratulaPzPK);
    	
		em.close();
    	return osCaratula; 	
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
	public List<OsCaratulaPz> getCaratulasByParams( String w_asegurado, String w_sucur, String w_poliza, String w_certif, String w_codpla, String w_cotizacion ) {			
		em = emf.createEntityManager();		
		StringBuilder sqsStr = new StringBuilder("SELECT * FROM osiris.s03020 WHERE orden=1");
		
		if( !UtilVal.validaString(w_asegurado) ) {
			sqsStr.append(" AND asegurado = '" + w_asegurado + "'");
		}		
		
		if( !UtilVal.validaString(w_sucur) ) {
			sqsStr.append(" AND sucur = '" + w_sucur + "'");
		}
		
		if( !UtilVal.validaString(w_poliza) ) {
			sqsStr.append(" AND poliza = '" + w_poliza + "'");
		}
		
		if( !UtilVal.validaString(w_certif) ) {
			sqsStr.append(" AND certif = '" + w_certif + "'");
		}
		
		if( !UtilVal.validaString(w_codpla) ) {
			sqsStr.append(" AND codpla = '" + w_codpla + "'");
		}

		if( !UtilVal.validaString(w_cotizacion) ) {
			sqsStr.append(" AND COTIZACION = '" + w_cotizacion + "'");
		}
		
		
		
		sqsStr.append(" AND ROWNUM <= " + ConfigProperties.getProp("dao.maxresult"));
		
		Query query = em.createNativeQuery(sqsStr.toString(), OsCaratulaPz.class);
		List<OsCaratulaPz> osCaratulas = (List<OsCaratulaPz>)query.getResultList();  	
		
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
	public long getNumRegsPoliza( String w_sucur, String w_codpla, String w_certif, int w_orden ) {
		long regsPoliza = 0;
		
		em = emf.createEntityManager();
		Query query = em.createNamedQuery("OsCaratulaPz.countByKey");
		query.setParameter("sucur", w_sucur);
		query.setParameter("codpla", w_codpla);
		query.setParameter("certif", w_certif);
		query.setParameter("orden", w_orden);
		
		regsPoliza = (Long)query.getSingleResult();
		
		em.close();
		return regsPoliza;
	}
	
	/**
	 * 
	 * @param w_sucur
	 * @param w_codpla
	 * @param w_certif
	 * @param w_poliza
	 * @return
	 */
	public long getNumRegsPoliza( String w_sucur, String w_codpla, String w_certif, String w_poliza, String w_user) {
		long regsPoliza = 0;
		
		em = emf.createEntityManager();
		Query query = em.createNamedQuery("OsCaratulaPz.countByPoliza");
		query.setParameter("sucur", w_sucur);
		query.setParameter("codpla", w_codpla);
		query.setParameter("certif", w_certif);
		query.setParameter("poliza", w_poliza);
		query.setParameter("usuario", w_user);
		regsPoliza = (Long)query.getSingleResult();
		
		em.close();
		return regsPoliza;
	}
}
