package coop.equidad.model.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the PERMISO database table.
 * 
 */
@Embeddable
public class CoberturaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String sucur;
	private String codpla;
	private String certif;
	private String codcla;

	public CoberturaPK() {}

	public CoberturaPK(String sucur, String codpla, String certif, String codcla) {
		super();
		this.sucur = sucur;
		this.codpla = codpla;
		this.certif = certif;
		this.codcla = codcla;
	}
	
	public String getSucur() {
		return sucur;
	}
	public void setSucur(String sucur) {
		this.sucur = sucur;
	}
	public String getCodpla() {
		return codpla;
	}
	public void setCodpla(String codpla) {
		this.codpla = codpla;
	}
	public String getCertif() {
		return certif;
	}
	public void setCertif(String certif) {
		this.certif = certif;
	}
	public String getCodcla() {
		return codcla;
	}
	public void setCodcla(String codcla) {
		this.codcla = codcla;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((certif == null) ? 0 : certif.hashCode());
		result = prime * result + ((codcla == null) ? 0 : codcla.hashCode());
		result = prime * result + ((codpla == null) ? 0 : codpla.hashCode());
		result = prime * result + ((sucur == null) ? 0 : sucur.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CoberturaPK other = (CoberturaPK) obj;
		if (certif == null) {
			if (other.certif != null)
				return false;
		} else if (!certif.equals(other.certif))
			return false;
		if (codcla == null) {
			if (other.codcla != null)
				return false;
		} else if (!codcla.equals(other.codcla))
			return false;
		if (codpla == null) {
			if (other.codpla != null)
				return false;
		} else if (!codpla.equals(other.codpla))
			return false;
		if (sucur == null) {
			if (other.sucur != null)
				return false;
		} else if (!sucur.equals(other.sucur))
			return false;
		return true;
	}

}
