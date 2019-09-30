package coop.equidad.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.ParameterMode;
import javax.persistence.Persistence;
import javax.persistence.StoredProcedureQuery;

import coop.equidad.config.ConfigProperties;
import coop.equidad.servicios.constantes.CONSTANTES;


public class PrPersonasDao {
	private static final EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory(ConfigProperties.getProp("persistenceUnit"));
	private EntityManager em;
	
	/**
	 * 
	 * @param w_identificacion
	 * @param w_nombre
	 * @param w_sexo
	 * @param w_tipo
	 * @param w_fecha_nacimiento
	 */
	public Object spPrPersonas(String w_identificacion, String w_nombre, String w_sexo, String w_tipo, String w_fecha_nacimiento, String w_vinculo, String w_user) {
		Object w_ind = null;

		em = emf.createEntityManager();
		 
		StoredProcedureQuery storedProcedure = em.createStoredProcedureQuery(CONSTANTES.PR_PERSONAS);
		
        storedProcedure.registerStoredProcedureParameter("w_identificacion", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_nombre", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_sexo", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_tipo", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_fecha_nacimiento", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_vinculo", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_user", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_ind", String.class, ParameterMode.OUT);
        
        storedProcedure.setParameter("w_identificacion", w_identificacion);
        storedProcedure.setParameter("w_nombre", w_nombre);
        storedProcedure.setParameter("w_sexo", w_sexo);
        storedProcedure.setParameter("w_tipo", w_tipo);
        storedProcedure.setParameter("w_fecha_nacimiento", w_fecha_nacimiento);
        storedProcedure.setParameter("w_vinculo", w_vinculo);
        storedProcedure.setParameter("w_user", w_user);
        storedProcedure.execute();
        
        w_ind = storedProcedure.getOutputParameterValue("w_ind");        
        
        em.close();
		return w_ind;
	}
		
}
