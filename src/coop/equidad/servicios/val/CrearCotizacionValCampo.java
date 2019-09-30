package coop.equidad.servicios.val;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import coop.equidad.servicios.constantes.CONSTANTES;
import coop.equidad.servicios.constantes.CodigosError;
import coop.equidad.servicios.suscripcion.Cobertura;
import coop.equidad.servicios.suscripcion.CrearCotizacion;
import coop.equidad.servicios.suscripcion.Detalle;
import coop.equidad.servicios.suscripcion.Producto;
import coop.equidad.servicios.suscripcion.Reaseguro;
import coop.equidad.servicios.suscripcion.Tercero;
import coop.equidad.servicios.utils.UtilVal;
import com.seven4n.sisa.client.SisaStub;
import com.seven4n.sisa.client.SisaStub.AmparoSisa;
import com.seven4n.sisa.client.SisaStub.HistoricoPolizaSisa;
import com.seven4n.sisa.client.SisaStub.HistoricoPolizas;
import com.seven4n.sisa.client.SisaStub.HistoricoSiniestroSisa;
import com.seven4n.sisa.client.SisaStub.HistoricoSiniestros;
import com.seven4n.sisa.client.SisaCallbackHandler;
import coop.equidad.model.dao.Fasecolda1Dao;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import coop.equidad.gacelaplus.cexper.servicio.SisaServicioImpl;
import coop.equidad.model.dao.OsSuscEquivCiudadDao;
/**import coop.equidad.model.entity.Fasecolda1;**/
import coop.equidad.model.entity.S03010;

public class CrearCotizacionValCampo {

	/**
	 * @param crearCotizacion
	 * @return
	 */
	public static Map<String, String> valCrearCotizacion(CrearCotizacion crearCotizacion) {
		Map<String, String> mssgValidacion = new HashMap<String, String>();

		/**
		 * Val param cot
		 */
		if (crearCotizacion.getParametroCotizacion() == null) {
			mssgValidacion.put(CodigosError.COD_VALCRC_PARAMCOT.getCodError(),
					CodigosError.COD_VALCRC_PARAMCOT.getDescError());
		} else {

			// VALIDAN EL USUARIO, EN ESTE EJEMPLO SERA "DTORRES"
			if (UtilVal.validaString(crearCotizacion.getParametroCotizacion().getUsuario())
					|| UtilVal.validaLongitudString(crearCotizacion.getParametroCotizacion().getUsuario(), 5, 20)) {
				mssgValidacion.put(CodigosError.COD_VALCRC_PARAMCOT_USUARIO.getCodError(),
						CodigosError.COD_VALCRC_PARAMCOT_USUARIO.getDescError());
			}
			// VALIDAN EL TIPO DE OBJETO, EN ESTE EJEMPLO "CERTIFICADO"
			if (UtilVal.validaString(crearCotizacion.getParametroCotizacion().getTipoObjeto())
					|| UtilVal.validaLongitudString(crearCotizacion.getParametroCotizacion().getTipoObjeto(), 5, 20)) {
				mssgValidacion.put(CodigosError.COD_VALCRC_PARAMCOT_TIPO_OBJ.getCodError(),
						CodigosError.COD_VALCRC_PARAMCOT_TIPO_OBJ.getDescError());
			}
		}

		/**
		 *  */
		// VALIDAN EL COMP, EN ESTE EJEMPLO "1"
		if (UtilVal.validaString(crearCotizacion.getComp())
				|| UtilVal.validaLongitudString(crearCotizacion.getComp(), 1, 1)) {
			mssgValidacion.put(CodigosError.COD_VALCRC_POL_COMP.getCodError(),
					CodigosError.COD_VALCRC_POL_COMP.getDescError());
		}
		// VALIDAN LA SUCURSAL, EN ESTE EJEMPLO "100023"
		if (UtilVal.validaString(crearCotizacion.getSucur())
				|| UtilVal.validaLongitudString(crearCotizacion.getSucur(), 5, 10)) {
			mssgValidacion.put(CodigosError.COD_VALCRC_POL_SUCUR.getCodError(),
					CodigosError.COD_VALCRC_POL_SUCUR.getDescError());
		}
		if (UtilVal.validaVacioDate(crearCotizacion.getFecini())) {
			mssgValidacion.put(CodigosError.COD_VALCRC_POL_FECINI.getCodError(),
					CodigosError.COD_VALCRC_POL_FECINI.getDescError());
		}
		if (UtilVal.validaVacioDate(crearCotizacion.getFecter())) {
			mssgValidacion.put(CodigosError.COD_VALCRC_POL_FECTER.getCodError(),
					CodigosError.COD_VALCRC_POL_FECTER.getDescError());
		}
		if (UtilVal.validaVacioFloat(crearCotizacion.getComision())) {
			mssgValidacion.put(CodigosError.COD_VALCRC_POL_COMISION.getCodError(),
					CodigosError.COD_VALCRC_POL_COMISION.getDescError());
		}
		if (UtilVal.validaVacioFloat(crearCotizacion.getVaseg())) {
			mssgValidacion.put(CodigosError.COD_VALCRC_POL_VASEG.getCodError(),
					CodigosError.COD_VALCRC_POL_VASEG.getDescError());
		}

		/**
		 * Val complexType poliza
		 */
		if (crearCotizacion.getProducto() == null || crearCotizacion.getProducto().length == 0
				|| UtilVal.validaMaxLongArray(crearCotizacion.getProducto(), CONSTANTES.MAX_PRODUCTOS_COTIZA)) {
			mssgValidacion.put(CodigosError.COD_VALCRC_POL_PROD.getCodError(),
					CodigosError.COD_VALCRC_POL_PROD.getDescError());
		} else {
			if (validaProductos(crearCotizacion.getProducto())) {
				mssgValidacion.put(CodigosError.COD_VALCRC_POL_PRODUCTO_DET.getCodError(),
						CodigosError.COD_VALCRC_POL_PRODUCTO_DET.getDescError());
			}
		}

		if (crearCotizacion.getTercero() == null || crearCotizacion.getTercero().length == 0) {
			mssgValidacion.put(CodigosError.COD_VALCRC_POL_TERCERO.getCodError(),
					CodigosError.COD_VALCRC_POL_TERCERO.getDescError());
		} else {
			if (validaTerceros(crearCotizacion.getTercero())) {
				mssgValidacion.put(CodigosError.COD_VALCRC_POL_TERCERO_DET.getCodError(),
						CodigosError.COD_VALCRC_POL_TERCERO_DET.getDescError());
			}
		}

		if (crearCotizacion.getDetalle() == null || crearCotizacion.getDetalle().length == 0) {
			mssgValidacion.put(CodigosError.COD_VALCRC_POL_DETALLE.getCodError(),
					CodigosError.COD_VALCRC_POL_DETALLE.getDescError());
		} else {
			if (validaDetalles(crearCotizacion.getDetalle())) {
				mssgValidacion.put(CodigosError.COD_VALCRC_POL_DETALLE_DET.getCodError(),
						CodigosError.COD_VALCRC_POL_DETALLE_DET.getDescError());
			}
		}

		return mssgValidacion;
	}

	/**
	 * 
	 * @param productos
	 * @return
	 */
	public static boolean validaProductos(Producto[] productos) {
		boolean valProducto = false;

		for (int i = 0; i < productos.length; i++) {
			if (UtilVal.validaString(productos[i].getCodpla())
					|| UtilVal.validaLongitudString(productos[i].getCodpla(), 4, 20)
					|| UtilVal.validaString(productos[i].getNemotec())
					|| UtilVal.validaLongitudString(productos[i].getNemotec(), 4, 20)) {
				valProducto = true;
			}
		}

		return valProducto;
	}

	/**
	 * @param terceros
	 * @return
	 */
	public static boolean validaTerceros(Tercero[] terceros) {
		boolean valTercero = false;

		for (int i = 0; i < terceros.length; i++) {

			terceros[i].setFechaNacimiento(terceros[i].getFechaNacimiento() == null ? Calendar.getInstance().getTime()
					: terceros[i].getFechaNacimiento());

			if (UtilVal.validaVacioInteger(terceros[i].getCodigo()) || UtilVal.validaString(terceros[i].getNombre())
					|| UtilVal.validaLongitudString(terceros[i].getNombre(), 3, 50)
					|| UtilVal.validaString(terceros[i].getSexo())
					|| UtilVal.validaLongitudString(terceros[i].getSexo(), 1, 10)
					|| UtilVal.validaString(terceros[i].getTipoPersona())
					|| UtilVal.validaLongitudString(terceros[i].getTipoPersona(), 1, 10)
					|| UtilVal.validaVacioDate(terceros[i].getFechaNacimiento())
					|| UtilVal.validaVacioInteger(terceros[i].getVinculacion())
					|| UtilVal.validaVacioInteger(terceros[i].getCodVinculacion())
					|| UtilVal.validaVacioInteger(terceros[i].getParentesco())) {
				valTercero = true;
			}
		}

		return valTercero;
	}

	/**
	 * @param detalles
	 * @return
	 */
	public static boolean validaDetalles(Detalle[] detalles) {
		boolean valDetalles = false;

		for (int i = 0; i < detalles.length; i++) {
			if (UtilVal.validaString(detalles[i].getCoddet())
					|| UtilVal.validaLongitudString(detalles[i].getCoddet(), 3, 20) ||
					// ( UtilVal.validaVacioFloat(detalles[i].getValnumber()) &&
					(detalles[i].getValnumber() == null && UtilVal.validaVacioDate(detalles[i].getValdate())
							&& UtilVal.validaLongitudStringNull(detalles[i].getValstring(), 1, 20))) {
				valDetalles = true;
			}
		}

		return valDetalles;
	}

	/**
	 * @param coberturas
	 * @return
	 */
	public static boolean validaCoberturas(Cobertura[] coberturas) {
		boolean valCoberturas = false;

		for (int i = 0; i < coberturas.length; i++) {
			if (UtilVal.validaVacioDate(coberturas[i].getFecini())
					|| UtilVal.validaVacioDate(coberturas[i].getFecfin())) {
				valCoberturas = true;
			}
		}

		return valCoberturas;
	}

	public static boolean validaReaseguro(Reaseguro reaseguro) {
		boolean valReaseguro = false;

		if (UtilVal.validaVacioDate(reaseguro.getFecini()) || UtilVal.validaVacioDate(reaseguro.getFecter())
				|| UtilVal.validaVacioFloat(reaseguro.getComision())) {
			valReaseguro = true;
		}

		return valReaseguro;
	}

//	public static String validarCodigo(String sucur, String certif, String codpla, int orden,
//			CrearCotizacion crearCotizacion) throws ParseException {
//		OsSuscEquivCiudadDao equivCiudadDao = new OsSuscEquivCiudadDao();
//
//		List<S03010> listaDetalles = equivCiudadDao.getDetalleParametrosPorCodigo(CONSTANTES.TIPO_AUTO,
//				CONSTANTES.CLASE_TIPO_AUTO, codpla);
//
//		for (S03010 s03010 : listaDetalles) {
//			if (codpla.trim().equals(s03010.getS03010PK().getCodigo())) {
//				String codigoFasecolda = "", modeloRequest = "";
//				for (Detalle detalle : crearCotizacion.getDetalle()) {
//					if (detalle.getCoddet().equalsIgnoreCase("01010005")) {
//						codigoFasecolda = detalle.getValstring();
//					}
//					if (detalle.getCoddet().equalsIgnoreCase("FALA0034")) {
//						modeloRequest = detalle.getValstring();
//					}
//				}
//				Date fechaActual = new Date();
//				SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
//				String fechaSistema = formateador.format(fechaActual);
//				Date fechaActualidad = formateador.parse(fechaSistema);
//				for (Detalle detalle2 : crearCotizacion.getDetalle()) {
//					if (detalle2.getCoddet().equalsIgnoreCase("01010120")) {
//						String placa = detalle2.getValstring();
//						String valstring = CrearCotizacionValCampo.experienciaContinuidad(
//								crearCotizacion.getTercero()[0].getCodigo(), "1", placa, codigoFasecolda,
//								modeloRequest);
//						Detalle detalle = new Detalle();
//						detalle.setCertif(certif);
//						detalle.setCoddet("CONTI001");
//						detalle.setCodpla(codpla);
//						detalle.setInciso(0);
//						detalle.setOrden(orden);
//						detalle.setSucur(sucur);
//						detalle.setValdate(fechaActualidad);
//						detalle.setValnumber(BigDecimal.ZERO);
//						detalle.setValstring(valstring);
//
//						crearCotizacion.addDetalle(detalle);
//					}
//				}
//
//			}
//		}
//
//		return null;
//	}
//
//	public static String experienciaContinuidad(int numdoc, String tipdoc, String placa, String codigoFasecolda,
//			String modeloRequest) throws ParseException {
//		int pasoSiniestro = 0;
//
//		Date fechaActual = new Date();
//		SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
//		String fechaSistema = formateador.format(fechaActual);
//		Date fechaActualidad = formateador.parse(fechaSistema);
//		String valstring = "01".trim();
//
//		SisaServicioImpl sisa = new SisaServicioImpl();
//		sisa.setUsuario("90598600284155");
//		sisa.setClave("12121212");
//
//		HistoricoPolizas historico = new HistoricoPolizas();
//		HistoricoSiniestros historicoSiniestro = new HistoricoSiniestros();
//		historico.setPlaca(placa);
//		historico.setMotor("");
//		historico.setChasis("");
//		historicoSiniestro.setPlaca(placa);
//		historicoSiniestro.setMotor("");
//		historicoSiniestro.setChasis("");
//
//		ArrayList<HistoricoSiniestroSisa> responses = sisa.consultarHistoricoSiniestros("", "", placa);
//		if (responses != null) {
//			if (responses.get(0).getPlaca().equalsIgnoreCase(placa)) {
//				Date fechaSini = responses.get(0).getFechaSiniestro().getTime();
//				int dias = (int) ((fechaSini.getTime() - fechaActualidad.getTime()) / 86400000);
//				if (dias <= -366) {
//					AmparoSisa[] amparoPerdida = responses.get(0).getAmparos().getAmparoSisa();
//					for (AmparoSisa amaparoPerdidaTotal : amparoPerdida) {
//						if (amaparoPerdidaTotal.getNombreAmparado().equalsIgnoreCase("PTD")) {
//							valstring = "02".trim();
//							pasoSiniestro = 1;
//						}
//					}
//				} else {
//					valstring = "02".trim();
//					pasoSiniestro = 1;
//				}
//			}
//		}
//
//		if (pasoSiniestro == 0) {
//			ArrayList<HistoricoPolizaSisa> hist = sisa.consultarHistoricoPolizas("", "", placa);
//
//			if (hist != null) {
//				HistoricoPolizaSisa histZero = hist.get(0);
//				histZero.getPlaca();
//				String modelo = String.valueOf(histZero.getModelo()).equalsIgnoreCase(modeloRequest) ? modeloRequest
//						: String.valueOf(histZero.getModelo());
//				if (validarCodigoFasecol(codigoFasecolda)
//						&& validarServicio(codigoFasecolda).equalsIgnoreCase("Particular")
//						&& Integer.parseInt(modelo) > 2013) {
//					Date date = histZero.getFechaFinVigencia().getTime();
//					Date fechaVigencia = date;
//					int fecVig = fechaVigencia.compareTo(fechaActualidad);
//					if (fecVig < 0) {
//						valstring = "02".trim();
//					}
//				} else {
//					valstring = "02";
//				}
//			}
//		}
//		return valstring;
//	}
//
//	public static boolean validarCodigoFasecol(String codigoFasecolda) {
//		String sSubCadena = codigoFasecolda.substring(3, 5);
//		boolean codFase = sSubCadena.equalsIgnoreCase("06") ? true
//				: false || sSubCadena.equalsIgnoreCase("21") ? true
//						: false || sSubCadena.equalsIgnoreCase("20") ? true
//								: false || sSubCadena.equalsIgnoreCase("08") ? true
//										: false || sSubCadena.equalsIgnoreCase("01") ? true : false;
//		return codFase;
//	}	
//
//	public static String validarServicio(String codigoFasecolda) {
//		Fasecolda1Dao fasecolda = new Fasecolda1Dao();
//		return fasecolda.getServicio(codigoFasecolda);
//	}

}
