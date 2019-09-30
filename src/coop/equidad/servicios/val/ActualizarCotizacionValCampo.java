package coop.equidad.servicios.val;

import java.util.HashMap;
import java.util.Map;

import coop.equidad.servicios.constantes.CodigosError;
import coop.equidad.servicios.suscripcion.ActualizarCotizacion;
import coop.equidad.servicios.suscripcion.Detalle;
import coop.equidad.servicios.utils.UtilVal;

public class ActualizarCotizacionValCampo {
	
	
	/**
	 * 
	 * @param actualizarCotizacion
	 * @return
	 */
	public static Map<String, String> valActualizarCotizacion ( ActualizarCotizacion actualizarCotizacion ) {		
		Map<String, String> mssgValidacion = new HashMap<String, String>();
		
		if ( UtilVal.validaString(actualizarCotizacion.getSucur() ) || 
				UtilVal.validaLongitudString( actualizarCotizacion.getSucur(), 5, 10) ) {
			mssgValidacion.put(CodigosError.COD_ACTCOT_SUCUR.getCodError(), CodigosError.COD_ACTCOT_SUCUR.getDescError());
		}
		
		if ( UtilVal.validaString(actualizarCotizacion.getCertif() ) || 
				UtilVal.validaLongitudString( actualizarCotizacion.getCertif(), 5, 10) ) {
			mssgValidacion.put(CodigosError.COD_ACTCOT_CERT.getCodError(), CodigosError.COD_ACTCOT_CERT.getDescError());
		}		
		
		if ( UtilVal.validaString(actualizarCotizacion.getCodpla()) || 
				UtilVal.validaLongitudString( actualizarCotizacion.getCodpla(), 4, 10) ) {
			mssgValidacion.put(CodigosError.COD_ACTCOT_CODPLA.getCodError(), CodigosError.COD_ACTCOT_CODPLA.getDescError());
		}
		
		if ( UtilVal.validaVacioInteger(actualizarCotizacion.getOrden()) ) {
			mssgValidacion.put(CodigosError.COD_ACTCOT_ORDEN.getCodError(), CodigosError.COD_ACTCOT_ORDEN.getDescError());
		}
		
		/**
		 * 
		 */
		if ( actualizarCotizacion.getDetalle() == null || actualizarCotizacion.getDetalle().length == 0 ) {
			mssgValidacion.put(CodigosError.COD_ACTCOT_DETALLE.getCodError(), CodigosError.COD_ACTCOT_DETALLE.getDescError());
		} else {
			if( validaDetalles(actualizarCotizacion.getDetalle()) ) {
				mssgValidacion.put(CodigosError.COD_ACTCOT_DETALLE_DET.getCodError(), CodigosError.COD_ACTCOT_DETALLE_DET.getDescError());
			}			
		}	
		
		return mssgValidacion;
	}
	
	/**
	 * 
	 * @param detalles
	 * @return
	 */
	public static boolean validaDetalles ( Detalle[] detalles ) {
		boolean valDetalles = false;
		
		for( int i=0; i<detalles.length; i++ ) {
			if(	UtilVal.validaString(detalles[i].getCoddet() ) || UtilVal.validaLongitudString(detalles[i].getCoddet(), 3, 20) ||
				//( UtilVal.validaVacioFloat(detalles[i].getValnumber()) &&
				  ( detalles[i].getValnumber()!=null &&	
						UtilVal.validaVacioDate(detalles[i].getValdate()) &&
						UtilVal.validaLongitudStringNull(detalles[i].getValstring(), 1, 20) )
				) {
			valDetalles = true;
			}
		}
		
		return valDetalles;
	}

}
