package coop.equidad.servicio.externo.autos;

import java.util.HashMap;
import java.util.Map;

import coop.equidad.gacelaplus.cexper.servicio.CexperServicioImpl;
import coop.equidad.gacelaplus.cexper.servicio.Servicios;
import coop.equidad.servicio.externo.ServicioExterno;
import coop.equidad.servicio.externo.exception.CallException;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import com.seven4n.cexper.client.CexperStub.ArrayOfHistoricoPolizaCexper;
import com.seven4n.cexper.client.CexperStub.HistoricoPolizaCexper;
import com.seven4n.cexper.client.CexperStub.HistoricoPolizas;
import com.seven4n.cexper.client.CexperStub.HistoricoSiniestroCexper;
import com.seven4n.cexper.client.CexperStub.HistoricoSiniestros;

import co.dynaco.main.Util;

public class ConsultaExperiencia implements ServicioExterno<String> {

	@Override
	public String getValor(Map<String, Object> parametros) throws CallException {
		try {
			System.out
					.println(parametros.get("tipDoc") + " " + parametros.get("numDoc") + " " + parametros.get("placa"));
			return getCodigoBuenaExperiencia("1", parametros.get("numDoc").toString(), "AAA111");// (parametros.get("tipDoc")+""),
																									// ((Integer)parametros.get("numDoc")).toString(),
																									// (String)parametros.get("placa"));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			throw new CallException(e.getMessage());
		}
	}

	public static boolean haTenidoPolizas(String tipoDocumento, String documento) {
		CexperServicioImpl cexper = new CexperServicioImpl();
		cexper.setUsuario("90598600284155");
		cexper.setClave("12121212");
		HistoricoPolizas historico = new HistoricoPolizas();
		historico.setTipoDocumento(tipoDocumento);
		historico.setNumeroDocumento(documento);
		historico.setPlaca("AAA111");
		ArrayOfHistoricoPolizaCexper hist = cexper.consultarHistoricoDePolizas(historico).getHistoricoPolizasResult();
		if (hist.getHistoricoPolizaCexper() != null) {
			return true;
		} else {
			return false;
		}
	}

	public static String calcularVigenciasAnteriores2(String tipoDocumento, String documento) {
		CexperServicioImpl cexper = new CexperServicioImpl();
		cexper.setUsuario("90598600284155");
		cexper.setClave("12121212");
		HistoricoPolizas historico = new HistoricoPolizas();
		historico.setTipoDocumento(tipoDocumento);
		historico.setNumeroDocumento(documento);
		historico.setPlaca("AAA111");
		ArrayOfHistoricoPolizaCexper hist = cexper.consultarHistoricoDePolizas(historico).getHistoricoPolizasResult();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		int val = 0;
		if (hist.getHistoricoPolizaCexper() != null && hist.getHistoricoPolizaCexper().length > 0) {
			HistoricoPolizaCexper historiAnterior, histori = hist.getHistoricoPolizaCexper()[0];
			int j = 1;
			if (histori.getFechaFinVigencia().before(Calendar.getInstance().getTime())) {
				histori = hist.getHistoricoPolizaCexper()[1];
				j = 2;
			}

			System.out.println(df.format(histori.getFechaFinVigencia().getTime()) + " "
					+ df.format(histori.getFechaVigencia().getTime()));
			val = 1;
			for (int i = j; i < hist.getHistoricoPolizaCexper().length; i++) {
				historiAnterior = hist.getHistoricoPolizaCexper()[i];
				System.out.println(df.format(historiAnterior.getFechaFinVigencia().getTime()) + " "
						+ df.format(historiAnterior.getFechaVigencia().getTime()));

				long diff = histori.getFechaVigencia().getTime().getTime()
						- historiAnterior.getFechaFinVigencia().getTime().getTime();
				long dias = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
				System.out.println("Days: " + dias);

				if (dias < 180) {
					++val;
				} else
					break;
				histori = historiAnterior;
				if (val == 4)
					break;

			}
		}

		return "0" + val;
	}

	static double mes;

	public static String calcularVigenciasAnteriores(String tipoDocumento, String documento) {
		CexperServicioImpl cexper = new CexperServicioImpl();
		cexper.setUsuario("90598600284155");
		cexper.setClave("12121212");
		HistoricoPolizas historico = new HistoricoPolizas();
		historico.setTipoDocumento(tipoDocumento);
		historico.setNumeroDocumento(documento);
		historico.setPlaca("AAA111");
		ArrayOfHistoricoPolizaCexper hist = cexper.consultarHistoricoDePolizas(historico).getHistoricoPolizasResult();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		int val = 0;
		if (hist.getHistoricoPolizaCexper() != null && hist.getHistoricoPolizaCexper().length > 0) {
			HistoricoPolizaCexper historiAnterior, histori = hist.getHistoricoPolizaCexper()[0];
			Calendar fechaUltima = Calendar.getInstance();
			int j = 1;
			// correr hacia atras hasta encontrar la primer poliza anterior o la
			// ultima poliza emitida
			// CAROLINA METIO LA MANO AQUI
			mes = Util.getDiferenciaMeses(histori.getFechaFinVigencia().getTime(), Calendar.getInstance().getTime());

			while (j < hist.getHistoricoPolizaCexper().length && (Calendar.getInstance().getTime().getTime()
					- histori.getFechaFinVigencia().getTime().getTime()) < 0) { // histori.getFechaFinVigencia().getTime().after(Calendar.getInstance().getTime())){
				fechaUltima = histori.getFechaVigencia();// gueardar fecha
															// inicio vigencia
															// actual
				histori = hist.getHistoricoPolizaCexper()[j];
				j++;
			}
			// validar que la ultima poliza emitida no este vigente
			if ((Calendar.getInstance().getTime().getTime() - histori.getFechaFinVigencia().getTime().getTime()) < 0)
				// return "00";
				return mes >= 0 && mes < 5 ? "01" : "00";
			/*
			 * 
			 * //correr hacia a tras buscando la primer poliza anterior con
			 * vigencia completa while(j<hist.getHistoricoPolizaCexper().length
			 * && diasEntre(histori.getFechaVigencia().getTime().getTime(),
			 * histori.getFechaFinVigencia().getTime().getTime())<364){
			 * fechaUltima=histori.getFechaVigencia();//gueardar fecha inicio
			 * vigencia actual histori=hist.getHistoricoPolizaCexper()[j]; j++;
			 * }
			 * 
			 * //validar que la ultima poliza emitida tenga vigencia completa
			 * if(diasEntre(histori.getFechaVigencia().getTime().getTime(),
			 * histori.getFechaFinVigencia().getTime().getTime())<364) return
			 * "00";
			 */
			System.out.println(df.format(histori.getFechaFinVigencia().getTime()) + " "
					+ df.format(histori.getFechaVigencia().getTime()));
			// validar que sean menos de 180 dias desde la poliza actual hasta
			// la ultima vigente
			if (diasEntre(histori.getFechaFinVigencia().getTime().getTime(), fechaUltima.getTime().getTime()) > 180)
				return "00";

			val = 1;
			Calendar inicio = histori.getFechaVigencia(), fin = histori.getFechaFinVigencia();
			for (int i = j; i < hist.getHistoricoPolizaCexper().length; i++) {
				historiAnterior = hist.getHistoricoPolizaCexper()[i];
				System.out.println(df.format(historiAnterior.getFechaFinVigencia().getTime()) + " "
						+ df.format(historiAnterior.getFechaVigencia().getTime()));

				/*
				 * if(diasEntre(historiAnterior.getFechaVigencia().getTime().
				 * getTime(),
				 * historiAnterior.getFechaFinVigencia().getTime().getTime())<
				 * 364) continue;
				 */

				long diff = histori.getFechaVigencia().getTime().getTime()
						- historiAnterior.getFechaFinVigencia().getTime().getTime();
				long dias = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
				System.out.println("Days: " + dias);
				/*
				 * if(dias <= -10 ||
				 * diasEntre(historiAnterior.getFechaVigencia().getTime().
				 * getTime(),
				 * historiAnterior.getFechaFinVigencia().getTime().getTime())<
				 * 364){
				 * histori.setFechaVigencia(historiAnterior.getFechaVigencia());
				 * continue;
				 * 
				 * } else
				 */
				if (dias < 180) {
					inicio = historiAnterior.getFechaVigencia();
					// ++val;
				} else
					break;
				histori = historiAnterior;
				/*
				 * if(val==4) break;
				 */

			}
			int resultado = new Long(diasEntre(inicio.getTime().getTime(), fin.getTime().getTime()) / 365).intValue();
			if (resultado > 4)
				resultado = 4;

			int suma = mes >= 0 && mes < 5 ? 1 : 0;

			return "0" + (resultado + suma);

		}

		return "0" + val;
	}

	public static long diasEntre(long inicio, long fin) {
		long diff = fin - inicio;
		long dias = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		return dias;
	}

	public static String getAnteriores(String tipoDocumento, String documento, Calendar fechaUltimo) {
		CexperServicioImpl cexper = new CexperServicioImpl();
		cexper.setUsuario("90598600284155");
		cexper.setClave("12121212");
		HistoricoPolizas historico = new HistoricoPolizas();
		historico.setTipoDocumento(tipoDocumento);
		historico.setNumeroDocumento(documento);
		historico.setPlaca("AAA111");
		ArrayOfHistoricoPolizaCexper hist = cexper.consultarHistoricoDePolizas(historico).getHistoricoPolizasResult();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		int val = 0;
		if (hist.getHistoricoPolizaCexper() != null && hist.getHistoricoPolizaCexper().length > 0) {
			HistoricoPolizaCexper historiAnterior, histori = hist.getHistoricoPolizaCexper()[0];
			System.out.println(df.format(histori.getFechaFinVigencia().getTime()) + " "
					+ df.format(histori.getFechaVigencia().getTime()));
			Calendar fechaUltima = Calendar.getInstance();
			int j = 1;

			if (fechaUltimo.after(histori.getFechaVigencia()) && fechaUltimo.before(histori.getFechaFinVigencia()))
				return "0";

			// CAROLINA METIO LA MANO AQUI
			Calendar ahoraCal2 = Calendar.getInstance();
			ahoraCal2.setTime(histori.getFechaFinVigencia().getTime());
			ahoraCal2.add(Calendar.MONTH, -2);

			System.out.println(ahoraCal2.getTime());

			mes = Util.getDiferenciaMeses(ahoraCal2.getTime(), Calendar.getInstance().getTime());

			while (j < hist.getHistoricoPolizaCexper().length && (Calendar.getInstance().getTime().getTime()
					- histori.getFechaFinVigencia().getTime().getTime()) < 0) { // histori.getFechaFinVigencia().getTime().after(Calendar.getInstance().getTime())){
				fechaUltima = histori.getFechaVigencia();// gueardar fecha
															// inicio vigencia
															// actual
				histori = hist.getHistoricoPolizaCexper()[j];
				j++;
			}
			// validar que la ultima poliza emitida no este vigente
			if ((Calendar.getInstance().getTime().getTime() - histori.getFechaFinVigencia().getTime().getTime()) < 0)
				return "0";

			System.out.println(df.format(histori.getFechaFinVigencia().getTime()) + " "
					+ df.format(histori.getFechaVigencia().getTime()));
			// validar que sean menos de 180 dias desde la poliza actual hasta
			// la ultima vigente
			if (diasEntre(histori.getFechaFinVigencia().getTime().getTime(), fechaUltima.getTime().getTime()) > 180)
				return "0";

			// validar QUE LA POLIZA NO ESTE SINIESTRADA O EN LA FECHA DE ALGUN
			// SINIESTRO
			if (fechaUltimo.after(histori.getFechaVigencia()) && fechaUltimo.before(histori.getFechaFinVigencia()))
				return mes >= 0 && mes < 3 ? "1" : "0";

			val = 1;
			Calendar inicio = histori.getFechaVigencia(), fin = histori.getFechaFinVigencia();
			for (int i = j; i < hist.getHistoricoPolizaCexper().length; i++) {
				historiAnterior = hist.getHistoricoPolizaCexper()[i];

				System.out.println(df.format(historiAnterior.getFechaFinVigencia().getTime()) + " "
						+ df.format(historiAnterior.getFechaVigencia().getTime()) + " "
						+ df.format(fechaUltimo.getTime()));
				System.out.println(fechaUltimo.after(historiAnterior.getFechaVigencia()) + "  "
						+ fechaUltimo.before(historiAnterior.getFechaFinVigencia()));
				long diff = histori.getFechaVigencia().getTime().getTime()
						- historiAnterior.getFechaFinVigencia().getTime().getTime();
				long dias = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
				System.out.println("Days: " + dias);
				/*
				 * if(dias <= -10 ||
				 * diasEntre(historiAnterior.getFechaVigencia().getTime().
				 * getTime(),
				 * historiAnterior.getFechaFinVigencia().getTime().getTime())<
				 * 364){
				 * histori.setFechaVigencia(historiAnterior.getFechaVigencia());
				 * continue; } else
				 */
				if (dias < 180) {
					if (fechaUltimo.after(historiAnterior.getFechaVigencia())
							&& fechaUltimo.before(historiAnterior.getFechaFinVigencia()))
						break;
					inicio = historiAnterior.getFechaVigencia();
				} else
					break;

				histori = historiAnterior;
				/*
				 * if(val==4) break;
				 */
			}
			int resultado = new Long(diasEntre(inicio.getTime().getTime(), fin.getTime().getTime()) / 365).intValue();
			if (resultado > 4)
				resultado = 4;

			int suma = mes >= 0 && mes < 3 ? 1 : 0;

			return (resultado + suma) + "";

		}

		return "0" + val;
	}

	public static int contadorPolizas(String tipoDocumento, String documento) {

		int totalpolizas = 0;

		CexperServicioImpl cexper = new CexperServicioImpl();
		cexper.setUsuario("90598600284155");
		cexper.setClave("12121212");
		HistoricoPolizas historico = new HistoricoPolizas();
		historico.setTipoDocumento(tipoDocumento);
		historico.setNumeroDocumento(documento);
		historico.setPlaca("AAA111");

		ArrayOfHistoricoPolizaCexper hist = cexper.consultarHistoricoDePolizas(historico).getHistoricoPolizasResult();
		if (hist.getHistoricoPolizaCexper() != null) {
			HistoricoPolizaCexper[] cex = hist.getHistoricoPolizaCexper();

			for (int i = 0; i < cex.length; i++) {
				totalpolizas++;
			}

		}
		return totalpolizas;
	}

	public static Date ultimaPoliza(String tipoDocumento, String documento) {
		Date fechaFinal = null;
		CexperServicioImpl cexper = new CexperServicioImpl();
		cexper.setUsuario("90598600284155");
		cexper.setClave("12121212");
		HistoricoPolizas historico = new HistoricoPolizas();
		historico.setTipoDocumento(tipoDocumento);
		historico.setNumeroDocumento(documento);
		historico.setPlaca("AAA111");

		ArrayOfHistoricoPolizaCexper hist = cexper.consultarHistoricoDePolizas(historico).getHistoricoPolizasResult();
		if (hist.getHistoricoPolizaCexper() != null) {
			HistoricoPolizaCexper[] cex = hist.getHistoricoPolizaCexper();

			for (int i = 0; i < cex.length; i++) {
				System.out.println(cex[i].getFechaFinVigencia().getTime() + " --- ");
				if (fechaFinal == null || fechaFinal.getTime() < cex[i].getFechaFinVigencia().getTimeInMillis()) {
					fechaFinal = cex[i].getFechaFinVigencia().getTime();
				}
			}
			return fechaFinal;
		}
		return fechaFinal;
	}

	public static int anioUltimoSiniestro(String tipoDocumento, String documento, String placa) throws Exception {
		CexperServicioImpl cexper = new CexperServicioImpl();
		cexper.setUsuario("90598600284155");
		cexper.setClave("12121212");
		HistoricoSiniestros historico = new HistoricoSiniestros();
		historico.setTipoDocumento(tipoDocumento);
		historico.setNumeroDocumento(documento);
		historico.setPlaca(placa);
		HistoricoSiniestroCexper[] responses = cexper.consultarHistoricoSiniestros(historico)
				.getHistoricoSiniestrosResult().getHistoricoSiniestroCexper();
		int anios = -1;
		if (responses != null) {

			HistoricoSiniestroCexper response = responses[0];
			Calendar c = response.getFechaSiniestro();
			anios = c.get(Calendar.YEAR);
			for (int i = 0; i < responses.length; i++) {
				response = responses[i];
				c = response.getFechaSiniestro();
				if (anios < c.get(Calendar.YEAR)) {
					anios = c.get(Calendar.YEAR);
				}
			}
		}
		return anios;
	}

	public static Calendar fechaUltimoSiniestro(String tipoDocumento, String documento, String placa) throws Exception {

		CexperServicioImpl cexper = new CexperServicioImpl();
		cexper.setUsuario("90598600284155");
		cexper.setClave("12121212");
		HistoricoSiniestros historico = new HistoricoSiniestros();
		historico.setTipoDocumento(tipoDocumento);
		historico.setNumeroDocumento(documento);
		historico.setPlaca(placa);
		HistoricoSiniestroCexper[] responses = cexper.consultarHistoricoSiniestros(historico)
				.getHistoricoSiniestrosResult().getHistoricoSiniestroCexper();
		Calendar cAnt, c = null;
		if (responses != null) {

			HistoricoSiniestroCexper response = responses[0];
			c = response.getFechaSiniestro();

			for (int i = 0; i < responses.length; i++) {
				response = responses[i];
				cAnt = response.getFechaSiniestro();
				if (!c.after(cAnt)) {
					c = cAnt;
				}

			}
		}
		return c;
	}

	public static String getCodigoBuenaExperiencia(String tipoDocumento, String documento, String placa)
			throws Exception {
		if (placa == null || placa.length() <= 0) {
			placa = "AAA111";
		}
		int anioActual = Calendar.getInstance().get(Calendar.YEAR);
		int anioUltimoSiniestro = Servicios.anioUltimoSiniestro(tipoDocumento, documento, placa);
		String cod = "00";
		Date fechaUltimoMes = Servicios.ultimaPoliza(tipoDocumento, documento);
		int totalPolizas = Servicios.contadorPolizas(tipoDocumento, documento);
		System.out.println(fechaUltimoMes);
		if (totalPolizas == 0) {
			return "05";
		} else {
			double meses = -10;
			if (fechaUltimoMes != null) {
				meses = Util.getDiferenciaMeses(Calendar.getInstance().getTime(), fechaUltimoMes);
			}

			if (meses < -6d || (meses > 0 && totalPolizas < 2)) {
				cod = "00";
			} else {
				if (anioUltimoSiniestro == -1) {
					cod = calcularVigenciasAnteriores(tipoDocumento, documento);

				} else {
					int resta = anioActual - anioUltimoSiniestro;
					Calendar fechaUltimo = fechaUltimoSiniestro(tipoDocumento, documento, placa);

					String vigenciasAnterioresConsecutivas = getAnteriores(tipoDocumento, documento, fechaUltimo);
					cod = "0" + vigenciasAnterioresConsecutivas;

				}
			}
		}
		if (cod == null) {
			cod = "00";
		}

		return cod;
	}

	public static void main(String[] args) {
		try {
			Class c = Class.forName("coop.equidad.servicio.externo.autos.ConsultaExperiencia");
			ServicioExterno se = (ServicioExterno) c.newInstance();
			Map<String, Object> parametros = new HashMap<String, Object>();
			try {
				se.getValor(parametros);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
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
		}
	}
}
