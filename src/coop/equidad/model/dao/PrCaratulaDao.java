package coop.equidad.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.ParameterMode;
import javax.persistence.Persistence;
import javax.persistence.StoredProcedureQuery;

import coop.equidad.config.ConfigProperties;
import coop.equidad.servicios.constantes.CONSTANTES;

public class PrCaratulaDao {
	private static final EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory(ConfigProperties.getProp("persistenceUnit"));
	private EntityManager em;
	
	/**
	 * 
	 * @param w_sucur
	 * @param w_certif
	 * @param w_codpla
	 * @param w_fecini
	 * @param w_fecfin
	 */
	public Object spPrCaratula(String w_sucur, String w_certif, String w_codpla, String w_tomador, String w_asegurado,
			String w_beneficiario, String w_agente, String w_vaseg, String w_fecini, String w_fecter, long w_dias, float w_comision, String w_user) {
		Object w_ind = null;

		em = emf.createEntityManager();
		 
		StoredProcedureQuery storedProcedure = em.createStoredProcedureQuery(CONSTANTES.PR_CARATULA);
		
        storedProcedure.registerStoredProcedureParameter("w_sucur", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_certif", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_codpla", String.class, ParameterMode.IN);        
        storedProcedure.registerStoredProcedureParameter("w_tomador", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_asegurado", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_beneficiario", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_agente", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_vaseg", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_fecini", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_fecter", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_dias", Long.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_comision", Float.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_user", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_ind", String.class, ParameterMode.OUT);
        
        storedProcedure.setParameter("w_sucur", w_sucur);
        storedProcedure.setParameter("w_certif", w_certif);
        storedProcedure.setParameter("w_codpla", w_codpla); 
        storedProcedure.setParameter("w_tomador", w_tomador);
        storedProcedure.setParameter("w_asegurado", w_asegurado);
        storedProcedure.setParameter("w_beneficiario", w_beneficiario);
        storedProcedure.setParameter("w_agente", w_agente);
        storedProcedure.setParameter("w_vaseg", w_vaseg);
        storedProcedure.setParameter("w_fecini", w_fecini);
        storedProcedure.setParameter("w_fecter", w_fecter);
        storedProcedure.setParameter("w_dias", w_dias);
        storedProcedure.setParameter("w_comision", w_comision);
        storedProcedure.setParameter("w_user", w_user);
        storedProcedure.execute();
        
        w_ind = storedProcedure.getOutputParameterValue("w_ind");
		
        em.close();
		return w_ind;
	}
}
