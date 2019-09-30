package coop.equidad.model.entity;

import java.io.Serializable;
import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the S03201 database table.
 * 
 */
@Entity
@Table(name="S03201", schema="osiris")
@NamedQueries({
	@NamedQuery(name="OsCaratula.findAll", query="SELECT o FROM OsCaratula o"),
	@NamedQuery(name="OsCaratula.countByKey", query="SELECT COUNT(o) FROM OsCaratula o "
			+ "WHERE o.id.sucur = :sucur AND o.id.codpla = :codpla AND o.id.certif = :certif AND o.id.orden = :orden"),
	@NamedQuery(name="OsCaratula.getCaratula", query="SELECT o FROM OsCaratula o "
			+ "WHERE o.id.sucur = :sucur AND o.id.codpla = :codpla AND o.id.certif = :certif AND o.id.orden = :orden"),
	@NamedQuery(name="OsCaratula.findByParams", query="SELECT o FROM OsCaratula o "
			+ "WHERE o.asegurado = :asegurado AND o.id.sucur = :sucur AND o.poliza = :poliza AND o.id.certif = :certif AND o.id.codpla = :codpla")
})
public class OsCaratula implements Serializable {
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

	public OsCaratula() {}

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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OsCaratula [");
		if (id != null) {
			builder.append("id=");
			builder.append(id);
			builder.append(", ");
		}
		if (agente != null) {
			builder.append("agente=");
			builder.append(agente);
			builder.append(", ");
		}
		if (amarrecertif != null) {
			builder.append("amarrecertif=");
			builder.append(amarrecertif);
			builder.append(", ");
		}
		if (amarreorden != null) {
			builder.append("amarreorden=");
			builder.append(amarreorden);
			builder.append(", ");
		}
		if (amarreplan != null) {
			builder.append("amarreplan=");
			builder.append(amarreplan);
			builder.append(", ");
		}
		if (amarrepoliza != null) {
			builder.append("amarrepoliza=");
			builder.append(amarrepoliza);
			builder.append(", ");
		}
		if (antcertif != null) {
			builder.append("antcertif=");
			builder.append(antcertif);
			builder.append(", ");
		}
		if (antcodpla != null) {
			builder.append("antcodpla=");
			builder.append(antcodpla);
			builder.append(", ");
		}
		if (antorden != null) {
			builder.append("antorden=");
			builder.append(antorden);
			builder.append(", ");
		}
		if (asegurado != null) {
			builder.append("asegurado=");
			builder.append(asegurado);
			builder.append(", ");
		}
		if (beneficiario != null) {
			builder.append("beneficiario=");
			builder.append(beneficiario);
			builder.append(", ");
		}
		if (cambio != null) {
			builder.append("cambio=");
			builder.append(cambio);
			builder.append(", ");
		}
		if (cerlider != null) {
			builder.append("cerlider=");
			builder.append(cerlider);
			builder.append(", ");
		}
		if (certifcausacion != null) {
			builder.append("certifcausacion=");
			builder.append(certifcausacion);
			builder.append(", ");
		}
		if (cesioncomision != null) {
			builder.append("cesioncomision=");
			builder.append(cesioncomision);
			builder.append(", ");
		}
		if (clasifrea != null) {
			builder.append("clasifrea=");
			builder.append(clasifrea);
			builder.append(", ");
		}
		if (cliente != null) {
			builder.append("cliente=");
			builder.append(cliente);
			builder.append(", ");
		}
		if (coalider != null) {
			builder.append("coalider=");
			builder.append(coalider);
			builder.append(", ");
		}
		if (coaseg != null) {
			builder.append("coaseg=");
			builder.append(coaseg);
			builder.append(", ");
		}
		if (codcia != null) {
			builder.append("codcia=");
			builder.append(codcia);
			builder.append(", ");
		}
		if (comision != null) {
			builder.append("comision=");
			builder.append(comision);
			builder.append(", ");
		}
		if (cotizacion != null) {
			builder.append("cotizacion=");
			builder.append(cotizacion);
			builder.append(", ");
		}
		if (cumulo != null) {
			builder.append("cumulo=");
			builder.append(cumulo);
			builder.append(", ");
		}
		if (diafact != null) {
			builder.append("diafact=");
			builder.append(diafact);
			builder.append(", ");
		}
		if (dias != null) {
			builder.append("dias=");
			builder.append(dias);
			builder.append(", ");
		}
		if (estado != null) {
			builder.append("estado=");
			builder.append(estado);
			builder.append(", ");
		}
		if (fecexp != null) {
			builder.append("fecexp=");
			builder.append(fecexp);
			builder.append(", ");
		}
		if (fecimpuestos != null) {
			builder.append("fecimpuestos=");
			builder.append(fecimpuestos);
			builder.append(", ");
		}
		if (fecini != null) {
			builder.append("fecini=");
			builder.append(fecini);
			builder.append(", ");
		}
		if (fecmod != null) {
			builder.append("fecmod=");
			builder.append(fecmod);
			builder.append(", ");
		}
		if (fecori != null) {
			builder.append("fecori=");
			builder.append(fecori);
			builder.append(", ");
		}
		if (fecout != null) {
			builder.append("fecout=");
			builder.append(fecout);
			builder.append(", ");
		}
		if (fecrea != null) {
			builder.append("fecrea=");
			builder.append(fecrea);
			builder.append(", ");
		}
		if (fecren != null) {
			builder.append("fecren=");
			builder.append(fecren);
			builder.append(", ");
		}
		if (fecter != null) {
			builder.append("fecter=");
			builder.append(fecter);
			builder.append(", ");
		}
		if (fecterplan != null) {
			builder.append("fecterplan=");
			builder.append(fecterplan);
			builder.append(", ");
		}
		if (forpag != null) {
			builder.append("forpag=");
			builder.append(forpag);
			builder.append(", ");
		}
		if (hordes != null) {
			builder.append("hordes=");
			builder.append(hordes);
			builder.append(", ");
		}
		if (horhas != null) {
			builder.append("horhas=");
			builder.append(horhas);
			builder.append(", ");
		}
		if (impresa != null) {
			builder.append("impresa=");
			builder.append(impresa);
			builder.append(", ");
		}
		if (moneda != null) {
			builder.append("moneda=");
			builder.append(moneda);
			builder.append(", ");
		}
		if (motivocan != null) {
			builder.append("motivocan=");
			builder.append(motivocan);
			builder.append(", ");
		}
		if (nivel != null) {
			builder.append("nivel=");
			builder.append(nivel);
			builder.append(", ");
		}
		if (numdoc != null) {
			builder.append("numdoc=");
			builder.append(numdoc);
			builder.append(", ");
		}
		if (ordengrupo != null) {
			builder.append("ordengrupo=");
			builder.append(ordengrupo);
			builder.append(", ");
		}
		if (participacion != null) {
			builder.append("participacion=");
			builder.append(participacion);
			builder.append(", ");
		}
		if (planorden != null) {
			builder.append("planorden=");
			builder.append(planorden);
			builder.append(", ");
		}
		if (plaza != null) {
			builder.append("plaza=");
			builder.append(plaza);
			builder.append(", ");
		}
		if (poliza != null) {
			builder.append("poliza=");
			builder.append(poliza);
			builder.append(", ");
		}
		if (pollider != null) {
			builder.append("pollider=");
			builder.append(pollider);
			builder.append(", ");
		}
		if (pordescesion != null) {
			builder.append("pordescesion=");
			builder.append(pordescesion);
			builder.append(", ");
		}
		if (pordescuento != null) {
			builder.append("pordescuento=");
			builder.append(pordescuento);
			builder.append(", ");
		}
		if (porgastos != null) {
			builder.append("porgastos=");
			builder.append(porgastos);
			builder.append(", ");
		}
		if (porrecargo != null) {
			builder.append("porrecargo=");
			builder.append(porrecargo);
			builder.append(", ");
		}
		if (rol != null) {
			builder.append("rol=");
			builder.append(rol);
			builder.append(", ");
		}
		if (sucmod != null) {
			builder.append("sucmod=");
			builder.append(sucmod);
			builder.append(", ");
		}
		if (sucrea != null) {
			builder.append("sucrea=");
			builder.append(sucrea);
			builder.append(", ");
		}
		if (tipcer != null) {
			builder.append("tipcer=");
			builder.append(tipcer);
			builder.append(", ");
		}
		if (tipcoa != null) {
			builder.append("tipcoa=");
			builder.append(tipcoa);
			builder.append(", ");
		}
		if (tipdoc != null) {
			builder.append("tipdoc=");
			builder.append(tipdoc);
			builder.append(", ");
		}
		if (tipfac != null) {
			builder.append("tipfac=");
			builder.append(tipfac);
			builder.append(", ");
		}
		if (tipflo != null) {
			builder.append("tipflo=");
			builder.append(tipflo);
			builder.append(", ");
		}
		if (tipocarga != null) {
			builder.append("tipocarga=");
			builder.append(tipocarga);
			builder.append(", ");
		}
		if (tomador != null) {
			builder.append("tomador=");
			builder.append(tomador);
			builder.append(", ");
		}
		if (ubicacion != null) {
			builder.append("ubicacion=");
			builder.append(ubicacion);
			builder.append(", ");
		}
		if (valgastos != null) {
			builder.append("valgastos=");
			builder.append(valgastos);
			builder.append(", ");
		}
		if (valiva != null) {
			builder.append("valiva=");
			builder.append(valiva);
			builder.append(", ");
		}
		if (vaseg != null) {
			builder.append("vaseg=");
			builder.append(vaseg);
			builder.append(", ");
		}
		if (vbase != null) {
			builder.append("vbase=");
			builder.append(vbase);
			builder.append(", ");
		}
		if (vprima != null) {
			builder.append("vprima=");
			builder.append(vprima);
		}
		builder.append("]");
		return builder.toString();
	}

}