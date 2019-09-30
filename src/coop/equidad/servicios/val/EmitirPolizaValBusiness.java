package coop.equidad.servicios.val;

import java.util.HashMap;
import java.util.Map;

import coop.equidad.servicios.constantes.CONSTANTES;
import coop.equidad.servicios.constantes.CodigosError;

public class EmitirPolizaValBusiness {
	
	/**
	 * 
	 * @param codError
	 * @return
	 */
	public static Map<String, String> valSpErrorSingle ( String codError ) {
		Map<String, String> msgValidacion = new HashMap<String, String>() ;
		
		if( CONSTANTES.RESP_EMI_POL_NEX.equals(codError) ) {
			msgValidacion.put(CodigosError.COD_EMIPOL_COTEX.getCodError(), CodigosError.COD_EMIPOL_COTEX.getDescError());
		}
		
		else if( CONSTANTES.RESP_SP_EMI_DET.equals(codError) ) {
			msgValidacion.put(CodigosError.COD_EMIPOL_DET.getCodError(), CodigosError.COD_EMIPOL_DET.getDescError());
		}
		
		else if( CONSTANTES.RESP_SP_EMI_RCT.equals(codError) ) {
			msgValidacion.put(CodigosError.COD_EMIPOL_RCT.getCodError(), CodigosError.COD_EMIPOL_RCT.getDescError());
		}
		
		else if( CONSTANTES.RESP_SP_EMI_ERR.equals(codError) ) {
			msgValidacion.put(CodigosError.COD_EMIPOL_ERR.getCodError(), CodigosError.COD_EMIPOL_ERR.getDescError());
		}

		else if( CONSTANTES.RESP_SP_EMI_SARLAF.equals(codError) ) {
			msgValidacion.put(CodigosError.COD_EMIPOL_SARLAF.getCodError(), CodigosError.COD_EMIPOL_SARLAF.getDescError());
		}
		else{
			msgValidacion.put(CodigosError.COD_EMIPOL_INESPERADO.getCodError(), CodigosError.COD_EMIPOL_INESPERADO.getDescError());
		}
		
		return msgValidacion;
	}
}
