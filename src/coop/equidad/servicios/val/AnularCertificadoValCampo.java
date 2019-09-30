package coop.equidad.servicios.val;

import java.util.HashMap;
import java.util.Map;

import coop.equidad.servicios.constantes.CodigosError;
import coop.equidad.servicios.suscripcion.AnularCertificado;
import coop.equidad.servicios.utils.UtilVal;

public class AnularCertificadoValCampo {
	public static Map<String, String> valCancelarCertificado ( AnularCertificado anularCertificado ) {
		Map<String, String> mssgValidacion = new HashMap<String, String>();
		
		if ( UtilVal.validaString(anularCertificado.getSucur() ) || 
				UtilVal.validaLongitudString( anularCertificado.getSucur(), 5, 10) ) {
			mssgValidacion.put(CodigosError.COD_ANUCERT_SUCUR.getCodError(), CodigosError.COD_ANUCERT_SUCUR.getDescError());
		}
		
		if ( UtilVal.validaString(anularCertificado.getPoliza() ) || 
				UtilVal.validaLongitudString( anularCertificado.getPoliza(), 5, 10) ) {
			mssgValidacion.put(CodigosError.COD_ANUCERT_POLIZA.getCodError(), CodigosError.COD_ANUCERT_POLIZA.getDescError());
		}	
		
		if ( UtilVal.validaString(anularCertificado.getCertif() ) || 
				UtilVal.validaLongitudString( anularCertificado.getCertif(), 5, 10) ) {
			mssgValidacion.put(CodigosError.COD_ANUCERT_CERTIF.getCodError(), CodigosError.COD_ANUCERT_CERTIF.getDescError());
		}		
		
		if ( UtilVal.validaString(anularCertificado.getCodpla()) || 
				UtilVal.validaLongitudString( anularCertificado.getCodpla(), 4, 10) ) {
			mssgValidacion.put(CodigosError.COD_ANUCERT_CODPLA.getCodError(), CodigosError.COD_ANUCERT_CODPLA.getDescError());
		}
		
		
		return mssgValidacion;
	}
}
