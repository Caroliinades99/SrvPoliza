package coop.equidad.servicios.val;

import java.util.HashMap;
import java.util.Map;

import coop.equidad.servicios.constantes.CONSTANTES;
import coop.equidad.servicios.constantes.CodigosError;

public class AnularCertificadoValBusiness {
	
	/**
	 * 
	 * @param codError
	 * @return
	 */
	public static Map<String, String> valSpErrorSingle ( String codError ) {
		Map<String, String> msgValidacion = new HashMap<String, String>() ;
		
		if( CONSTANTES.RESP_SP_UNK_ERR.equals(codError) ) {
			msgValidacion.put(CodigosError.COD_ANUCERT_SPANU.getCodError(), CodigosError.COD_ANUCERT_SPANU.getDescError());
		}
		
		if( CONSTANTES.RESP_CSP_POL_ERR.equals(codError) ) {
			msgValidacion.put(CodigosError.COD_ANUCERT_POLEX.getCodError(), CodigosError.COD_ANUCERT_POLEX.getDescError());
		}
		
		return msgValidacion;
	}
}
