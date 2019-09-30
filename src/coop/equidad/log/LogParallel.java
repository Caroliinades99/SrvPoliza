package coop.equidad.log;

import java.sql.Timestamp;
import java.util.Calendar;

import coop.equidad.model.dao.TokenDao;
import coop.equidad.web.entity.LogSuscripcion;

public class LogParallel  implements Runnable {
	
	private String request;
	
	public LogParallel(String request){
		this.request=request;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		guardarRequestWS();
	}
	
	
	 private void guardarRequestWS (  ) {
 		LogSuscripcion logSuscripcion = new LogSuscripcion();
 		logSuscripcion.setFechamensaje(new Timestamp(Calendar.getInstance().getTimeInMillis()));
 		logSuscripcion.setMensaje(request);
 		
 		TokenDao td = new TokenDao();
 		td.creaLogSuscripcion(logSuscripcion);
 	}
	
}
