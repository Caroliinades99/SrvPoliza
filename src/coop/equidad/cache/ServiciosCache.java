package coop.equidad.cache;

import java.math.BigDecimal;
import java.util.List;

import coop.equidad.model.dao.OsParametroDao;
import coop.equidad.model.entity.S03010;

public class ServiciosCache {
	
	private List<S03010> servicios;
	private static ServiciosCache instance;
	public static ServiciosCache getInstance(){
		
		if(instance==null)
			instance=new ServiciosCache();
		return instance;
		
	}
	
	private ServiciosCache(){
		OsParametroDao os= new OsParametroDao();
		setServicios(os.getParam(new BigDecimal(1), "SEREXT"));
	}

	public List<S03010> getServicios() {
		return servicios;
	}

	public void setServicios(List<S03010> servicios) {
		this.servicios = servicios;
	}
	
}
