package coop.equidad.servicios.oper;


import coop.equidad.model.dao.OsSuscEquivCiudadDao;
import coop.equidad.servicios.constantes.CONSTANTES;
import coop.laequidad.cache.CacheParametros;

public class ValidarSarlaf {

	public static String callValidar( String w_codpla, String w_tomador ) {		
		
		if(CacheParametros.getInstance().getCache().get("1-SARLAF").containsKey(w_codpla))
			return CONSTANTES.RESP_SP_SARLAF_OK;
		
		
		
		OsSuscEquivCiudadDao sus= new OsSuscEquivCiudadDao();
		
		try {
			if (sus.getSaltarSarlaf(w_tomador))
				return CONSTANTES.RESP_SP_SARLAF_OK;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sus.getSarlaf(w_tomador)?CONSTANTES.RESP_SP_SARLAF_OK:CONSTANTES.RESP_SP_SARLAF_ERR;
		
		
	}
	
}
