package coop.equidad.servicios.objws;

import java.util.List;

import coop.equidad.model.entity.OsCaratulaPz;
import coop.equidad.servicios.suscripcion.Poliza;
import coop.equidad.servicios.suscripcion.ResultadoPoliza;
import coop.equidad.servicios.utils.UtilCommon;

public class PolizaWS {
	
	/**
	 * 
	 * @param osCaratula
	 * @return
	 */
	public static Poliza polizaEntityToWS ( OsCaratulaPz osCaratula ) {
		Poliza poliza = new Poliza();
		poliza.setSucur(osCaratula.getId().getSucur());
		poliza.setCodpla(osCaratula.getId().getCodpla());
		poliza.setCertif(osCaratula.getId().getCertif());
		poliza.setOrden(UtilCommon.getIntFromBigDecimal(osCaratula.getId().getOrden()));
		poliza.setEstado(UtilCommon.getIntFromBigDecimal(osCaratula.getEstado()));
		poliza.setPoliza(osCaratula.getPoliza());
		poliza.setTomador(UtilCommon.getIntegerFromString(osCaratula.getTomador()));
		poliza.setAsegurado(UtilCommon.getIntegerFromString(osCaratula.getAsegurado()));
		poliza.setBeneficiario(UtilCommon.getIntegerFromString(osCaratula.getBeneficiario()));
		poliza.setCliente(UtilCommon.getIntegerFromString(osCaratula.getCliente()));
		poliza.setAgente(UtilCommon.getIntegerFromString(osCaratula.getAgente()));
		poliza.setComision(UtilCommon.getFloatFromBigDecimal(osCaratula.getComision()));
		poliza.setFecini(osCaratula.getFecini());
		poliza.setFecter(osCaratula.getFecter());
		poliza.setVaseg(UtilCommon.getFloatFromBigDecimal(osCaratula.getVaseg()));		
		poliza.setValgastos(UtilCommon.getFloatFromBigDecimal(osCaratula.getValgastos()));
		poliza.setValiva(UtilCommon.getFloatFromBigDecimal(osCaratula.getValiva()));
		poliza.setVbase(UtilCommon.getFloatFromBigDecimal(osCaratula.getVbase()));
		poliza.setVprima(UtilCommon.getFloatFromBigDecimal(osCaratula.getVprima()));
		
		poliza.setCotizacion(osCaratula.getCotizacion());		
		
		return poliza;
	}
	
	/**
	 * 
	 * @param osCaratula
	 * @return
	 */
	public static ResultadoPoliza polizaEntityToResultadoPolizaWS ( OsCaratulaPz osCaratula ) {
		ResultadoPoliza resultadoPoliza = new ResultadoPoliza();
		
		resultadoPoliza.setCertif(osCaratula.getId().getCertif());
		resultadoPoliza.setCodpla(osCaratula.getId().getCodpla());
		resultadoPoliza.setEstado(UtilCommon.getIntFromBigDecimal(osCaratula.getEstado()));
		resultadoPoliza.setFecini(osCaratula.getFecini());
		resultadoPoliza.setFecter(osCaratula.getFecter());
		resultadoPoliza.setPoliza(osCaratula.getPoliza());
		resultadoPoliza.setSucur(osCaratula.getId().getSucur());
		
		return resultadoPoliza;
	}
	
	/**
	 * 
	 * @param osCaratulas
	 * @return
	 */
	public static ResultadoPoliza[] polizasEntityToResultadosPolizaWS ( List<OsCaratulaPz> osCaratulas, String w_user ) {
		ResultadoPoliza[] resultadoPolizas = new ResultadoPoliza[osCaratulas.size()];
		
		for( int i=0; i<osCaratulas.size(); i++ ) {
			if(osCaratulas.get(i).getSucrea().equalsIgnoreCase(w_user)){
				resultadoPolizas[i] = polizaEntityToResultadoPolizaWS(osCaratulas.get(i));
			}
		}
		
		return resultadoPolizas;
	}
	
}
