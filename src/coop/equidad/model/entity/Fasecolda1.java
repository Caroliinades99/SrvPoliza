//package coop.equidad.model.entity;
//
//import java.io.Serializable;
//import javax.persistence.*;
//
///**
// * The persistent class for the FASECOLDA1 database table.
// * 
// */
//@Entity
//@NamedQuery(name = "Fasecolda1.findAll", query = "SELECT f FROM Fasecolda1 f")
//
//public class Fasecolda1 implements Serializable {
//	private static final long serialVersionUID = 1L;
//
//	@Column(name = "F_1970")
//	private String f1970;
//
//	@Column(name = "F_1971")
//	private String f1971;
//
//	@Column(name = "F_1972")
//	private String f1972;
//
//	@Column(name = "F_1973")
//	private String f1973;
//
//	@Column(name = "F_1974")
//	private String f1974;
//
//	@Column(name = "F_1975")
//	private String f1975;
//
//	@Column(name = "F_1976")
//	private String f1976;
//
//	@Column(name = "F_1977")
//	private String f1977;
//
//	@Column(name = "F_1978")
//	private String f1978;
//
//	@Column(name = "F_1979")
//	private String f1979;
//
//	@Column(name = "F_1980")
//	private String f1980;
//
//	@Column(name = "F_1981")
//	private String f1981;
//
//	@Column(name = "F_1982")
//	private String f1982;
//
//	@Column(name = "F_1983")
//	private String f1983;
//
//	@Column(name = "F_1984")
//	private String f1984;
//
//	@Column(name = "F_1985")
//	private String f1985;
//
//	@Column(name = "F_1986")
//	private String f1986;
//
//	@Column(name = "F_1987")
//	private String f1987;
//
//	@Column(name = "F_1988")
//	private String f1988;
//
//	@Column(name = "F_1989")
//	private String f1989;
//
//	@Column(name = "F_1990")
//	private String f1990;
//
//	@Column(name = "F_1991")
//	private String f1991;
//
//	@Column(name = "F_1992")
//	private String f1992;
//
//	@Column(name = "F_1993")
//	private String f1993;
//
//	@Column(name = "F_1994")
//	private String f1994;
//
//	@Column(name = "F_1995")
//	private String f1995;
//
//	@Column(name = "F_1996")
//	private String f1996;
//
//	@Column(name = "F_1997")
//	private String f1997;
//
//	@Column(name = "F_1998")
//	private String f1998;
//
//	@Column(name = "F_1999")
//	private String f1999;
//
//	@Column(name = "F_2000")
//	private String f2000;
//
//	@Column(name = "F_2001")
//	private String f2001;
//
//	@Column(name = "F_2002")
//	private String f2002;
//
//	@Column(name = "F_2003")
//	private String f2003;
//
//	@Column(name = "F_2004")
//	private String f2004;
//
//	@Column(name = "F_2005")
//	private String f2005;
//
//	@Column(name = "F_2006")
//	private String f2006;
//
//	@Column(name = "F_2007")
//	private String f2007;
//
//	@Column(name = "F_2008")
//	private String f2008;
//
//	@Column(name = "F_2009")
//	private String f2009;
//
//	@Column(name = "F_2010")
//	private String f2010;
//
//	@Column(name = "F_2011")
//	private String f2011;
//
//	@Column(name = "F_2012")
//	private String f2012;
//
//	@Column(name = "F_2013")
//	private String f2013;
//
//	@Column(name = "F_2014")
//	private String f2014;
//
//	@Column(name = "F_2015")
//	private String f2015;
//
//	@Column(name = "F_2016")
//	private String f2016;
//
//	@Column(name = "F_2017")
//	private String f2017;
//
//	@Column(name = "F_2018")
//	private String f2018;
//
//	@Column(name = "F_2019")
//	private String f2019;
//
//	@Column(name = "F_2020")
//	private String f2020;
//
//	@Column(name = "F_AIREACONDICIONADO")
//	private String fAireacondicionado;
//
//	@Column(name = "F_BCPP")
//	private String fBcpp;
//
//	@Column(name = "F_CAPACIDADCARGA")
//	private String fCapacidadcarga;
//
//	@Column(name = "F_CAPACIDADPASAJEROS")
//	private String fCapacidadpasajeros;
//
//	@Column(name = "F_CILINDRAJE")
//	private String fCilindraje;
//
//	@Column(name = "F_CLASE")
//	private String fClase;
//
//	@Column(name = "F_CODIGO")
//	private String fCodigo;
//
//	@Column(name = "F_COMBUSTIBLE")
//	private String fCombustible;
//
//	@Column(name = "F_EJES")
//	private String fEjes;
//
//	@Column(name = "F_ESTADO")
//	private String fEstado;
//
//	@Column(name = "F_HOMOLOGOCODIGO")
//	private String fHomologocodigo;
//
//	@Column(name = "F_IDSERVICIO")
//	private String fIdservicio;
//
//	@Column(name = "F_IMPORTADO")
//	private String fImportado;
//
//	@Column(name = "F_MARCA")
//	private String fMarca;
//
//	@Column(name = "F_NACIONALIDAD")
//	private String fNacionalidad;
//
//	@Column(name = "F_NOVEDAD")
//	private String fNovedad;
//
//	@Column(name = "F_PESO")
//	private String fPeso;
//
//	@Column(name = "F_PESOCATEGORIA")
//	private String fPesocategoria;
//
//	@Column(name = "F_POTENCIA")
//	private String fPotencia;
//
//	@Column(name = "F_PUERTAS")
//	private String fPuertas;
//
//	@Column(name = "F_REFERENCIA1")
//	private String fReferencia1;
//
//	@Column(name = "F_REFERENCIA2")
//	private String fReferencia2;
//
//	@Column(name = "F_REFERENCIA3")
//	private String fReferencia3;
//
//	@Column(name = "F_SERVICIO")
//	private String fServicio;
//
//	@Column(name = "F_TIPOCAJA")
//	private String fTipocaja;
//
//	@Column(name = "F_TRANSMISION")
//	private String fTransmision;
//
//	@Column(name = "F_UM")
//	private String fUm;
//
//	public Fasecolda1() {
//	}
//
//	public String getF1970() {
//		return this.f1970;
//	}
//
//	public void setF1970(String f1970) {
//		this.f1970 = f1970;
//	}
//
//	public String getF1971() {
//		return this.f1971;
//	}
//
//	public void setF1971(String f1971) {
//		this.f1971 = f1971;
//	}
//
//	public String getF1972() {
//		return this.f1972;
//	}
//
//	public void setF1972(String f1972) {
//		this.f1972 = f1972;
//	}
//
//	public String getF1973() {
//		return this.f1973;
//	}
//
//	public void setF1973(String f1973) {
//		this.f1973 = f1973;
//	}
//
//	public String getF1974() {
//		return this.f1974;
//	}
//
//	public void setF1974(String f1974) {
//		this.f1974 = f1974;
//	}
//
//	public String getF1975() {
//		return this.f1975;
//	}
//
//	public void setF1975(String f1975) {
//		this.f1975 = f1975;
//	}
//
//	public String getF1976() {
//		return this.f1976;
//	}
//
//	public void setF1976(String f1976) {
//		this.f1976 = f1976;
//	}
//
//	public String getF1977() {
//		return this.f1977;
//	}
//
//	public void setF1977(String f1977) {
//		this.f1977 = f1977;
//	}
//
//	public String getF1978() {
//		return this.f1978;
//	}
//
//	public void setF1978(String f1978) {
//		this.f1978 = f1978;
//	}
//
//	public String getF1979() {
//		return this.f1979;
//	}
//
//	public void setF1979(String f1979) {
//		this.f1979 = f1979;
//	}
//
//	public String getF1980() {
//		return this.f1980;
//	}
//
//	public void setF1980(String f1980) {
//		this.f1980 = f1980;
//	}
//
//	public String getF1981() {
//		return this.f1981;
//	}
//
//	public void setF1981(String f1981) {
//		this.f1981 = f1981;
//	}
//
//	public String getF1982() {
//		return this.f1982;
//	}
//
//	public void setF1982(String f1982) {
//		this.f1982 = f1982;
//	}
//
//	public String getF1983() {
//		return this.f1983;
//	}
//
//	public void setF1983(String f1983) {
//		this.f1983 = f1983;
//	}
//
//	public String getF1984() {
//		return this.f1984;
//	}
//
//	public void setF1984(String f1984) {
//		this.f1984 = f1984;
//	}
//
//	public String getF1985() {
//		return this.f1985;
//	}
//
//	public void setF1985(String f1985) {
//		this.f1985 = f1985;
//	}
//
//	public String getF1986() {
//		return this.f1986;
//	}
//
//	public void setF1986(String f1986) {
//		this.f1986 = f1986;
//	}
//
//	public String getF1987() {
//		return this.f1987;
//	}
//
//	public void setF1987(String f1987) {
//		this.f1987 = f1987;
//	}
//
//	public String getF1988() {
//		return this.f1988;
//	}
//
//	public void setF1988(String f1988) {
//		this.f1988 = f1988;
//	}
//
//	public String getF1989() {
//		return this.f1989;
//	}
//
//	public void setF1989(String f1989) {
//		this.f1989 = f1989;
//	}
//
//	public String getF1990() {
//		return this.f1990;
//	}
//
//	public void setF1990(String f1990) {
//		this.f1990 = f1990;
//	}
//
//	public String getF1991() {
//		return this.f1991;
//	}
//
//	public void setF1991(String f1991) {
//		this.f1991 = f1991;
//	}
//
//	public String getF1992() {
//		return this.f1992;
//	}
//
//	public void setF1992(String f1992) {
//		this.f1992 = f1992;
//	}
//
//	public String getF1993() {
//		return this.f1993;
//	}
//
//	public void setF1993(String f1993) {
//		this.f1993 = f1993;
//	}
//
//	public String getF1994() {
//		return this.f1994;
//	}
//
//	public void setF1994(String f1994) {
//		this.f1994 = f1994;
//	}
//
//	public String getF1995() {
//		return this.f1995;
//	}
//
//	public void setF1995(String f1995) {
//		this.f1995 = f1995;
//	}
//
//	public String getF1996() {
//		return this.f1996;
//	}
//
//	public void setF1996(String f1996) {
//		this.f1996 = f1996;
//	}
//
//	public String getF1997() {
//		return this.f1997;
//	}
//
//	public void setF1997(String f1997) {
//		this.f1997 = f1997;
//	}
//
//	public String getF1998() {
//		return this.f1998;
//	}
//
//	public void setF1998(String f1998) {
//		this.f1998 = f1998;
//	}
//
//	public String getF1999() {
//		return this.f1999;
//	}
//
//	public void setF1999(String f1999) {
//		this.f1999 = f1999;
//	}
//
//	public String getF2000() {
//		return this.f2000;
//	}
//
//	public void setF2000(String f2000) {
//		this.f2000 = f2000;
//	}
//
//	public String getF2001() {
//		return this.f2001;
//	}
//
//	public void setF2001(String f2001) {
//		this.f2001 = f2001;
//	}
//
//	public String getF2002() {
//		return this.f2002;
//	}
//
//	public void setF2002(String f2002) {
//		this.f2002 = f2002;
//	}
//
//	public String getF2003() {
//		return this.f2003;
//	}
//
//	public void setF2003(String f2003) {
//		this.f2003 = f2003;
//	}
//
//	public String getF2004() {
//		return this.f2004;
//	}
//
//	public void setF2004(String f2004) {
//		this.f2004 = f2004;
//	}
//
//	public String getF2005() {
//		return this.f2005;
//	}
//
//	public void setF2005(String f2005) {
//		this.f2005 = f2005;
//	}
//
//	public String getF2006() {
//		return this.f2006;
//	}
//
//	public void setF2006(String f2006) {
//		this.f2006 = f2006;
//	}
//
//	public String getF2007() {
//		return this.f2007;
//	}
//
//	public void setF2007(String f2007) {
//		this.f2007 = f2007;
//	}
//
//	public String getF2008() {
//		return this.f2008;
//	}
//
//	public void setF2008(String f2008) {
//		this.f2008 = f2008;
//	}
//
//	public String getF2009() {
//		return this.f2009;
//	}
//
//	public void setF2009(String f2009) {
//		this.f2009 = f2009;
//	}
//
//	public String getF2010() {
//		return this.f2010;
//	}
//
//	public void setF2010(String f2010) {
//		this.f2010 = f2010;
//	}
//
//	public String getF2011() {
//		return this.f2011;
//	}
//
//	public void setF2011(String f2011) {
//		this.f2011 = f2011;
//	}
//
//	public String getF2012() {
//		return this.f2012;
//	}
//
//	public void setF2012(String f2012) {
//		this.f2012 = f2012;
//	}
//
//	public String getF2013() {
//		return this.f2013;
//	}
//
//	public void setF2013(String f2013) {
//		this.f2013 = f2013;
//	}
//
//	public String getF2014() {
//		return this.f2014;
//	}
//
//	public void setF2014(String f2014) {
//		this.f2014 = f2014;
//	}
//
//	public String getF2015() {
//		return this.f2015;
//	}
//
//	public void setF2015(String f2015) {
//		this.f2015 = f2015;
//	}
//
//	public String getF2016() {
//		return this.f2016;
//	}
//
//	public void setF2016(String f2016) {
//		this.f2016 = f2016;
//	}
//
//	public String getF2017() {
//		return this.f2017;
//	}
//
//	public void setF2017(String f2017) {
//		this.f2017 = f2017;
//	}
//
//	public String getF2018() {
//		return this.f2018;
//	}
//
//	public void setF2018(String f2018) {
//		this.f2018 = f2018;
//	}
//
//	public String getF2019() {
//		return this.f2019;
//	}
//
//	public void setF2019(String f2019) {
//		this.f2019 = f2019;
//	}
//
//	public String getF2020() {
//		return this.f2020;
//	}
//
//	public void setF2020(String f2020) {
//		this.f2020 = f2020;
//	}
//
//	public String getFAireacondicionado() {
//		return this.fAireacondicionado;
//	}
//
//	public void setFAireacondicionado(String fAireacondicionado) {
//		this.fAireacondicionado = fAireacondicionado;
//	}
//
//	public String getFBcpp() {
//		return this.fBcpp;
//	}
//
//	public void setFBcpp(String fBcpp) {
//		this.fBcpp = fBcpp;
//	}
//
//	public String getFCapacidadcarga() {
//		return this.fCapacidadcarga;
//	}
//
//	public void setFCapacidadcarga(String fCapacidadcarga) {
//		this.fCapacidadcarga = fCapacidadcarga;
//	}
//
//	public String getFCapacidadpasajeros() {
//		return this.fCapacidadpasajeros;
//	}
//
//	public void setFCapacidadpasajeros(String fCapacidadpasajeros) {
//		this.fCapacidadpasajeros = fCapacidadpasajeros;
//	}
//
//	public String getFCilindraje() {
//		return this.fCilindraje;
//	}
//
//	public void setFCilindraje(String fCilindraje) {
//		this.fCilindraje = fCilindraje;
//	}
//
//	public String getFClase() {
//		return this.fClase;
//	}
//
//	public void setFClase(String fClase) {
//		this.fClase = fClase;
//	}
//
//	public String getFCodigo() {
//		return this.fCodigo;
//	}
//
//	public void setFCodigo(String fCodigo) {
//		this.fCodigo = fCodigo;
//	}
//
//	public String getFCombustible() {
//		return this.fCombustible;
//	}
//
//	public void setFCombustible(String fCombustible) {
//		this.fCombustible = fCombustible;
//	}
//
//	public String getFEjes() {
//		return this.fEjes;
//	}
//
//	public void setFEjes(String fEjes) {
//		this.fEjes = fEjes;
//	}
//
//	public String getFEstado() {
//		return this.fEstado;
//	}
//
//	public void setFEstado(String fEstado) {
//		this.fEstado = fEstado;
//	}
//
//	public String getFHomologocodigo() {
//		return this.fHomologocodigo;
//	}
//
//	public void setFHomologocodigo(String fHomologocodigo) {
//		this.fHomologocodigo = fHomologocodigo;
//	}
//
//	public String getFIdservicio() {
//		return this.fIdservicio;
//	}
//
//	public void setFIdservicio(String fIdservicio) {
//		this.fIdservicio = fIdservicio;
//	}
//
//	public String getFImportado() {
//		return this.fImportado;
//	}
//
//	public void setFImportado(String fImportado) {
//		this.fImportado = fImportado;
//	}
//
//	public String getFMarca() {
//		return this.fMarca;
//	}
//
//	public void setFMarca(String fMarca) {
//		this.fMarca = fMarca;
//	}
//
//	public String getFNacionalidad() {
//		return this.fNacionalidad;
//	}
//
//	public void setFNacionalidad(String fNacionalidad) {
//		this.fNacionalidad = fNacionalidad;
//	}
//
//	public String getFNovedad() {
//		return this.fNovedad;
//	}
//
//	public void setFNovedad(String fNovedad) {
//		this.fNovedad = fNovedad;
//	}
//
//	public String getFPeso() {
//		return this.fPeso;
//	}
//
//	public void setFPeso(String fPeso) {
//		this.fPeso = fPeso;
//	}
//
//	public String getFPesocategoria() {
//		return this.fPesocategoria;
//	}
//
//	public void setFPesocategoria(String fPesocategoria) {
//		this.fPesocategoria = fPesocategoria;
//	}
//
//	public String getFPotencia() {
//		return this.fPotencia;
//	}
//
//	public void setFPotencia(String fPotencia) {
//		this.fPotencia = fPotencia;
//	}
//
//	public String getFPuertas() {
//		return this.fPuertas;
//	}
//
//	public void setFPuertas(String fPuertas) {
//		this.fPuertas = fPuertas;
//	}
//
//	public String getFReferencia1() {
//		return this.fReferencia1;
//	}
//
//	public void setFReferencia1(String fReferencia1) {
//		this.fReferencia1 = fReferencia1;
//	}
//
//	public String getFReferencia2() {
//		return this.fReferencia2;
//	}
//
//	public void setFReferencia2(String fReferencia2) {
//		this.fReferencia2 = fReferencia2;
//	}
//
//	public String getFReferencia3() {
//		return this.fReferencia3;
//	}
//
//	public void setFReferencia3(String fReferencia3) {
//		this.fReferencia3 = fReferencia3;
//	}
//
//	public String getFServicio() {
//		return this.fServicio;
//	}
//
//	public void setFServicio(String fServicio) {
//		this.fServicio = fServicio;
//	}
//
//	public String getFTipocaja() {
//		return this.fTipocaja;
//	}
//
//	public void setFTipocaja(String fTipocaja) {
//		this.fTipocaja = fTipocaja;
//	}
//
//	public String getFTransmision() {
//		return this.fTransmision;
//	}
//
//	public void setFTransmision(String fTransmision) {
//		this.fTransmision = fTransmision;
//	}
//
//	public String getFUm() {
//		return this.fUm;
//	}
//
//	public void setFUm(String fUm) {
//		this.fUm = fUm;
//	}
//
//}