package coop.equidad.web.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the PERMISO database table.
 * 
 */
@Embeddable
public class PermisoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private long cliente;

	private long restriccion;

	public PermisoPK() {
	}
	public long getCliente() {
		return this.cliente;
	}
	public void setCliente(long cliente) {
		this.cliente = cliente;
	}
	public long getRestriccion() {
		return this.restriccion;
	}
	public void setRestriccion(long restriccion) {
		this.restriccion = restriccion;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PermisoPK)) {
			return false;
		}
		PermisoPK castOther = (PermisoPK)other;
		return 
				(this.cliente == castOther.cliente)
				&& (this.restriccion == castOther.restriccion);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.cliente ^ (this.cliente >>> 32)));
		hash = hash * prime + ((int) (this.restriccion ^ (this.restriccion >>> 32)));

		return hash;
	}
}
