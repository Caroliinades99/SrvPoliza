package coop.equidad.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.ParameterMode;
import javax.persistence.Persistence;
import javax.persistence.StoredProcedureQuery;

import coop.equidad.config.ConfigProperties;
import coop.equidad.servicios.constantes.CONSTANTES;


public class PrSeguridadDao {
	private static final EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory(ConfigProperties.getProp("persistenceUnit"));
	private EntityManager em;
	
	/**
	 * 
	 * @param w_usuario
	 * @param w_codpla
	 * @param w_vaseg
	 * @return
	 */
	public String spPrSeguridad(String w_usuario, String w_codpla, float w_vaseg) {
		String w_ind = null;

		em = emf.createEntityManager();
		 
		StoredProcedureQuery storedProcedure = em.createStoredProcedureQuery(CONSTANTES.PR_SEGURIDAD);
		
        storedProcedure.registerStoredProcedureParameter("w_usuario", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_codpla", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_vaseg", Float.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_ind", String.class, ParameterMode.OUT);
        
        storedProcedure.setParameter("w_usuario", w_usuario);
        storedProcedure.setParameter("w_codpla", w_codpla);
        storedProcedure.setParameter("w_vaseg", w_vaseg);
        storedProcedure.execute();
        
        w_ind = storedProcedure.getOutputParameterValue("w_ind").toString();
		
        em.close();
		return w_ind;
	}
		
}
