package coop.laequidad.cache;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import coop.equidad.model.dao.OsDetalleDao;
import coop.equidad.model.dao.TokenDao;
import coop.equidad.web.entity.Permiso;

public class ProductosCache {
	private static ProductosCache instance;
	private Map<String, String> cache;



	private ProductosCache (){
		cargarCache ();
	}

	public static ProductosCache getInstance() {
		if (instance == null) {
			instance = new ProductosCache();

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

		OsDetalleDao osDetalleDao= new OsDetalleDao();
		

		this.cache=osDetalleDao.planesCompania();

		
	}



}
