package coop.equidad.model.dao;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.ParameterMode;
import javax.persistence.Persistence;
import javax.persistence.StoredProcedureQuery;

import coop.equidad.config.ConfigProperties;
import coop.equidad.servicios.constantes.CONSTANTES;

public class PrCoberturasDao {
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
	public Object spPrCoberturas(String w_sucur, String w_certif, String w_codpla, String w_fecini, String w_fecfin, String w_user) {
		Object w_ind = null;

		em = emf.createEntityManager();
		 
		StoredProcedureQuery storedProcedure = em.createStoredProcedureQuery(CONSTANTES.PR_COBERTURAS);
		
        storedProcedure.registerStoredProcedureParameter("w_sucur", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_certif", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_codpla", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_fecini", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_fecfin", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_user", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_ind", String.class, ParameterMode.OUT);
        
        storedProcedure.setParameter("w_sucur", w_sucur);
        storedProcedure.setParameter("w_certif", w_certif);
        storedProcedure.setParameter("w_codpla", w_codpla);
        storedProcedure.setParameter("w_fecini", w_fecini);
        storedProcedure.setParameter("w_fecfin", w_fecfin);
        storedProcedure.setParameter("w_user", w_user);
        storedProcedure.execute();
        
        w_ind = storedProcedure.getOutputParameterValue("w_ind");
		
        em.close();
		return w_ind;
	}
	public boolean spUpdateCoberturas( String w_sucur  , String w_codpla, String w_certif, String w_codcla, double w_asegurado, String w_user){
		
		em = emf.createEntityManager();
		
		StoredProcedureQuery storedProcedure = em.createStoredProcedureQuery(CONSTANTES.PR_UPDATE_COBERTURAS);
//(w_sucur varchar2, w_certif varchar2,  w_codpla varchar2, w_codcla varchar2, w_asegurado numeric, w_ind out varchar2, w_user IN varchar2);
		
        storedProcedure.registerStoredProcedureParameter("w_sucur", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_certif", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_codpla", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_codcla", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_asegurado", Float.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_user", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_ind", String.class, ParameterMode.OUT);
        
        storedProcedure.setParameter("w_sucur", w_sucur);
        storedProcedure.setParameter("w_codpla", w_codpla);
        storedProcedure.setParameter("w_certif", w_certif);
        storedProcedure.setParameter("w_codcla", w_codcla);
        storedProcedure.setParameter("w_asegurado", w_asegurado);
        storedProcedure.setParameter("w_user", w_user);
             
        storedProcedure.execute();
        
        //w_ind = storedProcedure.getOutputParameterValue("w_ind");
		
        em.close();
		
		return true;
	}
	
		public Object spPrListCobertura(String v_sucur , String v_codcia , String v_codpla , String v_certif , String v_orden , 
				String v_inciso , String v_codcla , double v_secuen, String v_valstr , Date v_valdate, double v_valnum , int v_sumap , int v_sumav, String w_user ) {
			Object w_ind = null;
			
			em = emf.createEntityManager();
			
			StoredProcedureQuery storedProcedure = em.createStoredProcedureQuery(CONSTANTES.PR_LISTAS_PARA_COBERTURAS);
			
	        storedProcedure.registerStoredProcedureParameter("v_sucur", String.class, ParameterMode.IN);
	        storedProcedure.registerStoredProcedureParameter("v_codcia", String.class, ParameterMode.IN);
	        storedProcedure.registerStoredProcedureParameter("v_codpla", String.class, ParameterMode.IN);
	        storedProcedure.registerStoredProcedureParameter("v_certif", String.class, ParameterMode.IN);
	        storedProcedure.registerStoredProcedureParameter("v_orden", String.class, ParameterMode.IN);
	        storedProcedure.registerStoredProcedureParameter("v_inciso", String.class, ParameterMode.IN);
	        storedProcedure.registerStoredProcedureParameter("v_codcla", String.class, ParameterMode.IN);
	        storedProcedure.registerStoredProcedureParameter("v_secuen", Integer.class, ParameterMode.IN);
	        storedProcedure.registerStoredProcedureParameter("v_valstr", String.class, ParameterMode.IN);
	        storedProcedure.registerStoredProcedureParameter("v_valdate", Date.class, ParameterMode.IN);
	        storedProcedure.registerStoredProcedureParameter("v_valnum", Float.class, ParameterMode.IN);
	        storedProcedure.registerStoredProcedureParameter("v_sumap", Integer.class, ParameterMode.IN);
	        storedProcedure.registerStoredProcedureParameter("v_sumav", Integer.class, ParameterMode.IN);
	        storedProcedure.registerStoredProcedureParameter("w_user", String.class, ParameterMode.IN);
	        storedProcedure.registerStoredProcedureParameter("w_ind", String.class, ParameterMode.OUT);
	        
	        storedProcedure.setParameter("v_sucur", v_sucur);
	        storedProcedure.setParameter("v_codcia", v_codcia);
	        storedProcedure.setParameter("v_codpla", v_codpla);
	        storedProcedure.setParameter("v_certif", v_certif);
	        storedProcedure.setParameter("v_orden", v_orden);
	        storedProcedure.setParameter("v_inciso", v_inciso);
	        storedProcedure.setParameter("v_codcla", v_codcla);
	        storedProcedure.setParameter("v_secuen", v_secuen);
	        storedProcedure.setParameter("v_valstr", v_valstr);
	        storedProcedure.setParameter("v_valdate", v_valdate);
	        storedProcedure.setParameter("v_valnum", v_valnum);
	        storedProcedure.setParameter("v_sumap", v_sumap);
	        storedProcedure.setParameter("v_sumav", v_sumav);
	        storedProcedure.setParameter("w_user", w_user);
	        
                   
	        storedProcedure.execute();
	        
	        w_ind = storedProcedure.getOutputParameterValue("w_ind");
			
	        em.close();
			return w_ind;
		}
	
}
