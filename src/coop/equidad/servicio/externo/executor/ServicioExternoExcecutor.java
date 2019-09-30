package coop.equidad.servicio.externo.executor;

import java.util.Map;
import java.util.concurrent.Callable;

import coop.equidad.servicios.oper.CrearCotizacionOper;
import coop.equidad.servicios.suscripcion.Poliza;

public class ServicioExternoExcecutor implements Callable<String>{
	
	String w_sucur;
	String w_certif; 
	String w_codpla; 
	int w_orden; 
	coop.equidad.servicios.suscripcion.CrearCotizacion crearCotizacion; 
	Poliza poliza; 
	Map<String,Object> resultado;
	
	public ServicioExternoExcecutor(String w_sucur, String w_certif, String w_codpla, int w_orden, coop.equidad.servicios.suscripcion.CrearCotizacion crearCotizacion, Poliza poliza, Map<String,Object> resultado){
		
		this.w_sucur=w_sucur;
		this.w_certif=w_certif; 
		this.w_codpla=w_codpla; 
		this.w_orden=w_orden; 
		this.crearCotizacion=crearCotizacion; 
		this.poliza=poliza; 
		this.resultado=resultado;
		
	}
	
	@Override
	public String call() throws Exception {
		CrearCotizacionOper.callExternalServices(w_sucur, w_certif, w_codpla, w_orden, crearCotizacion, poliza, resultado);
		return "OK";
	}

}
