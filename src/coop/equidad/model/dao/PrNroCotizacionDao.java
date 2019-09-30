package coop.equidad.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.ParameterMode;
import javax.persistence.Persistence;
import javax.persistence.StoredProcedureQuery;

import coop.equidad.config.ConfigProperties;
import coop.equidad.servicios.constantes.CONSTANTES;


public class PrNroCotizacionDao {
	private static final EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory(ConfigProperties.getProp("persistenceUnit"));
	private EntityManager em;
	
	/**
	 * @return consec nro cot, add AA, 8 digits
	 * */
	public String spPrNroCotizacion(String w_cia, String w_tipo) {
		String w_nrocotiza = null;

		em = emf.createEntityManager();
		 
		StoredProcedureQuery storedProcedure = em.createStoredProcedureQuery(CONSTANTES.PR_NROCOTIZACION);
		
        storedProcedure.registerStoredProcedureParameter("w_cia", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_tipo", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_nrocotiza", String.class, ParameterMode.OUT);
        
        storedProcedure.setParameter("w_cia", w_cia);
        storedProcedure.setParameter("w_tipo", w_tipo);        
        storedProcedure.execute();
        
        w_nrocotiza = storedProcedure.getOutputParameterValue("w_nrocotiza").toString();
        
        em.close();	
		return w_nrocotiza;
	}
		
}
