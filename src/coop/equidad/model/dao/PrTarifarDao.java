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

public class PrTarifarDao {
	private static final EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory(ConfigProperties.getProp("persistenceUnit"));
	private EntityManager em;
	
	public Map<String, String> spPrTarifar(String w_sucur, String w_certif, String w_codpla, int w_orden, String w_user) {
		Map<String, String> rsTarifar = new HashMap<String, String>();
		em = emf.createEntityManager();
		 
		StoredProcedureQuery storedProcedure = em.createStoredProcedureQuery(CONSTANTES.PR_TARIFAR);
		
        storedProcedure.registerStoredProcedureParameter("w_sucur", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_certif", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_codpla", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_orden", Integer.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_user", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("w_vprima", Double.class, ParameterMode.OUT);
        storedProcedure.registerStoredProcedureParameter("w_vaseg", String.class, ParameterMode.OUT);
        storedProcedure.registerStoredProcedureParameter("w_iva", Double.class, ParameterMode.OUT);
        storedProcedure.registerStoredProcedureParameter("w_gastos", Integer.class, ParameterMode.OUT);
        storedProcedure.registerStoredProcedureParameter("w_total", Double.class, ParameterMode.OUT);        
        storedProcedure.registerStoredProcedureParameter("w_ind", String.class, ParameterMode.OUT);
        storedProcedure.registerStoredProcedureParameter("error", String.class, ParameterMode.OUT);
        storedProcedure.registerStoredProcedureParameter("mensaje", String.class, ParameterMode.OUT);
        
        storedProcedure.setParameter("w_sucur", w_sucur);
        storedProcedure.setParameter("w_certif", w_certif);
        storedProcedure.setParameter("w_codpla", w_codpla);
        storedProcedure.setParameter("w_orden", w_orden);
        storedProcedure.setParameter("w_user",w_user);
        storedProcedure.execute();
        
        Object w_vprima = storedProcedure.getOutputParameterValue("w_vprima");
        Object w_vaseg = storedProcedure.getOutputParameterValue("w_vaseg");
        Object w_iva = storedProcedure.getOutputParameterValue("w_iva");
        Object w_gastos = storedProcedure.getOutputParameterValue("w_gastos");
        Object w_total = storedProcedure.getOutputParameterValue("w_total");
        Object w_ind = storedProcedure.getOutputParameterValue("w_ind");
        Object error = storedProcedure.getOutputParameterValue("error");
        Object mensaje = storedProcedure.getOutputParameterValue("mensaje");
        
        if( w_vprima != null ) {
        	rsTarifar.put(CONSTANTES.PARAM_TAR_VPRIMA, w_vprima.toString());
        }
        
        if( w_vaseg != null ) {
        	rsTarifar.put(CONSTANTES.PARAM_TAR_VASEG, w_vaseg.toString());
        }
        
        if( w_iva != null ) {
        	rsTarifar.put(CONSTANTES.PARAM_TAR_VIVA, w_iva.toString());
        }
        
        if( w_gastos != null ) {
        	rsTarifar.put(CONSTANTES.PARAM_TAR_VGASTOS, w_gastos.toString());
        }
        
        if( w_total != null ) {
        	rsTarifar.put(CONSTANTES.PARAM_TAR_VTOTAL, w_total.toString());
        }
        
        if( w_ind != null ) {
        	rsTarifar.put(CONSTANTES.PARAM_TAR_IND, w_ind.toString());
        }
        
        if( error != null ) {
        	rsTarifar.put(CONSTANTES.PARAM_TAR_ERR, error.toString());
        }
        
        if( mensaje != null ) {
        	rsTarifar.put(CONSTANTES.PARAM_TAR_MSJ, mensaje.toString());
        }
		
        em.close();
		return rsTarifar;
	}
}
