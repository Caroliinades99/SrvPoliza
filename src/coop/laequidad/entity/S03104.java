package coop.laequidad.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the S03104 database table.
 * 
 */
@Entity
@Table(name="S03104",schema="osiris")
@NamedQuery(name="S03104.findAll", query="SELECT s FROM S03104 s")
public class S03104 implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private S03104Pk s03104Pk;
	
	private BigDecimal busca;

	private BigDecimal clasedetvida;

	private BigDecimal clasepar;

	private String def;

	private BigDecimal detadd;

	private BigDecimal detbol;

	private BigDecimal detchg;

	private BigDecimal detdec;

	private BigDecimal detend;

	private BigDecimal detrea;

	private BigDecimal detren;

	private BigDecimal detsin;

	private BigDecimal exclusivo;

	@Temporal(TemporalType.DATE)
	private Date fecini;

	@Temporal(TemporalType.DATE)
	private Date fecter;

	private String formato;

	private BigDecimal generico;

	private BigDecimal imprimir;

	private String nombre;

	private BigDecimal oculto;

	private BigDecimal referencia;

	private BigDecimal secuen;

	private BigDecimal segrupo;

	private BigDecimal sublista;

	private BigDecimal tipinc;

	private BigDecimal tipo;

	private String tipopar;

	private String tippad;

	private BigDecimal uso;

	private String formatoweb;
	
	public S03104() {
	}

	public BigDecimal getBusca() {
		return this.busca;
	}

	public void setBusca(BigDecimal busca) {
		this.busca = busca;
	}

	public BigDecimal getClasedetvida() {
		return this.clasedetvida;
	}

	public void setClasedetvida(BigDecimal clasedetvida) {
		this.clasedetvida = clasedetvida;
	}

	public BigDecimal getClasepar() {
		return this.clasepar;
	}

	public void setClasepar(BigDecimal clasepar) {
		this.clasepar = clasepar;
	}

	public String getDef() {
		return this.def;
	}

	public void setDef(String def) {
		this.def = def;
	}

	public BigDecimal getDetadd() {
		return this.detadd;
	}

	public void setDetadd(BigDecimal detadd) {
		this.detadd = detadd;
	}

	public BigDecimal getDetbol() {
		return this.detbol;
	}

	public void setDetbol(BigDecimal detbol) {
		this.detbol = detbol;
	}

	public BigDecimal getDetchg() {
		return this.detchg;
	}

	public void setDetchg(BigDecimal detchg) {
		this.detchg = detchg;
	}

	public BigDecimal getDetdec() {
		return this.detdec;
	}

	public void setDetdec(BigDecimal detdec) {
		this.detdec = detdec;
	}

	public BigDecimal getDetend() {
		return this.detend;
	}

	public void setDetend(BigDecimal detend) {
		this.detend = detend;
	}

	public BigDecimal getDetrea() {
		return this.detrea;
	}

	public void setDetrea(BigDecimal detrea) {
		this.detrea = detrea;
	}

	public BigDecimal getDetren() {
		return this.detren;
	}

	public void setDetren(BigDecimal detren) {
		this.detren = detren;
	}

	public BigDecimal getDetsin() {
		return this.detsin;
	}

	public void setDetsin(BigDecimal detsin) {
		this.detsin = detsin;
	}

	public BigDecimal getExclusivo() {
		return this.exclusivo;
	}

	public void setExclusivo(BigDecimal exclusivo) {
		this.exclusivo = exclusivo;
	}

	public Date getFecini() {
		return this.fecini;
	}

	public void setFecini(Date fecini) {
		this.fecini = fecini;
	}

	public Date getFecter() {
		return this.fecter;
	}

	public void setFecter(Date fecter) {
		this.fecter = fecter;
	}

	public String getFormato() {
		return this.formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public BigDecimal getGenerico() {
		return this.generico;
	}

	public void setGenerico(BigDecimal generico) {
		this.generico = generico;
	}

	public BigDecimal getImprimir() {
		return this.imprimir;
	}

	public void setImprimir(BigDecimal imprimir) {
		this.imprimir = imprimir;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getOculto() {
		return this.oculto;
	}

	public void setOculto(BigDecimal oculto) {
		this.oculto = oculto;
	}

	public BigDecimal getReferencia() {
		return this.referencia;
	}

	public void setReferencia(BigDecimal referencia) {
		this.referencia = referencia;
	}

	public BigDecimal getSecuen() {
		return this.secuen;
	}

	public void setSecuen(BigDecimal secuen) {
		this.secuen = secuen;
	}

	public BigDecimal getSegrupo() {
		return this.segrupo;
	}

	public void setSegrupo(BigDecimal segrupo) {
		this.segrupo = segrupo;
	}

	public BigDecimal getSublista() {
		return this.sublista;
	}

	public void setSublista(BigDecimal sublista) {
		this.sublista = sublista;
	}

	public BigDecimal getTipinc() {
		return this.tipinc;
	}

	public void setTipinc(BigDecimal tipinc) {
		this.tipinc = tipinc;
	}

	public BigDecimal getTipo() {
		return this.tipo;
	}

	public void setTipo(BigDecimal tipo) {
		this.tipo = tipo;
	}

	public String getTipopar() {
		return this.tipopar;
	}

	public void setTipopar(String tipopar) {
		this.tipopar = tipopar;
	}

	public String getTippad() {
		return this.tippad;
	}

	public void setTippad(String tippad) {
		this.tippad = tippad;
	}

	public BigDecimal getUso() {
		return this.uso;
	}

	public void setUso(BigDecimal uso) {
		this.uso = uso;
	}

	public String getFormatoweb() {
		return formatoweb;
	}

	public void setFormatoweb(String formatoWeb) {
		this.formatoweb = formatoWeb;
	}

	public S03104Pk getS03104Pk() {
		return s03104Pk;
	}

	public void setS03104Pk(S03104Pk s03104Pk) {
		this.s03104Pk = s03104Pk;
	}

}