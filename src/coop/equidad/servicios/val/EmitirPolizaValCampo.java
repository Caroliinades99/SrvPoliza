package coop.equidad.servicios.val;

import java.util.HashMap;
import java.util.Map;

import coop.equidad.servicios.constantes.CodigosError;
import coop.equidad.servicios.suscripcion.EmitirPoliza;
import coop.equidad.servicios.utils.UtilVal;

public class EmitirPolizaValCampo {
	
	
	/**
	 * 
	 * @param consultarPoliza
	 * @return
	 */
	public static Map<String, String> valEmitirPoliza ( EmitirPoliza emitirPoliza ) {
		Map<String, String> mssgValidacion = new HashMap<String, String>();
		
		if ( UtilVal.validaString(emitirPoliza.getCotizacion()) || 
				UtilVal.validaLongitudString( emitirPoliza.getCotizacion(), 5, 10) ) {
			mssgValidacion.put(CodigosError.COD_EMIPOL_COT.getCodError(), CodigosError.COD_EMIPOL_COT.getDescError());
		}
		
		if ( UtilVal.validaString(emitirPoliza.getSucur() ) || 
				UtilVal.validaLongitudString( emitirPoliza.getSucur(), 5, 10) ) {
			mssgValidacion.put(CodigosError.COD_EMIPOL_SUCUR.getCodError(), CodigosError.COD_EMIPOL_SUCUR.getDescError());
		}
		
		if ( UtilVal.validaString(emitirPoliza.getCodpla() ) || 
				UtilVal.validaLongitudString( emitirPoliza.getCodpla(), 4, 10) ) {
			mssgValidacion.put(CodigosError.COD_EMIPOL_CODPLA.getCodError(), CodigosError.COD_EMIPOL_CODPLA.getDescError());
		}
		
		if ( UtilVal.validaVacioInteger(emitirPoliza.getOrden() ) ) {
			mssgValidacion.put(CodigosError.COD_EMIPOL_ORDEN.getCodError(), CodigosError.COD_EMIPOL_ORDEN.getDescError());
		}
		
		return mssgValidacion;
	}
}
