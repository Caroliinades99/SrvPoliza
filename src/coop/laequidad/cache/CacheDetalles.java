package coop.laequidad.cache;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import coop.equidad.model.dao.OsDetalleDao;
import coop.equidad.model.entity.S03010;
import coop.laequidad.entity.S03104;
import coop.laequidad.entity.S03105;

public class CacheDetalles {
	private static CacheDetalles instance;
	private Map<String, Map<String, Map<String, String>>> cache;
	private Map<String, Map<String, String>> cacheDName;

	private CacheDetalles() {
		cargarCache();
	}

	public static CacheDetalles getInstance() {
		if (instance == null) {
			instance = new CacheDetalles();

		}

		return instance;
	}

	public Map<String, Map<String, Map<String, String>>> getCache() {
		return cache;
	}

	public void setCache(Map<String, Map<String, Map<String, String>>> cache) {
		this.cache = cache;
	}

	public Map<String, Map<String, String>> getCacheDName() {
		return cacheDName;
	}

	public void setCacheDName(Map<String, Map<String, String>> cacheDName) {
		this.cacheDName = cacheDName;
	}

	public void cargarCache() {
		cache = new HashMap<String, Map<String, Map<String, String>>>();
		cacheDName = new HashMap<String, Map<String, String>>();
		OsDetalleDao osDetalleDao = new OsDetalleDao();

		List<S03105> detalles = osDetalleDao.getValoresDetalleByKey();

		for (S03105 detalle : detalles) {

			if (cache.get(detalle.getS03105Pk().getCodpad()) == null)
				cache.put(detalle.getS03105Pk().getCodpad(), new HashMap<String, Map<String, String>>());

			if (cache.get(detalle.getS03105Pk().getCodpad()).get(detalle.getS03105Pk().getCoddet()) == null)
				cache.get(detalle.getS03105Pk().getCodpad()).put(detalle.getS03105Pk().getCoddet(),
						new HashMap<String, String>());

			if (cache.get(detalle.getS03105Pk().getCodpad()).get(detalle.getS03105Pk().getCoddet())
					.get(detalle.getS03105Pk().getCodigo()) == null)
				cache.get(detalle.getS03105Pk().getCodpad()).get(detalle.getS03105Pk().getCoddet())
						.put(detalle.getS03105Pk().getCodigo(), detalle.getNombre());
		}

		List<S03104> nombreDetalles = osDetalleDao.getDetalleName();

		for (S03104 detalle : nombreDetalles) {

			if (detalle != null && detalle.getS03104Pk() != null && detalle.getS03104Pk().getCodpla() != null) {
				if (cacheDName.get(detalle.getS03104Pk().getCodpla()) == null)
					cacheDName.put(detalle.getS03104Pk().getCodpla(), new HashMap<String, String>());
				if (cacheDName.get(detalle.getS03104Pk().getCodpla()).get(detalle.getS03104Pk().getCoddet()) == null)
					cacheDName.get(detalle.getS03104Pk().getCodpla()).put(detalle.getS03104Pk().getCoddet(),
							detalle.getNombre());
			}

		}
	}

}
