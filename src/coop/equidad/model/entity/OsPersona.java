package coop.equidad.model.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the S03500 database table.
 * 
 */
@Entity
@Table(name="S03500", schema="osiris")
@NamedQueries({
	@NamedQuery(name="OsPersona.findAll", query="SELECT o FROM OsPersona o"),
	@NamedQuery(name="OsPersona.numRegByCod", query="SELECT COUNT(o) FROM OsPersona o "
			+ "WHERE o.codigo = :w_codigo")
})
public class OsPersona implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal cattributaria;

	private String claide;

	private String codcia;
	
	@Id
	private String codigo;

	private String digito;

	@Temporal(TemporalType.DATE)
	private Date fecmod;

	@Temporal(TemporalType.DATE)
	private Date fecnacimiento;

	@Temporal(TemporalType.DATE)
	private Date fecrea;

	private String nit;

	private String nombre;

	private BigDecimal sexo;

	private String sigla;

	private String sucmod;

	private String sucrea;

	private String sucur;

	private BigDecimal tipper;

	public OsPersona() {
	}

	public BigDecimal getCattributaria() {
		return this.cattributaria;
	}

	public void setCattributaria(BigDecimal cattributaria) {
		this.cattributaria = cattributaria;
	}

	public String getClaide() {
		return this.claide;
	}

	public void setClaide(String claide) {
		this.claide = claide;
	}

	public String getCodcia() {
		return this.codcia;
	}

	public void setCodcia(String codcia) {
		this.codcia = codcia;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDigito() {
		return this.digito;
	}

	public void setDigito(String digito) {
		this.digito = digito;
	}

	public Date getFecmod() {
		return this.fecmod;
	}

	public void setFecmod(Date fecmod) {
		this.fecmod = fecmod;
	}

	public Date getFecnacimiento() {
		return this.fecnacimiento;
	}

	public void setFecnacimiento(Date fecnacimiento) {
		this.fecnacimiento = fecnacimiento;
	}

	public Date getFecrea() {
		return this.fecrea;
	}

	public void setFecrea(Date fecrea) {
		this.fecrea = fecrea;
	}

	public String getNit() {
		return this.nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getSexo() {
		return this.sexo;
	}

	public void setSexo(BigDecimal sexo) {
		this.sexo = sexo;
	}

	public String getSigla() {
		return this.sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getSucmod() {
		return this.sucmod;
	}

	public void setSucmod(String sucmod) {
		this.sucmod = sucmod;
	}

	public String getSucrea() {
		return this.sucrea;
	}

	public void setSucrea(String sucrea) {
		this.sucrea = sucrea;
	}

	public String getSucur() {
		return this.sucur;
	}

	public void setSucur(String sucur) {
		this.sucur = sucur;
	}

	public BigDecimal getTipper() {
		return this.tipper;
	}

	public void setTipper(BigDecimal tipper) {
		this.tipper = tipper;
	}

}