package coop.equidad.model.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import coop.equidad.config.ConfigProperties;
import coop.equidad.model.entity.OsCobertura;

public class OsCoberturaDao {
	private static final EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory(ConfigProperties.getProp("persistenceUnit"));
	private EntityManager em;	
	
	@SuppressWarnings("unchecked")
	public List<OsCobertura> getCoberturasByPoliza( String w_sucur, String w_codpla, String w_certif, BigDecimal w_orden ) {				
		em = emf.createEntityManager();
		Query query = em.createNamedQuery("OsCobertura.findByPoliza", OsCobertura.class);
		query.setParameter("sucur", w_sucur);
		query.setParameter("codpla", w_codpla);
		query.setParameter("certif", w_certif);
		query.setParameter("orden", w_orden);
    	
		List<OsCobertura> osCoberturas = (List<OsCobertura>)query.getResultList();  	
		
		em.close();
    	return osCoberturas; 	
	}
	
	/**
	 * 
	 * @param osCoberturas
	 */
	public void setCoberturas(List<OsCobertura> osCoberturas) {
		EntityTransaction transaccion = null;
		
		em = emf.createEntityManager();
		transaccion = em.getTransaction();
		transaccion.begin();
		
		for( OsCobertura osCobertura: osCoberturas ) {
			em.merge(osCobertura);
		}
		
		transaccion.commit();
		em.close();
	}
}
