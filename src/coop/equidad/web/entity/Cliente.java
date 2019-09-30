package coop.equidad.web.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the CLIENTE database table.
 * 
 */
@Entity
@Table(name="Cliente", schema="webservices")
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String clave;

	@Column(name="FROMECHA_FIN")
	private Timestamp fromechaFin;

	@Column(name="FROMECHA_INI")
	private Timestamp fromechaIni;

	private String nombre;

	private String token;
	
	private String usuarioosiris;
	
	@Transient
	private String grupo;
	
	public Cliente() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Timestamp getFromechaFin() {
		return this.fromechaFin;
	}

	public void setFromechaFin(Timestamp fromechaFin) {
		this.fromechaFin = fromechaFin;
	}

	public Timestamp getFromechaIni() {
		return this.fromechaIni;
	}

	public void setFromechaIni(Timestamp fromechaIni) {
		this.fromechaIni = fromechaIni;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUsuarioosiris() {
		return usuarioosiris;
	}

	public void setUsuarioosiris(String usuarioosiris) {
		this.usuarioosiris = usuarioosiris;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

}