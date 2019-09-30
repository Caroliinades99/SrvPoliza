package coop.equidad.model.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the S04021 database table.
 * 
 */
@Entity
@Table(name="S04021", schema="osiris")
@NamedQueries({
	@NamedQuery(name="OsReaseguroPz.findAll", query="SELECT o FROM OsReaseguroPz o"),
	@NamedQuery(name="OsReaseguroPz.findByPoliza", query="SELECT r FROM OsReaseguroPz r "
			+ "WHERE r.id.sucur = :sucur AND r.id.codpla = :codpla AND r.id.certif = :certif AND r.id.orden = :orden")
})
public class OsReaseguroPz implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private ReaseguroPK id;	

	private String amarrecertif;

	private String amarrecodram;

	private BigDecimal amarreorden;

	private String amarreplan;

	private String amarrepoliza;

	private String antcertif;

	private BigDecimal antorden;

	private BigDecimal basereaseg;

	private String clasificacion;

	private BigDecimal coaseg;

	private BigDecimal concolocacion;

	private String cont1;

	private String cont2;

	private String cont3;

	private String cont4;

	private String cont5;

	private String contt1;

	private String contt2;

	private String contt3;

	private String contt4;

	private String contt5;

	private String cumulo;

	private BigDecimal difprima;

	private BigDecimal estado;

	private BigDecimal facultativo;

	@Temporal(TemporalType.DATE)
	private Date feccolocacion;

	@Temporal(TemporalType.DATE)
	private Date fecexp;

	@Temporal(TemporalType.DATE)
	private Date fecfin;

	@Temporal(TemporalType.DATE)
	private Date fecini;

	@Temporal(TemporalType.DATE)
	private Date fecmod;

	@Temporal(TemporalType.DATE)
	private Date fecmodificado;

	@Temporal(TemporalType.DATE)
	private Date fecrea;

	@Temporal(TemporalType.DATE)
	private Date fectraspaso;

	private BigDecimal monedacolocacion;

	private BigDecimal nivel;

	private String paquete;

	private String poliza;

	private BigDecimal pr1;

	private BigDecimal pr2;

	private BigDecimal pr3;

	private BigDecimal pr4;

	private BigDecimal pr5;

	private BigDecimal prf;

	private BigDecimal pricau;

	private BigDecimal pricaucomercial;

	private BigDecimal pricomercial;

	private BigDecimal prirev;

	private BigDecimal prirevcomercial;

	private BigDecimal retencionpr;

	private BigDecimal retencionva;

	private BigDecimal riesgobase;

	private BigDecimal siniestros;

	private String sucmod;

	private String sucrea;

	private BigDecimal tcont1;

	private BigDecimal tcont2;

	private BigDecimal tcont3;

	private BigDecimal tcont4;

	private BigDecimal tcont5;

	private String tipcer;

	private BigDecimal tipcoa;

	private String ubicacion;

	private BigDecimal va1;

	private BigDecimal va2;

	private BigDecimal va3;

	private BigDecimal va4;

	private BigDecimal va5;

	private BigDecimal vaf;

	private BigDecimal valcomision;

	private BigDecimal vaseg;

	private BigDecimal vprima;

	public OsReaseguroPz() {
	}
	
	public ReaseguroPK getId() {
		return id;
	}

	public void setId(ReaseguroPK id) {
		this.id = id;
	}

	public String getAmarrecertif() {
		return this.amarrecertif;
	}

	public void setAmarrecertif(String amarrecertif) {
		this.amarrecertif = amarrecertif;
	}

	public String getAmarrecodram() {
		return this.amarrecodram;
	}

	public void setAmarrecodram(String amarrecodram) {
		this.amarrecodram = amarrecodram;
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

	public BigDecimal getAntorden() {
		return this.antorden;
	}

	public void setAntorden(BigDecimal antorden) {
		this.antorden = antorden;
	}

	public BigDecimal getBasereaseg() {
		return this.basereaseg;
	}

	public void setBasereaseg(BigDecimal basereaseg) {
		this.basereaseg = basereaseg;
	}

	public String getClasificacion() {
		return this.clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	public BigDecimal getCoaseg() {
		return this.coaseg;
	}

	public void setCoaseg(BigDecimal coaseg) {
		this.coaseg = coaseg;
	}

	public BigDecimal getConcolocacion() {
		return this.concolocacion;
	}

	public void setConcolocacion(BigDecimal concolocacion) {
		this.concolocacion = concolocacion;
	}

	public String getCont1() {
		return this.cont1;
	}

	public void setCont1(String cont1) {
		this.cont1 = cont1;
	}

	public String getCont2() {
		return this.cont2;
	}

	public void setCont2(String cont2) {
		this.cont2 = cont2;
	}

	public String getCont3() {
		return this.cont3;
	}

	public void setCont3(String cont3) {
		this.cont3 = cont3;
	}

	public String getCont4() {
		return this.cont4;
	}

	public void setCont4(String cont4) {
		this.cont4 = cont4;
	}

	public String getCont5() {
		return this.cont5;
	}

	public void setCont5(String cont5) {
		this.cont5 = cont5;
	}

	public String getContt1() {
		return this.contt1;
	}

	public void setContt1(String contt1) {
		this.contt1 = contt1;
	}

	public String getContt2() {
		return this.contt2;
	}

	public void setContt2(String contt2) {
		this.contt2 = contt2;
	}

	public String getContt3() {
		return this.contt3;
	}

	public void setContt3(String contt3) {
		this.contt3 = contt3;
	}

	public String getContt4() {
		return this.contt4;
	}

	public void setContt4(String contt4) {
		this.contt4 = contt4;
	}

	public String getContt5() {
		return this.contt5;
	}

	public void setContt5(String contt5) {
		this.contt5 = contt5;
	}

	public String getCumulo() {
		return this.cumulo;
	}

	public void setCumulo(String cumulo) {
		this.cumulo = cumulo;
	}

	public BigDecimal getDifprima() {
		return this.difprima;
	}

	public void setDifprima(BigDecimal difprima) {
		this.difprima = difprima;
	}

	public BigDecimal getEstado() {
		return this.estado;
	}

	public void setEstado(BigDecimal estado) {
		this.estado = estado;
	}

	public BigDecimal getFacultativo() {
		return this.facultativo;
	}

	public void setFacultativo(BigDecimal facultativo) {
		this.facultativo = facultativo;
	}

	public Date getFeccolocacion() {
		return this.feccolocacion;
	}

	public void setFeccolocacion(Date feccolocacion) {
		this.feccolocacion = feccolocacion;
	}

	public Date getFecexp() {
		return this.fecexp;
	}

	public void setFecexp(Date fecexp) {
		this.fecexp = fecexp;
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

	public Date getFecmod() {
		return this.fecmod;
	}

	public void setFecmod(Date fecmod) {
		this.fecmod = fecmod;
	}

	public Date getFecmodificado() {
		return this.fecmodificado;
	}

	public void setFecmodificado(Date fecmodificado) {
		this.fecmodificado = fecmodificado;
	}

	public Date getFecrea() {
		return this.fecrea;
	}

	public void setFecrea(Date fecrea) {
		this.fecrea = fecrea;
	}

	public Date getFectraspaso() {
		return this.fectraspaso;
	}

	public void setFectraspaso(Date fectraspaso) {
		this.fectraspaso = fectraspaso;
	}

	public BigDecimal getMonedacolocacion() {
		return this.monedacolocacion;
	}

	public void setMonedacolocacion(BigDecimal monedacolocacion) {
		this.monedacolocacion = monedacolocacion;
	}

	public BigDecimal getNivel() {
		return this.nivel;
	}

	public void setNivel(BigDecimal nivel) {
		this.nivel = nivel;
	}

	public String getPaquete() {
		return this.paquete;
	}

	public void setPaquete(String paquete) {
		this.paquete = paquete;
	}

	public String getPoliza() {
		return this.poliza;
	}

	public void setPoliza(String poliza) {
		this.poliza = poliza;
	}

	public BigDecimal getPr1() {
		return this.pr1;
	}

	public void setPr1(BigDecimal pr1) {
		this.pr1 = pr1;
	}

	public BigDecimal getPr2() {
		return this.pr2;
	}

	public void setPr2(BigDecimal pr2) {
		this.pr2 = pr2;
	}

	public BigDecimal getPr3() {
		return this.pr3;
	}

	public void setPr3(BigDecimal pr3) {
		this.pr3 = pr3;
	}

	public BigDecimal getPr4() {
		return this.pr4;
	}

	public void setPr4(BigDecimal pr4) {
		this.pr4 = pr4;
	}

	public BigDecimal getPr5() {
		return this.pr5;
	}

	public void setPr5(BigDecimal pr5) {
		this.pr5 = pr5;
	}

	public BigDecimal getPrf() {
		return this.prf;
	}

	public void setPrf(BigDecimal prf) {
		this.prf = prf;
	}

	public BigDecimal getPricau() {
		return this.pricau;
	}

	public void setPricau(BigDecimal pricau) {
		this.pricau = pricau;
	}

	public BigDecimal getPricaucomercial() {
		return this.pricaucomercial;
	}

	public void setPricaucomercial(BigDecimal pricaucomercial) {
		this.pricaucomercial = pricaucomercial;
	}

	public BigDecimal getPricomercial() {
		return this.pricomercial;
	}

	public void setPricomercial(BigDecimal pricomercial) {
		this.pricomercial = pricomercial;
	}

	public BigDecimal getPrirev() {
		return this.prirev;
	}

	public void setPrirev(BigDecimal prirev) {
		this.prirev = prirev;
	}

	public BigDecimal getPrirevcomercial() {
		return this.prirevcomercial;
	}

	public void setPrirevcomercial(BigDecimal prirevcomercial) {
		this.prirevcomercial = prirevcomercial;
	}

	public BigDecimal getRetencionpr() {
		return this.retencionpr;
	}

	public void setRetencionpr(BigDecimal retencionpr) {
		this.retencionpr = retencionpr;
	}

	public BigDecimal getRetencionva() {
		return this.retencionva;
	}

	public void setRetencionva(BigDecimal retencionva) {
		this.retencionva = retencionva;
	}

	public BigDecimal getRiesgobase() {
		return this.riesgobase;
	}

	public void setRiesgobase(BigDecimal riesgobase) {
		this.riesgobase = riesgobase;
	}

	public BigDecimal getSiniestros() {
		return this.siniestros;
	}

	public void setSiniestros(BigDecimal siniestros) {
		this.siniestros = siniestros;
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

	public BigDecimal getTcont1() {
		return this.tcont1;
	}

	public void setTcont1(BigDecimal tcont1) {
		this.tcont1 = tcont1;
	}

	public BigDecimal getTcont2() {
		return this.tcont2;
	}

	public void setTcont2(BigDecimal tcont2) {
		this.tcont2 = tcont2;
	}

	public BigDecimal getTcont3() {
		return this.tcont3;
	}

	public void setTcont3(BigDecimal tcont3) {
		this.tcont3 = tcont3;
	}

	public BigDecimal getTcont4() {
		return this.tcont4;
	}

	public void setTcont4(BigDecimal tcont4) {
		this.tcont4 = tcont4;
	}

	public BigDecimal getTcont5() {
		return this.tcont5;
	}

	public void setTcont5(BigDecimal tcont5) {
		this.tcont5 = tcont5;
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

	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public BigDecimal getVa1() {
		return this.va1;
	}

	public void setVa1(BigDecimal va1) {
		this.va1 = va1;
	}

	public BigDecimal getVa2() {
		return this.va2;
	}

	public void setVa2(BigDecimal va2) {
		this.va2 = va2;
	}

	public BigDecimal getVa3() {
		return this.va3;
	}

	public void setVa3(BigDecimal va3) {
		this.va3 = va3;
	}

	public BigDecimal getVa4() {
		return this.va4;
	}

	public void setVa4(BigDecimal va4) {
		this.va4 = va4;
	}

	public BigDecimal getVa5() {
		return this.va5;
	}

	public void setVa5(BigDecimal va5) {
		this.va5 = va5;
	}

	public BigDecimal getVaf() {
		return this.vaf;
	}

	public void setVaf(BigDecimal vaf) {
		this.vaf = vaf;
	}

	public BigDecimal getValcomision() {
		return this.valcomision;
	}

	public void setValcomision(BigDecimal valcomision) {
		this.valcomision = valcomision;
	}

	public BigDecimal getVaseg() {
		return this.vaseg;
	}

	public void setVaseg(BigDecimal vaseg) {
		this.vaseg = vaseg;
	}

	public BigDecimal getVprima() {
		return this.vprima;
	}

	public void setVprima(BigDecimal vprima) {
		this.vprima = vprima;
	}

}