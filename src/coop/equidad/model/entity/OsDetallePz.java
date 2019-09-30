package coop.equidad.model.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the S03035 database table.
 * 
 */
@Entity
@Table(name="S03035", schema="osiris")
@NamedQueries({
	@NamedQuery(name="OsDetallePz.findAll", query="SELECT o FROM OsDetallePz o"),
	@NamedQuery(name="OsDetallePz.findByPoliza", query="SELECT d FROM OsDetallePz d "
			+ "WHERE d.id.sucur = :sucur AND d.id.codpla = :codpla AND d.id.certif = :certif AND d.orden = :orden")
})
public class OsDetallePz implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private DetallePK id;

	private BigDecimal inciso;

	private BigDecimal orden;

	@Temporal(TemporalType.DATE)
	private Date valdate;

	private BigDecimal valnumber;

	private String valstring;

	public OsDetallePz() {
	}
	
	public DetallePK getId() {
		return id;
	}

	public void setId(DetallePK id) {
		this.id = id;
	}

	public BigDecimal getInciso() {
		return this.inciso;
	}

	public void setInciso(BigDecimal inciso) {
		this.inciso = inciso;
	}

	public BigDecimal getOrden() {
		return this.orden;
	}

	public void setOrden(BigDecimal orden) {
		this.orden = orden;
	}

	public Date getValdate() {
		return this.valdate;
	}

	public void setValdate(Date valdate) {
		this.valdate = valdate;
	}

	public BigDecimal getValnumber() {
		return this.valnumber;
	}

	public void setValnumber(BigDecimal valnumber) {
		this.valnumber = valnumber;
	}

	public String getValstring() {
		return this.valstring;
	}

	public void setValstring(String valstring) {
		this.valstring = valstring;
	}

}