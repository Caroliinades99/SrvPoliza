package coop.equidad.servicios.utils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import coop.equidad.servicios.constantes.CONSTANTES;
import coop.equidad.servicios.suscripcion.ContextoRespuesta;
import coop.equidad.servicios.suscripcion.CrearCotizacion;
import coop.equidad.servicios.suscripcion.Detalle;
import coop.equidad.servicios.suscripcion.Error;
import coop.equidad.servicios.suscripcion.Poliza;
import coop.equidad.servicios.suscripcion.PolizaSequence_type0;
import coop.equidad.servicios.suscripcion.PolizaSequence_type1;
import coop.equidad.servicios.suscripcion.PolizaSequence_type2;
import coop.equidad.servicios.suscripcion.PolizaSequence_type3;
import coop.equidad.servicios.suscripcion.PolizaSequence_type4;
import coop.equidad.servicios.suscripcion.PolizaSequence_type5;
import coop.equidad.servicios.suscripcion.Producto;
import coop.equidad.servicios.suscripcion.Reaseguro;
import coop.equidad.servicios.suscripcion.Tercero;

public class UtilWS {
	/**
	 * @param mssgValidacion
	 * @return
	 */
	public static ContextoRespuesta getContextoRespuestaVal ( Map<String, String> mssgValidacion ) {
		ContextoRespuesta contextoRespuesta = new ContextoRespuesta();
		contextoRespuesta.setCodigoTx(CONSTANTES.COD_RESP_FALLIDO);
		contextoRespuesta.setFechaTx(Calendar.getInstance());
		contextoRespuesta.setErrores(getErrores(mssgValidacion));
		
		return contextoRespuesta;
	}
	
	/**
	 * 
	 * @param mssgValidacion
	 * @return
	 */
	public static ContextoRespuesta getContextoRespuestaTarErrSuscripcion ( String mensaje ) {
		ContextoRespuesta contextoRespuesta = new ContextoRespuesta();
		contextoRespuesta.setCodigoTx(CONSTANTES.COD_RESP_FALLIDO);
		contextoRespuesta.setFechaTx(Calendar.getInstance());
		
		Error[] errores= new Error[1];
		errores[0]= new Error();
		errores[0].setCodError(CONSTANTES.RESP_SP_SEG_ERR);
		errores[0].setDescError(mensaje);
		contextoRespuesta.setErrores(errores);
		
		return contextoRespuesta;
	}
	/**
	 * 
	 * @param mssgValidacion
	 * @return
	 */
	public static ContextoRespuesta getContextoRespuestaTarErrSuscripcion ( String mensaje, String codigo ) {
		ContextoRespuesta contextoRespuesta = new ContextoRespuesta();
		contextoRespuesta.setCodigoTx(CONSTANTES.COD_RESP_FALLIDO);
		contextoRespuesta.setFechaTx(Calendar.getInstance());
		
		Error[] errores= new Error[1];
		errores[0]= new Error();
		errores[0].setCodError(codigo);
		errores[0].setDescError(CONSTANTES.getMessage(codigo));
		contextoRespuesta.setErrores(errores);
		
		return contextoRespuesta;
	}

	/**
	 * 
	 * @param mssgValidacion
	 * @return
	 */
	public static ContextoRespuesta getContextoRespuestaTarErr ( Map<String, String> mssgValidacion ) {
		ContextoRespuesta contextoRespuesta = new ContextoRespuesta();
		contextoRespuesta.setCodigoTx(CONSTANTES.COD_RESP_EXITOSO);
		contextoRespuesta.setFechaTx(Calendar.getInstance());
		contextoRespuesta.setErrores(getErrores(mssgValidacion));
		
		return contextoRespuesta;
	}
	/**
	 * @return
	 */
	public static ContextoRespuesta getContextoRespuestaEx () {
		ContextoRespuesta contextoRespuesta = new ContextoRespuesta();
		contextoRespuesta.setCodigoTx(CONSTANTES.COD_RESP_EXITOSO);
		contextoRespuesta.setFechaTx(Calendar.getInstance());
		
		return contextoRespuesta;
	}
	
	/**
	 * @param e
	 * @return
	 */
	public static ContextoRespuesta getContextoRespuestaErrorException ( Exception e ) {
		ContextoRespuesta contextoRespuesta = new ContextoRespuesta();
		contextoRespuesta.setCodigoTx(CONSTANTES.COD_RESP_FALLIDO);
		contextoRespuesta.setFechaTx(Calendar.getInstance());
		contextoRespuesta.setErrores(getErrores(e));
		
		return contextoRespuesta;
	}
	
	/**
	 * @param mssgValidacion
	 * @return
	 */
	public static Error[] getErrores ( Exception e ) {
		Error[] errores = new Error[2];
		
		Error errorMessage = new Error();
		errorMessage.setCodError(CONSTANTES.COD_RESP_ERROR_MESSAGE);
		errorMessage.setDescError(e.getMessage());
		
		Error errorCause = new Error();
		errorCause.setCodError(CONSTANTES.COD_RESP_ERROR_CAUSE);
		errorCause.setDescError("" + e.getCause());
		
		errores[0] = errorMessage;
		errores[1] = errorCause;
		
		return errores;
	}
	
	/**
	 * @param mssgValidacion
	 * @return
	 */
	public static Error[] getErrores (Map<String, String> mssgValidacion ) {
		Error[] errores = new Error[mssgValidacion.size()]; 		
		Iterator<String> it = mssgValidacion.keySet().iterator();		
		int i = 0;	
		
		while(it.hasNext()) {					
			String key = it.next();
			Error error = new Error();	
			
			error.setCodError(key);
			error.setDescError(mssgValidacion.get(key));
			errores[i] = error;
			
			i++;
		}
		
		return errores;
	}
	
	/**
	 * @param nroCot
	 * @return
	 */
	public static String nroCotizacionComp (String nroCot) {
		String nroCotComp = CONSTANTES.PREF_NRO_COT + 
				String.format("%07d", Integer.parseInt(nroCot));
		return nroCotComp;
	}
	
	/**
	 * @param detalles
	 * @param sucur
	 * @param codpla
	 * @param certif
	 */
	public static void setDetallesReq ( Detalle[] detalles, String sucur, String codpla, String certif ){
		for( int i=0; i<detalles.length; i++ ) {
			detalles[i].setSucur(sucur);
			detalles[i].setCodpla(codpla);
			detalles[i].setCertif(certif);
		}
	}
	
	
	public static Map<Integer, Integer> getCodsTerceros ( Tercero[] terceros ) {
		Map<Integer, Integer> codsTerceros = new HashMap<Integer, Integer>();
		
		for( int i=0; i<terceros.length; i++ ) {
			codsTerceros.put(terceros[i].getCodVinculacion(), terceros[i].getCodigo());
		}
		
		return codsTerceros;
	}
	
	/**
	 * @param value
	 * @return
	 */
	public static Reaseguro getReaseguro(Poliza value) {
		Reaseguro reaseguro = new Reaseguro();
			reaseguro.setSucur(value.getSucur());
			reaseguro.setCodpla(value.getCodpla());
			reaseguro.setCertif(value.getCertif());
			reaseguro.setFecini(value.getFecini());
			reaseguro.setFecter(value.getFecter());
			reaseguro.setTomador(value.getTomador());
			reaseguro.setComision(value.getComision());
		
		return reaseguro;
	}
	
	/**
	 * @param crearCotizacion
	 * @return
	 */
	public static Poliza getPoliza( CrearCotizacion crearCotizacion ) {
		Poliza poliza = new Poliza();
		
		poliza.setSucur(crearCotizacion.getSucur());
		poliza.setFecini(crearCotizacion.getFecini());
		poliza.setFecter(crearCotizacion.getFecter());
		poliza.setComision(crearCotizacion.getComision());
		poliza.setVaseg(crearCotizacion.getVaseg());
		
		PolizaSequence_type0 polizaSequence_type0 = new PolizaSequence_type0();
		
		PolizaSequence_type1 polizaSequence_type1 = new PolizaSequence_type1();
		polizaSequence_type1.setTercero(crearCotizacion.getTercero());
		
		PolizaSequence_type2 polizaSequence_type2 = new PolizaSequence_type2();
		polizaSequence_type2.setDetalle(crearCotizacion.getDetalle());
		
		PolizaSequence_type3 polizaSequence_type3 = new PolizaSequence_type3();		
		PolizaSequence_type4 polizaSequence_type4 = new PolizaSequence_type4();
		PolizaSequence_type5 polizaSequence_type5 = new PolizaSequence_type5();
		
		poliza.setPolizaSequence_type0(polizaSequence_type0);
		poliza.setPolizaSequence_type1(polizaSequence_type1);
		poliza.setPolizaSequence_type2(polizaSequence_type2);
		poliza.setPolizaSequence_type3(polizaSequence_type3);
		poliza.setPolizaSequence_type4(polizaSequence_type4);
		poliza.setPolizaSequence_type5(polizaSequence_type5);
		
		return poliza;
	}
	
	/**
	 * 
	 * @param polizas
	 * @return
	 */
	public static Poliza[] getPolizaArray( ArrayList<Poliza> polizas ) {
		Poliza[] polizasResp = new Poliza[polizas.size()];
		
		for( int i=0; i<polizas.size(); i++ ){
			polizasResp[i] = polizas.get(i);
		}
		
		return polizasResp;
	}
	
	/**
	 * 
	 * @param codplaOrigen
	 * @return
	 */
	public static String[] getCodpla ( String[] codplaOrigen ) {
		List<String> list = new ArrayList<String>(Arrays.asList(codplaOrigen));
		
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.addAll(list);		
		list.clear();
		list.addAll(hashSet);
		
		String[] codpla = list.toArray(new String[0]);
		return codpla;
	}
	
	/**
	 * 
	 * @param productoOrigen
	 * @return
	 */
	public static Producto[] getProducto ( Producto[] productoOrigen ) {
		List<Producto> list = new ArrayList<Producto>(Arrays.asList(productoOrigen));
		
		HashSet<Producto> hashSet = new HashSet<Producto>();
		hashSet.addAll(list);		
		list.clear();
		list.addAll(hashSet);
		
		Producto[] producto = list.toArray(new Producto[0]);
		return producto;
	}
	
	/**
	 * 
	 * @param detalles
	 * @param sucur
	 * @param codpla
	 * @param certif
	 * @param coddet
	 * @param valString
	 * @return
	 */
	public static Detalle[] getDetallesNemotec( Detalle[] detalles, String sucur, String codpla, String certif, String coddet, String valString ) {		
		List<Detalle> list = new ArrayList<Detalle>(Arrays.asList(detalles));
		list.add(getDetalleStd(sucur, codpla, certif, coddet, valString));
		
		Detalle[] detallesNemotec = list.toArray(new Detalle[0]);	
		return detallesNemotec;
	}
	
	/**
	 * 
	 * @param detalles
	 * @param rsTarifar
	 * @return
	 */
	public static Detalle[] getDetallesRsTarifar( Detalle[] detalles, Map<String, String> rsTarifar, String sucur, String codpla, String certif ) {		
		List<Detalle> list = new ArrayList<Detalle>(Arrays.asList(detalles));
		list.addAll(getDetalleRsTarifar(rsTarifar, sucur, codpla, certif));		
		
		Detalle[] detallesRsTarifar = list.toArray(new Detalle[0]);	
		return detallesRsTarifar;
	}
	
	/**
	 * 
	 * @param sucur
	 * @param codpla
	 * @param certif
	 * @param coddet
	 * @param valString
	 * @return
	 */
	private static Detalle getDetalleStd ( String sucur, String codpla, String certif, String coddet, String valString ) {
		Detalle detalle = new Detalle();
		detalle.setSucur(sucur);
		detalle.setCodpla(codpla);
		detalle.setCertif(certif);
		detalle.setCoddet(coddet);		
		detalle.setValdate(new Date());
		detalle.setValnumber(BigDecimal.ZERO);
		detalle.setValstring(valString);	
		
		return detalle;
	}
	
	/**
	 * 
	 * @param rsTarifar
	 * @param sucur
	 * @param codpla
	 * @param certif
	 * @return
	 */
	private static List<Detalle> getDetalleRsTarifar ( Map<String, String> rsTarifar, String sucur, String codpla, String certif ) {
		List<Detalle> detalles = new ArrayList<Detalle>();
		
		Detalle detalleIva = new Detalle();
		detalleIva.setSucur(sucur);
		detalleIva.setCodpla(codpla);
		detalleIva.setCertif(certif);
		detalleIva.setCoddet(CONSTANTES.COD_DET_IVA);		
		detalleIva.setValdate(new Date());
		detalleIva.setValnumber(BigDecimal.ZERO);
		detalleIva.setValstring(rsTarifar.get(CONSTANTES.PARAM_TAR_VIVA));
		
		Detalle detalleGastos = new Detalle();
		detalleGastos.setSucur(sucur);
		detalleGastos.setCodpla(codpla);
		detalleGastos.setCertif(certif);
		detalleGastos.setCoddet(CONSTANTES.COD_DET_GASTOS);		
		detalleGastos.setValdate(new Date());
		detalleGastos.setValnumber(BigDecimal.ZERO);
		detalleGastos.setValstring(rsTarifar.get(CONSTANTES.PARAM_TAR_VGASTOS));
		
		Detalle detalleTotal = new Detalle();
		detalleTotal.setSucur(sucur);
		detalleTotal.setCodpla(codpla);
		detalleTotal.setCertif(certif);
		detalleTotal.setCoddet(CONSTANTES.COD_DET_TOTAL);		
		detalleTotal.setValdate(new Date());
		detalleTotal.setValnumber(BigDecimal.ZERO);
		detalleTotal.setValstring(rsTarifar.get(CONSTANTES.PARAM_TAR_VTOTAL));
		
		detalles.add(detalleIva);
		detalles.add(detalleGastos);
		detalles.add(detalleTotal);
		
		return detalles;
	}

}
