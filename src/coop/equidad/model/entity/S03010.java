package coop.equidad.model.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the S03010 database table.
 * 
 */
@Entity
@Table(name="S03010", schema="osiris")
@NamedQuery(name="S03010.findAll", query="SELECT s FROM S03010 s")
public class S03010 implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private S03010PK s03010PK;
	
	private String nombre;

	private String valoran;

	private String valoran2;

	private String valoran3;

	private String valorb1;

	private String valorb2;

	private String valorb3;

	private String valorb4;

	private String valorb5;

	private String valorb6;

	private BigDecimal valorn1;

	private BigDecimal valorn2;

	private BigDecimal valorn3;

	private BigDecimal valorn4;

	public S03010() {
	}

	

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getValoran() {
		return this.valoran;
	}

	public void setValoran(String valoran) {
		this.valoran = valoran;
	}

	public String getValoran2() {
		return this.valoran2;
	}

	public void setValoran2(String valoran2) {
		this.valoran2 = valoran2;
	}

	public String getValoran3() {
		return this.valoran3;
	}

	public void setValoran3(String valoran3) {
		this.valoran3 = valoran3;
	}

	public String getValorb1() {
		return this.valorb1;
	}

	public void setValorb1(String valorb1) {
		this.valorb1 = valorb1;
	}

	public String getValorb2() {
		return this.valorb2;
	}

	public void setValorb2(String valorb2) {
		this.valorb2 = valorb2;
	}

	public String getValorb3() {
		return this.valorb3;
	}

	public void setValorb3(String valorb3) {
		this.valorb3 = valorb3;
	}

	public String getValorb4() {
		return this.valorb4;
	}

	public void setValorb4(String valorb4) {
		this.valorb4 = valorb4;
	}

	public String getValorb5() {
		return this.valorb5;
	}

	public void setValorb5(String valorb5) {
		this.valorb5 = valorb5;
	}

	public String getValorb6() {
		return this.valorb6;
	}

	public void setValorb6(String valorb6) {
		this.valorb6 = valorb6;
	}

	public BigDecimal getValorn1() {
		return this.valorn1;
	}

	public void setValorn1(BigDecimal valorn1) {
		this.valorn1 = valorn1;
	}

	public BigDecimal getValorn2() {
		return this.valorn2;
	}

	public void setValorn2(BigDecimal valorn2) {
		this.valorn2 = valorn2;
	}

	public BigDecimal getValorn3() {
		return this.valorn3;
	}

	public void setValorn3(BigDecimal valorn3) {
		this.valorn3 = valorn3;
	}

	public BigDecimal getValorn4() {
		return this.valorn4;
	}

	public void setValorn4(BigDecimal valorn4) {
		this.valorn4 = valorn4;
	}



	public S03010PK getS03010PK() {
		return s03010PK;
	}



	public void setS03010PK(S03010PK s03010pk) {
		s03010PK = s03010pk;
	}

}