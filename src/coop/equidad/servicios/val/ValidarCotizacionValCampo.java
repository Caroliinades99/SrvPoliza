package coop.equidad.servicios.val;

import java.util.HashMap;
import java.util.Map;

import coop.equidad.servicios.constantes.CodigosError;
import coop.equidad.servicios.suscripcion.ValidarCotizacion;
import coop.equidad.servicios.utils.UtilVal;

public class ValidarCotizacionValCampo {
	
	
	/**
	 * 
	 * @param validarCotizacion
	 * @return
	 */
	public static Map<String, String> valValidarCotizacion ( ValidarCotizacion validarCotizacion ) {
		Map<String, String> mssgValidacion = new HashMap<String, String>();
		
		if ( UtilVal.validaString(validarCotizacion.getCertif() ) || 
				UtilVal.validaLongitudString( validarCotizacion.getCertif(), 5, 10) ) {
			mssgValidacion.put(CodigosError.COD_VALVLC_COT.getCodError(), CodigosError.COD_VALVLC_COT.getDescError());
		}
		
		if ( UtilVal.validaString(validarCotizacion.getSucur() ) || 
				UtilVal.validaLongitudString( validarCotizacion.getSucur(), 5, 10) ) {
			mssgValidacion.put(CodigosError.COD_VALVLC_SUCUR.getCodError(), CodigosError.COD_VALVLC_SUCUR.getDescError());
		}
		
		if ( UtilVal.validaString(validarCotizacion.getCodpla() ) || 
				UtilVal.validaLongitudString( validarCotizacion.getCodpla(), 4, 10) ) {
			mssgValidacion.put(CodigosError.COD_VALVLC_CODPLA.getCodError(), CodigosError.COD_VALVLC_CODPLA.getDescError());
		}
		
		if ( UtilVal.validaVacioInteger(validarCotizacion.getOrden() ) ) {
			mssgValidacion.put(CodigosError.COD_VALVLC_ORDEN.getCodError(), CodigosError.COD_VALVLC_ORDEN.getDescError());
		}
		
		return mssgValidacion;
	}
}
