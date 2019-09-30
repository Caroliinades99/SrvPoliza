package coop.laequidad.cache;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import coop.equidad.model.dao.OsSuscEquivCiudadDao;
import coop.equidad.model.dao.TokenDao;
import coop.equidad.model.entity.SuscEquivCiudade;
import coop.equidad.web.entity.Permiso;

public class CacheSucur {
	
	private static CacheSucur instance;
	private Map<String, String> cache;
	private Map<String, String> revCache;



	private CacheSucur (){
		cargarCache ();
	}

	public static CacheSucur getInstance() {
		if (instance == null) {
			instance = new CacheSucur();

		}

		return instance;
	}

	public Map<String, String> getCache() {
		return cache;
	}

	public void setCache(Map<String, String> cache) {
		this.cache = cache;
	}

	public void cargarCache () {

		ConcurrentHashMap<String, String> cacheTmp = new ConcurrentHashMap<String,  String>();
		ConcurrentHashMap<String, String> cacheTmp1 = new ConcurrentHashMap<String,  String>();

		OsSuscEquivCiudadDao td= new OsSuscEquivCiudadDao();

		List<SuscEquivCiudade> ciudades = td.getCodSucursales();

		for(SuscEquivCiudade cl:ciudades){


			cacheTmp.put(cl.getCodigoDane(),cl.getSucursal());
			cacheTmp1.put(cl.getSucursal(),cl.getCodigoDane());


		}



		cache=cacheTmp;
		revCache=cacheTmp1;
	}

	public Map<String, String> getRevCache() {
		return revCache;
	}

	public void setRevCache(Map<String, String> revCache) {
		this.revCache = revCache;
	}
	
	
	
}
