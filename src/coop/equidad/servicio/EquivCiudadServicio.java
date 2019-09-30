package coop.equidad.servicio;

import coop.equidad.model.dao.OsSuscEquivCiudadDao;
import coop.equidad.servicios.constantes.CONSTANTES;
import coop.equidad.servicios.utils.UtilCommon;
import coop.laequidad.cache.CacheSucur;

public class EquivCiudadServicio {
	
	/**
	 * 
	 * @param w_coddane
	 * @return
	 */
	public String getCodSucursal( String w_cia, String w_coddane ) {
		OsSuscEquivCiudadDao suscEquivCiudadDao = new OsSuscEquivCiudadDao();
		String codSucursal = CacheSucur.getInstance().getCache().get(w_coddane);//suscEquivCiudadDao.getCodSucursal(w_coddane);
		
		if( codSucursal != null ) {
			codSucursal = w_cia + UtilCommon.getStringComp(
					CONSTANTES.FORMAT_STRING_5DIG, codSucursal);
		}
		
		return codSucursal;
	}
}
