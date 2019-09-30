package coop.equidad.servicios.val.db;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import coop.equidad.model.dao.OsPersonaDao;
import coop.equidad.model.dao.OsPersonaVincDao;
import coop.equidad.model.dao.OsSuscEquivCiudadDao;
import coop.equidad.model.entity.S03010;
import coop.equidad.servicios.constantes.CONSTANTES;
import coop.equidad.servicios.constantes.CodigosError;
import coop.equidad.servicios.suscripcion.CrearCotizacion;
import coop.equidad.servicios.suscripcion.Tercero;
import coop.equidad.servicios.utils.UtilCommon;

public class CrearCotizacionValBD {

	/**
	 * 
	 * @param crearCotizacion
	 * @return
	 */
	public static Map<String, String> valCrearCotizacionBD(CrearCotizacion crearCotizacion) {
		Map<String, String> mssgValidacion = new HashMap<String, String>();
		Tercero terceroInter = getTerceroInter(crearCotizacion.getTercero());
		System.out.println("terceroInter "+terceroInter);
		Tercero terceroTomador = getTerceroTomador(crearCotizacion.getTercero());
		String codpla = crearCotizacion.getProducto()[0].getCodpla();

		if (validaExisteTercero(UtilCommon.getStringFromInteger(terceroInter.getCodigo()), CONSTANTES.CODVIN_INTER)) {
			mssgValidacion.put(CodigosError.COD_VALCRC_BD_POL_TERCERO_EXI_AGENTE.getCodError(),
					CodigosError.COD_VALCRC_BD_POL_TERCERO_EXI_AGENTE.getDescError());
		}

//		String conValidacion = validaVigenciaSarlaft(terceroTomador, codpla);
//
//		// si el sexo esta mal, toca mandar un error
//
//		if (conValidacion.equals(CodigosError.COD_VALCRC_BD_POL_TERCERO_TP_JUR_SARLAFT.getCodError())) {
//			mssgValidacion.put(CodigosError.COD_VALCRC_BD_POL_TERCERO_TP_JUR_SARLAFT.getCodError(),
//					CodigosError.COD_VALCRC_BD_POL_TERCERO_TP_JUR_SARLAFT.getDescError());
//		} else if (conValidacion.equals(CodigosError.COD_VALCRC_SEXO.getCodError())) {
//			mssgValidacion.put(CodigosError.COD_VALCRC_SEXO.getCodError(), CodigosError.COD_VALCRC_SEXO.getDescError());
//		}
		return mssgValidacion;
	}

	/**
	 * 
	 * @param w_codigo
	 * @param w_codvin
	 * @return
	 */
	public static boolean validaExisteTercero(String w_codigo, int w_codvin) {
		OsPersonaDao osPersonaDao = new OsPersonaDao();
		long numReg = osPersonaDao.getNumRegPersona(w_codigo, w_codvin);

		boolean existeTercero = numReg == 0;
		return existeTercero;
	}

	/**
	 * 
	 * @param w_codigo
	 * @param w_codvin
	 * @return
	 */
	public static boolean validaExisteTerceroVinc(String w_codigo, int w_codvin) {
		OsPersonaVincDao osPersonaVincDao = new OsPersonaVincDao();
		long numReg = osPersonaVincDao.getNumRegPersonaVinc(w_codigo, w_codvin);

		boolean existeTerceroVinc = numReg == 0;
		return existeTerceroVinc;
	}

	/**
	 * 
	 * @param terceros
	 * @return
	 */
	public static Tercero getTerceroInter(Tercero[] terceros) {
		Tercero terceroInter = null;

		for (Tercero tercero : terceros) {
			if (CONSTANTES.COD_VINC_AGENTE == tercero.getCodVinculacion()) {
				terceroInter = tercero;
			}
		}

		return terceroInter;
	}

	/**
	 * Retorna el tomador de la cotización
	 * 
	 * @param terceros
	 * @return
	 */
	public static Tercero getTerceroTomador(Tercero[] terceros) {
		Tercero terceroTomador = null;

		for (Tercero tercero : terceros) {
			if (CONSTANTES.COD_VINC_TOMADOR == tercero.getCodVinculacion()) {
				terceroTomador = tercero;
			}
		}

		return terceroTomador;
	}

	/**
	 * Valida el tercero Vinculo 0 tiene vigente el sarlaft
	 * 
	 * @param terceros
	 * @return
	 */
	public static String validaVigenciaSarlaft(Tercero tercero, String codpla) {
		String sarlaftVigente = CodigosError.COD_VALCRC_BD_POL_TERCERO_EXITOSO.getCodError();
		OsSuscEquivCiudadDao equivCiudadDao = new OsSuscEquivCiudadDao();
		List<S03010> listaDetalles = equivCiudadDao.getDetalleParametrosPorCodigo(CONSTANTES.TIPO_PARAMETRO_VALSARLAFT,
				CONSTANTES.CLASE_PARAMETRO_VALSARLAFT, codpla);
		if (listaDetalles != null && listaDetalles.size() > 0) {
			if (validarSexo(tercero.getSexo())) {
				S03010 reglaSarlaft = listaDetalles.get(0);
				String valoranTipoNatural = reglaSarlaft.getValoran();
				String valoranTipoJuridico = reglaSarlaft.getValorb1();
				String tipoPersona = validartipoPer(tercero.getSexo());
				if (!valoranTipoNatural.equals(CONSTANTES.VALSARLAFT_SIN_REGLA) && tipoPersona.equals("1")
						|| !valoranTipoJuridico.equals(CONSTANTES.VALSARLAFT_SIN_REGLA) && tipoPersona.equals("2")) {
					if (!equivCiudadDao.getSarlaf(String.valueOf(tercero.getCodigo()))) {
						sarlaftVigente = CodigosError.COD_VALCRC_BD_POL_TERCERO_TP_JUR_SARLAFT.getCodError();
					}
				}
			} else {
				sarlaftVigente = CodigosError.COD_VALCRC_SEXO.getCodError();
			}
		}

		return sarlaftVigente;
	}

	private static boolean validarSexo(String sexo) {
		boolean sexoVal = sexo.equalsIgnoreCase(null) ? false
				: sexo.equalsIgnoreCase(CONSTANTES.SEXO_MASCULINO) ? true
						: false || sexo.equalsIgnoreCase(CONSTANTES.SEXO_FEMENINO) ? true
								: false || sexo.equalsIgnoreCase(CONSTANTES.SEXO_PJ) ? true : false;
		return sexoVal;
	}

	private static String validartipoPer(String sexo) {
		String tipoPersona = sexo.equalsIgnoreCase(CONSTANTES.SEXO_MASCULINO) ? "1"
				: sexo.equalsIgnoreCase(CONSTANTES.SEXO_FEMENINO) ? "1"
						: sexo.equalsIgnoreCase(CONSTANTES.SEXO_PJ) ? "2" : "1";
		return tipoPersona;
	}
}
