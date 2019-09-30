package coop.equidad.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import coop.equidad.config.ConfigProperties;

public class Fasecolda1Dao {
	protected static final EntityManagerFactory emf = Persistence
			.createEntityManagerFactory(ConfigProperties.getProp("persistenceUnit"));
	protected EntityManager em;

	public String getServicio(String codFasecolda) {

		em = emf.createEntityManager();

		Query query = em.createNativeQuery(
				"SELECT f_servicio FROM osiris.fasecolda1 s WHERE s.f_codigo = '" + codFasecolda + "' AND ROWNUM = 1");
		String servicio = (String) query.getSingleResult();
		em.close();
		return servicio;
	}
}
