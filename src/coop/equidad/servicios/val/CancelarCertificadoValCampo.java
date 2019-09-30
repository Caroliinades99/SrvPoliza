package coop.equidad.servicios.val;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import coop.equidad.servicios.constantes.CONSTANTES;
import coop.equidad.servicios.constantes.CodigosError;
import coop.equidad.servicios.suscripcion.CancelarCertificado;
import coop.equidad.servicios.utils.UtilVal;

public class CancelarCertificadoValCampo {
	public static Map<String, String> valCancelarCertificado ( CancelarCertificado cancelarCertificado ) {
		Map<String, String> mssgValidacion = new HashMap<String, String>();
		
		if ( UtilVal.validaString(cancelarCertificado.getSucur() ) || 
				UtilVal.validaLongitudString( cancelarCertificado.getSucur(), 5, 10) ) {
			mssgValidacion.put(CodigosError.COD_CANCERT_SUCUR.getCodError(), CodigosError.COD_CANCERT_SUCUR.getDescError());
		}
		
		if ( UtilVal.validaString(cancelarCertificado.getPoliza() ) || 
				UtilVal.validaLongitudString( cancelarCertificado.getPoliza(), 5, 10) ) {
			mssgValidacion.put(CodigosError.COD_CANCERT_POLIZA.getCodError(), CodigosError.COD_CANCERT_POLIZA.getDescError());
		}	
		
		if ( UtilVal.validaString(cancelarCertificado.getCertif() ) || 
				UtilVal.validaLongitudString( cancelarCertificado.getCertif(), 5, 10) ) {
			mssgValidacion.put(CodigosError.COD_CANCERT_CERTIF.getCodError(), CodigosError.COD_CANCERT_CERTIF.getDescError());
		}		
		
		if ( UtilVal.validaString(cancelarCertificado.getCodpla() ) || 
				UtilVal.validaLongitudString( cancelarCertificado.getCodpla(), 4, 10) ) {
			mssgValidacion.put(CodigosError.COD_CANCERT_CODPLA.getCodError(), CodigosError.COD_CANCERT_CODPLA.getDescError());
		}
		
		if ( UtilVal.validaFechaRetro(cancelarCertificado.getFechaCancelacion(), new Date(), CONSTANTES.DIAS_RETRO_CANC) ) {
			mssgValidacion.put(CodigosError.COD_CANCERT_FECANC.getCodError(), CodigosError.COD_CANCERT_FECANC.getDescError());
		}
		
		if ( UtilVal.validaString(cancelarCertificado.getCausa() ) || 
				UtilVal.validaLongitudString( cancelarCertificado.getCausa(), 3, 100) ) {
			mssgValidacion.put(CodigosError.COD_CANCERT_CAUSA.getCodError(), CodigosError.COD_CANCERT_CAUSA.getDescError());
		}
		
		return mssgValidacion;
	}
}
