package coop.laequidad.entity;

import java.io.Serializable;
import javax.persistence.*;

import coop.equidad.model.entity.S03010PK;

import java.math.BigDecimal;


/**
 * The persistent class for the S03080 database table.
 * 
 */
@Entity
@Table(name="S03080",schema="osiris")
@NamedQuery(name="S03080.findAll", query="SELECT s FROM S03080 s")
public class S03080 implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private S03080Pk s03080PK;
	
	private String alfan;

	private String alfan2;

	private String alfan3;
	

	private String flag1;

	private String flag2;

	private String flag3;

	private String flag4;

	private String flag5;

	private String flag6;

	private BigDecimal longitud;

	private String nombre;

	private String nume1;

	private String nume2;

	private String nume3;

	private String nume4;

	private BigDecimal numval;

	public S03080() {
	}

	public String getAlfan() {
		return this.alfan;
	}

	public void setAlfan(String alfan) {
		this.alfan = alfan;
	}

	public String getAlfan2() {
		return this.alfan2;
	}

	public void setAlfan2(String alfan2) {
		this.alfan2 = alfan2;
	}

	public String getAlfan3() {
		return this.alfan3;
	}

	public void setAlfan3(String alfan3) {
		this.alfan3 = alfan3;
	}


	public String getFlag1() {
		return this.flag1;
	}

	public void setFlag1(String flag1) {
		this.flag1 = flag1;
	}

	public String getFlag2() {
		return this.flag2;
	}

	public void setFlag2(String flag2) {
		this.flag2 = flag2;
	}

	public String getFlag3() {
		return this.flag3;
	}

	public void setFlag3(String flag3) {
		this.flag3 = flag3;
	}

	public String getFlag4() {
		return this.flag4;
	}

	public void setFlag4(String flag4) {
		this.flag4 = flag4;
	}

	public String getFlag5() {
		return this.flag5;
	}

	public void setFlag5(String flag5) {
		this.flag5 = flag5;
	}

	public String getFlag6() {
		return this.flag6;
	}

	public void setFlag6(String flag6) {
		this.flag6 = flag6;
	}

	public BigDecimal getLongitud() {
		return this.longitud;
	}

	public void setLongitud(BigDecimal longitud) {
		this.longitud = longitud;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNume1() {
		return this.nume1;
	}

	public void setNume1(String nume1) {
		this.nume1 = nume1;
	}

	public String getNume2() {
		return this.nume2;
	}

	public void setNume2(String nume2) {
		this.nume2 = nume2;
	}

	public String getNume3() {
		return this.nume3;
	}

	public void setNume3(String nume3) {
		this.nume3 = nume3;
	}

	public String getNume4() {
		return this.nume4;
	}

	public void setNume4(String nume4) {
		this.nume4 = nume4;
	}

	public BigDecimal getNumval() {
		return this.numval;
	}

	public void setNumval(BigDecimal numval) {
		this.numval = numval;
	}

	public S03080Pk getS03080PK() {
		return s03080PK;
	}

	public void setS03080PK(S03080Pk s03080pk) {
		s03080PK = s03080pk;
	}

	

}