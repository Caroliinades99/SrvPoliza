package coop.equidad.servicio.externo.exception;

public class CallException extends Exception {
	private String message;
	public CallException(String message){
		this.message=message;
	}
	
	@Override
	public String getMessage() {
		
		return this.message;
	}
	
	
}
