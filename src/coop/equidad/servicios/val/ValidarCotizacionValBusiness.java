package coop.equidad.servicios.val;

import java.util.HashMap;
import java.util.Map;

import coop.equidad.servicios.constantes.CONSTANTES;
import coop.equidad.servicios.constantes.CodigosError;

public class ValidarCotizacionValBusiness {
	
	/**
	 * 
	 * @param codError
	 * @return
	 */
	public static Map<String, String> valSpErrorSingle ( String codError ) {
		Map<String, String> msgValidacion = new HashMap<String, String>() ;
		
		if( CONSTANTES.RESP_SP_TAR_ERR.equals(codError) ) {
			msgValidacion.put(CodigosError.COD_VALVLC_SPTAR.getCodError(), CodigosError.COD_VALVLC_SPTAR.getDescError());
		}
		
		if( CONSTANTES.RESP_VAL_POL_ERR.equals(codError) ) {
			msgValidacion.put(CodigosError.COD_VALVLC_POLEX.getCodError(), CodigosError.COD_VALVLC_POLEX.getDescError());
		}
		
		if( CONSTANTES.RESP_CSP_POL_ERR.equals(codError) ) {
			msgValidacion.put(CodigosError.COD_VALCSP_POLEX.getCodError(), CodigosError.COD_VALCSP_POLEX.getDescError());
		}
		
		return msgValidacion;
	}
}
