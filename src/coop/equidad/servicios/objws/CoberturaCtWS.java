package coop.equidad.servicios.objws;

import java.util.List;

import coop.equidad.model.entity.OsCobertura;
import coop.equidad.servicios.suscripcion.Cobertura;
import coop.equidad.servicios.suscripcion.PolizaSequence_type0;
import coop.equidad.servicios.utils.UtilCommon;

public class CoberturaCtWS {
	
	/**
	 * 
	 * @param coberturas
	 * @return
	 */
	public static PolizaSequence_type0 coberturaEntityToWS ( List<OsCobertura> osCoberturas) {
		PolizaSequence_type0 polizaSequence_type0 = new PolizaSequence_type0();
		polizaSequence_type0.setCobertura(getCoberturas(osCoberturas));	
		
		return polizaSequence_type0;
	}
	
	/**
	 * 
	 * @param coberturas
	 * @return
	 */
	public static Cobertura[] getCoberturas( List<OsCobertura> coberturas ) {
		Cobertura[] coberturasArray = new Cobertura[coberturas.size()];
		
		for( int i=0; i<coberturas.size(); i++ ) {
			coberturasArray[i] = getCobertura(coberturas.get(i));
		}
		
		return coberturasArray;
	}
	
	/**
	 * 
	 * @param osCobertura
	 * @return
	 */
	public static Cobertura getCobertura(OsCobertura osCobertura) {
		Cobertura cobertura = new Cobertura();
		cobertura.setCodcla(osCobertura.getId().getCodcla());
		cobertura.setVaseg(UtilCommon.getLongFromBigDecimal(osCobertura.getVaseg()));
		cobertura.setPrima(UtilCommon.getFloatFromBigDecimal(osCobertura.getPrima()));
		cobertura.setTipo(UtilCommon.getIntFromBigDecimal(osCobertura.getTipo()));
		cobertura.setImpuesto(UtilCommon.getIntFromBigDecimal(osCobertura.getImpuesto()));
		cobertura.setCodram(osCobertura.getCodram());
		cobertura.setMonprima(UtilCommon.getIntFromBigDecimal(osCobertura.getMonprima()));
		
		return cobertura;
	}
	
}
