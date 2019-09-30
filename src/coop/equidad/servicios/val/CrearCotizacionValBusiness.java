package coop.equidad.servicios.val;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import coop.equidad.servicios.constantes.CONSTANTES;
import coop.equidad.servicios.constantes.CodigosError;
import coop.equidad.servicios.suscripcion.CrearCotizacion;
import coop.equidad.servicios.suscripcion.Tercero;
import coop.equidad.servicios.utils.UtilVal;

public class CrearCotizacionValBusiness {
	
	/**
	 * @param poliza
	 * @return
	 */
	public static Map<String, String> valCrearCotizacionBs ( CrearCotizacion crearCotizacion  ) {
		Map<String, String> mssgValidacion = new HashMap<String, String>();
		
		Tercero[] terceros = crearCotizacion.getTercero();
		List<Integer> codsVinculacion = getCodsVinculacion(terceros);
		
		if( UtilVal.isFechaPost(crearCotizacion.getFecini(), crearCotizacion.getFecter()) ) {
			mssgValidacion.put(CodigosError.COD_VALCRC_BS_POL_FECINITER.getCodError(), CodigosError.COD_VALCRC_BS_POL_FECINITER.getDescError());
		}
		
		if( terceros.length >= 4 ) {	
			if( !codsVinculacion.contains(CONSTANTES.COD_VINC_ASEGURADO) ) {
				mssgValidacion.put(CodigosError.COD_VALCRC_BS_POL_TERCERO_DET_ASEGURADO.getCodError(), CodigosError.COD_VALCRC_BS_POL_TERCERO_DET_ASEGURADO.getDescError());
			}	
			if( !codsVinculacion.contains(CONSTANTES.COD_VINC_BENEFICIARIO) ) {
				mssgValidacion.put(CodigosError.COD_VALCRC_BS_POL_TERCERO_DET_BENEFICIARIO.getCodError(), CodigosError.COD_VALCRC_BS_POL_TERCERO_DET_BENEFICIARIO.getDescError());
			}	
			if( !codsVinculacion.contains(CONSTANTES.COD_VINC_AGENTE) ) {
				mssgValidacion.put(CodigosError.COD_VALCRC_BS_POL_TERCERO_DET_AGENTE.getCodError(), CodigosError.COD_VALCRC_BS_POL_TERCERO_DET_AGENTE.getDescError());
			}
			if( !codsVinculacion.contains(CONSTANTES.COD_VINC_TOMADOR) ) {
				mssgValidacion.put(CodigosError.COD_VALCRC_BS_POL_TERCERO_DET_TOMADOR.getCodError(), CodigosError.COD_VALCRC_BS_POL_TERCERO_DET_TOMADOR.getDescError());
			}
		} else {
			mssgValidacion.put(CodigosError.COD_VALCRC_BS_POL_TERCERO_DET_OBL.getCodError(), CodigosError.COD_VALCRC_BS_POL_TERCERO_DET_OBL.getDescError());
		}
		
		return mssgValidacion;
	}
	
	/**
	 * @param codError
	 * @return
	 */
	public static Map<String, String> valSpErrorSingle ( String codError ) {
		Map<String, String> msgValidacion = new HashMap<String, String>() ;
		
		if( CONSTANTES.RESP_SP_SEG_ERR.equals(codError) ) {
			msgValidacion.put(CodigosError.COD_VALCRC_SPSEGURIDAD.getCodError(), CodigosError.COD_VALCRC_SPSEGURIDAD.getDescError());
		}
		
		if( CONSTANTES.RESP_SP_DET_ERR.equals(codError) ) {
			msgValidacion.put(CodigosError.COD_VALCRC_SPVALDETOBL.getCodError(), CodigosError.COD_VALCRC_SPVALDETOBL.getDescError());
		}
		
		if( CONSTANTES.RESP_SP_TAR_ERR.equals(codError) ) {
			msgValidacion.put(CodigosError.COD_VALCRC_SPTAR.getCodError(), CodigosError.COD_VALCRC_SPTAR.getDescError());
		}
		
		return msgValidacion;
	}
	
	/**
	 * 
	 * @param descError
	 * @return
	 */
	public static Map<String, String> valSpErrorDetallesObl ( String descError ) {
		Map<String, String> msgValidacion = new HashMap<String, String>() ;
		msgValidacion.put(CodigosError.COD_VALCRC_SPVALDETOBL.getCodError(), descError);
		
		return msgValidacion;
	}
	
	/**
	 * 
	 * @return
	 */
	public static Map<String, String> getSpErrorTarifar ( String mensaje ) {
		Map<String, String> msgValidacion = new HashMap<String, String>() ;
		msgValidacion.put(CodigosError.COD_VALCRC_SP_VAL_TAR.getCodError(), mensaje);
		
		return msgValidacion;
	}
	
	/**
	 * @param terceros
	 * @return
	 */
	public static List<Integer> getCodsVinculacion( Tercero[] terceros ) {
		List<Integer> codsVinculacion = new ArrayList<Integer>();
		
		for( int i=0; i<terceros.length; i++ ) {
			codsVinculacion.add(terceros[i].getCodVinculacion());	
		}
		
		return codsVinculacion;
	}
}
