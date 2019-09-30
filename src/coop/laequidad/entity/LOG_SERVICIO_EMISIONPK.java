package coop.laequidad.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class LOG_SERVICIO_EMISIONPK implements Serializable {
	
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date hora;
	
	private String cotizacion;
	
	private String sucursal;

	
	
	public java.util.Date getHora() {
		return hora;
	}

	public void setHora(java.util.Date hora) {
		this.hora = hora;
	}

	public String getCotizacion() {
		return cotizacion;
	}

	public void setCotizacion(String cotizacion) {
		this.cotizacion = cotizacion;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cotizacion == null) ? 0 : cotizacion.hashCode());
		result = prime * result + ((hora == null) ? 0 : hora.hashCode());
		result = prime * result + ((sucursal == null) ? 0 : sucursal.hashCode());
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
		if (!(obj instanceof LOG_SERVICIO_EMISIONPK)) {
			return false;
		}
		LOG_SERVICIO_EMISIONPK other = (LOG_SERVICIO_EMISIONPK) obj;
		if (cotizacion == null) {
			if (other.cotizacion != null) {
				return false;
			}
		} else if (!cotizacion.equals(other.cotizacion)) {
			return false;
		}
		if (hora == null) {
			if (other.hora != null) {
				return false;
			}
		} else if (!hora.equals(other.hora)) {
			return false;
		}
		if (sucursal == null) {
			if (other.sucursal != null) {
				return false;
			}
		} else if (!sucursal.equals(other.sucursal)) {
			return false;
		}
		return true;
	}
	
	
	
}
