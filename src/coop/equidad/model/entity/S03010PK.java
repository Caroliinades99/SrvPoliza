package coop.equidad.model.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class S03010PK implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public S03010PK() {
		// TODO Auto-generated constructor stub
	}

	public S03010PK(BigDecimal clase, String codigo, String tipo) {
		super();
		this.clase = clase;
		this.codigo = codigo;
		this.tipo = tipo;
	}
	private BigDecimal clase;
	private String codigo;
	private String tipo;
	public BigDecimal getClase() {
		return clase;
	}
	public void setClase(BigDecimal clase) {
		this.clase = clase;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		if (!(obj instanceof S03010PK)) {
			return false;
		}
		S03010PK other = (S03010PK) obj;
		if (clase == null) {
			if (other.clase != null) {
				return false;
			}
		} else if (!clase.equals(other.clase)) {
			return false;
		}
		if (codigo == null) {
			if (other.codigo != null) {
				return false;
			}
		} else if (!codigo.equals(other.codigo)) {
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
