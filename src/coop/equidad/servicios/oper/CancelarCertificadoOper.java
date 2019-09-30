package coop.equidad.servicios.oper;

import java.util.Date;

import coop.equidad.model.dao.PrCancelarCertifDao;

public class CancelarCertificadoOper {
	
	/**
	 * 
	 * @param w_sucur
	 * @param w_poliza
	 * @param w_certif
	 * @param w_codpla
	 * @param w_causa
	 * @return
	 */
	public static int callSpPrCancelarCertif( String w_sucur, String w_poliza, String w_certif, String w_codpla, Date w_fecha_cancelacion, String w_causa, String w_user ) {
		PrCancelarCertifDao cancelarCertifDao = new PrCancelarCertifDao();		
		int w_ind = cancelarCertifDao.spPrCancelarCertif(w_sucur, w_poliza, w_certif, w_codpla, w_fecha_cancelacion, w_causa, w_user);
		
		return w_ind;
	}
}
