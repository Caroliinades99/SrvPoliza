package coop.equidad.model.dao;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.ParameterMode;
import javax.persistence.Persistence;
import javax.persistence.StoredProcedureQuery;

import coop.equidad.config.ConfigProperties;
import coop.equidad.servicios.constantes.CONSTANTES;

public class PrEmitirPolizaDao {
	private static final EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory(ConfigProperties.getProp("persistenceUnit"));
	private EntityManager em;
	
	/**
	 * 
	 * @param w_sucur
	 * @param w_poliza
	 * @param w_certif
	 * @param w_codpla
	 * @param fechaCancelacion
	 * @param w_causa
	 * @return
	 */                                                
	public Map<String, String> spPrEmitirPoliza( String w_sucur, String w_codpla, String w_cotizacion, int w_orden, String w_user ) {
		Map<String, String> rsEmitir = new HashMap<String, String>();
		try {
			
			em = emf.createEntityManager();
			 
			StoredProcedureQuery storedProcedure = em.createStoredProcedureQuery(CONSTANTES.PR_EMITIR_POLIZA);
			
			storedProcedure.registerStoredProcedureParameter("w_sucur", String.class, ParameterMode.IN);
			storedProcedure.registerStoredProcedureParameter("w_codpla", String.class, ParameterMode.IN);
			storedProcedure.registerStoredProcedureParameter("w_cotizacion", String.class, ParameterMode.IN);
			storedProcedure.registerStoredProcedureParameter("w_user", String.class, ParameterMode.IN);
			storedProcedure.registerStoredProcedureParameter("w_orden", Integer.class, ParameterMode.INOUT);
			storedProcedure.registerStoredProcedureParameter("w_poliza", String.class, ParameterMode.OUT);
			storedProcedure.registerStoredProcedureParameter("w_ind", String.class, ParameterMode.OUT);
			
			storedProcedure.setParameter("w_sucur", w_sucur);
			storedProcedure.setParameter("w_codpla", w_codpla);
			storedProcedure.setParameter("w_cotizacion", w_cotizacion);
			storedProcedure.setParameter("w_user", w_user);
			storedProcedure.setParameter("w_orden", w_orden);
			storedProcedure.execute();
			
			Object w_poliza = storedProcedure.getOutputParameterValue("w_poliza");
			Object w_ind = storedProcedure.getOutputParameterValue("w_ind");
			
			if( w_poliza != null ) {
				rsEmitir.put(CONSTANTES.PARAM_EMI_POLIZA, w_poliza.toString());
			}
			
			if( w_ind != null ) {
				rsEmitir.put(CONSTANTES.PARAM_EMI_IND, w_ind.toString());
			}
			
			em.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				new TokenDao().creaLogEmision(w_sucur, w_cotizacion, e.getMessage());
			} catch (Exception er) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return rsEmitir;
	}
}
