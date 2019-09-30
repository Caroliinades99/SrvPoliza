package coop.equidad.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.ParameterMode;
import javax.persistence.Persistence;
import javax.persistence.StoredProcedureQuery;

import coop.equidad.config.ConfigProperties;
import coop.equidad.servicios.constantes.CONSTANTES;


public class PrCotPersonasDao {
	private static final EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory(ConfigProperties.getProp("persistenceUnit"));
	private EntityManager em;
	
	
	public Object spPrCotPersonas(String w_sucur, String w_certif, String w_codpla, String w_identificacion, float w_comision, String w_vinculo, int w_parentesco, String w_user) {
		Object w_ind = null;

		em = emf.createEntityManager();
		 
		StoredProcedureQuery storedProcedure = em.createStoredProcedureQuery(CONSTANTES.PR_COTPERSONAS);
		
        storedProcedure.registerStoredProcedureParameter("w_sucur", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_certif", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_codpla", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_identificacion", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_comision", Float.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_vinculo", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_parentesco", Integer.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_user", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_ind", String.class, ParameterMode.OUT);
        
        storedProcedure.setParameter("w_sucur", w_sucur);
        storedProcedure.setParameter("w_certif", w_certif);
        storedProcedure.setParameter("w_codpla", w_codpla);
        storedProcedure.setParameter("w_identificacion", w_identificacion);
        storedProcedure.setParameter("w_comision", w_comision);
        storedProcedure.setParameter("w_vinculo", w_vinculo);
        storedProcedure.setParameter("w_parentesco", w_parentesco);
        storedProcedure.setParameter("w_user", w_user);
        storedProcedure.execute();
        
        w_ind = storedProcedure.getOutputParameterValue("w_ind");        
        
        em.close();
		return w_ind;
	}
		
}
