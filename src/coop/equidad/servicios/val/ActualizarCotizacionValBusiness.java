package coop.equidad.servicios.val;

import java.util.HashMap;
import java.util.Map;

import coop.equidad.servicios.constantes.CONSTANTES;
import coop.equidad.servicios.constantes.CodigosError;

public class ActualizarCotizacionValBusiness {
	
	/**
	 * 
	 * @param codError
	 * @return
	 */
	public static Map<String, String> valSpErrorSingle ( String codError ) {
		Map<String, String> msgValidacion = new HashMap<String, String>() ;
		
		if( CONSTANTES.RESP_ACT_COT_NEX.equals(codError) ) {
			msgValidacion.put(CodigosError.COD_ACTCOT_POLEX.getCodError(), CodigosError.COD_ACTCOT_POLEX.getDescError());
		}
		
		if( CONSTANTES.RESP_ACT_COT_ERR.equals(codError) ) {
			msgValidacion.put(CodigosError.COD_ACTCOT_ERR.getCodError(), CodigosError.COD_ACTCOT_ERR.getDescError());
		}
		
		if( CONSTANTES.RESP_SP_TAR_ERR.equals(codError) ) {
			msgValidacion.put(CodigosError.COD_ACTCOT_ERR.getCodError(), CodigosError.COD_ACTCOT_ERR.getDescError());
		}
		
		return msgValidacion;
	}
}
