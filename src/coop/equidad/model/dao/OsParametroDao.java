package coop.equidad.model.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Query;

import coop.equidad.model.entity.S03010;


public class OsParametroDao extends OsCaratulaDao {
	
	public List<S03010> getParam(BigDecimal w_clase, String w_tipo) {
		
		
		em = emf.createEntityManager();
		
			
		StringBuilder sqsStr = new StringBuilder("SELECT a FROM S03010 a WHERE a.s03010PK.clase = :w_clase and"
				+ " a.s03010PK.tipo = :w_tipo ");
		
		Query query = em.createQuery(sqsStr.toString());
		query.setParameter("w_clase", w_clase);
		query.setParameter("w_tipo", w_tipo);
		
		
		List<S03010> s03010 = (List<S03010>)query.getResultList();
    	
		em.close();
    	return s03010; 	
	}
	
	
	
}
