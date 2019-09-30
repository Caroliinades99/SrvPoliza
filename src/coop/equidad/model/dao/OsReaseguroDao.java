package coop.equidad.model.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import coop.equidad.config.ConfigProperties;
import coop.equidad.model.entity.OsReaseguro;

public class OsReaseguroDao {
	private static final EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory(ConfigProperties.getProp("persistenceUnit"));
	private EntityManager em;	
	
	@SuppressWarnings("unchecked")
	public List<OsReaseguro> getReaseguroByPoliza( String w_sucur, String w_codpla, String w_certif, BigDecimal w_orden ) {				
		em = emf.createEntityManager();
		Query query = em.createNamedQuery("OsReaseguro.findByPoliza", OsReaseguro.class);
		query.setParameter("sucur", w_sucur);
		query.setParameter("codpla", w_codpla);
		query.setParameter("certif", w_certif);
		query.setParameter("orden", w_orden);
    	
		List<OsReaseguro> osReaseguros = (List<OsReaseguro>)query.getResultList();  
		
		em.close();
    	return osReaseguros; 	
	}
	
	/**
	 * 
	 * @param osReaseguro
	 */
	public void setReaseguros (List <OsReaseguro> osReaseguros ) {				
		EntityTransaction transaccion = null;
		
		em = emf.createEntityManager();
		transaccion = em.getTransaction();
		transaccion.begin();
		
		for( OsReaseguro osReaseguro: osReaseguros ) {
			em.merge(osReaseguro);
		}
		
		transaccion.commit();
		em.close();
	}
}
