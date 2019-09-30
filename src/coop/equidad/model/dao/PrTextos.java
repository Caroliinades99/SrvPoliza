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

public class PrTextos {
	private static final EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory(ConfigProperties.getProp("persistenceUnit"));
	private EntityManager em;
//(w_sucur  in varchar2, w_codpla in varchar2, w_certif in varchar2, w_detalle in varchar2, w_valstring in varchar2, w_orden in varchar2)	
	public void createtextos( String w_sucur, String w_codpla, String w_certif, String w_orden, String w_detalle, String w_valstring) {
		Map<String, String> rsEmitir = new HashMap<String, String>();
		try {
			
			em = emf.createEntityManager();
			 
			StoredProcedureQuery storedProcedure = em.createStoredProcedureQuery(CONSTANTES.PR_CREATE_TEXTOS);
			
			storedProcedure.registerStoredProcedureParameter("w_sucur", String.class, ParameterMode.IN);
			storedProcedure.registerStoredProcedureParameter("w_codpla", String.class, ParameterMode.IN);
			storedProcedure.registerStoredProcedureParameter("w_certif", String.class, ParameterMode.IN);
			storedProcedure.registerStoredProcedureParameter("w_detalle", String.class, ParameterMode.IN);
			storedProcedure.registerStoredProcedureParameter("w_valstring", String.class, ParameterMode.IN);
			storedProcedure.registerStoredProcedureParameter("w_orden", String.class, ParameterMode.IN);
			
			storedProcedure.setParameter("w_sucur", w_sucur);
			storedProcedure.setParameter("w_codpla", w_codpla);
			storedProcedure.setParameter("w_certif", w_certif);
			storedProcedure.setParameter("w_detalle", w_detalle);
			storedProcedure.setParameter("w_valstring", w_valstring);
			storedProcedure.setParameter("w_orden", w_orden);
			storedProcedure.execute();
			em.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}
	
}
