package coop.equidad.model.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import coop.equidad.config.ConfigProperties;
import coop.equidad.model.entity.OsReaseguroPz;

public class OsReaseguroPzDao {
	private static final EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory(ConfigProperties.getProp("persistenceUnit"));
	private EntityManager em;	
	
	@SuppressWarnings("unchecked")
	public List<OsReaseguroPz> getReaseguroByPoliza( String w_sucur, String w_codpla, String w_certif, BigDecimal w_orden ) {				
		em = emf.createEntityManager();
		Query query = em.createNamedQuery("OsReaseguroPz.findByPoliza", OsReaseguroPz.class);
		query.setParameter("sucur", w_sucur);
		query.setParameter("codpla", w_codpla);
		query.setParameter("certif", w_certif);
		query.setParameter("orden", w_orden);
    	
		List<OsReaseguroPz> osReaseguros = (List<OsReaseguroPz>)query.getResultList();  
		
		em.close();
    	return osReaseguros; 	
	}
}
