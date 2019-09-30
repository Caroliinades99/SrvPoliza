package coop.equidad.model.dao;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.ParameterMode;
import javax.persistence.Persistence;
import javax.persistence.StoredProcedureQuery;

import coop.equidad.config.ConfigProperties;
import coop.equidad.servicios.constantes.CONSTANTES;

public class PrDetallesDao {
	private static final EntityManagerFactory emf = Persistence
			.createEntityManagerFactory(ConfigProperties.getProp("persistenceUnit"));
	private EntityManager em;

	/**
	 * 
	 * @param w_sucur
	 * @param w_certif
	 * @param w_coddet
	 * @param w_codpla
	 * @param w_valnumber
	 * @param w_valdate
	 * @param w_valstring
	 */
	public Object spPrDetalles(String w_sucur, String w_certif, String w_coddet, String w_codpla,
			BigDecimal w_valnumber, String w_valdate, String w_valstring, String w_user) {
		Object w_ind = null;
		/*
		 * if (Float.isNaN(w_valnumber)){ w_valnumber=0; }
		 */
		em = emf.createEntityManager();

		StoredProcedureQuery storedProcedure = em.createStoredProcedureQuery(CONSTANTES.PR_DETALLES);

		storedProcedure.registerStoredProcedureParameter("w_sucur", String.class, ParameterMode.IN);
		storedProcedure.registerStoredProcedureParameter("w_certif", String.class, ParameterMode.IN);
		storedProcedure.registerStoredProcedureParameter("w_coddet", String.class, ParameterMode.IN);
		storedProcedure.registerStoredProcedureParameter("w_codpla", String.class, ParameterMode.IN);
		storedProcedure.registerStoredProcedureParameter("w_valnumber", BigDecimal.class, ParameterMode.IN);
		storedProcedure.registerStoredProcedureParameter("w_valdate", String.class, ParameterMode.IN);
		storedProcedure.registerStoredProcedureParameter("w_valstring", String.class, ParameterMode.IN);
		storedProcedure.registerStoredProcedureParameter("w_user", String.class, ParameterMode.IN);
		storedProcedure.registerStoredProcedureParameter("w_ind", String.class, ParameterMode.OUT);

		storedProcedure.setParameter("w_sucur", w_sucur);
		storedProcedure.setParameter("w_certif", w_certif);
		storedProcedure.setParameter("w_coddet", w_coddet);
		storedProcedure.setParameter("w_codpla", w_codpla);
		storedProcedure.setParameter("w_valnumber", w_valnumber == null ? 0 : w_valnumber);
		storedProcedure.setParameter("w_valdate", w_valdate);
		storedProcedure.setParameter("w_valstring", w_valstring);
		storedProcedure.setParameter("w_user", w_user);
		storedProcedure.execute();

		w_ind = storedProcedure.getOutputParameterValue("w_ind");

		em.close();
		return w_ind;
	}

}
