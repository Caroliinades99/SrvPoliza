package coop.laequidad.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class S03080Pk implements Serializable {
	
	
	private BigDecimal clase;


	private String tipo;


	public BigDecimal getClase() {
		return clase;
	}


	public void setClase(BigDecimal clase) {
		this.clase = clase;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clase == null) ? 0 : clase.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof S03080Pk)) {
			return false;
		}
		S03080Pk other = (S03080Pk) obj;
		if (clase == null) {
			if (other.clase != null) {
				return false;
			}
		} else if (!clase.equals(other.clase)) {
			return false;
		}
		if (tipo == null) {
			if (other.tipo != null) {
				return false;
			}
		} else if (!tipo.equals(other.tipo)) {
			return false;
		}
		return true;
	}
	
}
