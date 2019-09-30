package coop.laequidad.cache;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import coop.equidad.model.dao.TokenDao;
import coop.equidad.web.entity.Permiso;

public class PermisoCache {
	private static PermisoCache instance;
	private Map<String, Permiso> cache;



	private PermisoCache (){
		cargarCache ();
	}

	public static PermisoCache getInstance() {
		if (instance == null) {
			instance = new PermisoCache();

		}

		return instance;
	}

	public Map<String, Permiso> getCache() {
		return cache;
	}

	public void setCache(Map<String, Permiso> cache) {
		this.cache = cache;
	}

	public void cargarCache () {

		ConcurrentHashMap<String, Permiso> cacheTmp = new ConcurrentHashMap<String,  Permiso>();


		TokenDao td= new TokenDao();

		List<Permiso> permisos = td.getPermisos();

		for(Permiso cl:permisos){


			cacheTmp.put(cl.getId().getCliente()+"-"+cl.getId().getRestriccion(),cl);



		}

		CacheSucur.getInstance();

		cache=cacheTmp;
	}



}
