package coop.laequidad.cache;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import coop.equidad.model.dao.TokenDao;
import coop.equidad.model.entity.S03067;

public class SuscripcionCache {
	private static SuscripcionCache instance;
	private Map<String,Map<String,List<S03067>>> cache; 
	
	private SuscripcionCache (){
		cargarCache ();
	}
	
	public static SuscripcionCache getInstance() {
		if (instance == null) {
			instance = new SuscripcionCache();

		}

		return instance;
	}
	
	public void cargarCache () {

		TokenDao td= new TokenDao();
				
		setCache(td.getRestriccionesSuscripcion());
		
	}

	public Map<String,Map<String,List<S03067>>> getCache() {
		return cache;
	}

	public void setCache(Map<String,Map<String,List<S03067>>> cache) {
		this.cache = cache;
	}
	
}
