package coop.equidad.servicios.oper;

import java.util.Map;

import coop.equidad.model.dao.PrEmitirPolizaDao;

public class EmitirPolizaOper {
	
	/**
	 * 
	 * @param w_sucur
	 * @param w_codpla
	 * @param w_certif
	 * @param w_orden
	 * @return
	 */
	public static Map<String, String> callSpEmitirPoliza( String w_sucur, String w_codpla, String w_cotizacion, int w_orden, String w_user ) {
		PrEmitirPolizaDao emitirPolizaDao = new PrEmitirPolizaDao();		
		Map<String, String> rsEmitir = emitirPolizaDao.spPrEmitirPoliza(w_sucur, w_codpla, w_cotizacion, w_orden,w_user);
		
		return rsEmitir;
	}
}
