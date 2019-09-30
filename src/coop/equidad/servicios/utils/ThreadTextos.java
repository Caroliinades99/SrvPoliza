package coop.equidad.servicios.utils;

import coop.equidad.model.dao.PrTextos;

public class ThreadTextos implements Runnable {
	
	private String w_sucur; 
	private String w_codpla; 
	private String w_certif; 
	private String w_orden; 
	private String w_detalle; 
	private String w_valstring;
	
	public ThreadTextos(String w_sucur, String w_codpla, String w_certif, String w_orden, String w_detalle, String w_valstring)
	{
		this.w_sucur=w_sucur; 
		this.w_codpla=w_codpla; 
		this.w_certif=w_certif; 
		this.w_orden=w_orden; 
		this.w_detalle=w_detalle; 
		this.w_valstring=w_valstring;
	}
	@Override
	public void run() {
		try {
			new PrTextos().createtextos(w_sucur, w_codpla, w_certif, w_orden, w_detalle, w_valstring);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
