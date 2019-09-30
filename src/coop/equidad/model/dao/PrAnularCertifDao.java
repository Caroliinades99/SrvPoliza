package coop.equidad.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.ParameterMode;
import javax.persistence.Persistence;
import javax.persistence.StoredProcedureQuery;

import coop.equidad.config.ConfigProperties;
import coop.equidad.servicios.constantes.CONSTANTES;

public class PrAnularCertifDao {
	private static final EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory(ConfigProperties.getProp("persistenceUnit"));
	private EntityManager em;
	
	/**
	 * 
	 * @param w_sucur
	 * @param w_poliza
	 * @param w_certif
	 * @param w_codpla
	 * @param w_causa
	 * @return
	 */
	public int spPrAnularCertif(String w_sucur, String w_poliza, String w_certif, String w_codpla, String w_user) {
		em = emf.createEntityManager();
		int w_ind = CONSTANTES.RESP_SP_CAN_ERR;
		 
		StoredProcedureQuery storedProcedure = em.createStoredProcedureQuery(CONSTANTES.PR_ANULAR_CERTIF);
		
        storedProcedure.registerStoredProcedureParameter("sucursal", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("producto", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("poliza", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("certificado", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("user", String.class, ParameterMode.IN);
        
        storedProcedure.registerStoredProcedureParameter("CodeError", Integer.class, ParameterMode.OUT);
        
        storedProcedure.setParameter("sucursal", w_sucur);
        storedProcedure.setParameter("producto", w_codpla);
        storedProcedure.setParameter("poliza", w_poliza);
        storedProcedure.setParameter("certificado", w_certif);
        storedProcedure.setParameter("user", w_user);
        storedProcedure.execute();
        
        Object o_ind = storedProcedure.getOutputParameterValue("CodeError");
        
        if( o_ind != null ) {
        	 w_ind = Integer.valueOf(o_ind.toString());
        }        
		
        em.close();
		return w_ind;
	}
}
