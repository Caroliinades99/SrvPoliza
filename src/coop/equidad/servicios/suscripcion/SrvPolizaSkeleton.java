
/**
 * SrvPolizaSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:08:57 BST)
 */
package coop.equidad.servicios.suscripcion;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import coop.equidad.model.dao.TokenDao;
import coop.equidad.model.entity.OsCaratula;
import coop.equidad.servicio.CotizacionServicio;
import coop.equidad.servicio.EquivCiudadServicio;
import coop.equidad.servicio.PolizaServicio;
import coop.equidad.servicio.externo.executor.ServicioExternoExcecutor;
import coop.equidad.servicios.constantes.CONSTANTES;
import coop.equidad.servicios.oper.AnularCertificadoOper;
import coop.equidad.servicios.oper.CancelarCertificadoOper;
import coop.equidad.servicios.oper.CrearCotizacionOper;
import coop.equidad.servicios.oper.EmitirPolizaOper;
import coop.equidad.servicios.oper.ValidarCotizacionOper;
import coop.equidad.servicios.oper.ValidarSarlaf;
import coop.equidad.servicios.utils.ThreadLog;
import coop.equidad.servicios.utils.ThreadTextos;
import coop.equidad.servicios.utils.UtilWS;
import coop.equidad.servicios.val.ActualizarCotizacionValBusiness;
import coop.equidad.servicios.val.ActualizarCotizacionValCampo;
import coop.equidad.servicios.val.AnularCertificadoValBusiness;
import coop.equidad.servicios.val.AnularCertificadoValCampo;
import coop.equidad.servicios.val.BuscarPolizasValCampo;
import coop.equidad.servicios.val.CancelarCertificadoValBusiness;
import coop.equidad.servicios.val.CancelarCertificadoValCampo;
import coop.equidad.servicios.val.ConsultarPolizaValCampo;
import coop.equidad.servicios.val.CrearCotizacionValBusiness;
import coop.equidad.servicios.val.CrearCotizacionValCampo;
import coop.equidad.servicios.val.EmitirPolizaValBusiness;
import coop.equidad.servicios.val.EmitirPolizaValCampo;
import coop.equidad.servicios.val.ValidarCotizacionValBusiness;
import coop.equidad.servicios.val.ValidarCotizacionValCampo;
import coop.equidad.servicios.val.db.CrearCotizacionValBD;
import coop.equidad.web.entity.Cliente;
import coop.laequidad.cache.CacheSucur;
import coop.laequidad.cache.ProductosCache;
import coop.laequidad.cache.TokenCache;

/**
 * SrvPolizaSkeleton java skeleton for the axisService
 */
public class SrvPolizaSkeleton implements SrvPolizaSkeletonInterface {

	private Poliza poliza = null;
	private Map<String, String> mssgValidacion = null;
	private String w_ind = null;

	/**
	 * Auto generated method signature
	 * 
	 * @param crearCotizacion8
	 * @return crearCotizacionResponse
	 */

	public coop.equidad.servicios.suscripcion.CrearCotizacionResponse crearCotizacion(
			coop.equidad.servicios.suscripcion.CrearCotizacion crearCotizacion, String token) {
		System.out.println("LLamado servicio externo " + sdf.format(Calendar.getInstance().getTime()));
		CrearCotizacionResponse crearCotizacionResponse = new CrearCotizacionResponse();
		ArrayList<Poliza> polizasResp = null;
		Cliente cliente = TokenCache.getInstance().getRevCache().get(token);
		Map<String, Object> llamadaExterna = null;
		if (cliente == null) {
			TokenCache.getInstance().cargarCache();
			cliente = TokenCache.getInstance().getRevCache().get(token);
		}
		System.out.println("buscando token " + sdf.format(Calendar.getInstance().getTime()));
		try {
			EquivCiudadServicio equivCiudadServicio = new EquivCiudadServicio();
			crearCotizacion.setSucur(
					equivCiudadServicio.getCodSucursal(crearCotizacion.getComp(), crearCotizacion.getSucur()));
			System.out.println("saco ciudad " + sdf.format(Calendar.getInstance().getTime()));

			// AQUI SE VALIDA TODOS LOS DATOS DE ENTRADA
			mssgValidacion = CrearCotizacionValCampo.valCrearCotizacion(crearCotizacion);

			if (mssgValidacion.size() > 0) {
				crearCotizacionResponse.setPoliza(null);
				crearCotizacionResponse.setContextoRespuesta(UtilWS.getContextoRespuestaVal(mssgValidacion));
			} else {
				// AQUI SE VALIDA A LOS TERCEROS
				mssgValidacion = CrearCotizacionValBusiness.valCrearCotizacionBs(crearCotizacion);

				// SI HAY MAS DE 1 MSSVALIDACION NO VA A GENERAR LA COTIZACION Y
				// SE SALE
				if (mssgValidacion.size() > 0) {
					crearCotizacionResponse.setPoliza(null);
					crearCotizacionResponse.setContextoRespuesta(UtilWS.getContextoRespuestaVal(mssgValidacion));
				} else {
					mssgValidacion = CrearCotizacionValBD.valCrearCotizacionBD(crearCotizacion);

					if (mssgValidacion.size() > 0) {
						// mssgValidacion.size() 0 ) {
						crearCotizacionResponse.setPoliza(null);
						crearCotizacionResponse.setContextoRespuesta(UtilWS.getContextoRespuestaVal(mssgValidacion));
					} else {
						polizasResp = new ArrayList<Poliza>();
						// AQUI VALIDA EL PRODUCTO
						crearCotizacion.setProducto(UtilWS.getProducto(crearCotizacion.getProducto()));

						for (Producto producto : crearCotizacion.getProducto()) {

							System.out.println("inicia producto " + sdf.format(Calendar.getInstance().getTime()));

							poliza = UtilWS.getPoliza(crearCotizacion);
							// Calendar.getInstance().poliza.getFecini()
							long dias = TimeUnit.MILLISECONDS
									.toDays(Calendar.getInstance().getTime().getTime() - poliza.getFecini().getTime());
							if (dias >= 15 || dias <= -15)
								poliza.setFecini(Calendar.getInstance().getTime());

							// AQUI ME DA EL CODPLA DEL PRODUCTO EL CUAL SERA EL
							// QUE INGRESE A LA 30205
							poliza.setCodpla(producto.getCodpla());
							poliza.setVaseg(0);
							Calendar fechaFin = Calendar.getInstance();
							fechaFin.setTime(poliza.getFecini());

							if (!producto.getCodpla().equals("182005")) {
								fechaFin.add(Calendar.YEAR, 1);
								poliza.setFecter(fechaFin.getTime());
							} else {
								for (Detalle detalle : crearCotizacion.getDetalle()) {
									switch (detalle.getCoddet()) {
									case "20002300":
										poliza.setFecter(detalle.getValdate());
										break;
									default:
										break;
									}
								}
							}
							System.out.println("seguridad " + sdf.format(Calendar.getInstance().getTime()));
							w_ind = CrearCotizacionOper.callSpPrSeguridad(cliente.getUsuarioosiris(),
									poliza.getCodpla(), poliza.getVaseg());
							System.out.println("termino seguridad " + sdf.format(Calendar.getInstance().getTime()));
							if (CONSTANTES.RESP_SP_SEG_ERR.equals(w_ind)) {
								crearCotizacionResponse.setPoliza(null);
								mssgValidacion = CrearCotizacionValBusiness
										.valSpErrorSingle(CONSTANTES.RESP_SP_SEG_ERR);
								crearCotizacionResponse
										.setContextoRespuesta(UtilWS.getContextoRespuestaVal(mssgValidacion));
							} else {
								System.out.println("numerando " + sdf.format(Calendar.getInstance().getTime()));
								String w_nrocotiza = CrearCotizacionOper.callSprNroCotizacion(crearCotizacion.getComp(),
										crearCotizacion.getParametroCotizacion().getTipoObjeto());
								poliza.setCotizacion(w_nrocotiza);
								poliza.setCertif(w_nrocotiza);
								System.out.println(
										"LLamado servicio externo " + sdf.format(Calendar.getInstance().getTime()));

//								String insertaCotizacion = CrearCotizacionValCampo.validarCodigo(poliza.getSucur(),
//										poliza.getCertif(), poliza.getCodpla(), poliza.getOrden(), crearCotizacion);
							
								// crear mapa llamdo servicios, copiar los
								// detalles del mapa a la cotizacion
								// llamara en paralelo la funcion de crear los
								// textos

								// LLAMADA EXTERNA SOLO LA PRIMERA VEZ SERA
								// NULL, POR ENDE DEBERIA DE INGRESAR
								if (llamadaExterna == null) {
									llamadaExterna = new HashMap<>();

									ExecutorService executor = Executors.newFixedThreadPool(1);
									List<Future<String>> future = new ArrayList<>();

									future.add(executor.submit(new ServicioExternoExcecutor(poliza.getSucur(),
											poliza.getCertif(), poliza.getCodpla(), poliza.getOrden(), crearCotizacion,
											poliza, llamadaExterna)));

									System.out.println(
											"COTIZACION: " + poliza.getCertif() + " SUCURSAL " + poliza.getSucur()
													+ " CODPLA " + poliza.getCodpla() + " ORDEN " + poliza.getOrden());

									System.out.println(poliza.getSucur() + "," + poliza.getCertif() + ","
											+ poliza.getCodpla() + "," + poliza.getOrden());

									boolean ejecutando = true;
									long start = System.currentTimeMillis();
									long end = start + 20 * 1000;
									while (ejecutando && System.currentTimeMillis() < end) {

										for (Future<String> resultado : future) {

											if (resultado.isDone()) {
												ejecutando = false;
											}
										}

									}
									System.out.println("externo llama" + sdf.format(Calendar.getInstance().getTime())
											+ " " + llamadaExterna);
								} else {

									System.out.println("externo reutiliza"
											+ sdf.format(Calendar.getInstance().getTime()) + " " + llamadaExterna);
									for (String key : llamadaExterna.keySet()) {
										boolean salio = false;
										for (Detalle detalle : crearCotizacion.getDetalle()) {
											if (detalle.getCoddet().equalsIgnoreCase(key)) {

												if (llamadaExterna.get(key) == null) {
													detalle.setValstring("");
												} else if (llamadaExterna.get(key).getClass().getName()
														.contains("String")) {
													detalle.setValstring(llamadaExterna.get(key).toString());
												} else if (llamadaExterna.get(key).getClass().getName()
														.contains("Double")
														|| llamadaExterna.get(key).getClass().getName()
																.contains("BigDecimal")
														|| llamadaExterna.get(key).getClass().getName()
																.contains("Integer")) {
													detalle.setValnumber(
															new BigDecimal(llamadaExterna.get(key).toString()));// ).floatValue());
												} else if (llamadaExterna.get(key).getClass()
														.isAssignableFrom(Date.class)) {
													detalle.setValdate((Date) llamadaExterna.get(key));
												}
												salio = true;
												break;
											}
										}

										if (!salio) {

											List<Detalle> det = new ArrayList(
													Arrays.asList(crearCotizacion.getDetalle()));

											Detalle detalleTmp = new Detalle();

											detalleTmp.setCoddet(key);

											detalleTmp.setCertif(crearCotizacion.getDetalle()[0].getCertif());

											detalleTmp.setCodpla(crearCotizacion.getDetalle()[0].getCodpla());

											detalleTmp.setInciso(crearCotizacion.getDetalle()[0].getInciso());
											detalleTmp.setSucur(crearCotizacion.getDetalle()[0].getSucur());

											if (llamadaExterna.get(key) == null) {
												detalleTmp.setValstring("");
											} else if (llamadaExterna.get(key).getClass().getName()
													.contains("String")) {

												detalleTmp.setValstring(llamadaExterna.get(key).toString());
											} else if (llamadaExterna.get(key).getClass().getName().contains("Double")
													|| llamadaExterna.get(key).getClass().getName()
															.contains("BigDecimal")
													|| llamadaExterna.get(key).getClass().getName()
															.contains("Integer")) {
												detalleTmp.setValnumber(
														new BigDecimal(llamadaExterna.get(key).toString()));// .floatValue());
											} else if (llamadaExterna.get(key).getClass()
													.isAssignableFrom(Date.class)) {
												detalleTmp.setValdate((Date) llamadaExterna.get(key));
											}
											try {

												det.add(detalleTmp);

												crearCotizacion.setDetalle(new Detalle[det.size()]);
												for (int i = 0; i < det.size(); i++) {
													crearCotizacion.getDetalle()[i] = det.get(i);
												}

												poliza.getPolizaSequence_type2()
														.setDetalle(crearCotizacion.getDetalle());
											} catch (Exception e) {
												// TODO Auto-generated catch
												// block
												e.printStackTrace();
											}
										}

									}

								}
								// AQUI SALE DE LA CONDICION DE LLAMADA EXTERNA

								System.out
										.println("COTIZACION: " + poliza.getCertif() + " SUCURSAL " + poliza.getSucur()
												+ " CODPLA " + poliza.getCodpla() + " ORDEN " + poliza.getOrden());

								System.out.println("personas " + sdf.format(Calendar.getInstance().getTime()) + " "
										+ llamadaExterna);

								CrearCotizacionOper.callSpPrPersonas(poliza.getPolizaSequence_type1().getTercero(),
										cliente.getUsuarioosiris());

								System.out.println("fin personas" + sdf.format(Calendar.getInstance().getTime()) + " "
										+ llamadaExterna);
								CrearCotizacionOper.callSpPrCotPersonas(poliza.getPolizaSequence_type1().getTercero(),
										poliza.getSucur(), poliza.getCertif(), poliza.getCodpla(), poliza.getComision(),
										cliente.getUsuarioosiris());
								System.out.println("externo llama" + sdf.format(Calendar.getInstance().getTime()) + " "
										+ llamadaExterna);
								UtilWS.setDetallesReq(poliza.getPolizaSequence_type2().getDetalle(), poliza.getSucur(),
										poliza.getCodpla(), poliza.getCertif());

								String detalle_nemotec = poliza.getCodpla().equalsIgnoreCase("011703")
										? CONSTANTES.COD_DET_NEMOTEC_FALA : CONSTANTES.COD_DET_NEMOTEC_MASC;

								poliza.getPolizaSequence_type2().setDetalle(
										UtilWS.getDetallesNemotec(poliza.getPolizaSequence_type2().getDetalle(),
												poliza.getSucur(), poliza.getCodpla(), poliza.getCertif(),
												detalle_nemotec, producto.getNemotec()));
								System.out.println("externo detalles" + sdf.format(Calendar.getInstance().getTime()));
								CrearCotizacionOper.callSpPrDetalles(poliza.getPolizaSequence_type2().getDetalle(),
										cliente.getUsuarioosiris());
								System.out.println("fin detalles" + sdf.format(Calendar.getInstance().getTime()));
								w_ind = CrearCotizacionOper.callSpPrValidaDetallesObligatorios(poliza.getSucur(),
										poliza.getCertif(), poliza.getCodpla());

								System.out.println(
										"salio detalles obligatori" + sdf.format(Calendar.getInstance().getTime()));
								if (!CONSTANTES.RESP_SP_VDET_OK.equals(w_ind)) {
									crearCotizacionResponse.setPoliza(null);
									mssgValidacion = CrearCotizacionValBusiness.valSpErrorDetallesObl(w_ind);
									crearCotizacionResponse
											.setContextoRespuesta(UtilWS.getContextoRespuestaVal(mssgValidacion));
								} else {
									System.out.println("coberturas" + sdf.format(Calendar.getInstance().getTime()));
									CrearCotizacionOper.callSpPrCoberturas(poliza.getSucur(), poliza.getCertif(),
											poliza.getCodpla(), poliza.getFecini(), poliza.getFecter(),
											cliente.getUsuarioosiris());
									System.out
											.println("salio coberturas" + sdf.format(Calendar.getInstance().getTime()));
									CrearCotizacionOper.callSpListasCoberturas(
											poliza.getPolizaSequence_type2().getDetalle(), cliente.getUsuarioosiris());
									System.out.println("salio coberturas " + Calendar.getInstance().getTimeInMillis());
									Map<Integer, Integer> codTerceros = UtilWS
											.getCodsTerceros(poliza.getPolizaSequence_type1().getTercero());
									poliza.setTomador(codTerceros.get(CONSTANTES.COD_VINC_TOMADOR));
									poliza.setAsegurado(codTerceros.get(CONSTANTES.COD_VINC_ASEGURADO));
									poliza.setBeneficiario(codTerceros.get(CONSTANTES.COD_VINC_BENEFICIARIO));
									poliza.setAgente(codTerceros.get(CONSTANTES.COD_VINC_AGENTE));
									System.out.println("caratural" + sdf.format(Calendar.getInstance().getTime()));
									// AQUI VA Y BUSCA EL PROCEDURE DE LA
									// CARATULA
									CrearCotizacionOper.callSpPrCaratula(poliza.getSucur(), poliza.getCertif(),
											poliza.getCodpla(), poliza.getTomador(), poliza.getAsegurado(),
											poliza.getBeneficiario(), poliza.getAgente(), poliza.getVaseg(),
											poliza.getFecini(), poliza.getFecter(), poliza.getComision(),
											cliente.getUsuarioosiris());
									System.out.println("salio caratula" + sdf.format(Calendar.getInstance().getTime()));
									poliza.setOrden(CONSTANTES.COD_ORDEN);

									Map<String, String> rsTarifar = CrearCotizacionOper.callSpPrTarifar(
											poliza.getSucur(), poliza.getCertif(), poliza.getCodpla(),
											poliza.getOrden(), cliente.getUsuarioosiris());
									System.out
											.println("salio cotizacion" + sdf.format(Calendar.getInstance().getTime()));
									w_ind = rsTarifar.get(CONSTANTES.PARAM_TAR_ERR);// CONSTANTES.PARAM_TAR_IND);

									if (!CONSTANTES.RESP_SP_TAR_VAL_OK.equals(w_ind)) {// CONSTANTES.RESP_SP_TAR_ERR.equals(w_ind)
																						// )
																						// {
										crearCotizacionResponse.setPoliza(null);
										mssgValidacion = CrearCotizacionValBusiness
												.valSpErrorSingle(CONSTANTES.RESP_SP_TAR_ERR);
										// mssgValidacion.put("1035",
										// rsTarifar.get(CONSTANTES.PARAM_TAR_MSJ));
										mssgValidacion.put(rsTarifar.get(CONSTANTES.PARAM_TAR_ERR),
												rsTarifar.get(CONSTANTES.PARAM_TAR_MSJ));
										crearCotizacionResponse
												.setContextoRespuesta(UtilWS.getContextoRespuestaVal(mssgValidacion));
									} else {

										Reaseguro reaseguro = UtilWS.getReaseguro(poliza);
										CrearCotizacionOper.callSpPrReaseguros(reaseguro.getSucur(),
												reaseguro.getCertif(), reaseguro.getCodpla(), reaseguro.getTomador(),
												reaseguro.getFecini(), reaseguro.getFecter(), reaseguro.getComision(),
												cliente.getUsuarioosiris());
										System.out.println(
												"salio reaseguros" + sdf.format(Calendar.getInstance().getTime()));
										PolizaSequence_type5 polizaSequence_type5 = new PolizaSequence_type5();
										polizaSequence_type5.setReaseguro(reaseguro);
										poliza.setPolizaSequence_type5(polizaSequence_type5);
										CotizacionServicio cotizacionServicio = new CotizacionServicio();
										System.out.println(
												"armando respuesta" + sdf.format(Calendar.getInstance().getTime()));
										poliza = cotizacionServicio.getCotizacion(poliza.getSucur(), poliza.getCodpla(),
												poliza.getCertif(), poliza.getOrden());
										System.out.println(
												"sacando respuesta" + sdf.format(Calendar.getInstance().getTime()));
										poliza.getPolizaSequence_type2()
												.setDetalle(UtilWS.getDetallesRsTarifar(
														poliza.getPolizaSequence_type2().getDetalle(), rsTarifar,
														poliza.getSucur(), poliza.getCertif(), poliza.getCodpla()));
										System.out.println(
												"detalles respuesta" + sdf.format(Calendar.getInstance().getTime()));
										w_ind = CrearCotizacionOper.validateSuscription(poliza,
												cliente.getUsuarioosiris(), cliente.getGrupo());
										if (CONSTANTES.RESP_SUSCRIP_OK.equals(w_ind)) {

											poliza.setSucur(CacheSucur.getInstance().getRevCache()
													.get(poliza.getSucur().substring(4)));
											polizasResp.add(poliza);
											crearCotizacionResponse.setPoliza(UtilWS.getPolizaArray(polizasResp));
											System.out.println("asignando poliza a response"
													+ sdf.format(Calendar.getInstance().getTime()));
											String err_tar = rsTarifar.get(CONSTANTES.PARAM_TAR_ERR);

											if (CONSTANTES.RESP_SP_TAR_VAL_OK.equals(err_tar)) {
												crearCotizacionResponse
														.setContextoRespuesta(UtilWS.getContextoRespuestaEx());
											} else {
												mssgValidacion = CrearCotizacionValBusiness
														.getSpErrorTarifar(rsTarifar.get(CONSTANTES.PARAM_TAR_MSJ));
												crearCotizacionResponse.setContextoRespuesta(
														UtilWS.getContextoRespuestaTarErr(mssgValidacion));
											}
										} else {
											if (w_ind.contains("valor")) {
												Error[] e = new Error[1];
												Error err = new Error();
												err.setCodError(w_ind);
												err.setCodError("99");
												e[0] = err;
												ContextoRespuesta contextoRespuesta = new ContextoRespuesta();
												contextoRespuesta.setErrores(e);
												crearCotizacionResponse.setContextoRespuesta(contextoRespuesta);
											} else
												crearCotizacionResponse.setContextoRespuesta(
														UtilWS.getContextoRespuestaTarErrSuscripcion(
																CONSTANTES.MESG_SUSCRIPCION, w_ind));
										}

									}

								}

							}

						}

					}

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
			crearCotizacionResponse.setContextoRespuesta(UtilWS.getContextoRespuestaErrorException(e));
		}
		System.out.println("respondiendo" + sdf.format(Calendar.getInstance().getTime()));
		return crearCotizacionResponse;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param validarCotizacion
	 * @return validarCotizacionResponse
	 */

	public coop.equidad.servicios.suscripcion.ValidarCotizacionResponse validarCotizacion(
			coop.equidad.servicios.suscripcion.ValidarCotizacion validarCotizacion, String token) {
		ValidarCotizacionResponse validarCotizacionResponse = new ValidarCotizacionResponse();
		Cliente cliente = TokenCache.getInstance().getRevCache().get(token);
		try {
			EquivCiudadServicio equivCiudadServicio = new EquivCiudadServicio();
			validarCotizacion
					.setSucur(equivCiudadServicio.getCodSucursal(CONSTANTES.COD_GEN, validarCotizacion.getSucur()));

			mssgValidacion = ValidarCotizacionValCampo.valValidarCotizacion(validarCotizacion);

			if (mssgValidacion.size() > 0) {
				validarCotizacionResponse.setPoliza(null);
				validarCotizacionResponse.setContextoRespuesta(UtilWS.getContextoRespuestaVal(mssgValidacion));
			} else {
				CotizacionServicio cotizacionServicio = new CotizacionServicio();

				if (!cotizacionServicio.existeCotizacion(validarCotizacion.getSucur(), validarCotizacion.getCodpla(),
						validarCotizacion.getCertif(), validarCotizacion.getOrden())) {

					validarCotizacionResponse.setPoliza(null);
					mssgValidacion = ValidarCotizacionValBusiness.valSpErrorSingle(CONSTANTES.RESP_VAL_POL_ERR);
					validarCotizacionResponse.setContextoRespuesta(UtilWS.getContextoRespuestaVal(mssgValidacion));

				} else {
					Map<String, String> rsTarifar = ValidarCotizacionOper.callSpPrTarifar(validarCotizacion.getSucur(),
							validarCotizacion.getCertif(), validarCotizacion.getCodpla(), validarCotizacion.getOrden(),
							cliente.getUsuarioosiris());

					w_ind = rsTarifar.get(CONSTANTES.PARAM_TAR_ERR);// CONSTANTES.PARAM_TAR_IND);

					if (!CONSTANTES.RESP_SP_TAR_VAL_OK.equals(w_ind)) {// CONSTANTES.RESP_SP_TAR_ERR.equals(w_ind)
																		// ) {
						validarCotizacionResponse.setPoliza(null);
						mssgValidacion = ValidarCotizacionValBusiness.valSpErrorSingle(CONSTANTES.RESP_SP_TAR_ERR);
						validarCotizacionResponse.setContextoRespuesta(UtilWS.getContextoRespuestaVal(mssgValidacion));
					} else {
						poliza = cotizacionServicio.getCotizacion(validarCotizacion.getSucur(),
								validarCotizacion.getCodpla(), validarCotizacion.getCertif(),
								validarCotizacion.getOrden());
						poliza.getPolizaSequence_type2()
								.setDetalle(UtilWS.getDetallesRsTarifar(poliza.getPolizaSequence_type2().getDetalle(),
										rsTarifar, poliza.getSucur(), poliza.getCertif(), poliza.getCodpla()));

						w_ind = CrearCotizacionOper.validateSuscription(poliza, cliente.getUsuarioosiris(),
								cliente.getGrupo());
						if (!CONSTANTES.RESP_SP_SEG_ERR.equals(w_ind)) {

							poliza.setSucur(CacheSucur.getInstance().getRevCache().get(poliza.getSucur().substring(4)));
							validarCotizacionResponse.setPoliza(poliza);

							String err_tar = rsTarifar.get(CONSTANTES.PARAM_TAR_ERR);

							if (CONSTANTES.RESP_SP_TAR_VAL_OK.equals(err_tar)) {
								validarCotizacionResponse.setContextoRespuesta(UtilWS.getContextoRespuestaEx());
							} else {
								mssgValidacion = CrearCotizacionValBusiness
										.getSpErrorTarifar(rsTarifar.get(CONSTANTES.PARAM_TAR_MSJ));
								validarCotizacionResponse
										.setContextoRespuesta(UtilWS.getContextoRespuestaTarErr(mssgValidacion));
							}

						} else {
							validarCotizacionResponse.setContextoRespuesta(
									UtilWS.getContextoRespuestaTarErrSuscripcion(CONSTANTES.MESG_SUSCRIPCION));
						}

					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			validarCotizacionResponse.setContextoRespuesta(UtilWS.getContextoRespuestaErrorException(e));
		}

		return validarCotizacionResponse;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param consultarPoliza
	 * @return consultarPolizaResponse
	 */

	public coop.equidad.servicios.suscripcion.ConsultarPolizaResponse consultarPoliza(
			coop.equidad.servicios.suscripcion.ConsultarPoliza consultarPoliza, String token) {
		ConsultarPolizaResponse consultarPolizaResponse = new ConsultarPolizaResponse();
		Cliente cliente = TokenCache.getInstance().getRevCache().get(token);
		try {
			EquivCiudadServicio equivCiudadServicio = new EquivCiudadServicio();
			consultarPoliza
					.setSucur(equivCiudadServicio.getCodSucursal(CONSTANTES.COD_GEN, consultarPoliza.getSucur()));

			mssgValidacion = ConsultarPolizaValCampo.valConsultarPoliza(consultarPoliza);

			if (mssgValidacion.size() > 0) {
				consultarPolizaResponse.setPoliza(null);
				consultarPolizaResponse.setContextoRespuesta(UtilWS.getContextoRespuestaVal(mssgValidacion));
			} else {
				PolizaServicio polizaServicio = new PolizaServicio();

				if (!polizaServicio.existePoliza(consultarPoliza.getSucur(), consultarPoliza.getCodpla(),
						consultarPoliza.getCertif(), consultarPoliza.getOrden())) {

					consultarPolizaResponse.setPoliza(null);
					mssgValidacion = ValidarCotizacionValBusiness.valSpErrorSingle(CONSTANTES.RESP_CSP_POL_ERR);
					consultarPolizaResponse.setContextoRespuesta(UtilWS.getContextoRespuestaVal(mssgValidacion));

				} else {
					poliza = polizaServicio.getPoliza(consultarPoliza.getSucur(), consultarPoliza.getCodpla(),
							consultarPoliza.getCertif(), consultarPoliza.getOrden(), cliente.getUsuarioosiris());

					poliza.setSucur(CacheSucur.getInstance().getRevCache().get(poliza.getSucur().substring(4)));
					consultarPolizaResponse.setPoliza(poliza);
					consultarPolizaResponse.setContextoRespuesta(UtilWS.getContextoRespuestaEx());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			consultarPolizaResponse.setContextoRespuesta(UtilWS.getContextoRespuestaErrorException(e));
		}

		return consultarPolizaResponse;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param buscarPolizas
	 * @return buscarPolizasResponse
	 */

	public coop.equidad.servicios.suscripcion.BuscarPolizasResponse buscarPolizas(
			coop.equidad.servicios.suscripcion.BuscarPolizas buscarPolizas, String token) {
		BuscarPolizasResponse buscarPolizasResponse = new BuscarPolizasResponse();
		Cliente cliente = TokenCache.getInstance().getRevCache().get(token);
		if (cliente == null) {
			TokenCache.getInstance().cargarCache();
			cliente = TokenCache.getInstance().getRevCache().get(token);
		}
		try {
			EquivCiudadServicio equivCiudadServicio = new EquivCiudadServicio();
			buscarPolizas.setSucur(equivCiudadServicio.getCodSucursal(CONSTANTES.COD_GEN, buscarPolizas.getSucur()));

			mssgValidacion = BuscarPolizasValCampo.valBuscarPolizas(buscarPolizas);

			if (mssgValidacion.size() > 0) {
				buscarPolizasResponse.setResultadoPoliza(null);
				buscarPolizasResponse.setContextoRespuesta(UtilWS.getContextoRespuestaVal(mssgValidacion));
			} else {
				PolizaServicio polizaServicio = new PolizaServicio();
				ResultadoPoliza[] polizas = polizaServicio.getPolizas(buscarPolizas.getAsegurado(),
						buscarPolizas.getSucur(), buscarPolizas.getPoliza(), buscarPolizas.getCertif(),
						buscarPolizas.getCodpla(), cliente.getUsuarioosiris());
				for (ResultadoPoliza pol : polizas) {
					pol.setSucur(CacheSucur.getInstance().getRevCache().get(pol.getSucur().substring(4)));
				}
				buscarPolizasResponse.setResultadoPoliza(polizas);
				buscarPolizasResponse.setContextoRespuesta(UtilWS.getContextoRespuestaEx());
			}

		} catch (Exception e) {
			e.printStackTrace();
			buscarPolizasResponse.setContextoRespuesta(UtilWS.getContextoRespuestaErrorException(e));
		}

		return buscarPolizasResponse;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param cancelarCertificado
	 * @return cancelarCertificadoResponse
	 */

	public coop.equidad.servicios.suscripcion.CancelarCertificadoResponse cancelarCertificado(
			coop.equidad.servicios.suscripcion.CancelarCertificado cancelarCertificado, String token) {
		CancelarCertificadoResponse cancelarCertificadoResponse = new CancelarCertificadoResponse();
		int w_ind = CONSTANTES.RESP_SP_CAN_ERR;
		Cliente cliente = TokenCache.getInstance().getRevCache().get(token);
		if (cliente == null) {
			TokenCache.getInstance().cargarCache();
			cliente = TokenCache.getInstance().getRevCache().get(token);
		}

		try {
			EquivCiudadServicio equivCiudadServicio = new EquivCiudadServicio();
			cancelarCertificado
					.setSucur(equivCiudadServicio.getCodSucursal(CONSTANTES.COD_GEN, cancelarCertificado.getSucur()));

			mssgValidacion = CancelarCertificadoValCampo.valCancelarCertificado(cancelarCertificado);

			if (mssgValidacion.size() > 0) {
				cancelarCertificadoResponse.setCancelado(Boolean.FALSE);
				cancelarCertificadoResponse.setContextoRespuesta(UtilWS.getContextoRespuestaVal(mssgValidacion));
			} else {
				PolizaServicio polizaServicio = new PolizaServicio();

				if (!polizaServicio.existePoliza(cancelarCertificado.getSucur(), cancelarCertificado.getCodpla(),
						cancelarCertificado.getCertif(), cancelarCertificado.getPoliza(), cliente.getUsuarioosiris())) {

					cancelarCertificadoResponse.setCancelado(Boolean.FALSE);
					mssgValidacion = CancelarCertificadoValBusiness.valSpErrorSingle(CONSTANTES.RESP_CAN_CRT_ERR);
					cancelarCertificadoResponse.setContextoRespuesta(UtilWS.getContextoRespuestaVal(mssgValidacion));

				} else {
					w_ind = CancelarCertificadoOper.callSpPrCancelarCertif(cancelarCertificado.getSucur(),
							cancelarCertificado.getPoliza(), cancelarCertificado.getCertif(),
							cancelarCertificado.getCodpla(), cancelarCertificado.getFechaCancelacion(),
							cancelarCertificado.getCausa(), cliente.getUsuarioosiris());

					if (CONSTANTES.RESP_SP_CAN_OK == w_ind) {
						cancelarCertificadoResponse.setCancelado(Boolean.TRUE);
						cancelarCertificadoResponse.setContextoRespuesta(UtilWS.getContextoRespuestaEx());
					} else {
						cancelarCertificadoResponse.setCancelado(Boolean.FALSE);
						mssgValidacion = CancelarCertificadoValBusiness.valSpErrorSingle(CONSTANTES.RESP_SP_UNK_ERR);
						cancelarCertificadoResponse
								.setContextoRespuesta(UtilWS.getContextoRespuestaVal(mssgValidacion));
					}
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
			cancelarCertificadoResponse.setContextoRespuesta(UtilWS.getContextoRespuestaErrorException(e));
		}

		return cancelarCertificadoResponse;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param emitirPoliza
	 * @return emitirPolizaResponse
	 */
	private static SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");

	public coop.equidad.servicios.suscripcion.EmitirPolizaResponse emitirPoliza(
			coop.equidad.servicios.suscripcion.EmitirPoliza emitirPoliza, String token) {
		EmitirPolizaResponse emitirPolizaResponse = new EmitirPolizaResponse();
		Cliente cliente = TokenCache.getInstance().getRevCache().get(token);
		if (cliente == null) {
			TokenCache.getInstance().cargarCache();
			cliente = TokenCache.getInstance().getRevCache().get(token);
		}
		TokenDao taokenDao = new TokenDao();

		try {
			EquivCiudadServicio equivCiudadServicio = new EquivCiudadServicio();

			System.out.println("tiempo 1 " + sdf.format(Calendar.getInstance().getTime()));

			emitirPoliza.setSucur(equivCiudadServicio.getCodSucursal(
					ProductosCache.getInstance().getCache().get(emitirPoliza.getCodpla()), emitirPoliza.getSucur()));

			mssgValidacion = EmitirPolizaValCampo.valEmitirPoliza(emitirPoliza);

			System.out.println("tiempo 2 " + sdf.format(Calendar.getInstance().getTime()));

			try {
				// taokenDao.creaLogEmision(emitirPoliza.getSucur(),
				// emitirPoliza.getCotizacion(), "Error campos de entrada
				// "+mssgValidacion.toString());
				Thread t = new Thread(new ThreadLog(emitirPoliza.getSucur(), emitirPoliza.getCotizacion(),
						"Error campos de entrada " + mssgValidacion.toString(), taokenDao));
				t.start();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
			System.out.println("tiempo 3 " + sdf.format(Calendar.getInstance().getTime()));
			if (mssgValidacion.size() > 0) {
				emitirPolizaResponse.setPoliza(null);
				emitirPolizaResponse.setContextoRespuesta(UtilWS.getContextoRespuestaVal(mssgValidacion));
			} else {
				CotizacionServicio cotizacionServicio = new CotizacionServicio();
				System.out.println("tiempo 4 " + sdf.format(Calendar.getInstance().getTime()));
				OsCaratula osCaratula = cotizacionServicio.getCaratula(emitirPoliza.getSucur(),
						emitirPoliza.getCodpla(), emitirPoliza.getCotizacion(), emitirPoliza.getOrden());
				System.out.println("tiempo 5 " + sdf.format(Calendar.getInstance().getTime()));

				if (osCaratula == null) {
					/*
					 * if( !cotizacionServicio.existeCotizacion(emitirPoliza.
					 * getSucur(), emitirPoliza.getCodpla(),
					 * emitirPoliza.getCotizacion(), emitirPoliza.getOrden()) )
					 * {
					 */

					System.out.println("tiempo 6 " + sdf.format(Calendar.getInstance().getTime()));
					PolizaServicio polizaServicio = new PolizaServicio();
					// String w_sucur, String w_codpla, String w_cotiza, String
					// w_user
					poliza = polizaServicio.getPolizaByCotizacion(emitirPoliza.getSucur(), emitirPoliza.getCodpla(),
							emitirPoliza.getCotizacion(), cliente.getUsuarioosiris());

					System.out.println("tiempo 7 " + sdf.format(Calendar.getInstance().getTime()));
					if (poliza != null) {
						poliza.setSucur(CacheSucur.getInstance().getRevCache().get(poliza.getSucur().substring(4)));
						emitirPolizaResponse.setPoliza(poliza);
						emitirPolizaResponse.setContextoRespuesta(UtilWS.getContextoRespuestaEx());
					} else {

						try {
							// taokenDao.creaLogEmision(emitirPoliza.getSucur(),
							// emitirPoliza.getCotizacion(), "poliza no
							// encontrada");
							Thread t = new Thread(new ThreadLog(emitirPoliza.getSucur(), emitirPoliza.getCotizacion(),
									"poliza no encontrada", taokenDao));
							t.start();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						emitirPolizaResponse.setPoliza(null);
						mssgValidacion = EmitirPolizaValBusiness.valSpErrorSingle(CONSTANTES.RESP_EMI_POL_NEX);
						emitirPolizaResponse.setContextoRespuesta(UtilWS.getContextoRespuestaVal(mssgValidacion));
					}

				} else {

					try {
						// taokenDao.creaLogEmision(emitirPoliza.getSucur(),
						// emitirPoliza.getCotizacion(), "poliza encontrada:
						// "+osCaratula.toString());
						Thread t = new Thread(new ThreadLog(emitirPoliza.getSucur(), emitirPoliza.getCotizacion(),
								"poliza encontrada: " + osCaratula.toString(), taokenDao));
						t.start();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					PolizaServicio polizaServicio = new PolizaServicio();
					System.out.println("tiempo 8 " + sdf.format(Calendar.getInstance().getTime()));
					poliza = polizaServicio.getPolizaByCotizacion(emitirPoliza.getSucur(), emitirPoliza.getCodpla(),
							emitirPoliza.getCotizacion(), cliente.getUsuarioosiris());
					if (poliza != null) {
						poliza.setSucur(CacheSucur.getInstance().getRevCache().get(poliza.getSucur().substring(4)));
						emitirPolizaResponse.setPoliza(poliza);
						emitirPolizaResponse.setContextoRespuesta(UtilWS.getContextoRespuestaEx());
					} else {
						if (ValidarSarlaf.callValidar(emitirPoliza.getCodpla(), osCaratula.getTomador())
								.equalsIgnoreCase(CONSTANTES.RESP_SP_SARLAF_OK)) {
							System.out.println("tiempo 9 " + sdf.format(Calendar.getInstance().getTime()));

							// aqui sale error en el paquere en emitir poliza
							Map<String, String> rsEmitir = EmitirPolizaOper.callSpEmitirPoliza(emitirPoliza.getSucur(),
									emitirPoliza.getCodpla(), emitirPoliza.getCotizacion(), emitirPoliza.getOrden(),
									cliente.getUsuarioosiris());
							System.out.println("tiempo 10 " + sdf.format(Calendar.getInstance().getTime()));
							if (CONSTANTES.RESP_SP_EMI_OK.equals(rsEmitir.get(CONSTANTES.PARAM_EMI_IND))) {

								System.out.println("tiempo 11 " + sdf.format(Calendar.getInstance().getTime()));
								poliza = polizaServicio.getPoliza(emitirPoliza.getSucur(), emitirPoliza.getCodpla(),
										rsEmitir.get(CONSTANTES.PARAM_EMI_POLIZA), emitirPoliza.getOrden(),
										cliente.getUsuarioosiris());

								try {
									System.out.println("lanza hilo textos");
									Thread t = new Thread(new ThreadTextos(poliza.getSucur(), poliza.getCodpla(),
											poliza.getCertif(), "1", "FALA0036", "S"));
									t.start();
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}

								poliza.setSucur(
										CacheSucur.getInstance().getRevCache().get(poliza.getSucur().substring(4)));
								System.out.println("tiempo 12 " + sdf.format(Calendar.getInstance().getTime()));
								try {
									// taokenDao.creaLogEmision(emitirPoliza.getSucur(),
									// emitirPoliza.getCotizacion(), "Emitio:
									// "+poliza.toString());
									Thread t = new Thread(new ThreadLog(emitirPoliza.getSucur(),
											emitirPoliza.getCotizacion(), "Emitio: " + poliza.toString(), taokenDao));
									t.start();
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								emitirPolizaResponse.setPoliza(poliza);
								emitirPolizaResponse.setContextoRespuesta(UtilWS.getContextoRespuestaEx());
							} else {
								emitirPolizaResponse.setPoliza(null);
								mssgValidacion = EmitirPolizaValBusiness
										.valSpErrorSingle(rsEmitir.get(CONSTANTES.PARAM_EMI_IND));
								try {
									// taokenDao.creaLogEmision(emitirPoliza.getSucur(),
									// emitirPoliza.getCotizacion(), "Error al
									// emitir: "+mssgValidacion.toString());
									Thread t = new Thread(
											new ThreadLog(emitirPoliza.getSucur(), emitirPoliza.getCotizacion(),
													"Error al emitir: " + mssgValidacion.toString(), taokenDao));
									t.start();
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								emitirPolizaResponse
										.setContextoRespuesta(UtilWS.getContextoRespuestaVal(mssgValidacion));
							}
						} else {
							emitirPolizaResponse.setPoliza(null);
							mssgValidacion = EmitirPolizaValBusiness.valSpErrorSingle(CONSTANTES.RESP_SP_EMI_SARLAF);
							try {
								// taokenDao.creaLogEmision(emitirPoliza.getSucur(),
								// emitirPoliza.getCotizacion(), "Error al
								// emitir sarlaf:
								// "+mssgValidacion.toString());
								Thread t = new Thread(
										new ThreadLog(emitirPoliza.getSucur(), emitirPoliza.getCotizacion(),
												"Error al emitir sarlaf: " + mssgValidacion.toString(), taokenDao));
								t.start();
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							emitirPolizaResponse.setContextoRespuesta(UtilWS.getContextoRespuestaVal(mssgValidacion));

						}
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			try {
				// taokenDao.creaLogEmision(emitirPoliza.getSucur(),
				// emitirPoliza.getCotizacion(), "error global:
				// "+e.getMessage());
				Thread t = new Thread(new ThreadLog(emitirPoliza.getSucur(), emitirPoliza.getCotizacion(),
						"error global: " + e.getMessage(), taokenDao));
				t.start();
			} catch (Exception ei) {
				// TODO Auto-generated catch block
				ei.printStackTrace();
			}
			System.out.println("tiempo 13 " + sdf.format(Calendar.getInstance().getTime()));
			emitirPolizaResponse.setContextoRespuesta(UtilWS.getContextoRespuestaErrorException(e));
		}
		try {
			// taokenDao.creaLogEmision(emitirPoliza.getSucur(),
			// emitirPoliza.getCotizacion(), "respuesta final:
			// "+emitirPolizaResponse.toString());
			Thread t = new Thread(new ThreadLog(emitirPoliza.getSucur(), emitirPoliza.getCotizacion(),
					"respuesta final: " + emitirPolizaResponse.toString(), taokenDao));
			t.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("tiempo 1 " + sdf.format(Calendar.getInstance().getTime()));
		return emitirPolizaResponse;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param anularCertificado
	 * @return anularCertificadoResponse
	 */

	public coop.equidad.servicios.suscripcion.AnularCertificadoResponse anularCertificado(
			coop.equidad.servicios.suscripcion.AnularCertificado anularCertificado, String token) {
		AnularCertificadoResponse anularCertificadoResponse = new AnularCertificadoResponse();
		int w_ind = CONSTANTES.RESP_SP_ANU_ERR;
		Cliente cliente = TokenCache.getInstance().getRevCache().get(token);
		if (cliente == null) {
			TokenCache.getInstance().cargarCache();
			cliente = TokenCache.getInstance().getRevCache().get(token);
		}
		try {
			EquivCiudadServicio equivCiudadServicio = new EquivCiudadServicio();
			anularCertificado
					.setSucur(equivCiudadServicio.getCodSucursal(CONSTANTES.COD_GEN, anularCertificado.getSucur()));

			mssgValidacion = AnularCertificadoValCampo.valCancelarCertificado(anularCertificado);

			if (mssgValidacion.size() > 0) {
				anularCertificadoResponse.setAnulado(Boolean.FALSE);
				anularCertificadoResponse.setContextoRespuesta(UtilWS.getContextoRespuestaVal(mssgValidacion));
			} else {
				PolizaServicio polizaServicio = new PolizaServicio();

				if (!polizaServicio.existePoliza(anularCertificado.getSucur(), anularCertificado.getCodpla(),
						anularCertificado.getCertif(), anularCertificado.getPoliza(), cliente.getClave())) {

					anularCertificadoResponse.setAnulado(Boolean.FALSE);
					mssgValidacion = AnularCertificadoValBusiness.valSpErrorSingle(CONSTANTES.RESP_ANU_CRT_ERR);
					anularCertificadoResponse.setContextoRespuesta(UtilWS.getContextoRespuestaVal(mssgValidacion));

				} else {
					w_ind = AnularCertificadoOper.callSpPrAnularCertif(anularCertificado.getSucur(),
							anularCertificado.getPoliza(), anularCertificado.getCertif(), anularCertificado.getCodpla(),
							cliente.getUsuarioosiris());

					if (CONSTANTES.RESP_SP_ANU_ERR == w_ind) {
						anularCertificadoResponse.setAnulado(Boolean.FALSE);
						mssgValidacion = AnularCertificadoValBusiness.valSpErrorSingle(CONSTANTES.RESP_SP_UNK_ERR);
						anularCertificadoResponse.setContextoRespuesta(UtilWS.getContextoRespuestaVal(mssgValidacion));
					} else {
						anularCertificadoResponse.setAnulado(Boolean.TRUE);
						anularCertificadoResponse.setContextoRespuesta(UtilWS.getContextoRespuestaEx());
					}
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
			anularCertificadoResponse.setContextoRespuesta(UtilWS.getContextoRespuestaErrorException(e));
		}

		return anularCertificadoResponse;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param actualizarCotizacion
	 * @return actualizarCotizacionResponse
	 */

	public coop.equidad.servicios.suscripcion.ActualizarCotizacionResponse actualizarCotizacion(
			coop.equidad.servicios.suscripcion.ActualizarCotizacion actualizarCotizacion, String token) {
		ActualizarCotizacionResponse actualizarCotizacionResponse = new ActualizarCotizacionResponse();
		Cliente cliente = TokenCache.getInstance().getRevCache().get(token);
		if (cliente == null) {
			TokenCache.getInstance().cargarCache();
			cliente = TokenCache.getInstance().getRevCache().get(token);
		}
		try {
			EquivCiudadServicio equivCiudadServicio = new EquivCiudadServicio();
			actualizarCotizacion
					.setSucur(equivCiudadServicio.getCodSucursal(CONSTANTES.COD_GEN, actualizarCotizacion.getSucur()));

			mssgValidacion = ActualizarCotizacionValCampo.valActualizarCotizacion(actualizarCotizacion);

			if (mssgValidacion.size() > 0) {
				actualizarCotizacionResponse.setPoliza(null);
				actualizarCotizacionResponse.setContextoRespuesta(UtilWS.getContextoRespuestaVal(mssgValidacion));
			} else {
				CotizacionServicio cotizacionServicio = new CotizacionServicio();

				if (!cotizacionServicio.existeCotizacion(actualizarCotizacion.getSucur(),
						actualizarCotizacion.getCodpla(), actualizarCotizacion.getCertif(),
						actualizarCotizacion.getOrden())) {

					actualizarCotizacionResponse.setPoliza(null);
					mssgValidacion = ActualizarCotizacionValBusiness.valSpErrorSingle(CONSTANTES.RESP_ACT_COT_NEX);
					actualizarCotizacionResponse.setContextoRespuesta(UtilWS.getContextoRespuestaVal(mssgValidacion));
				} else {
					UtilWS.setDetallesReq(actualizarCotizacion.getDetalle(), actualizarCotizacion.getSucur(),
							actualizarCotizacion.getCodpla(), actualizarCotizacion.getCertif());

					if (!cotizacionServicio.setCotizacion(actualizarCotizacion, cliente.getUsuarioosiris())) {
						actualizarCotizacionResponse.setPoliza(null);
						mssgValidacion = ActualizarCotizacionValBusiness.valSpErrorSingle(CONSTANTES.RESP_ACT_COT_ERR);
						actualizarCotizacionResponse
								.setContextoRespuesta(UtilWS.getContextoRespuestaVal(mssgValidacion));

					} else {
						Map<String, String> rsTarifar = ValidarCotizacionOper.callSpPrTarifar(
								actualizarCotizacion.getSucur(), actualizarCotizacion.getCertif(),
								actualizarCotizacion.getCodpla(), actualizarCotizacion.getOrden(),
								cliente.getUsuarioosiris());

						w_ind = rsTarifar.get(CONSTANTES.PARAM_TAR_ERR);// CONSTANTES.PARAM_TAR_IND);TARD0002valorFT171201

						if (!CONSTANTES.RESP_SP_TAR_VAL_OK.equals(w_ind)) {// CONSTANTES.RESP_SP_TAR_ERR.equals(w_ind)
																			// )
																			// {
							actualizarCotizacionResponse.setPoliza(null);
							mssgValidacion = ActualizarCotizacionValBusiness
									.valSpErrorSingle(CONSTANTES.RESP_SP_TAR_ERR);
							actualizarCotizacionResponse
									.setContextoRespuesta(UtilWS.getContextoRespuestaVal(mssgValidacion));
						} else {
							poliza = cotizacionServicio.getCotizacion(actualizarCotizacion.getSucur(),
									actualizarCotizacion.getCodpla(), actualizarCotizacion.getCertif(),
									actualizarCotizacion.getOrden());
							poliza.getPolizaSequence_type2()
									.setDetalle(UtilWS.getDetallesRsTarifar(
											poliza.getPolizaSequence_type2().getDetalle(), rsTarifar, poliza.getSucur(),
											poliza.getCertif(), poliza.getCodpla()));
							poliza.setSucur(CacheSucur.getInstance().getRevCache().get(poliza.getSucur().substring(4)));
							actualizarCotizacionResponse.setPoliza(poliza);

							String err_tar = rsTarifar.get(CONSTANTES.PARAM_TAR_ERR);

							if (CONSTANTES.RESP_SP_TAR_VAL_OK.equals(err_tar)) {
								actualizarCotizacionResponse.setContextoRespuesta(UtilWS.getContextoRespuestaEx());
							} else {
								mssgValidacion = CrearCotizacionValBusiness
										.getSpErrorTarifar(rsTarifar.get(CONSTANTES.PARAM_TAR_MSJ));
								actualizarCotizacionResponse
										.setContextoRespuesta(UtilWS.getContextoRespuestaTarErr(mssgValidacion));
							}

						}

					}

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			actualizarCotizacionResponse.setContextoRespuesta(UtilWS.getContextoRespuestaErrorException(e));
		}

		return actualizarCotizacionResponse;
	}

}