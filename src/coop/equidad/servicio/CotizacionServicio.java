package coop.equidad.servicio;

import java.util.List;

import coop.equidad.model.dao.OsCaratulaDao;
import coop.equidad.model.dao.OsCoberturaDao;
import coop.equidad.model.dao.OsDetalleDao;
import coop.equidad.model.dao.OsReaseguroDao;
import coop.equidad.model.dao.OsTerceroDao;
import coop.equidad.model.dao.PrDetallesDao;
import coop.equidad.model.entity.OsCaratula;
import coop.equidad.model.entity.OsCobertura;
import coop.equidad.model.entity.OsDetalle;
import coop.equidad.model.entity.OsReaseguro;
import coop.equidad.model.entity.OsTercero;
import coop.equidad.servicios.objws.CoberturaCtWS;
import coop.equidad.servicios.objws.PolizaCtWS;
import coop.equidad.servicios.objws.ReaseguroCtWS;
import coop.equidad.servicios.objws.DetalleCtWS;
import coop.equidad.servicios.objws.TerceroCtWS;
import coop.equidad.servicios.suscripcion.ActualizarCotizacion;
import coop.equidad.servicios.suscripcion.Detalle;
import coop.equidad.servicios.suscripcion.Poliza;
import coop.equidad.servicios.suscripcion.PolizaSequence_type0;
import coop.equidad.servicios.suscripcion.PolizaSequence_type3;
import coop.equidad.servicios.suscripcion.PolizaSequence_type4;
import coop.equidad.servicios.utils.UtilCommon;

public class CotizacionServicio {
	
	/**
	 * 
	 * @param w_sucur
	 * @param w_codpla
	 * @param w_certif
	 * @param w_orden
	 * @return
	 */
	public Poliza getCotizacion(String w_sucur, String w_codpla, String w_certif, int w_orden) {
		Poliza poliza = null;
		
		
		//YA PARA AQUI SE ENCUENTRA INGRESADO ESE NIT MAL
		OsCaratulaDao osCaratulaDao = new OsCaratulaDao();
		OsCaratula osCaratula =  osCaratulaDao.getCaratula(w_sucur, w_codpla, w_certif, w_orden);
		
		if( osCaratula != null ) {
			poliza = PolizaCtWS.polizaEntityToWS(osCaratula);
			
			// cobert
			OsCoberturaDao osCoberturaDao = new OsCoberturaDao();
			List<OsCobertura> osCoberturas =  osCoberturaDao.getCoberturasByPoliza(w_sucur, w_codpla, w_certif, 
					UtilCommon.getBigDecimalFromInt(w_orden));						
			poliza.setPolizaSequence_type0(CoberturaCtWS.coberturaEntityToWS(osCoberturas));
			
			// terc
			OsTerceroDao osTerceroDao = new OsTerceroDao();
			List<OsTercero> osTerceros = osTerceroDao.getTerceroByPoliza(w_sucur, w_codpla, w_certif, 
					UtilCommon.getBigDecimalFromInt(w_orden));
			poliza.setPolizaSequence_type1(TerceroCtWS.terceroEntityToWS(osTerceros));
			
			// detalle
			OsDetalleDao osDetalleDao = new OsDetalleDao();
			List<OsDetalle> osDetalles = osDetalleDao.getDetallesByPoliza(w_sucur, w_codpla, w_certif, 
					UtilCommon.getBigDecimalFromInt(w_orden));
			poliza.setPolizaSequence_type2(DetalleCtWS.detalleEntityToWS(osDetalles));
			
			// ctacte
			poliza.setPolizaSequence_type3(new PolizaSequence_type3());
			
			// polemite
			poliza.setPolizaSequence_type4(new PolizaSequence_type4());			
			
			// reaseg
			OsReaseguroDao osReaseguroDao = new OsReaseguroDao();
			List<OsReaseguro> osReaseguros = osReaseguroDao.getReaseguroByPoliza(w_sucur, w_codpla, w_certif, 
					UtilCommon.getBigDecimalFromInt(w_orden));
			poliza.setPolizaSequence_type5(ReaseguroCtWS.reaseguroEntityToWS(osReaseguros));		
			
		}
						
		return poliza;
	}
	
	/**
	 * 
	 * @param w_sucur
	 * @param w_codpla
	 * @param w_certif
	 * @param w_orden
	 * @return
	 */
	public boolean setCotizacion(ActualizarCotizacion actualizarCotizacion, String w_user) {
		boolean update = false;
		
		// detalle
		setDetalles(w_user, actualizarCotizacion.getDetalle());
		
		update = true;
		return update;
	}
	
	/**
	 * 
	 * @param w_sucur
	 * @param w_codpla
	 * @param w_certif
	 * @param w_orden
	 * @return
	 */
	public PolizaSequence_type0 getCoberturasByPoliza ( String w_sucur, String w_codpla, String w_certif, int w_orden ) {				
		OsCoberturaDao osCoberturaDao = new OsCoberturaDao();
		List<OsCobertura> osCoberturas =  osCoberturaDao.getCoberturasByPoliza(w_sucur, w_codpla, w_certif, 
				UtilCommon.getBigDecimalFromInt(w_orden));
		
		PolizaSequence_type0 polizaSequence_type0 = CoberturaCtWS.coberturaEntityToWS(osCoberturas);	
		return polizaSequence_type0;
	}
	
	/**
	 * 
	 * @param w_sucur
	 * @param w_codpla
	 * @param w_certif
	 * @param w_orden
	 * @return
	 */
	public boolean existeCotizacion (String w_sucur, String w_codpla, String w_certif, int w_orden) {
		OsCaratulaDao osCaratulaDao = new OsCaratulaDao();
		long regsPoliza = osCaratulaDao.getNumRegsCotizacion(w_sucur, w_codpla, w_certif, 
				UtilCommon.getBigDecimalFromInt(w_orden));
		
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
	 * @param w_orden
	 * @return
	 */
	public OsCaratula getCaratula (String w_sucur, String w_codpla, String w_certif, int w_orden) {
		OsCaratulaDao osCaratulaDao = new OsCaratulaDao();
		OsCaratula regsPoliza = osCaratulaDao.getCaratula(w_sucur, w_codpla, w_certif, 
				UtilCommon.getBigDecimalFromInt(w_orden));
		
		return regsPoliza;
	}
	/**
	 * 
	 * @param w_sucur
	 * @param w_codpla
	 * @param w_certif
	 * @param w_coddet
	 * @return
	 */
	public boolean existeDetalle (String w_sucur, String w_codpla, String w_certif, String w_coddet) {
		OsDetalleDao osDetalleDao = new OsDetalleDao();
		long numDetalles = osDetalleDao.getNumDetallesByKey(w_sucur, w_codpla, w_certif, w_coddet);
		
		if( numDetalles == 0 ){
			return false;
		} else {
			return true;		
		}
	}
	
	/**
	 * 
	 * @param detalles
	 */
	public void setDetalles ( String w_user ,Detalle ... detalles) {
		PrDetallesDao prDetallesDao = new PrDetallesDao();
		
		for( Detalle detalle: detalles ) {
			if( !existeDetalle(detalle.getSucur(), detalle.getCodpla(), detalle.getCertif(), detalle.getCoddet()) ) {
				prDetallesDao.spPrDetalles(
						detalle.getSucur(), 
						detalle.getCertif(), 
						detalle.getCoddet(), 
						detalle.getCodpla(), 
						detalle.getValnumber(), 
						UtilCommon.getFechaFormato(detalle.getValdate()),
						detalle.getValstring() == null ? "" : detalle.getValstring(),w_user);
			} else{
				;
			}
		}
		
	}
}
