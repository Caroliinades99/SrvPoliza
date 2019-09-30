package coop.equidad.servicios.val;

import java.util.HashMap;
import java.util.Map;

import coop.equidad.servicios.constantes.CodigosError;
import coop.equidad.servicios.suscripcion.ConsultarPoliza;
import coop.equidad.servicios.utils.UtilVal;

public class ConsultarPolizaValCampo {
	
	
	/**
	 * 
	 * @param consultarPoliza
	 * @return
	 */
	public static Map<String, String> valConsultarPoliza ( ConsultarPoliza consultarPoliza ) {
		Map<String, String> mssgValidacion = new HashMap<String, String>();
		
		if ( UtilVal.validaString(consultarPoliza.getCertif() ) || 
				UtilVal.validaLongitudString( consultarPoliza.getCertif(), 5, 10) ) {
			mssgValidacion.put(CodigosError.COD_VALCSP_COT.getCodError(), CodigosError.COD_VALCSP_COT.getDescError());
		}
		
		if ( UtilVal.validaString(consultarPoliza.getSucur() ) || 
				UtilVal.validaLongitudString( consultarPoliza.getSucur(), 5, 10) ) {
			mssgValidacion.put(CodigosError.COD_VALCSP_SUCUR.getCodError(), CodigosError.COD_VALCSP_SUCUR.getDescError());
		}
		
		if ( UtilVal.validaString(consultarPoliza.getCodpla() ) || 
				UtilVal.validaLongitudString( consultarPoliza.getCodpla(), 4, 10) ) {
			mssgValidacion.put(CodigosError.COD_VALCSP_CODPLA.getCodError(), CodigosError.COD_VALCSP_CODPLA.getDescError());
		}
		
		if ( UtilVal.validaVacioInteger(consultarPoliza.getOrden() ) ) {
			mssgValidacion.put(CodigosError.COD_VALCSP_ORDEN.getCodError(), CodigosError.COD_VALCSP_ORDEN.getDescError());
		}
		
		return mssgValidacion;
	}
}
