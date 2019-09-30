package coop.equidad.model.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the SUSC_EQUIV_CIUDADES database table.
 * 
 */
@Entity
@Table(name = "SUSC_EQUIV_CIUDADES", schema = "osiris")
@NamedQueries({ @NamedQuery(name = "SuscEquivCiudade.findAll", query = "SELECT s FROM SuscEquivCiudade s"),
		@NamedQuery(name = "SuscEquivCiudade.getCodSucursal", query = "SELECT s.sucursal FROM SuscEquivCiudade s "
				+ "WHERE s.codigoDane = :codDane") })

public class SuscEquivCiudade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CODIGO_DANE")
	private String codigoDane;

	private String departamento;

	private String municipio;

	private String sucursal;

	public SuscEquivCiudade() {
	}

	public String getCodigoDane() {
		return this.codigoDane;
	}

	public void setCodigoDane(String codigoDane) {
		this.codigoDane = codigoDane;
	}

	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getMunicipio() {
		return this.municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getSucursal() {
		return this.sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

}