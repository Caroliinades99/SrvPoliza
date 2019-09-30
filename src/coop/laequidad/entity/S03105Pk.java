package coop.laequidad.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class S03105Pk implements Serializable  {

	private String coddet;

	private String codigo;

	private String codpad;

	public String getCoddet() {
		return coddet;
	}

	public void setCoddet(String coddet) {
		this.coddet = coddet;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCodpad() {
		return codpad;
	}

	public void setCodpad(String codpad) {
		this.codpad = codpad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coddet == null) ? 0 : coddet.hashCode());
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((codpad == null) ? 0 : codpad.hashCode());
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
		if (!(obj instanceof S03105Pk)) {
			return false;
		}
		S03105Pk other = (S03105Pk) obj;
		if (coddet == null) {
			if (other.coddet != null) {
				return false;
			}
		} else if (!coddet.equals(other.coddet)) {
			return false;
		}
		if (codigo == null) {
			if (other.codigo != null) {
				return false;
			}
		} else if (!codigo.equals(other.codigo)) {
			return false;
		}
		if (codpad == null) {
			if (other.codpad != null) {
				return false;
			}
		} else if (!codpad.equals(other.codpad)) {
			return false;
		}
		return true;
	}
	
	
	
}
