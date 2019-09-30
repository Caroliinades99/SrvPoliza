package coop.equidad.servicios.objws;

import java.util.List;

import coop.equidad.model.entity.OsCaratula;
import coop.equidad.servicios.suscripcion.Poliza;
import coop.equidad.servicios.suscripcion.ResultadoPoliza;
import coop.equidad.servicios.utils.UtilCommon;

public class PolizaCtWS {
	
	/**
	 * 
	 * @param osCaratula
	 * @return
	 */
	public static Poliza polizaEntityToWS ( OsCaratula osCaratula ) {
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
		poliza.setCotizacion(osCaratula.getCotizacion());
		poliza.setVprima(UtilCommon.getFloatFromBigDecimal(osCaratula.getVprima()));
		
		return poliza;
	}
	
	/**
	 * 
	 * @param osCaratula
	 * @return
	 */
	public static ResultadoPoliza polizaEntityToResultadoPolizaWS ( OsCaratula osCaratula ) {
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
	public static ResultadoPoliza[] polizasEntityToResultadosPolizaWS ( List<OsCaratula> osCaratulas ) {
		ResultadoPoliza[] resultadoPolizas = new ResultadoPoliza[osCaratulas.size()];
		
		for( int i=0; i<osCaratulas.size(); i++ ) {
			resultadoPolizas[i] = polizaEntityToResultadoPolizaWS(osCaratulas.get(i));
		}
		
		return resultadoPolizas;
	}
	
}
