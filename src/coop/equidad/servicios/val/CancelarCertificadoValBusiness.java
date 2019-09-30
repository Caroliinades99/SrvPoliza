package coop.equidad.servicios.val;

import java.util.HashMap;
import java.util.Map;

import coop.equidad.servicios.constantes.CONSTANTES;
import coop.equidad.servicios.constantes.CodigosError;

public class CancelarCertificadoValBusiness {
	
	/**
	 * 
	 * @param codError
	 * @return
	 */
	public static Map<String, String> valSpErrorSingle ( String codError ) {
		Map<String, String> msgValidacion = new HashMap<String, String>() ;
		
		if( CONSTANTES.RESP_SP_UNK_ERR.equals(codError) ) {
			msgValidacion.put(CodigosError.COD_CANCERT_SPCAN.getCodError(), CodigosError.COD_CANCERT_SPCAN.getDescError());
		}
		
		if( CONSTANTES.RESP_CAN_CRT_ERR.equals(codError) ) {
			msgValidacion.put(CodigosError.COD_CANCERT_POLEX.getCodError(), CodigosError.COD_CANCERT_POLEX.getDescError());
		}
		
		return msgValidacion;
	}
}
