package coop.equidad.servicio.externo;

import java.util.Map;

import coop.equidad.servicio.externo.exception.CallException;

public interface ServicioExterno<valor> {
	public abstract valor getValor(Map<String, Object> parametros) throws CallException; 
}
