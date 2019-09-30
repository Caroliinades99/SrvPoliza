package coop.laequidad.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="LOG_SERVICIO_EMISION",schema="osiris")
@NamedQuery(name="LOG_SERVICIO_EMISION.findAll", query="SELECT s FROM S03080 s")
public class LOG_SERVICIO_EMISION  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private LOG_SERVICIO_EMISIONPK id;
	
	@Column(columnDefinition="CLOB")
	private String mensaje;

	public LOG_SERVICIO_EMISIONPK getId() {
		return id;
	}

	public void setId(LOG_SERVICIO_EMISIONPK id) {
		this.id = id;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
	
}
