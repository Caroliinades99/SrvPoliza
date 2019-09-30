package coop.laequidad.cache;


import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import coop.equidad.model.dao.TokenDao;
import coop.equidad.web.entity.Restriccion;

public class RestriccionCache {
	private static RestriccionCache instance;
	private Map<String, Restriccion> cache;



	private RestriccionCache (){
		cargarCache ();
	}

	public static RestriccionCache getInstance() {
		if (instance == null) {
			instance = new RestriccionCache();

		}

		return instance;
	}

	public Map<String, Restriccion> getCache() {
		return cache;
	}

	public void setCache(Map<String, Restriccion> cache) {
		this.cache = cache;
	}

	public void cargarCache () {

		ConcurrentHashMap<String, Restriccion> cacheTmp = new ConcurrentHashMap<String,  Restriccion>();


		TokenDao td= new TokenDao();

		List<Restriccion> restricciones = td.getRestricciones();

		for(Restriccion cl:restricciones){

			cacheTmp.put(cl.getUrl(),cl);

		}

		cache=cacheTmp;
	}

}
