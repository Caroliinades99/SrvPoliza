package coop.laequidad.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the S03105 database table.
 * 
 */
@Entity
@Table(name="S03105",schema="osiris")
@NamedQuery(name="S03105.findAll", query="SELECT s FROM S03105 s")
public class S03105 implements Serializable {
	private static final long serialVersionUID = 1L;

	private String asgdet;

	private String asgval;

	@EmbeddedId
	private S03105Pk s03105Pk;

	private String metodoex;

	
	private String nivel;

	private String nombre;

	public S03105() {
	}

	public String getAsgdet() {
		return this.asgdet;
	}

	public void setAsgdet(String asgdet) {
		this.asgdet = asgdet;
	}

	public String getAsgval() {
		return this.asgval;
	}

	public void setAsgval(String asgval) {
		this.asgval = asgval;
	}

	public String getMetodoex() {
		return this.metodoex;
	}

	public void setMetodoex(String metodoex) {
		this.metodoex = metodoex;
	}

	public String getNivel() {
		return this.nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public S03105Pk getS03105Pk() {
		return s03105Pk;
	}

	public void setS03105Pk(S03105Pk s03105Pk) {
		this.s03105Pk = s03105Pk;
	}
	
}