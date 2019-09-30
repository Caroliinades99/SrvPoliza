package coop.equidad.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import coop.equidad.config.ConfigProperties;

public class OsPersonaVincDao {	
	private static final EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory(ConfigProperties.getProp("persistenceUnit"));
	private EntityManager em;	
	
	/**
	 * 
	 * @param w_codigo
	 * @param w_codvin
	 * @return
	 */
	public long getNumRegPersonaVinc( String w_codigo, int w_codvin ) {			
		long numRegsPersona = 0;

		em = emf.createEntityManager();
		Query query = em.createNamedQuery("OsPersonaVinc.numRegByCod");
		query.setParameter("w_codigo", w_codigo);
		query.setParameter("w_codvin", w_codvin);
		numRegsPersona = (Long) query.getSingleResult();
		
		em.close();
		return numRegsPersona;
	}
}
