package coop.laequidad.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Embeddable;

@Embeddable
public class S03104Pk implements Serializable {
	
	
	private String coddet;
	private String codpla;
	private BigDecimal nivel;
	
	public String getCoddet() {
		return coddet;
	}
	public void setCoddet(String coddet) {
		this.coddet = coddet;
	}
	public String getCodpla() {
		return codpla;
	}
	public void setCodpla(String codpla) {
		this.codpla = codpla;
	}
	
	public BigDecimal getNivel() {
		return nivel;
	}
	public void setNivel(BigDecimal nivel) {
		this.nivel = nivel;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coddet == null) ? 0 : coddet.hashCode());
		result = prime * result + ((codpla == null) ? 0 : codpla.hashCode());
		result = prime * result + ((nivel == null) ? 0 : nivel.hashCode());
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
		if (!(obj instanceof S03104Pk)) {
			return false;
		}
		S03104Pk other = (S03104Pk) obj;
		if (coddet == null) {
			if (other.coddet != null) {
				return false;
			}
		} else if (!coddet.equals(other.coddet)) {
			return false;
		}
		if (codpla == null) {
			if (other.codpla != null) {
				return false;
			}
		} else if (!codpla.equals(other.codpla)) {
			return false;
		}
		if (nivel == null) {
			if (other.nivel != null) {
				return false;
			}
		} else if (!nivel.equals(other.nivel)) {
			return false;
		}
		return true;
	}
	
	
}
