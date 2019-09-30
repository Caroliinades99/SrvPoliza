package coop.equidad.model.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import coop.equidad.config.ConfigProperties;
import coop.equidad.model.entity.OsTercero;

public class OsTerceroDao {
	private static final EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory(ConfigProperties.getProp("persistenceUnit"));
	private EntityManager em;	
	
	@SuppressWarnings("unchecked")
	public List<OsTercero> getTerceroByPoliza( String w_sucur, String w_codpla, String w_certif, BigDecimal w_orden ) {				
		em = emf.createEntityManager();
		Query query = em.createNamedQuery("OsTercero.findByPoliza", OsTercero.class);
		query.setParameter("sucur", w_sucur);
		query.setParameter("codpla", w_codpla);
		query.setParameter("certif", w_certif);
		query.setParameter("orden", w_orden);
    	
		List<OsTercero> osTerceros = (List<OsTercero>)query.getResultList();
		
		em.close();
    	return osTerceros; 	
	}
	
	/**
	 * 
	 * @param osTerceros
	 */
	public void setTerceros ( List<OsTercero> osTerceros ) {
		EntityTransaction transaccion = null;
		
		em = emf.createEntityManager();
		transaccion = em.getTransaction();
		transaccion.begin();
		
		for( OsTercero osTercero: osTerceros ) {
			em.merge(osTercero);
		}
		
		transaccion.commit();
		em.close();
	}
}
