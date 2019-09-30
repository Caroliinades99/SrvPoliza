package coop.equidad.test;

import java.rmi.RemoteException;
import java.util.Date;

import coop.equidad.servicios.suscripcion.ActualizarCotizacion;
import coop.equidad.servicios.suscripcion.ActualizarCotizacionResponse;
import coop.equidad.servicios.suscripcion.AnularCertificado;
import coop.equidad.servicios.suscripcion.AnularCertificadoResponse;
import coop.equidad.servicios.suscripcion.BuscarPolizas;
import coop.equidad.servicios.suscripcion.BuscarPolizasResponse;
import coop.equidad.servicios.suscripcion.CancelarCertificado;
import coop.equidad.servicios.suscripcion.CancelarCertificadoResponse;
import coop.equidad.servicios.suscripcion.ConsultarPoliza;
import coop.equidad.servicios.suscripcion.ConsultarPolizaResponse;
import coop.equidad.servicios.suscripcion.CrearCotizacion;
import coop.equidad.servicios.suscripcion.CrearCotizacionResponse;
import coop.equidad.servicios.suscripcion.Detalle;
import coop.equidad.servicios.suscripcion.EmitirPoliza;
import coop.equidad.servicios.suscripcion.EmitirPolizaResponse;
import coop.equidad.servicios.suscripcion.ParametroCotizacion;
import coop.equidad.servicios.suscripcion.Producto;
import coop.equidad.servicios.suscripcion.SrvPolizaSkeleton;
import coop.equidad.servicios.suscripcion.Tercero;
import coop.equidad.servicios.suscripcion.ValidarCotizacion;
import coop.equidad.servicios.suscripcion.ValidarCotizacionResponse;

public class Test {

	/*public static void main(String[] args) {
		try {
			//crearCotizacion();
			//validarCotizacion();
			//consultarPoliza();
			//buscarPolizas();
			//actualizarCotizacion();
			//emitirPoliza();
			//cancelarCertificado();
			//anularCertificado();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	*//**
	 * @throws RemoteException 
	 * 
	 *//*
	@SuppressWarnings("deprecation")
	public static void crearCotizacion () throws RemoteException {
		SrvPolizaSkeleton srvPolizaSkeleton = new SrvPolizaSkeleton();
			
		ParametroCotizacion parametroCotizacion = new ParametroCotizacion();
			parametroCotizacion.setUsuario("FBERNATE");	
			parametroCotizacion.setTipoObjeto("CERTIFICADO");
		Producto[] productos = new Producto[1];
			Producto producto0 = new Producto();
			producto0.setCodpla("011703");
			producto0.setNemotec("AEIOU");
			productos[0] = producto0;
		Tercero[] terceros = new Tercero[4];
			Tercero tercero0 = new Tercero();
			tercero0.setCodigo(90102001);
			tercero0.setNombre("Tercero tomador");
			tercero0.setSexo("1");
			tercero0.setVinculacion(1);
			tercero0.setCodVinculacion(1);
			tercero0.setFechaNacimiento(new Date());
			tercero0.setTipoPersona("2");
			terceros[0] = tercero0;	
		Tercero tercero1 = new Tercero();
			tercero1.setCodigo(90102002);
			tercero1.setNombre("Tercero asegurado");
			tercero1.setSexo("1");
			tercero1.setVinculacion(1);
			tercero1.setCodVinculacion(2);
			tercero1.setFechaNacimiento(new Date());
			tercero1.setTipoPersona("2");
			terceros[1] = tercero1;
		Tercero tercero2 = new Tercero();
			tercero2.setCodigo(90102003);
			tercero2.setNombre("Tercero beneficiario");
			tercero2.setSexo("1");
			tercero2.setVinculacion(1);
			tercero2.setCodVinculacion(3);
			tercero2.setFechaNacimiento(new Date());
			tercero2.setTipoPersona("2");
			terceros[2] = tercero2;	
		Tercero tercero3 = new Tercero();
			tercero3.setCodigo(90102004);
			tercero3.setNombre("Tercero agente");
			tercero3.setSexo("1");
			tercero3.setVinculacion(1);
			tercero3.setCodVinculacion(4);
			tercero3.setFechaNacimiento(new Date());
			tercero3.setTipoPersona("2");
			terceros[3] = tercero3;				
		Detalle[] detalles = new Detalle[10];
			Detalle detalle1 = new Detalle();
				detalle1.setCoddet("108");	
				detalle1.setValnumber(new Float(0.1));
				detalle1.setValdate(new Date());
				detalle1.setValstring("11001");
				detalles[0] = detalle1;
			Detalle detalle2 = new Detalle();
				detalle2.setCoddet("00000120");	
				detalle2.setValnumber(new Float(0.1));				
				detalle2.setValdate(new Date());
				detalle2.setValstring("03201220");
				detalles[1] = detalle2;
			Detalle detalle3 = new Detalle();
				detalle3.setCoddet("01020097");	
				detalle3.setValnumber(new Float(0.1));				
				detalle3.setValdate(new Date());
				detalle3.setValstring("PRB314");
				detalles[2] = detalle3;
			Detalle detalle4 = new Detalle();
				detalle4.setCoddet("FALA0034");	
				detalle4.setValdate(new Date());
				detalle4.setValnumber(new Float(0.1));								
				detalle4.setValstring("7211412");
				detalles[3] = detalle4;
			Detalle detalle5 = new Detalle();
				detalle5.setCoddet("01010120");	
				detalle5.setValnumber(21215472);				
				detalle5.setValdate(new Date());
				detalle5.setValstring("21215472");
				detalles[4] = detalle5;					
			Detalle detalle6 = new Detalle();
				detalle6.setCoddet("COM0002");	
				detalle6.setValnumber(new Float(0.1));
				detalle6.setValdate(new Date());
				detalle6.setValstring("11001");
				detalles[5] = detalle6;			
			Detalle detalle7 = new Detalle();
				detalle7.setCoddet("00000060");	
				detalle7.setValnumber(new Float(0.1));
				detalle7.setValdate(new Date());
				detalle7.setValstring("11001");
				detalles[6] = detalle7;			
			Detalle detalle8 = new Detalle();
				detalle8.setCoddet("01010005");	
				detalle8.setValnumber(new Float(0.1));
				detalle8.setValdate(new Date());
				detalle8.setValstring("11001");
				detalles[7] = detalle8;		
			Detalle detalle9 = new Detalle();
				detalle9.setCoddet("00000109");	
				detalle9.setValnumber(new Float(0.1));
				detalle9.setValdate(new Date());
				detalle9.setValstring("11001");
				detalles[8] = detalle9;			
			Detalle detalle10 = new Detalle();
				detalle10.setCoddet("01010052");	
				detalle10.setValnumber(new Float(0.1));
				detalle10.setValdate(new Date());
				detalle10.setValstring("11001");
				detalles[9] = detalle10;			
			
		CrearCotizacion crearCotizacion = new CrearCotizacion();
		crearCotizacion.setComp("1");
		crearCotizacion.setSucur("100001");
		crearCotizacion.setFecini(new Date("2016/09/26"));
		crearCotizacion.setFecter(new Date("2017/09/25"));
		crearCotizacion.setComision(new Float(25.5));
		crearCotizacion.setVaseg(new Float(500000000));
		crearCotizacion.setParametroCotizacion(parametroCotizacion);
		crearCotizacion.setProducto(productos);
		crearCotizacion.setTercero(terceros);
		crearCotizacion.setDetalle(detalles);
		
		CrearCotizacionResponse crearCotizacionResponse = srvPolizaSkeleton.crearCotizacion(crearCotizacion);
		
		System.out.println(
				">>>>>>>>>  Codigo TX: " + crearCotizacionResponse.getContextoRespuesta().getCodigoTx()
				);
		
	}
	
	*//**
	 * 
	 * @throws RemoteException
	 *//*
	public static void validarCotizacion () throws RemoteException {
		SrvPolizaSkeleton srvPolizaSkeleton = new SrvPolizaSkeleton();
		
		ValidarCotizacion validarCotizacion = new ValidarCotizacion();
		validarCotizacion.setSucur("100001");
		validarCotizacion.setCertif("AA007647");
		validarCotizacion.setCodpla("011704");
		validarCotizacion.setOrden(1);
		
		ValidarCotizacionResponse validarCotizacionResponse = srvPolizaSkeleton.validarCotizacion(validarCotizacion);
		System.out.println(
				">>>>>>>>>  Codigo TX: " + validarCotizacionResponse.getContextoRespuesta().getCodigoTx() + 
				"\n >>>>>>>>> FechaTx: " + validarCotizacionResponse.getContextoRespuesta().getFechaTx()
				);
		
	}
	
	*//**
	 * 
	 * @throws RemoteException
	 *//*
	public static void consultarPoliza () throws RemoteException {
		SrvPolizaSkeleton srvPolizaSkeleton = new SrvPolizaSkeleton();
		
		ConsultarPoliza consultarPoliza = new ConsultarPoliza();
		consultarPoliza.setSucur("");
		consultarPoliza.setCertif("AA105795");
		consultarPoliza.setCodpla("011701");
		consultarPoliza.setOrden(1);
		
		ConsultarPolizaResponse validarCotizacionResponse = srvPolizaSkeleton.consultarPoliza(consultarPoliza);
		System.out.println(
				">>>>>>>>>  Codigo TX: " + validarCotizacionResponse.getContextoRespuesta().getCodigoTx() + 
				"\n >>>>>>>>> FechaTx: " + validarCotizacionResponse.getContextoRespuesta().getFechaTx()
				);
		
	}
	
	*//**
	 * 
	 * @throws RemoteException
	 *//*
	public static void buscarPolizas () throws RemoteException {
		SrvPolizaSkeleton srvPolizaSkeleton = new SrvPolizaSkeleton();
		
		BuscarPolizas buscarPolizas = new BuscarPolizas();
		buscarPolizas.setAsegurado("");
		buscarPolizas.setSucur("");
		buscarPolizas.setPoliza("");
		buscarPolizas.setCertif("");
		buscarPolizas.setCodpla("011703");			
		
		BuscarPolizasResponse buscarPolizasResponse = srvPolizaSkeleton.buscarPolizas(buscarPolizas);
		System.out.println(
				">>>>>>>>>  Codigo TX: " + buscarPolizasResponse.getContextoRespuesta().getCodigoTx() + 
				"\n >>>>>>>>> FechaTx: " + buscarPolizasResponse.getContextoRespuesta().getFechaTx()
				);
	}
	
	*//**
	 * 
	 * @throws RemoteException
	 *//*
	public static void emitirPoliza () throws RemoteException {
		SrvPolizaSkeleton srvPolizaSkeleton = new SrvPolizaSkeleton();
		
		EmitirPoliza emitirPoliza = new EmitirPoliza();
		emitirPoliza.setSucur("100001");
		emitirPoliza.setCodpla("011704");
		emitirPoliza.setCotizacion("AA007550");
		emitirPoliza.setOrden(1);
		
		EmitirPolizaResponse emitirPolizaResponse = srvPolizaSkeleton.emitirPoliza(emitirPoliza);
		System.out.println(
				">>>>>>>>>  Codigo TX: " + emitirPolizaResponse.getContextoRespuesta().getCodigoTx() + 
				"\n >>>>>>>>> FechaTx: " + emitirPolizaResponse.getContextoRespuesta().getFechaTx()
				);
		
	}
	
	*//**
	 * 
	 * @throws RemoteException
	 *//*
	@SuppressWarnings("deprecation")
	public static void cancelarCertificado () throws RemoteException {
		SrvPolizaSkeleton srvPolizaSkeleton = new SrvPolizaSkeleton();
		
		CancelarCertificado cancelarCertificado = new CancelarCertificado();
		cancelarCertificado.setSucur("100005");
		cancelarCertificado.setPoliza("AA033168");
		cancelarCertificado.setCertif("AA105795");
		cancelarCertificado.setCodpla("011701");
		cancelarCertificado.setFechaCancelacion(new Date("2017/03/19"));
		cancelarCertificado.setCausa("prueba");
		
		CancelarCertificadoResponse cancelarCertificadoResponse = srvPolizaSkeleton.cancelarCertificado(cancelarCertificado);
		System.out.println(
				">>>>>>>>>  Codigo TX: " + cancelarCertificadoResponse.getContextoRespuesta().getCodigoTx() + 
				"\n >>>>>>>>> FechaTx: " + cancelarCertificadoResponse.getContextoRespuesta().getFechaTx()
				);
		
	}
	
	*//**
	 * 
	 * @throws RemoteException
	 *//*
	public static void anularCertificado () throws RemoteException {
		SrvPolizaSkeleton srvPolizaSkeleton = new SrvPolizaSkeleton();
		
		AnularCertificado anularCertificado = new AnularCertificado();
		anularCertificado.setSucur("100001");
		anularCertificado.setPoliza("AA033168");
		anularCertificado.setCertif("AA105795");
		anularCertificado.setCodpla("011701");
		
		AnularCertificadoResponse anularCertificadoResponse = srvPolizaSkeleton.anularCertificado(anularCertificado);
		System.out.println(
				">>>>>>>>>  Codigo TX: " + anularCertificadoResponse.getContextoRespuesta().getCodigoTx() + 
				"\n >>>>>>>>> FechaTx: " + anularCertificadoResponse.getContextoRespuesta().getFechaTx()
				);
		
	}
	
	*//**
	 * 
	 * @throws RemoteException
	 *//*
	public static void actualizarCotizacion () throws RemoteException {
		SrvPolizaSkeleton srvPolizaSkeleton = new SrvPolizaSkeleton();
			
		Detalle[] detalles = new Detalle[1];
			Detalle detalle1 = new Detalle();
				detalle1.setCoddet("FALA0009");	
				detalle1.setValnumber(new Float(100.1));
				detalle1.setValdate(new Date());
				detalle1.setValstring("NEW_VAL");
				detalles[0] = detalle1;	
		
		ActualizarCotizacion actualizarCotizacion = new ActualizarCotizacion();
		actualizarCotizacion.setSucur("100001");
		actualizarCotizacion.setCodpla("011703");
		actualizarCotizacion.setCertif("AA008042");
		actualizarCotizacion.setOrden(1);
		actualizarCotizacion.setDetalle(detalles);
		
		
		ActualizarCotizacionResponse actualizarCotizacionResponse = srvPolizaSkeleton.actualizarCotizacion(actualizarCotizacion);
		System.out.println(
				">>>>>>>>>  Codigo TX: " + actualizarCotizacionResponse.getContextoRespuesta().getCodigoTx() + 
				"\n >>>>>>>>> FechaTx: " + actualizarCotizacionResponse.getContextoRespuesta().getFechaTx()
				);
		
	}*/
}
