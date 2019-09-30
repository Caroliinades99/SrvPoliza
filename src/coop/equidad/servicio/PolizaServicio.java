package coop.equidad.servicio;

import java.util.List;

import coop.equidad.model.dao.OsCaratulaPzDao;
import coop.equidad.model.dao.OsCoberturaPzDao;
import coop.equidad.model.dao.OsDetallePzDao;
import coop.equidad.model.dao.OsReaseguroPzDao;
import coop.equidad.model.dao.OsTerceroPzDao;
import coop.equidad.model.entity.OsCaratulaPz;
import coop.equidad.model.entity.OsCoberturaPz;
import coop.equidad.model.entity.OsDetallePz;
import coop.equidad.model.entity.OsReaseguroPz;
import coop.equidad.model.entity.OsTerceroPz;
import coop.equidad.servicios.objws.CoberturaWS;
import coop.equidad.servicios.objws.DetalleWS;
import coop.equidad.servicios.objws.PolizaWS;
import coop.equidad.servicios.objws.ReaseguroWS;
import coop.equidad.servicios.objws.TerceroWS;
import coop.equidad.servicios.suscripcion.Poliza;
import coop.equidad.servicios.suscripcion.PolizaSequence_type3;
import coop.equidad.servicios.suscripcion.PolizaSequence_type4;
import coop.equidad.servicios.suscripcion.ResultadoPoliza;
import coop.equidad.servicios.utils.UtilCommon;

public class PolizaServicio {
	
	/**
	 * 
	 * @param w_sucur
	 * @param w_codpla
	 * @param w_certif
	 * @param w_orden
	 * @return  String w_asegurado, String w_sucur, String w_poliza, String w_certif, String w_codpla, String w_cotizacion
	 */
	public Poliza getPolizaByCotizacion( String w_sucur, String w_codpla, String w_cotiza, String w_user){
		OsCaratulaPzDao osCaratulaDao = new OsCaratulaPzDao();		
		
		
				List<OsCaratulaPz> result = osCaratulaDao.getCaratulasByParams(null, w_sucur, null, null, w_codpla, w_cotiza);
				
				if(result.size()<1)
					return null;
				 
				return this.getPoliza(result.get(0).getId().getSucur(), result.get(0).getId().getCodpla(), result.get(0).getId().getCertif(), result.get(0).getId().getOrden().intValue(),w_user); 
				
				
	}
	
	/**
	 * 
	 * @param w_sucur
	 * @param w_codpla
	 * @param w_certif
	 * @param w_orden
	 * @return
	 */
	public Poliza getPoliza(String w_sucur, String w_codpla, String w_certif, int w_orden, String w_user) {
		Poliza poliza = null;
		
		OsCaratulaPzDao osCaratulaPzDao = new OsCaratulaPzDao();
		OsCaratulaPz osCaratula =  osCaratulaPzDao.getCaratula(w_sucur, w_codpla, w_certif, w_orden);
		
		if( osCaratula != null && osCaratula.getSucrea().equalsIgnoreCase(w_user)) {
			poliza = PolizaWS.polizaEntityToWS(osCaratula);
			
			// cobert
			OsCoberturaPzDao osCoberturaDao = new OsCoberturaPzDao();
			List<OsCoberturaPz> osCoberturas =  osCoberturaDao.getCoberturasByPoliza(w_sucur, w_codpla, w_certif, 
					UtilCommon.getBigDecimalFromInt(w_orden));						
			poliza.setPolizaSequence_type0(CoberturaWS.coberturaEntityToWS(osCoberturas));
			
			// terc
			OsTerceroPzDao osTerceroDao = new OsTerceroPzDao();
			List<OsTerceroPz> osTerceros = osTerceroDao.getTerceroByPoliza(w_sucur, w_codpla, w_certif, 
					UtilCommon.getBigDecimalFromInt(w_orden));
			poliza.setPolizaSequence_type1(TerceroWS.terceroEntityToWS(osTerceros));
			
			// detalle
			OsDetallePzDao osDetalleDao = new OsDetallePzDao();
			List<OsDetallePz> osDetalles = osDetalleDao.getDetallesByPoliza(w_sucur, w_codpla, w_certif, 
					UtilCommon.getBigDecimalFromInt(w_orden));
			poliza.setPolizaSequence_type2(DetalleWS.detalleEntityToWS(osDetalles));
			
			// ctacte
			poliza.setPolizaSequence_type3(new PolizaSequence_type3());
			
			// polemite
			poliza.setPolizaSequence_type4(new PolizaSequence_type4());			
			
			// reaseg
			OsReaseguroPzDao osReaseguroDao = new OsReaseguroPzDao();
			List<OsReaseguroPz> osReaseguros = osReaseguroDao.getReaseguroByPoliza(w_sucur, w_codpla, w_certif, 
					UtilCommon.getBigDecimalFromInt(w_orden));
			poliza.setPolizaSequence_type5(ReaseguroWS.reaseguroEntityToWS(osReaseguros));		
			
		}
						
		return poliza;
	}
	
	/**
	 * 
	 * @param w_asegurado
	 * @param w_sucur
	 * @param w_poliza
	 * @param w_certif
	 * @param w_codpla
	 * @return
	 */
	public ResultadoPoliza[] getPolizas (String w_asegurado, String w_sucur, String w_poliza, String w_certif, String w_codpla, String w_user) {
		ResultadoPoliza[] polizas = null;		
		OsCaratulaPzDao osCaratulaDao = new OsCaratulaPzDao();		
		
		polizas = PolizaWS.polizasEntityToResultadosPolizaWS(
				osCaratulaDao.getCaratulasByParams(w_asegurado, w_sucur, w_poliza, w_certif, w_codpla, null),w_user); 
		
		return polizas;
	}
		
	
	/**
	 * 
	 * @param w_sucur
	 * @param w_codpla
	 * @param w_certif
	 * @param w_orden
	 * @return
	 */
	public boolean existePoliza (String w_sucur, String w_codpla, String w_certif, int w_orden) {
		OsCaratulaPzDao osCaratulaDao = new OsCaratulaPzDao();
		long regsPoliza = osCaratulaDao.getNumRegsPoliza(w_sucur, w_codpla, w_certif, w_orden);
		
		if( regsPoliza == 0 ){
			return false;
		} else {
			return true;		
		}
	}
	
	/**
	 * 
	 * @param w_sucur
	 * @param w_codpla
	 * @param w_certif
	 * @param w_poliza
	 * @return
	 */
	public boolean existePoliza (String w_sucur, String w_codpla, String w_certif, String w_poliza, String w_user) {
		OsCaratulaPzDao osCaratulaDao = new OsCaratulaPzDao();
		long regsPoliza = osCaratulaDao.getNumRegsPoliza(w_sucur, w_codpla, w_certif, w_poliza, w_user);
		
		if( regsPoliza == 0 ){
			return false;
		} else {
			return true;		
		}
	}		

}
