package coop.equidad.model.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the S03202 database table.
 * 
 */
@Entity
@Table(name="S03202", schema="osiris")
@NamedQueries({
	@NamedQuery(name="OsTercero.findAll", query="SELECT o FROM OsTercero o"),
	@NamedQuery(name="OsTercero.findByPoliza", query="SELECT t FROM OsTercero t "
			+ "WHERE t.id.sucur = :sucur AND t.id.codpla = :codpla AND t.id.certif = :certif AND t.orden = :orden")
})
public class OsTercero implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private TerceroPK id;	

	private BigDecimal categoria;

	private String codcla;

	private String codigo;

	private BigDecimal comision;

	private BigDecimal inciso;

	private String nombre;

	private BigDecimal orden;

	private BigDecimal parentesco;

	private BigDecimal participacion;

	private String principal;

	public OsTercero() {}
	
	public TerceroPK getId() {
		return id;
	}

	public void setId(TerceroPK id) {
		this.id = id;
	}

	public BigDecimal getCategoria() {
		return this.categoria;
	}

	public void setCategoria(BigDecimal categoria) {
		this.categoria = categoria;
	}

	public String getCodcla() {
		return this.codcla;
	}

	public void setCodcla(String codcla) {
		this.codcla = codcla;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public BigDecimal getComision() {
		return this.comision;
	}

	public void setComision(BigDecimal comision) {
		this.comision = comision;
	}

	public BigDecimal getInciso() {
		return this.inciso;
	}

	public void setInciso(BigDecimal inciso) {
		this.inciso = inciso;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getOrden() {
		return this.orden;
	}

	public void setOrden(BigDecimal orden) {
		this.orden = orden;
	}

	public BigDecimal getParentesco() {
		return this.parentesco;
	}

	public void setParentesco(BigDecimal parentesco) {
		this.parentesco = parentesco;
	}

	public BigDecimal getParticipacion() {
		return this.participacion;
	}

	public void setParticipacion(BigDecimal participacion) {
		this.participacion = participacion;
	}

	public String getPrincipal() {
		return this.principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

}