package coop.equidad.servicios.oper;

import java.util.Map;

import coop.equidad.model.dao.PrTarifarDao;

public class ValidarCotizacionOper {
	
	/**
	 * 
	 * @param w_sucur
	 * @param w_certif
	 * @param w_codpla
	 * @param w_orden
	 * @return
	 */
	public static Map<String, String> callSpPrTarifar( String w_sucur, String w_certif, String w_codpla, int w_orden, String w_user ) {		
		PrTarifarDao prTarifarDao = new PrTarifarDao();		
		Map<String, String> rsTarifar = prTarifarDao.spPrTarifar(w_sucur, w_certif, w_codpla, w_orden, w_user);
		
		return rsTarifar;
	}
}
