package coop.equidad.web.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the LOG_SUSCRIPCION database table.
 * 
 */
@Entity
@Table(name="LOG_SUSCRIPCION", schema="osiris")
@NamedQuery(name="LogSuscripcion.findAll", query="SELECT l FROM LogSuscripcion l")
public class LogSuscripcion implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private Timestamp fechamensaje;

	@Column(columnDefinition="CLOB")
	private String mensaje;

	public LogSuscripcion() {
	}

	public Timestamp getFechamensaje() {
		return this.fechamensaje;
	}

	public void setFechamensaje(Timestamp fechamensaje) {
		this.fechamensaje = fechamensaje;
	}

	public String getMensaje() {
		return this.mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}