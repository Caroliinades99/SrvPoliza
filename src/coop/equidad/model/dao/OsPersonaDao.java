package coop.equidad.model.dao;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import coop.equidad.config.ConfigProperties;

public class OsPersonaDao {
	private static final EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory(ConfigProperties.getProp("persistenceUnit"));
	private EntityManager em;	
	
	/**
	 * 
	 * @param w_codigo
	 * @return
	 */
	public long getNumRegPersona( String w_codigo ) {				
		long numRegsPersona = 0;

		em = emf.createEntityManager();
		Query query = em.createNamedQuery("OsPersona.numRegByCod");
		query.setParameter("w_codigo", w_codigo);
		numRegsPersona = (Long) query.getSingleResult();
		
		em.close();
		return numRegsPersona;
	}
	
	/**
	 * 
	 * @param w_codigo
	 * @param w_codvin
	 * @return
	 */
	public long getNumRegPersona( String w_codigo, int w_codvin ) {		
		long numRegsPersona = 0;

		em = emf.createEntityManager();
		Query query = em.createNativeQuery(
				"SELECT COUNT(*) " +
			    "FROM OSIRIS.S03500 a, osiris.s03501 b " +
			    "WHERE a.codigo = b.codigo " +
			          "AND b.estado = '0' " +
			          "AND b.codvin = '" + w_codvin + "' " +
			          "AND a.nit in ('" + w_codigo + "',LPAD('" + w_codigo + "',12,'0'), TO_CHAR('" + w_codigo + "' || ' '),TO_CHAR(LPAD('" + w_codigo + "',12,'0')|| ' '), " +
			          "LPAD('" + w_codigo + "',11,'0'), TO_CHAR('" + w_codigo + "' || ' '),TO_CHAR(LPAD('" + w_codigo + "',11,'0')|| ' '), " +
			          "LPAD('" + w_codigo + "',10,'0'), TO_CHAR('" + w_codigo + "' || ' '),TO_CHAR(LPAD('" + w_codigo + "',10,'0')|| ' '), " +
			          "LPAD('" + w_codigo + "',9,'0'), TO_CHAR('" + w_codigo + "' || ' '),TO_CHAR(LPAD('" + w_codigo + "',9,'0')|| ' '), " +
			          "LPAD('" + w_codigo + "',10,' '), TO_CHAR('" + w_codigo + "' || ' '),TO_CHAR(LPAD('" + w_codigo + "',10,' ')|| ' '), " +
			          "TO_CHAR(' '||LPAD('" + w_codigo + "',11,'0')|| ' '), TO_CHAR(' '||LPAD('" + w_codigo + "',11,'0')))"
				);
		
		BigDecimal rslt = (BigDecimal) query.getSingleResult();
		
		if( rslt != null ) {
			numRegsPersona = rslt.longValue();
		}

		em.close();
		return numRegsPersona;
	}
}
