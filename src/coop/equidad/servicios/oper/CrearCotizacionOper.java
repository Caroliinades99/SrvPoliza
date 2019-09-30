package coop.equidad.servicios.oper;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;

import coop.equidad.cache.ServiciosCache;
import coop.equidad.model.dao.OsParametroDao;
import coop.equidad.model.dao.PrCaratulaDao;
import coop.equidad.model.dao.PrCoberturasDao;
import coop.equidad.model.dao.PrCotPersonasDao;
import coop.equidad.model.dao.PrDetallesDao;
import coop.equidad.model.dao.PrNroCotizacionDao;
import coop.equidad.model.dao.PrPersonasDao;
import coop.equidad.model.dao.PrReasegurosDao;
import coop.equidad.model.dao.PrSeguridadDao;
import coop.equidad.model.dao.PrTarifarDao;
import coop.equidad.model.dao.PrValidaDetallesObligatoriosDao;
import coop.equidad.model.entity.S03010;
import coop.equidad.model.entity.S03067;
import coop.equidad.servicio.externo.ServicioExterno;
import coop.equidad.servicio.externo.digest.ParametrosDigest;
import coop.equidad.servicio.externo.exception.CallException;
import coop.equidad.servicios.constantes.CONSTANTES;
import coop.equidad.servicios.suscripcion.Cobertura;
import coop.equidad.servicios.suscripcion.Detalle;
import coop.equidad.servicios.suscripcion.Poliza;
import coop.equidad.servicios.suscripcion.Tercero;
import coop.equidad.servicios.utils.UtilCommon;
import coop.equidad.servicios.utils.UtilWS;
import coop.laequidad.cache.CacheDetalles;
import coop.laequidad.cache.SuscripcionCache;

public class CrearCotizacionOper {
	/**
	 * @param w_usuario
	 * @param w_codpla
	 * @param w_vaseg
	 * @return
	 */
	public static String callSpPrSeguridad(String w_usuario, String w_codpla, float w_vaseg) {
		PrSeguridadDao prSeguridadDao = new PrSeguridadDao();
		String w_ind = prSeguridadDao.spPrSeguridad(w_usuario, w_codpla, w_vaseg);

		return w_ind;
	}

	/**
	 * @param w_sucur
	 * @param w_tipo
	 * @return
	 */
	public static String callSprNroCotizacion(String w_cia, String w_tipo) {
		PrNroCotizacionDao prNroCotizacionDao = new PrNroCotizacionDao();

		String w_nrocotiza = prNroCotizacionDao.spPrNroCotizacion(w_cia, w_tipo);
		w_nrocotiza = UtilWS.nroCotizacionComp(w_nrocotiza);

		return w_nrocotiza;
	}

	/**
	 * s
	 * 
	 * @param terceros
	 */
	public static void callSpPrPersonas(Tercero[] terceros, String w_user) {
		PrPersonasDao prPersonasDao = new PrPersonasDao();

		for (int i = 0; i < terceros.length; i++) {
			prPersonasDao.spPrPersonas(UtilCommon.getStringFromInteger(terceros[i].getCodigo()),
					terceros[i].getNombre(), terceros[i].getSexo(), terceros[i].getTipoPersona(),
					UtilCommon.getFechaFormato(terceros[i].getFechaNacimiento()),
					UtilCommon.getStringFromInteger(terceros[i].getCodVinculacion()), w_user);
		}
	}

	/**
	 * 
	 * @param terceros
	 */
	public static void callSpPrCotPersonas(Tercero[] terceros, String w_sucur, String w_certif, String w_codpla,
			float w_comision, String w_user) {
		PrCotPersonasDao prCotPersonasDao = new PrCotPersonasDao();

		for (int i = 0; i < terceros.length; i++) {
			prCotPersonasDao.spPrCotPersonas(w_sucur, w_certif, w_codpla,
					UtilCommon.getStringFromInteger(terceros[i].getCodigo()), w_comision,
					UtilCommon.getStringFromInteger(terceros[i].getCodVinculacion()), terceros[i].getParentesco(),
					w_user);
		}
	}

	/**
	 * 
	 * @param detalles
	 * @param w_nrocotiza
	 */
	public static void callSpPrDetalles(Detalle[] detalles, String w_user) {
		PrDetallesDao prDetallesDao = new PrDetallesDao();

		for (int i = 0; i < detalles.length; i++) {
			if (!detalles[i].getValstring().contains("{")) {
				prDetallesDao.spPrDetalles(detalles[i].getSucur(), detalles[i].getCertif(), detalles[i].getCoddet(),
						detalles[i].getCodpla(), detalles[i].getValnumber(),
						UtilCommon.getFechaFormato(detalles[i].getValdate()),
						detalles[i].getValstring() == null ? "" : detalles[i].getValstring(), w_user);
			}
		}
	}

	/**
	 * 
	 * @param detalles
	 * @param w_nrocotiza
	 */
	public static void callSpListasCoberturas(Detalle[] detalles, String w_user) {
		PrCoberturasDao prCoberturasDao = new PrCoberturasDao();

		for (int i = 0; i < detalles.length; i++) {

			if (detalles[i].getValstring().contains("{")) {
				detalles[i].setValstring(detalles[i].getValstring().replaceAll("\\{", ""));
				detalles[i].setValstring(detalles[i].getValstring().replaceAll("}", ""));
				StringTokenizer st = new StringTokenizer(detalles[i].getValstring(), ")");
				StringTokenizer st2;
				String tmp, tmp2, tmp3;
				BigDecimal numerico, total = new BigDecimal("0");
				int contador = 0;
				while (st.hasMoreTokens()) {
					tmp = st.nextToken();
					tmp = tmp.replaceAll("\\(", "");
					st2 = new StringTokenizer(tmp, ",");
					tmp2 = null;
					tmp3 = null;
					if (st2.hasMoreTokens())
						tmp2 = st2.nextToken().trim();
					if (st2.hasMoreTokens())
						tmp3 = st2.nextToken();

					if (tmp2 != null && tmp3 != null) {
						numerico = null;
						try {
							numerico = new BigDecimal(tmp3.trim());
						} catch (Exception e) {
						}
						if (numerico != null) {
							prCoberturasDao.spPrListCobertura(detalles[i].getSucur(), null, detalles[i].getCodpla(),
									detalles[i].getCertif(), "1", "0", detalles[i].getCoddet(), contador, tmp2, null,
									numerico.doubleValue(), 0, 1, w_user);
							total = total.add(numerico);
							contador++;

						}
					}

				}
				if (contador > 0) {
					prCoberturasDao.spUpdateCoberturas(detalles[i].getSucur(), detalles[i].getCodpla(),
							detalles[i].getCertif(), detalles[i].getCoddet(), total.doubleValue(), w_user);
				}
			}
		}
	}

	/**
	 * 
	 * @param w_sucur
	 * @param w_certif
	 * @param w_codpla
	 * @return
	 */
	public static String callSpPrValidaDetallesObligatorios(String w_sucur, String w_certif, String w_codpla) {
		PrValidaDetallesObligatoriosDao prValidaDetallesObligatoriosDao = new PrValidaDetallesObligatoriosDao();
		String ccampo = prValidaDetallesObligatoriosDao.spValidaDetallesObligatorios(w_sucur, w_certif, w_codpla);

		return ccampo;
	}

	/**
	 * 
	 * @param coberturas
	 * @param w_nrocotiza
	 * @return
	 */
	public static void callSpPrCoberturas(String w_sucur, String w_certif, String w_codpla, Date w_fecini,
			Date w_fecfin, String w_user) {
		PrCoberturasDao prCoberturasDao = new PrCoberturasDao();

		prCoberturasDao.spPrCoberturas(w_sucur, w_certif, w_codpla, UtilCommon.getFechaFormato(w_fecini),
				UtilCommon.getFechaFormato(w_fecfin), w_user);
	}

	/**
	 * @param w_sucur
	 * @param w_certif
	 * @param w_codpla
	 * @param w_tomador
	 * @param w_fecini
	 * @param w_fecter
	 * @param w_comision
	 * @return
	 */
	public static Object callSpPrReaseguros(String w_sucur, String w_certif, String w_codpla, int w_tomador,
			Date w_fecini, Date w_fecter, float w_comision, String w_user) {
		PrReasegurosDao prReasegurosDao = new PrReasegurosDao();
		Object w_ind = prReasegurosDao.spPrReaseguros(w_sucur, w_certif, w_codpla,
				UtilCommon.getStringFromInteger(w_tomador), UtilCommon.getFechaFormato(w_fecini),
				UtilCommon.getFechaFormato(w_fecter), w_comision, w_user);

		return w_ind;
	}

	/**
	 * 
	 * @param w_sucur
	 * @param w_certif
	 * @param w_codpla
	 * @param w_fecini
	 * @param w_fecfin
	 * @return
	 */
	public static Object callSpPrCaratula(String w_sucur, String w_certif, String w_codpla, int w_tomador,
			int w_asegurado, int w_beneficiario, int w_agente, float w_vaseg, Date w_fecini, Date w_fecter,
			float w_comision, String user) {
		PrCaratulaDao prCaratulaDao = new PrCaratulaDao();
		Object w_ind = prCaratulaDao.spPrCaratula(w_sucur, w_certif, w_codpla,
				UtilCommon.getStringFromInteger(w_tomador), UtilCommon.getStringFromInteger(w_asegurado),
				UtilCommon.getStringFromInteger(w_beneficiario), UtilCommon.getStringFromInteger(w_agente),
				UtilCommon.getStringFromFloat(w_vaseg), UtilCommon.getFechaFormato(w_fecini),
				UtilCommon.getFechaFormato(w_fecter), UtilCommon.getDiasDiff(w_fecini, w_fecter), w_comision, user);

		return w_ind;
	}

	/**
	 * 
	 * @param w_sucur
	 * @param w_certif
	 * @param w_codpla
	 * @param w_orden
	 * @return
	 */
	public static Map<String, String> callSpPrTarifar(String w_sucur, String w_certif, String w_codpla, int w_orden,
			String w_user) {
		PrTarifarDao prTarifarDao = new PrTarifarDao();
		Map<String, String> rsTarifar = prTarifarDao.spPrTarifar(w_sucur, w_certif, w_codpla, w_orden, w_user);

		return rsTarifar;
	}

	/**
	 * 
	 */
	public static void callExternalServices(String w_sucur, String w_certif, String w_codpla, int w_orden,
			coop.equidad.servicios.suscripcion.CrearCotizacion crearCotizacion, Poliza poliza,
			Map<String, Object> resultado) {

		try {
			for (S03010 servicio : ServiciosCache.getInstance().getServicios()) {
				if (servicio.getS03010PK().getCodigo().equalsIgnoreCase(w_codpla)) {
					Class c = Class.forName(servicio.getNombre());
					ServicioExterno se = (ServicioExterno) c.newInstance();
					Map<String, Object> parametros = ParametrosDigest.digest(servicio.getValoran(), crearCotizacion);
					Object result = se.getValor(parametros);
					boolean salio = false;
					for (Detalle detalle : crearCotizacion.getDetalle()) {
						if (detalle.getCoddet().equalsIgnoreCase(servicio.getValoran2())) {

							if (result == null) {
								detalle.setValstring("");
							} else if (result.getClass().getName().contains("String")) {
								detalle.setValstring(result.toString());
							} else if (result.getClass().getName().contains("Double")
									|| result.getClass().getName().contains("BigDecimal")
									|| result.getClass().getName().contains("Integer")) {
								detalle.setValnumber(new BigDecimal(result.toString()));// ).floatValue());
							} else if (result.getClass().isAssignableFrom(Date.class)) {
								detalle.setValdate((Date) result);
							}
							salio = true;
							break;
						}
					}
					if (!salio) {

						List<Detalle> det = new ArrayList(Arrays.asList(crearCotizacion.getDetalle()));

						Detalle detalleTmp = new Detalle();

						detalleTmp.setCoddet(servicio.getValoran2());

						detalleTmp.setCertif(crearCotizacion.getDetalle()[0].getCertif());

						detalleTmp.setCodpla(crearCotizacion.getDetalle()[0].getCodpla());

						detalleTmp.setInciso(crearCotizacion.getDetalle()[0].getInciso());

						detalleTmp.setSucur(crearCotizacion.getDetalle()[0].getSucur());

						if (result == null) {
							detalleTmp.setValstring("");
						} else if (result.getClass().getName().contains("String")) {

							detalleTmp.setValstring(result.toString());
						} else if (result.getClass().getName().contains("Double")
								|| result.getClass().getName().contains("BigDecimal")
								|| result.getClass().getName().contains("Integer")) {
							detalleTmp.setValnumber(new BigDecimal(result.toString()));// .floatValue());
						} else if (result.getClass().isAssignableFrom(Date.class)) {
							detalleTmp.setValdate((Date) result);
						}
						try {

							det.add(detalleTmp);

							crearCotizacion.setDetalle(new Detalle[det.size()]);
							for (int i = 0; i < det.size(); i++) {
								crearCotizacion.getDetalle()[i] = det.get(i);
							}

							poliza.getPolizaSequence_type2().setDetalle(crearCotizacion.getDetalle());
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					resultado.put(servicio.getValoran2(), result);
				}

			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CallException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static String validateSuscription(Poliza poliza, String w_user, String w_group) {

		if (SuscripcionCache.getInstance().getCache().get(w_group) != null
				&& SuscripcionCache.getInstance().getCache().get(w_group).get(poliza.getCodpla()) != null) {
			List<S03067> validation = SuscripcionCache.getInstance().getCache().get(w_group).get(poliza.getCodpla());

			List<S03067> validationUsuario = SuscripcionCache.getInstance().getCache().get(w_user) != null
					? SuscripcionCache.getInstance().getCache().get(w_user).get(poliza.getCodpla())
					: new ArrayList<S03067>();

			if (validationUsuario != null) {

				for (S03067 s03067 : validationUsuario) {
					validation.stream().forEach(a -> {
						if (a.getClausula() != null && a.getClausula().trim().length() > 0
								&& a.getClasepermiso().equals(s03067.getClasepermiso())
								&& a.getClausula().equals(s03067.getClausula())) {
							a.setMonto(s03067.getMonto());
						}
					});

				}

			}

			if (validation == null)
				return CONSTANTES.RESP_SP_SEG_ERR;

			return validate(poliza, validation);

		} else if (SuscripcionCache.getInstance().getCache().get(w_user) != null
				&& SuscripcionCache.getInstance().getCache().get(w_user).get(poliza.getCodpla()) != null) {
			List<S03067> validation = SuscripcionCache.getInstance().getCache().get(w_user).get(poliza.getCodpla());

			if (validation == null)
				return CONSTANTES.RESP_SP_SEG_ERR;

			return validate(poliza, validation);

		} else
			return CONSTANTES.RESP_SP_SEG_ERR;

	}

	private static String validate(Poliza poliza, List<S03067> validation) {
		List<Detalle> detalles = null;
		for (S03067 var : validation) {

			if (var.getClasepermiso().intValue() == 30) {
				if (var.getClausula() != null && var.getClausula().trim().length() > 0) {
					for (Cobertura cob : poliza.getPolizaSequence_type0().getCobertura()) {

						if (cob.getCodcla().equalsIgnoreCase(var.getClausula())) {
							if (cob.getVaseg() > var.getMonto().longValue()) {
								return CONSTANTES.RESP_SUSCRIP_30;
							} else if (cob.getPrima() > cob.getVaseg()) {

								// get cobertura
								return CONSTANTES.RESP_SUSCRIP_999;
							}
						}

					}
				} else if (poliza.getVprima() > var.getMonto().floatValue()) {

					return CONSTANTES.RESP_SUSCRIP_30;

				}

			} else if (var.getClasepermiso().intValue() == 46) {

				long diff = poliza.getFecter().getTime() - poliza.getFecini().getTime();
				if (TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS) > (var.getMonto().longValue() * 366))
					return CONSTANTES.RESP_SUSCRIP_46;

			} else if (var.getClasepermiso().intValue() == 91) {

				if (detalles == null)
					detalles = Arrays.asList(poliza.getPolizaSequence_type2().getDetalle());
				for (Detalle det : detalles) {
					if (det.getValstring() != null && det.getCoddet().equalsIgnoreCase(var.getClausula())
							&& det.getValstring().equalsIgnoreCase(var.getCoddet())) {
						String valor = CacheDetalles.getInstance().getCache().get(var.getCodplan())
								.get(var.getClausula()) != null
										? CacheDetalles.getInstance().getCache().get(var.getCodplan())
												.get(var.getClausula()).get(var.getCoddet())
										: null;
						try {
							valor = valor == null ? CacheDetalles.getInstance().getCache().get("000000")
									.get(var.getClausula()).get(var.getCoddet()) : var.getCoddet();
						} catch (Exception e) {

							valor = var.getCoddet();
						}

						String clausula = CacheDetalles.getInstance().getCacheDName().get(var.getCodplan())
								.get(var.getClausula()) != null
										? CacheDetalles.getInstance().getCacheDName().get(var.getCodplan())
												.get(var.getClausula())
										: var.getClausula();
						return "Valor " + valor + " no permitido en detalle " + clausula;
					}
				}

			}
		}

		return CONSTANTES.RESP_SUSCRIP_OK;
	}

	public static void main(String[] args) {
		String asdf = "{(ACESORIOS1, 100000),( ACESORIOS2, 200000),( ACESORIOS3, 300000)}";
		asdf = asdf.replaceAll("\\{", "");
		asdf = asdf.replaceAll("}", "");
		StringTokenizer st = new StringTokenizer(asdf, ")");
		StringTokenizer st2;
		String tmp, tmp2;
		while (st.hasMoreTokens()) {
			tmp = st.nextToken();
			tmp = tmp.replaceAll("\\(", "");
			st2 = new StringTokenizer(tmp, ",");
			if (st2.hasMoreTokens()) {
				System.out.println(st2.nextToken());

			}
		}

	}
}
