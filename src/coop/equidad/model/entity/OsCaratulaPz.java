package coop.equidad.model.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the S03020 database table.
 * 
 */
@Entity
@Table(name="S03020", schema="osiris")
@NamedQueries({
	@NamedQuery(name="OsCaratulaPz.findAll", query="SELECT o FROM OsCaratulaPz o"),
	@NamedQuery(name="OsCaratulaPz.countByKey", query="SELECT COUNT(o) FROM OsCaratulaPz o "
			+ "WHERE o.id.sucur = :sucur AND o.id.codpla = :codpla AND o.id.certif = :certif AND o.id.orden = :orden"),
	@NamedQuery(name="OsCaratulaPz.countByPoliza", query="SELECT COUNT(o) FROM OsCaratulaPz o "
			+ "WHERE o.id.sucur = :sucur AND o.id.codpla = :codpla AND o.id.certif = :certif AND o.poliza = :poliza and o.sucrea= :usuario"),
	@NamedQuery(name="OsCaratulaPz.findByParams", query="SELECT o FROM OsCaratulaPz o "
			+ "WHERE o.asegurado = :asegurado AND o.id.sucur = :sucur AND o.poliza = :poliza AND o.id.certif = :certif AND o.id.codpla = :codpla")
})
public class OsCaratulaPz implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private CaratulaPK id;

	private String agente;

	private String amarrecertif;

	private BigDecimal amarreorden;

	private String amarreplan;

	private String amarrepoliza;

	private String antcertif;

	private String antcodpla;

	private BigDecimal antorden;

	private String asegurado;

	private String beneficiario;

	private BigDecimal cambio;

	private String cerlider;

	private String certifcausacion;

	private BigDecimal cesioncomision;

	private String clasifrea;

	private String cliente;

	private String coalider;

	private BigDecimal coaseg;

	private String codcia;

	private BigDecimal comision;

	private String cotizacion;

	private String cumulo;

	private BigDecimal diafact;

	private BigDecimal dias;

	private BigDecimal estado;

	@Temporal(TemporalType.DATE)
	private Date fecexp;

	@Temporal(TemporalType.DATE)
	private Date fecimpuestos;

	@Temporal(TemporalType.DATE)
	private Date fecini;

	@Temporal(TemporalType.DATE)
	private Date fecmod;

	@Temporal(TemporalType.DATE)
	private Date fecori;

	@Temporal(TemporalType.DATE)
	private Date fecout;

	@Temporal(TemporalType.DATE)
	private Date fecrea;

	@Temporal(TemporalType.DATE)
	private Date fecren;

	@Temporal(TemporalType.DATE)
	private Date fecter;

	@Temporal(TemporalType.DATE)
	private Date fecterplan;

	private BigDecimal forpag;

	private String hordes;

	private String horhas;

	private BigDecimal impresa;

	private BigDecimal moneda;

	private BigDecimal motivocan;

	private BigDecimal nivel;

	private String numdoc;

	private BigDecimal ordengrupo;

	private BigDecimal participacion;

	private String planorden;

	private String plaza;

	private String poliza;

	private String pollider;

	private BigDecimal pordescesion;

	private BigDecimal pordescuento;

	private BigDecimal porgastos;

	private BigDecimal porrecargo;

	private BigDecimal rol;

	private String sucmod;

	private String sucrea;

	private String tipcer;

	private BigDecimal tipcoa;

	private String tipdoc;

	private BigDecimal tipfac;

	private BigDecimal tipflo;

	private BigDecimal tipocarga;

	private String tomador;

	private String ubicacion;

	private BigDecimal valgastos;

	private BigDecimal valiva;

	private BigDecimal vaseg;

	private BigDecimal vbase;

	private BigDecimal vprima;

	public OsCaratulaPz() {
	}

	public CaratulaPK getId() {
		return id;
	}

	public void setId(CaratulaPK id) {
		this.id = id;
	}

	public String getAgente() {
		return this.agente;
	}

	public void setAgente(String agente) {
		this.agente = agente;
	}

	public String getAmarrecertif() {
		return this.amarrecertif;
	}

	public void setAmarrecertif(String amarrecertif) {
		this.amarrecertif = amarrecertif;
	}

	public BigDecimal getAmarreorden() {
		return this.amarreorden;
	}

	public void setAmarreorden(BigDecimal amarreorden) {
		this.amarreorden = amarreorden;
	}

	public String getAmarreplan() {
		return this.amarreplan;
	}

	public void setAmarreplan(String amarreplan) {
		this.amarreplan = amarreplan;
	}

	public String getAmarrepoliza() {
		return this.amarrepoliza;
	}

	public void setAmarrepoliza(String amarrepoliza) {
		this.amarrepoliza = amarrepoliza;
	}

	public String getAntcertif() {
		return this.antcertif;
	}

	public void setAntcertif(String antcertif) {
		this.antcertif = antcertif;
	}

	public String getAntcodpla() {
		return this.antcodpla;
	}

	public void setAntcodpla(String antcodpla) {
		this.antcodpla = antcodpla;
	}

	public BigDecimal getAntorden() {
		return this.antorden;
	}

	public void setAntorden(BigDecimal antorden) {
		this.antorden = antorden;
	}

	public String getAsegurado() {
		return this.asegurado;
	}

	public void setAsegurado(String asegurado) {
		this.asegurado = asegurado;
	}

	public String getBeneficiario() {
		return this.beneficiario;
	}

	public void setBeneficiario(String beneficiario) {
		this.beneficiario = beneficiario;
	}

	public BigDecimal getCambio() {
		return this.cambio;
	}

	public void setCambio(BigDecimal cambio) {
		this.cambio = cambio;
	}

	public String getCerlider() {
		return this.cerlider;
	}

	public void setCerlider(String cerlider) {
		this.cerlider = cerlider;
	}

	public String getCertifcausacion() {
		return this.certifcausacion;
	}

	public void setCertifcausacion(String certifcausacion) {
		this.certifcausacion = certifcausacion;
	}

	public BigDecimal getCesioncomision() {
		return this.cesioncomision;
	}

	public void setCesioncomision(BigDecimal cesioncomision) {
		this.cesioncomision = cesioncomision;
	}

	public String getClasifrea() {
		return this.clasifrea;
	}

	public void setClasifrea(String clasifrea) {
		this.clasifrea = clasifrea;
	}

	public String getCliente() {
		return this.cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getCoalider() {
		return this.coalider;
	}

	public void setCoalider(String coalider) {
		this.coalider = coalider;
	}

	public BigDecimal getCoaseg() {
		return this.coaseg;
	}

	public void setCoaseg(BigDecimal coaseg) {
		this.coaseg = coaseg;
	}

	public String getCodcia() {
		return this.codcia;
	}

	public void setCodcia(String codcia) {
		this.codcia = codcia;
	}

	public BigDecimal getComision() {
		return this.comision;
	}

	public void setComision(BigDecimal comision) {
		this.comision = comision;
	}

	public String getCotizacion() {
		return this.cotizacion;
	}

	public void setCotizacion(String cotizacion) {
		this.cotizacion = cotizacion;
	}

	public String getCumulo() {
		return this.cumulo;
	}

	public void setCumulo(String cumulo) {
		this.cumulo = cumulo;
	}

	public BigDecimal getDiafact() {
		return this.diafact;
	}

	public void setDiafact(BigDecimal diafact) {
		this.diafact = diafact;
	}

	public BigDecimal getDias() {
		return this.dias;
	}

	public void setDias(BigDecimal dias) {
		this.dias = dias;
	}

	public BigDecimal getEstado() {
		return this.estado;
	}

	public void setEstado(BigDecimal estado) {
		this.estado = estado;
	}

	public Date getFecexp() {
		return this.fecexp;
	}

	public void setFecexp(Date fecexp) {
		this.fecexp = fecexp;
	}

	public Date getFecimpuestos() {
		return this.fecimpuestos;
	}

	public void setFecimpuestos(Date fecimpuestos) {
		this.fecimpuestos = fecimpuestos;
	}

	public Date getFecini() {
		return this.fecini;
	}

	public void setFecini(Date fecini) {
		this.fecini = fecini;
	}

	public Date getFecmod() {
		return this.fecmod;
	}

	public void setFecmod(Date fecmod) {
		this.fecmod = fecmod;
	}

	public Date getFecori() {
		return this.fecori;
	}

	public void setFecori(Date fecori) {
		this.fecori = fecori;
	}

	public Date getFecout() {
		return this.fecout;
	}

	public void setFecout(Date fecout) {
		this.fecout = fecout;
	}

	public Date getFecrea() {
		return this.fecrea;
	}

	public void setFecrea(Date fecrea) {
		this.fecrea = fecrea;
	}

	public Date getFecren() {
		return this.fecren;
	}

	public void setFecren(Date fecren) {
		this.fecren = fecren;
	}

	public Date getFecter() {
		return this.fecter;
	}

	public void setFecter(Date fecter) {
		this.fecter = fecter;
	}

	public Date getFecterplan() {
		return this.fecterplan;
	}

	public void setFecterplan(Date fecterplan) {
		this.fecterplan = fecterplan;
	}

	public BigDecimal getForpag() {
		return this.forpag;
	}

	public void setForpag(BigDecimal forpag) {
		this.forpag = forpag;
	}

	public String getHordes() {
		return this.hordes;
	}

	public void setHordes(String hordes) {
		this.hordes = hordes;
	}

	public String getHorhas() {
		return this.horhas;
	}

	public void setHorhas(String horhas) {
		this.horhas = horhas;
	}

	public BigDecimal getImpresa() {
		return this.impresa;
	}

	public void setImpresa(BigDecimal impresa) {
		this.impresa = impresa;
	}

	public BigDecimal getMoneda() {
		return this.moneda;
	}

	public void setMoneda(BigDecimal moneda) {
		this.moneda = moneda;
	}

	public BigDecimal getMotivocan() {
		return this.motivocan;
	}

	public void setMotivocan(BigDecimal motivocan) {
		this.motivocan = motivocan;
	}

	public BigDecimal getNivel() {
		return this.nivel;
	}

	public void setNivel(BigDecimal nivel) {
		this.nivel = nivel;
	}

	public String getNumdoc() {
		return this.numdoc;
	}

	public void setNumdoc(String numdoc) {
		this.numdoc = numdoc;
	}

	public BigDecimal getOrdengrupo() {
		return this.ordengrupo;
	}

	public void setOrdengrupo(BigDecimal ordengrupo) {
		this.ordengrupo = ordengrupo;
	}

	public BigDecimal getParticipacion() {
		return this.participacion;
	}

	public void setParticipacion(BigDecimal participacion) {
		this.participacion = participacion;
	}

	public String getPlanorden() {
		return this.planorden;
	}

	public void setPlanorden(String planorden) {
		this.planorden = planorden;
	}

	public String getPlaza() {
		return this.plaza;
	}

	public void setPlaza(String plaza) {
		this.plaza = plaza;
	}

	public String getPoliza() {
		return this.poliza;
	}

	public void setPoliza(String poliza) {
		this.poliza = poliza;
	}

	public String getPollider() {
		return this.pollider;
	}

	public void setPollider(String pollider) {
		this.pollider = pollider;
	}

	public BigDecimal getPordescesion() {
		return this.pordescesion;
	}

	public void setPordescesion(BigDecimal pordescesion) {
		this.pordescesion = pordescesion;
	}

	public BigDecimal getPordescuento() {
		return this.pordescuento;
	}

	public void setPordescuento(BigDecimal pordescuento) {
		this.pordescuento = pordescuento;
	}

	public BigDecimal getPorgastos() {
		return this.porgastos;
	}

	public void setPorgastos(BigDecimal porgastos) {
		this.porgastos = porgastos;
	}

	public BigDecimal getPorrecargo() {
		return this.porrecargo;
	}

	public void setPorrecargo(BigDecimal porrecargo) {
		this.porrecargo = porrecargo;
	}

	public BigDecimal getRol() {
		return this.rol;
	}

	public void setRol(BigDecimal rol) {
		this.rol = rol;
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

	public String getTipcer() {
		return this.tipcer;
	}

	public void setTipcer(String tipcer) {
		this.tipcer = tipcer;
	}

	public BigDecimal getTipcoa() {
		return this.tipcoa;
	}

	public void setTipcoa(BigDecimal tipcoa) {
		this.tipcoa = tipcoa;
	}

	public String getTipdoc() {
		return this.tipdoc;
	}

	public void setTipdoc(String tipdoc) {
		this.tipdoc = tipdoc;
	}

	public BigDecimal getTipfac() {
		return this.tipfac;
	}

	public void setTipfac(BigDecimal tipfac) {
		this.tipfac = tipfac;
	}

	public BigDecimal getTipflo() {
		return this.tipflo;
	}

	public void setTipflo(BigDecimal tipflo) {
		this.tipflo = tipflo;
	}

	public BigDecimal getTipocarga() {
		return this.tipocarga;
	}

	public void setTipocarga(BigDecimal tipocarga) {
		this.tipocarga = tipocarga;
	}

	public String getTomador() {
		return this.tomador;
	}

	public void setTomador(String tomador) {
		this.tomador = tomador;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public BigDecimal getValgastos() {
		return this.valgastos;
	}

	public void setValgastos(BigDecimal valgastos) {
		this.valgastos = valgastos;
	}

	public BigDecimal getValiva() {
		return this.valiva;
	}

	public void setValiva(BigDecimal valiva) {
		this.valiva = valiva;
	}

	public BigDecimal getVaseg() {
		return this.vaseg;
	}

	public void setVaseg(BigDecimal vaseg) {
		this.vaseg = vaseg;
	}

	public BigDecimal getVbase() {
		return this.vbase;
	}

	public void setVbase(BigDecimal vbase) {
		this.vbase = vbase;
	}

	public BigDecimal getVprima() {
		return this.vprima;
	}

	public void setVprima(BigDecimal vprima) {
		this.vprima = vprima;
	}

}