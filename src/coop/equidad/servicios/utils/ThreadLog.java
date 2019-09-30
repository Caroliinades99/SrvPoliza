package coop.equidad.servicios.utils;

import coop.equidad.model.dao.TokenDao;

public class ThreadLog implements Runnable {
	
	String sucursal;
	String cotizacion;
	String mensaje;
	TokenDao taokenDao;
	
	public ThreadLog(String sucursal, String cotizacion, String mensaje,TokenDao taokenDao){
		this.sucursal=sucursal;
		this.cotizacion=cotizacion;
		this.mensaje=mensaje;
		this.taokenDao=taokenDao;
		
	}
	
	@Override
	public void run() {
		/*
		try {
			taokenDao.creaLogEmision(sucursal, cotizacion, mensaje);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

}
