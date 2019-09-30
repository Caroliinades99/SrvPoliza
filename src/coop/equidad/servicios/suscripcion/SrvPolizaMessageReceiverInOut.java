
/**
 * SrvPolizaMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:08:57 BST)
 */
        package coop.equidad.servicios.suscripcion;

import java.io.StringWriter;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;
import javax.xml.soap.SOAPMessage;

import org.apache.axis2.context.MessageContext;
import org.apache.axis2.jaxws.handler.SoapMessageContext;
import org.apache.commons.io.IOUtils;

import coop.equidad.log.LogParallel;
import coop.equidad.model.dao.TokenDao;
import coop.equidad.web.entity.LogSuscripcion;

/**
        *  SrvPolizaMessageReceiverInOut message receiver
        */

        public class SrvPolizaMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{
        	
        try {
        	
        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);
        
        SrvPolizaSkeletonInterface skel = (SrvPolizaSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }
       
        msgContext.getEnvelope().getBody().getFirstElement();
        HttpServletRequest objetin =(HttpServletRequest)msgContext.getProperty("transport.http.servletRequest");
        try {
        	Thread t= new Thread(new LogParallel(msgContext.getEnvelope().getBody().getFirstElement().toString()));
			t.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        String token=objetin.getParameter("token");
        
        StringTokenizer separador= new StringTokenizer(objetin.getRequestURI(), "/"); 
        
        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){

            if("cancelarCertificado".equals(methodName)){
                
                coop.equidad.servicios.suscripcion.CancelarCertificadoResponse cancelarCertificadoResponse49 = null;
	                        coop.equidad.servicios.suscripcion.CancelarCertificado wrappedParam =
                                                             (coop.equidad.servicios.suscripcion.CancelarCertificado)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    coop.equidad.servicios.suscripcion.CancelarCertificado.class);
                                                
                                               cancelarCertificadoResponse49 =
                                                   
                                                   
                                                         skel.cancelarCertificado(wrappedParam, token)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), cancelarCertificadoResponse49, false,
                                                    new javax.xml.namespace.QName("http://www.example.org/SrvPoliza/", "cancelarCertificadoResponse"));
                                    } else 

            if("consultarPoliza".equals(methodName)){
                
                coop.equidad.servicios.suscripcion.ConsultarPolizaResponse consultarPolizaResponse51 = null;
	                        coop.equidad.servicios.suscripcion.ConsultarPoliza wrappedParam =
                                                             (coop.equidad.servicios.suscripcion.ConsultarPoliza)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    coop.equidad.servicios.suscripcion.ConsultarPoliza.class);
                                                
                                               consultarPolizaResponse51 =
                                                   
                                                   
                                                         skel.consultarPoliza(wrappedParam, token)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), consultarPolizaResponse51, false,
                                                    new javax.xml.namespace.QName("http://www.example.org/SrvPoliza/", "consultarPolizaResponse"));
                                    } else 

            if("buscarPolizas".equals(methodName)){
                
                coop.equidad.servicios.suscripcion.BuscarPolizasResponse buscarPolizasResponse53 = null;
	                        coop.equidad.servicios.suscripcion.BuscarPolizas wrappedParam =
                                                             (coop.equidad.servicios.suscripcion.BuscarPolizas)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    coop.equidad.servicios.suscripcion.BuscarPolizas.class);
                                                
                                               buscarPolizasResponse53 =
                                                   
                                                   
                                                         skel.buscarPolizas(wrappedParam, token)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), buscarPolizasResponse53, false,
                                                    new javax.xml.namespace.QName("http://www.example.org/SrvPoliza/", "buscarPolizasResponse"));
                                    } else 

            if("emitirPoliza".equals(methodName)){
                
                coop.equidad.servicios.suscripcion.EmitirPolizaResponse emitirPolizaResponse55 = null;
	                        coop.equidad.servicios.suscripcion.EmitirPoliza wrappedParam =
                                                             (coop.equidad.servicios.suscripcion.EmitirPoliza)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    coop.equidad.servicios.suscripcion.EmitirPoliza.class);
                                                
                                               emitirPolizaResponse55 =
                                                   
                                                   
                                                         skel.emitirPoliza(wrappedParam, token)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), emitirPolizaResponse55, false,
                                                    new javax.xml.namespace.QName("http://www.example.org/SrvPoliza/", "emitirPolizaResponse"));
                                    } else 

            if("crearCotizacion".equals(methodName)){
                
                coop.equidad.servicios.suscripcion.CrearCotizacionResponse crearCotizacionResponse57 = null;
	                        coop.equidad.servicios.suscripcion.CrearCotizacion wrappedParam =
                                                             (coop.equidad.servicios.suscripcion.CrearCotizacion)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    coop.equidad.servicios.suscripcion.CrearCotizacion.class);
                                                
                                               
                                       		
											crearCotizacionResponse57 =
                                                   
                                            		    
                                                         skel.crearCotizacion(wrappedParam, token)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), crearCotizacionResponse57, false,
                                                    new javax.xml.namespace.QName("http://www.example.org/SrvPoliza/", "crearCotizacionResponse"));
                                    } else 

            if("anularCertificado".equals(methodName)){
                
                coop.equidad.servicios.suscripcion.AnularCertificadoResponse anularCertificadoResponse59 = null;
	                        coop.equidad.servicios.suscripcion.AnularCertificado wrappedParam =
                                                             (coop.equidad.servicios.suscripcion.AnularCertificado)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    coop.equidad.servicios.suscripcion.AnularCertificado.class);
                                                
                                               anularCertificadoResponse59 =
                                                   
                                                   
                                                         skel.anularCertificado(wrappedParam, token)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), anularCertificadoResponse59, false,
                                                    new javax.xml.namespace.QName("http://www.example.org/SrvPoliza/", "anularCertificadoResponse"));
                                    } else 

            if("validarCotizacion".equals(methodName)){
                
                coop.equidad.servicios.suscripcion.ValidarCotizacionResponse validarCotizacionResponse61 = null;
	                        coop.equidad.servicios.suscripcion.ValidarCotizacion wrappedParam =
                                                             (coop.equidad.servicios.suscripcion.ValidarCotizacion)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    coop.equidad.servicios.suscripcion.ValidarCotizacion.class);
                                                
                                               validarCotizacionResponse61 =
                                                   
                                                   
                                                         skel.validarCotizacion(wrappedParam, token)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), validarCotizacionResponse61, false,
                                                    new javax.xml.namespace.QName("http://www.example.org/SrvPoliza/", "validarCotizacionResponse"));
                                    } else 

            if("actualizarCotizacion".equals(methodName)){
                
                coop.equidad.servicios.suscripcion.ActualizarCotizacionResponse actualizarCotizacionResponse63 = null;
	                        coop.equidad.servicios.suscripcion.ActualizarCotizacion wrappedParam =
                                                             (coop.equidad.servicios.suscripcion.ActualizarCotizacion)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    coop.equidad.servicios.suscripcion.ActualizarCotizacion.class);
                                                
                                               actualizarCotizacionResponse63 =
                                                   
                                                   
                                                         skel.actualizarCotizacion(wrappedParam, token)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), actualizarCotizacionResponse63, false,
                                                    new javax.xml.namespace.QName("http://www.example.org/SrvPoliza/", "actualizarCotizacionResponse"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        
       
        //
            private  org.apache.axiom.om.OMElement  toOM(coop.equidad.servicios.suscripcion.CancelarCertificado param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(coop.equidad.servicios.suscripcion.CancelarCertificado.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(coop.equidad.servicios.suscripcion.CancelarCertificadoResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(coop.equidad.servicios.suscripcion.CancelarCertificadoResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(coop.equidad.servicios.suscripcion.ConsultarPoliza param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(coop.equidad.servicios.suscripcion.ConsultarPoliza.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(coop.equidad.servicios.suscripcion.ConsultarPolizaResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(coop.equidad.servicios.suscripcion.ConsultarPolizaResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(coop.equidad.servicios.suscripcion.BuscarPolizas param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(coop.equidad.servicios.suscripcion.BuscarPolizas.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(coop.equidad.servicios.suscripcion.BuscarPolizasResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(coop.equidad.servicios.suscripcion.BuscarPolizasResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(coop.equidad.servicios.suscripcion.EmitirPoliza param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(coop.equidad.servicios.suscripcion.EmitirPoliza.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(coop.equidad.servicios.suscripcion.EmitirPolizaResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(coop.equidad.servicios.suscripcion.EmitirPolizaResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(coop.equidad.servicios.suscripcion.CrearCotizacion param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(coop.equidad.servicios.suscripcion.CrearCotizacion.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(coop.equidad.servicios.suscripcion.CrearCotizacionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(coop.equidad.servicios.suscripcion.CrearCotizacionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(coop.equidad.servicios.suscripcion.AnularCertificado param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(coop.equidad.servicios.suscripcion.AnularCertificado.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(coop.equidad.servicios.suscripcion.AnularCertificadoResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(coop.equidad.servicios.suscripcion.AnularCertificadoResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(coop.equidad.servicios.suscripcion.ValidarCotizacion param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(coop.equidad.servicios.suscripcion.ValidarCotizacion.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(coop.equidad.servicios.suscripcion.ValidarCotizacionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(coop.equidad.servicios.suscripcion.ValidarCotizacionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(coop.equidad.servicios.suscripcion.ActualizarCotizacion param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(coop.equidad.servicios.suscripcion.ActualizarCotizacion.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(coop.equidad.servicios.suscripcion.ActualizarCotizacionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(coop.equidad.servicios.suscripcion.ActualizarCotizacionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, coop.equidad.servicios.suscripcion.CancelarCertificadoResponse param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(coop.equidad.servicios.suscripcion.CancelarCertificadoResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private coop.equidad.servicios.suscripcion.CancelarCertificadoResponse wrapcancelarCertificado(){
                                coop.equidad.servicios.suscripcion.CancelarCertificadoResponse wrappedElement = new coop.equidad.servicios.suscripcion.CancelarCertificadoResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, coop.equidad.servicios.suscripcion.ConsultarPolizaResponse param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(coop.equidad.servicios.suscripcion.ConsultarPolizaResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private coop.equidad.servicios.suscripcion.ConsultarPolizaResponse wrapconsultarPoliza(){
                                coop.equidad.servicios.suscripcion.ConsultarPolizaResponse wrappedElement = new coop.equidad.servicios.suscripcion.ConsultarPolizaResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, coop.equidad.servicios.suscripcion.BuscarPolizasResponse param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(coop.equidad.servicios.suscripcion.BuscarPolizasResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private coop.equidad.servicios.suscripcion.BuscarPolizasResponse wrapbuscarPolizas(){
                                coop.equidad.servicios.suscripcion.BuscarPolizasResponse wrappedElement = new coop.equidad.servicios.suscripcion.BuscarPolizasResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, coop.equidad.servicios.suscripcion.EmitirPolizaResponse param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(coop.equidad.servicios.suscripcion.EmitirPolizaResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private coop.equidad.servicios.suscripcion.EmitirPolizaResponse wrapemitirPoliza(){
                                coop.equidad.servicios.suscripcion.EmitirPolizaResponse wrappedElement = new coop.equidad.servicios.suscripcion.EmitirPolizaResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, coop.equidad.servicios.suscripcion.CrearCotizacionResponse param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(coop.equidad.servicios.suscripcion.CrearCotizacionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private coop.equidad.servicios.suscripcion.CrearCotizacionResponse wrapcrearCotizacion(){
                                coop.equidad.servicios.suscripcion.CrearCotizacionResponse wrappedElement = new coop.equidad.servicios.suscripcion.CrearCotizacionResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, coop.equidad.servicios.suscripcion.AnularCertificadoResponse param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(coop.equidad.servicios.suscripcion.AnularCertificadoResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private coop.equidad.servicios.suscripcion.AnularCertificadoResponse wrapanularCertificado(){
                                coop.equidad.servicios.suscripcion.AnularCertificadoResponse wrappedElement = new coop.equidad.servicios.suscripcion.AnularCertificadoResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, coop.equidad.servicios.suscripcion.ValidarCotizacionResponse param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(coop.equidad.servicios.suscripcion.ValidarCotizacionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private coop.equidad.servicios.suscripcion.ValidarCotizacionResponse wrapvalidarCotizacion(){
                                coop.equidad.servicios.suscripcion.ValidarCotizacionResponse wrappedElement = new coop.equidad.servicios.suscripcion.ValidarCotizacionResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, coop.equidad.servicios.suscripcion.ActualizarCotizacionResponse param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(coop.equidad.servicios.suscripcion.ActualizarCotizacionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private coop.equidad.servicios.suscripcion.ActualizarCotizacionResponse wrapactualizarCotizacion(){
                                coop.equidad.servicios.suscripcion.ActualizarCotizacionResponse wrappedElement = new coop.equidad.servicios.suscripcion.ActualizarCotizacionResponse();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type) throws org.apache.axis2.AxisFault{

        try {
        
                if (coop.equidad.servicios.suscripcion.ActualizarCotizacion.class.equals(type)){
                
                        return coop.equidad.servicios.suscripcion.ActualizarCotizacion.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (coop.equidad.servicios.suscripcion.ActualizarCotizacionResponse.class.equals(type)){
                
                        return coop.equidad.servicios.suscripcion.ActualizarCotizacionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (coop.equidad.servicios.suscripcion.AnularCertificado.class.equals(type)){
                
                        return coop.equidad.servicios.suscripcion.AnularCertificado.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (coop.equidad.servicios.suscripcion.AnularCertificadoResponse.class.equals(type)){
                
                        return coop.equidad.servicios.suscripcion.AnularCertificadoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (coop.equidad.servicios.suscripcion.BuscarPolizas.class.equals(type)){
                
                        return coop.equidad.servicios.suscripcion.BuscarPolizas.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (coop.equidad.servicios.suscripcion.BuscarPolizasResponse.class.equals(type)){
                
                        return coop.equidad.servicios.suscripcion.BuscarPolizasResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (coop.equidad.servicios.suscripcion.CancelarCertificado.class.equals(type)){
                
                        return coop.equidad.servicios.suscripcion.CancelarCertificado.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (coop.equidad.servicios.suscripcion.CancelarCertificadoResponse.class.equals(type)){
                
                        return coop.equidad.servicios.suscripcion.CancelarCertificadoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (coop.equidad.servicios.suscripcion.ConsultarPoliza.class.equals(type)){
                
                        return coop.equidad.servicios.suscripcion.ConsultarPoliza.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (coop.equidad.servicios.suscripcion.ConsultarPolizaResponse.class.equals(type)){
                
                        return coop.equidad.servicios.suscripcion.ConsultarPolizaResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (coop.equidad.servicios.suscripcion.CrearCotizacion.class.equals(type)){
                
                        return coop.equidad.servicios.suscripcion.CrearCotizacion.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (coop.equidad.servicios.suscripcion.CrearCotizacionResponse.class.equals(type)){
                
                        return coop.equidad.servicios.suscripcion.CrearCotizacionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (coop.equidad.servicios.suscripcion.EmitirPoliza.class.equals(type)){
                
                        return coop.equidad.servicios.suscripcion.EmitirPoliza.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (coop.equidad.servicios.suscripcion.EmitirPolizaResponse.class.equals(type)){
                
                        return coop.equidad.servicios.suscripcion.EmitirPolizaResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (coop.equidad.servicios.suscripcion.ValidarCotizacion.class.equals(type)){
                
                        return coop.equidad.servicios.suscripcion.ValidarCotizacion.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (coop.equidad.servicios.suscripcion.ValidarCotizacionResponse.class.equals(type)){
                
                        return coop.equidad.servicios.suscripcion.ValidarCotizacionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    