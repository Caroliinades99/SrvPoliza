package coop.equidad.model.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the S03203 database table.
 * 
 */
@Entity
@Table(name="S03203", schema="osiris")
@NamedQueries({
	@NamedQuery(name="OsCobertura.findAll", query="SELECT o FROM OsCobertura o"),
	@NamedQuery(name="OsCobertura.findByPoliza", query="SELECT c FROM OsCobertura c "
			+ "WHERE c.id.sucur = :sucur AND c.id.codpla = :codpla AND c.id.certif = :certif AND c.orden = :orden")
})
public class OsCobertura implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private CoberturaPK id;	

	private BigDecimal carencia;

	private BigDecimal coapactado;

	private String codram;

	private BigDecimal comisi;

	private BigDecimal consumo;

	private BigDecimal copago;

	private BigDecimal cumcat;

	private BigDecimal dedmax;

	private BigDecimal deduca;

	private BigDecimal deducm;

	private BigDecimal deducp;

	private BigDecimal descuentos;

	private BigDecimal estado;

	private BigDecimal estant;

	@Temporal(TemporalType.DATE)
	private Date fecfin;

	@Temporal(TemporalType.DATE)
	private Date fecini;

	private BigDecimal gruporea;

	private BigDecimal impuesto;

	private BigDecimal inciso;

	private BigDecimal indvariable;

	private BigDecimal moncopago;

	private BigDecimal monded;

	private BigDecimal monprima;

	private BigDecimal monval;

	private BigDecimal numpag;

	private BigDecimal orden;

	private BigDecimal pordedvalor;

	private BigDecimal priant;

	private BigDecimal pricau;

	private BigDecimal pricaureas;

	private BigDecimal prima;

	private BigDecimal primapoliza;

	private BigDecimal primareas;

	private BigDecimal prirev;

	private BigDecimal prirevreas;

	private BigDecimal recargos;

	private BigDecimal tasa;

	private BigDecimal tasant;

	private BigDecimal tasaperiodo;

	private BigDecimal tasaproteccion;

	private BigDecimal tasareas;

	private BigDecimal tasariesgo;

	private BigDecimal tipo;

	private BigDecimal vasant;

	private BigDecimal vaseg;

	private BigDecimal vasegpol;

	public OsCobertura() {}
	
	public CoberturaPK getId() {
		return id;
	}

	public void setId(CoberturaPK id) {
		this.id = id;
	}

	public BigDecimal getCarencia() {
		return this.carencia;
	}

	public void setCarencia(BigDecimal carencia) {
		this.carencia = carencia;
	}

	public BigDecimal getCoapactado() {
		return this.coapactado;
	}

	public void setCoapactado(BigDecimal coapactado) {
		this.coapactado = coapactado;
	}

	public String getCodram() {
		return this.codram;
	}

	public void setCodram(String codram) {
		this.codram = codram;
	}

	public BigDecimal getComisi() {
		return this.comisi;
	}

	public void setComisi(BigDecimal comisi) {
		this.comisi = comisi;
	}

	public BigDecimal getConsumo() {
		return this.consumo;
	}

	public void setConsumo(BigDecimal consumo) {
		this.consumo = consumo;
	}

	public BigDecimal getCopago() {
		return this.copago;
	}

	public void setCopago(BigDecimal copago) {
		this.copago = copago;
	}

	public BigDecimal getCumcat() {
		return this.cumcat;
	}

	public void setCumcat(BigDecimal cumcat) {
		this.cumcat = cumcat;
	}

	public BigDecimal getDedmax() {
		return this.dedmax;
	}

	public void setDedmax(BigDecimal dedmax) {
		this.dedmax = dedmax;
	}

	public BigDecimal getDeduca() {
		return this.deduca;
	}

	public void setDeduca(BigDecimal deduca) {
		this.deduca = deduca;
	}

	public BigDecimal getDeducm() {
		return this.deducm;
	}

	public void setDeducm(BigDecimal deducm) {
		this.deducm = deducm;
	}

	public BigDecimal getDeducp() {
		return this.deducp;
	}

	public void setDeducp(BigDecimal deducp) {
		this.deducp = deducp;
	}

	public BigDecimal getDescuentos() {
		return this.descuentos;
	}

	public void setDescuentos(BigDecimal descuentos) {
		this.descuentos = descuentos;
	}

	public BigDecimal getEstado() {
		return this.estado;
	}

	public void setEstado(BigDecimal estado) {
		this.estado = estado;
	}

	public BigDecimal getEstant() {
		return this.estant;
	}

	public void setEstant(BigDecimal estant) {
		this.estant = estant;
	}

	public Date getFecfin() {
		return this.fecfin;
	}

	public void setFecfin(Date fecfin) {
		this.fecfin = fecfin;
	}

	public Date getFecini() {
		return this.fecini;
	}

	public void setFecini(Date fecini) {
		this.fecini = fecini;
	}

	public BigDecimal getGruporea() {
		return this.gruporea;
	}

	public void setGruporea(BigDecimal gruporea) {
		this.gruporea = gruporea;
	}

	public BigDecimal getImpuesto() {
		return this.impuesto;
	}

	public void setImpuesto(BigDecimal impuesto) {
		this.impuesto = impuesto;
	}

	public BigDecimal getInciso() {
		return this.inciso;
	}

	public void setInciso(BigDecimal inciso) {
		this.inciso = inciso;
	}

	public BigDecimal getIndvariable() {
		return this.indvariable;
	}

	public void setIndvariable(BigDecimal indvariable) {
		this.indvariable = indvariable;
	}

	public BigDecimal getMoncopago() {
		return this.moncopago;
	}

	public void setMoncopago(BigDecimal moncopago) {
		this.moncopago = moncopago;
	}

	public BigDecimal getMonded() {
		return this.monded;
	}

	public void setMonded(BigDecimal monded) {
		this.monded = monded;
	}

	public BigDecimal getMonprima() {
		return this.monprima;
	}

	public void setMonprima(BigDecimal monprima) {
		this.monprima = monprima;
	}

	public BigDecimal getMonval() {
		return this.monval;
	}

	public void setMonval(BigDecimal monval) {
		this.monval = monval;
	}

	public BigDecimal getNumpag() {
		return this.numpag;
	}

	public void setNumpag(BigDecimal numpag) {
		this.numpag = numpag;
	}

	public BigDecimal getOrden() {
		return this.orden;
	}

	public void setOrden(BigDecimal orden) {
		this.orden = orden;
	}

	public BigDecimal getPordedvalor() {
		return this.pordedvalor;
	}

	public void setPordedvalor(BigDecimal pordedvalor) {
		this.pordedvalor = pordedvalor;
	}

	public BigDecimal getPriant() {
		return this.priant;
	}

	public void setPriant(BigDecimal priant) {
		this.priant = priant;
	}

	public BigDecimal getPricau() {
		return this.pricau;
	}

	public void setPricau(BigDecimal pricau) {
		this.pricau = pricau;
	}

	public BigDecimal getPricaureas() {
		return this.pricaureas;
	}

	public void setPricaureas(BigDecimal pricaureas) {
		this.pricaureas = pricaureas;
	}

	public BigDecimal getPrima() {
		return this.prima;
	}

	public void setPrima(BigDecimal prima) {
		this.prima = prima;
	}

	public BigDecimal getPrimapoliza() {
		return this.primapoliza;
	}

	public void setPrimapoliza(BigDecimal primapoliza) {
		this.primapoliza = primapoliza;
	}

	public BigDecimal getPrimareas() {
		return this.primareas;
	}

	public void setPrimareas(BigDecimal primareas) {
		this.primareas = primareas;
	}

	public BigDecimal getPrirev() {
		return this.prirev;
	}

	public void setPrirev(BigDecimal prirev) {
		this.prirev = prirev;
	}

	public BigDecimal getPrirevreas() {
		return this.prirevreas;
	}

	public void setPrirevreas(BigDecimal prirevreas) {
		this.prirevreas = prirevreas;
	}

	public BigDecimal getRecargos() {
		return this.recargos;
	}

	public void setRecargos(BigDecimal recargos) {
		this.recargos = recargos;
	}

	public BigDecimal getTasa() {
		return this.tasa;
	}

	public void setTasa(BigDecimal tasa) {
		this.tasa = tasa;
	}

	public BigDecimal getTasant() {
		return this.tasant;
	}

	public void setTasant(BigDecimal tasant) {
		this.tasant = tasant;
	}

	public BigDecimal getTasaperiodo() {
		return this.tasaperiodo;
	}

	public void setTasaperiodo(BigDecimal tasaperiodo) {
		this.tasaperiodo = tasaperiodo;
	}

	public BigDecimal getTasaproteccion() {
		return this.tasaproteccion;
	}

	public void setTasaproteccion(BigDecimal tasaproteccion) {
		this.tasaproteccion = tasaproteccion;
	}

	public BigDecimal getTasareas() {
		return this.tasareas;
	}

	public void setTasareas(BigDecimal tasareas) {
		this.tasareas = tasareas;
	}

	public BigDecimal getTasariesgo() {
		return this.tasariesgo;
	}

	public void setTasariesgo(BigDecimal tasariesgo) {
		this.tasariesgo = tasariesgo;
	}

	public BigDecimal getTipo() {
		return this.tipo;
	}

	public void setTipo(BigDecimal tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getVasant() {
		return this.vasant;
	}

	public void setVasant(BigDecimal vasant) {
		this.vasant = vasant;
	}

	public BigDecimal getVaseg() {
		return this.vaseg;
	}

	public void setVaseg(BigDecimal vaseg) {
		this.vaseg = vaseg;
	}

	public BigDecimal getVasegpol() {
		return this.vasegpol;
	}

	public void setVasegpol(BigDecimal vasegpol) {
		this.vasegpol = vasegpol;
	}

}