
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:09:26 BST)
 */

        
            package coop.equidad.servicios.suscripcion;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://www.example.org/SrvPoliza/".equals(namespaceURI) &&
                  "ContextoRespuesta".equals(typeName)){
                   
                            return  coop.equidad.servicios.suscripcion.ContextoRespuesta.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/SrvPoliza/".equals(namespaceURI) &&
                  "Tercero".equals(typeName)){
                   
                            return  coop.equidad.servicios.suscripcion.Tercero.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/SrvPoliza/".equals(namespaceURI) &&
                  "CuentaCorriente".equals(typeName)){
                   
                            return  coop.equidad.servicios.suscripcion.CuentaCorriente.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/SrvPoliza/".equals(namespaceURI) &&
                  "ResultadoPoliza".equals(typeName)){
                   
                            return  coop.equidad.servicios.suscripcion.ResultadoPoliza.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/SrvPoliza/".equals(namespaceURI) &&
                  "Poliza".equals(typeName)){
                   
                            return  coop.equidad.servicios.suscripcion.Poliza.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/SrvPoliza/".equals(namespaceURI) &&
                  "Reaseguro".equals(typeName)){
                   
                            return  coop.equidad.servicios.suscripcion.Reaseguro.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/SrvPoliza/".equals(namespaceURI) &&
                  "Cobertura".equals(typeName)){
                   
                            return  coop.equidad.servicios.suscripcion.Cobertura.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/SrvPoliza/".equals(namespaceURI) &&
                  "ParametroCotizacion".equals(typeName)){
                   
                            return  coop.equidad.servicios.suscripcion.ParametroCotizacion.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/SrvPoliza/".equals(namespaceURI) &&
                  "Error".equals(typeName)){
                   
                            return  coop.equidad.servicios.suscripcion.Error.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/SrvPoliza/".equals(namespaceURI) &&
                  "Detalle".equals(typeName)){
                   
                            return  coop.equidad.servicios.suscripcion.Detalle.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/SrvPoliza/".equals(namespaceURI) &&
                  "Producto".equals(typeName)){
                   
                            return  coop.equidad.servicios.suscripcion.Producto.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/SrvPoliza/".equals(namespaceURI) &&
                  "CuentaCorrienteDetalle".equals(typeName)){
                   
                            return  coop.equidad.servicios.suscripcion.CuentaCorrienteDetalle.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    