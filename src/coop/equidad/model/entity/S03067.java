package coop.equidad.model.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the S03067 database table.
 * 
 */

public class S03067 implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal clasepermiso;

	private String clausula;

	private String coddet;

	private String codplan;

	private String grupo;

	private BigDecimal inciso;

	private BigDecimal monto;

	private String usuario;

	public S03067() {
	}

	public BigDecimal getClasepermiso() {
		return this.clasepermiso;
	}

	public void setClasepermiso(BigDecimal clasepermiso) {
		this.clasepermiso = clasepermiso;
	}

	public String getClausula() {
		return this.clausula;
	}

	public void setClausula(String clausula) {
		this.clausula = clausula;
	}

	public String getCoddet() {
		return this.coddet;
	}

	public void setCoddet(String coddet) {
		this.coddet = coddet;
	}

	public String getCodplan() {
		return this.codplan;
	}

	public void setCodplan(String codplan) {
		this.codplan = codplan;
	}

	public String getGrupo() {
		return this.grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public BigDecimal getInciso() {
		return this.inciso;
	}

	public void setInciso(BigDecimal inciso) {
		this.inciso = inciso;
	}

	public BigDecimal getMonto() {
		return this.monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}