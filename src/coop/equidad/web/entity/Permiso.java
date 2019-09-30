package coop.equidad.web.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PERMISO database table.
 * 
 */
@Entity
@Table(name="Permiso", schema="webservices")
@NamedQuery(name="Permiso.findAll", query="SELECT p FROM Permiso p")
public class Permiso implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PermisoPK id;

	public Permiso() {
	}

	public PermisoPK getId() {
		return this.id;
	}

	public void setId(PermisoPK id) {
		this.id = id;
	}

}
