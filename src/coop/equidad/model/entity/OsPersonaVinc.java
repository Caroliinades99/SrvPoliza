package coop.equidad.model.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the S03501 database table.
 * 
 */
@Entity
@Table(name="S03501", schema="osiris")
@NamedQueries({
	@NamedQuery(name="OsPersonaVinc.findAll", query="SELECT p FROM OsPersonaVinc p"),
	@NamedQuery(name="OsPersonaVinc.numRegByCod", query="SELECT COUNT(o) FROM OsPersonaVinc o "
			+ "WHERE o.codigo = :w_codigo AND o.codvin = :w_codvin AND o.estado = 0")
})

public class OsPersonaVinc implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private String codigo;

	private BigDecimal codvin;

	private BigDecimal estado;

	@Temporal(TemporalType.DATE)
	private Date fecestado;

	private String sucrea;

	public OsPersonaVinc() {
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public BigDecimal getCodvin() {
		return this.codvin;
	}

	public void setCodvin(BigDecimal codvin) {
		this.codvin = codvin;
	}

	public BigDecimal getEstado() {
		return this.estado;
	}

	public void setEstado(BigDecimal estado) {
		this.estado = estado;
	}

	public Date getFecestado() {
		return this.fecestado;
	}

	public void setFecestado(Date fecestado) {
		this.fecestado = fecestado;
	}

	public String getSucrea() {
		return this.sucrea;
	}

	public void setSucrea(String sucrea) {
		this.sucrea = sucrea;
	}

}