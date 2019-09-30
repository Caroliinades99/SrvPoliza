package coop.equidad.servicio.externo.digest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import coop.equidad.servicios.suscripcion.Detalle;
import coop.equidad.servicios.suscripcion.Tercero;

public class ParametrosDigest {

	public static Map<String, Object> digest(String cadena,
			coop.equidad.servicios.suscripcion.CrearCotizacion crearCotizacion) {
		Map<String, Object> result = new HashMap<>();

		StringTokenizer st = new StringTokenizer(cadena, ",");
		StringTokenizer st2;
		String s, nombreParametro, tipoParametro, codParametro, tipoValor;
		while (st.hasMoreTokens()) {

			s = st.nextToken();
			st2 = new StringTokenizer(s, ":");

			nombreParametro = st2.nextToken();
			tipoParametro = st2.nextToken();

			if (tipoParametro.equalsIgnoreCase("detalle")) {
				codParametro = st2.nextToken();
				tipoValor = st2.nextToken();
				for (Detalle detalle : crearCotizacion.getDetalle()) {
					if (detalle.getCoddet().equalsIgnoreCase(codParametro)) {

						try {
							Method method = detalle.getClass().getMethod("get" + tipoValor);
							result.put(nombreParametro, method.invoke(detalle));
						} catch (NoSuchMethodException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (SecurityException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IllegalAccessException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IllegalArgumentException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (InvocationTargetException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						break;
					}
				}
			} else if (tipoParametro.equalsIgnoreCase("tercero")) {
				String codVin = st2.nextToken();
				for (Tercero tercero : crearCotizacion.getTercero()) {
					if (tercero.getCodVinculacion() == Integer.parseInt(codVin)) {

						try {
							Method method = tercero.getClass().getMethod("get" + st2.nextToken());
							result.put(nombreParametro, method.invoke(tercero));
						} catch (NoSuchMethodException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (SecurityException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IllegalAccessException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IllegalArgumentException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (InvocationTargetException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						break;
					}
				}
			}

		}

		return result;
	}

	public static void main(String[] args) {
		digest("placa:detalle:2345:StringValue,numDoc:tercero:1:valor,tipDoc:detalle:5645:StringValue", null);
	}

}
