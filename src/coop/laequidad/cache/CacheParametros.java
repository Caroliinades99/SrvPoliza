package coop.laequidad.cache;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import coop.equidad.model.dao.OsSuscEquivCiudadDao;
import coop.equidad.model.entity.S03010;

import coop.laequidad.entity.S03080;

public class CacheParametros {
	private static CacheParametros instance;
	private Map<String, Map<String, S03010>> cache;

	private CacheParametros() {
		cargarCache();
	}

	public static CacheParametros getInstance() {
		if (instance == null) {
			instance = new CacheParametros();

		}

		return instance;
	}

	public Map<String, Map<String, S03010>> getCache() {
		return cache;
	}

	public void setCache(Map<String, Map<String, S03010>> cache) {
		this.cache = cache;
	}

	public void cargarCache() {
		// TODO: Select a S03080
		// Para cada uno de los ergistros de S03080 buscar en la S03010 los detalles
		// Almacenar en "cache"

		cache = new HashMap<String, Map<String, S03010>>();

		OsSuscEquivCiudadDao td = new OsSuscEquivCiudadDao();

		List<S03080> listaParam = td.getCabezaParametros();
		List<S03010> listaDetalles;
		Map<String, S03010> mapaDetalles;
		for (S03080 param : listaParam) {

			listaDetalles = td.getDetalleParametros(param.getS03080PK().getTipo(), param.getS03080PK().getClase());
			mapaDetalles = new HashMap<String, S03010>();
			for (S03010 detalle : listaDetalles) {
				mapaDetalles.put(detalle.getS03010PK().getCodigo(), detalle);
			}
			cache.put(param.getS03080PK().getClase().intValue() + "-" + param.getS03080PK().getTipo(), mapaDetalles);

		}

	}

}
