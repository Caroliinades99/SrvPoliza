package coop.equidad.web.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the RESTRICCION database table.
 * 
 */
@Entity
@Table(name="Restriccion", schema="webservices")
@NamedQuery(name="Restriccion.findAll", query="SELECT r FROM Restriccion r")
public class Restriccion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String url;

	public Restriccion() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
