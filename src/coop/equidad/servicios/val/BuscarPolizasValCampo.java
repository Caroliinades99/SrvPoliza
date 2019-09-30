package coop.equidad.servicios.val;

import java.util.HashMap;
import java.util.Map;

import coop.equidad.servicios.constantes.CodigosError;
import coop.equidad.servicios.suscripcion.BuscarPolizas;
import coop.equidad.servicios.utils.UtilVal;

public class BuscarPolizasValCampo {
	
	
	/**
	 * 
	 * @param buscarPolizas
	 * @return
	 */
	public static Map<String, String> valBuscarPolizas ( BuscarPolizas buscarPolizas ) {
		Map<String, String> mssgValidacion = new HashMap<String, String>();
		
		if ( UtilVal.validaString(buscarPolizas.getAsegurado()) && UtilVal.validaString(buscarPolizas.getCertif()) &&
				UtilVal.validaString(buscarPolizas.getCodpla()) && UtilVal.validaString(buscarPolizas.getPoliza()) &&
				UtilVal.validaString(buscarPolizas.getSucur()) ) {
			mssgValidacion.put(CodigosError.COD_VALBSP_PAR.getCodError(), CodigosError.COD_VALBSP_PAR.getDescError());
		} else {
			if( !UtilVal.validaString(buscarPolizas.getAsegurado()) && UtilVal.validaLongitudString(buscarPolizas.getAsegurado(), 4, 20) ) {
				mssgValidacion.put(CodigosError.COD_VALASE_PAR.getCodError(), CodigosError.COD_VALASE_PAR.getDescError());
			}
			if( !UtilVal.validaString(buscarPolizas.getCertif()) && UtilVal.validaLongitudString(buscarPolizas.getCertif(), 5, 10) ) {
				mssgValidacion.put(CodigosError.COD_VALCER_PAR.getCodError(), CodigosError.COD_VALCER_PAR.getDescError());
			}
			if( !UtilVal.validaString(buscarPolizas.getCodpla()) && UtilVal.validaLongitudString(buscarPolizas.getCodpla(), 4, 10) ) {
				mssgValidacion.put(CodigosError.COD_VALCOP_PAR.getCodError(), CodigosError.COD_VALCOP_PAR.getDescError());
			}
			if( !UtilVal.validaString(buscarPolizas.getPoliza()) && UtilVal.validaLongitudString(buscarPolizas.getPoliza(), 5, 10) ) {
				mssgValidacion.put(CodigosError.COD_VALPOL_PAR.getCodError(), CodigosError.COD_VALPOL_PAR.getDescError());
			}
			if( !UtilVal.validaString(buscarPolizas.getSucur()) && UtilVal.validaLongitudString(buscarPolizas.getSucur(), 5, 10) ) {
				mssgValidacion.put(CodigosError.COD_VALSUC_PAR.getCodError(), CodigosError.COD_VALSUC_PAR.getDescError());
			}
		}
		
		return mssgValidacion;
	}

}
