package coop.equidad.servicios.oper;

import coop.equidad.model.dao.PrAnularCertifDao;

public class AnularCertificadoOper {
	
	/**
	 * 
	 * @param w_sucur
	 * @param w_poliza
	 * @param w_certif
	 * @param w_codpla
	 * @param w_causa
	 * @return
	 */
	public static int callSpPrAnularCertif( String w_sucur, String w_poliza, String w_certif, String w_codpla, String w_user ) {
		PrAnularCertifDao prAnularCertifDao = new PrAnularCertifDao();		
		int w_ind = prAnularCertifDao.spPrAnularCertif(w_sucur, w_poliza, w_certif, w_codpla, w_user);
		
		return w_ind;
	}
}
