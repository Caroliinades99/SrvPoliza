package coop.equidad.model.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;

/**
 * The primary key class for the PERMISO database table.
 * 
 */
@Embeddable
public class ReaseguroPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String sucur;
	private String codram;
	private String certif;
	private BigDecimal orden;
	private BigDecimal inciso;
	private String codpla;
	
	public ReaseguroPK() {}
	
	public ReaseguroPK(String sucur, String codram, String certif, BigDecimal orden, BigDecimal inciso, String codpla) {
		super();
		this.sucur = sucur;
		this.codram = codram;
		this.certif = certif;
		this.orden = orden;
		this.inciso = inciso;
		this.codpla = codpla;
	}
	
	public String getSucur() {
		return sucur;
	}
	public void setSucur(String sucur) {
		this.sucur = sucur;
	}
	public String getCodram() {
		return codram;
	}
	public void setCodram(String codram) {
		this.codram = codram;
	}
	public String getCertif() {
		return certif;
	}
	public void setCertif(String certif) {
		this.certif = certif;
	}
	public BigDecimal getOrden() {
		return orden;
	}
	public void setOrden(BigDecimal orden) {
		this.orden = orden;
	}
	public BigDecimal getInciso() {
		return inciso;
	}
	public void setInciso(BigDecimal inciso) {
		this.inciso = inciso;
	}
	public String getCodpla() {
		return codpla;
	}
	public void setCodpla(String codpla) {
		this.codpla = codpla;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((certif == null) ? 0 : certif.hashCode());
		result = prime * result + ((codpla == null) ? 0 : codpla.hashCode());
		result = prime * result + ((codram == null) ? 0 : codram.hashCode());
		result = prime * result + ((inciso == null) ? 0 : inciso.hashCode());
		result = prime * result + ((orden == null) ? 0 : orden.hashCode());
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
		ReaseguroPK other = (ReaseguroPK) obj;
		if (certif == null) {
			if (other.certif != null)
				return false;
		} else if (!certif.equals(other.certif))
			return false;
		if (codpla == null) {
			if (other.codpla != null)
				return false;
		} else if (!codpla.equals(other.codpla))
			return false;
		if (codram == null) {
			if (other.codram != null)
				return false;
		} else if (!codram.equals(other.codram))
			return false;
		if (inciso == null) {
			if (other.inciso != null)
				return false;
		} else if (!inciso.equals(other.inciso))
			return false;
		if (orden == null) {
			if (other.orden != null)
				return false;
		} else if (!orden.equals(other.orden))
			return false;
		if (sucur == null) {
			if (other.sucur != null)
				return false;
		} else if (!sucur.equals(other.sucur))
			return false;
		return true;
	}

	
}
