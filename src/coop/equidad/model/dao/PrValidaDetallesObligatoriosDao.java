package coop.equidad.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.ParameterMode;
import javax.persistence.Persistence;
import javax.persistence.StoredProcedureQuery;

import coop.equidad.config.ConfigProperties;
import coop.equidad.servicios.constantes.CONSTANTES;



public class PrValidaDetallesObligatoriosDao {
	private static final EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory(ConfigProperties.getProp("persistenceUnit"));
	private EntityManager em;
	
	/**
	 * 
	 * @param w_sucur
	 * @param w_certif
	 * @param w_codpla
	 * @return
	 */
	public String spValidaDetallesObligatorios(String w_sucur, String w_certif, String w_codpla) {
		String ccampo = null;
		
		em = emf.createEntityManager();
		 
		StoredProcedureQuery storedProcedure = em.createStoredProcedureQuery(CONSTANTES.PR_VALIDA_DETALLES_OBLIGATORIOS);
		
        storedProcedure.registerStoredProcedureParameter("w_sucur", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_certif", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_codpla", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_ind", String.class, ParameterMode.OUT);
        
        storedProcedure.setParameter("w_sucur", w_sucur);
        storedProcedure.setParameter("w_certif", w_certif);
        storedProcedure.setParameter("w_codpla", w_codpla);
        storedProcedure.execute();
        
        ccampo = storedProcedure.getOutputParameterValue("w_ind").toString();
		
        em.close();
		return ccampo;
	}
		
}
