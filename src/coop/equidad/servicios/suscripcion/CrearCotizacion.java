
/**
 * CrearCotizacion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:09:26 BST)
 */

            
                package coop.equidad.servicios.suscripcion;
            

            /**
            *  CrearCotizacion bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class CrearCotizacion
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.example.org/SrvPoliza/",
                "crearCotizacion",
                "ns1");

            

                        /**
                        * field for Comp
                        */

                        
                                    protected java.lang.String localComp ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCompTracker = false ;

                           public boolean isCompSpecified(){
                               return localCompTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getComp(){
                               return localComp;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Comp
                               */
                               public void setComp(java.lang.String param){
                            localCompTracker = param != null;
                                   
                                            this.localComp=param;
                                       

                               }
                            

                        /**
                        * field for Sucur
                        */

                        
                                    protected java.lang.String localSucur ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSucurTracker = false ;

                           public boolean isSucurSpecified(){
                               return localSucurTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSucur(){
                               return localSucur;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Sucur
                               */
                               public void setSucur(java.lang.String param){
                            localSucurTracker = param != null;
                                   
                                            this.localSucur=param;
                                       

                               }
                            

                        /**
                        * field for Fecini
                        */

                        
                                    protected java.util.Date localFecini ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFeciniTracker = false ;

                           public boolean isFeciniSpecified(){
                               return localFeciniTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getFecini(){
                               return localFecini;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Fecini
                               */
                               public void setFecini(java.util.Date param){
                            localFeciniTracker = param != null;
                                   
                                            this.localFecini=param;
                                       

                               }
                            

                        /**
                        * field for Fecter
                        */

                        
                                    protected java.util.Date localFecter ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFecterTracker = false ;

                           public boolean isFecterSpecified(){
                               return localFecterTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getFecter(){
                               return localFecter;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Fecter
                               */
                               public void setFecter(java.util.Date param){
                            localFecterTracker = param != null;
                                   
                                            this.localFecter=param;
                                       

                               }
                            

                        /**
                        * field for Comision
                        */

                        
                                    protected float localComision ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localComisionTracker = false ;

                           public boolean isComisionSpecified(){
                               return localComisionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getComision(){
                               return localComision;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Comision
                               */
                               public void setComision(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localComisionTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localComision=param;
                                       

                               }
                            

                        /**
                        * field for Vaseg
                        */

                        
                                    protected float localVaseg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localVasegTracker = false ;

                           public boolean isVasegSpecified(){
                               return localVasegTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getVaseg(){
                               return localVaseg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Vaseg
                               */
                               public void setVaseg(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localVasegTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localVaseg=param;
                                       

                               }
                            

                        /**
                        * field for Producto
                        * This was an Array!
                        */

                        
                                    protected coop.equidad.servicios.suscripcion.Producto[] localProducto ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProductoTracker = false ;

                           public boolean isProductoSpecified(){
                               return localProductoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return coop.equidad.servicios.suscripcion.Producto[]
                           */
                           public  coop.equidad.servicios.suscripcion.Producto[] getProducto(){
                               return localProducto;
                           }

                           
                        


                               
                              /**
                               * validate the array for Producto
                               */
                              protected void validateProducto(coop.equidad.servicios.suscripcion.Producto[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Producto
                              */
                              public void setProducto(coop.equidad.servicios.suscripcion.Producto[] param){
                              
                                   validateProducto(param);

                               localProductoTracker = param != null;
                                      
                                      this.localProducto=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param coop.equidad.servicios.suscripcion.Producto
                             */
                             public void addProducto(coop.equidad.servicios.suscripcion.Producto param){
                                   if (localProducto == null){
                                   localProducto = new coop.equidad.servicios.suscripcion.Producto[]{};
                                   }

                            
                                 //update the setting tracker
                                localProductoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localProducto);
                               list.add(param);
                               this.localProducto =
                             (coop.equidad.servicios.suscripcion.Producto[])list.toArray(
                            new coop.equidad.servicios.suscripcion.Producto[list.size()]);

                             }
                             

                        /**
                        * field for ParametroCotizacion
                        */

                        
                                    protected coop.equidad.servicios.suscripcion.ParametroCotizacion localParametroCotizacion ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localParametroCotizacionTracker = false ;

                           public boolean isParametroCotizacionSpecified(){
                               return localParametroCotizacionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return coop.equidad.servicios.suscripcion.ParametroCotizacion
                           */
                           public  coop.equidad.servicios.suscripcion.ParametroCotizacion getParametroCotizacion(){
                               return localParametroCotizacion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ParametroCotizacion
                               */
                               public void setParametroCotizacion(coop.equidad.servicios.suscripcion.ParametroCotizacion param){
                            localParametroCotizacionTracker = param != null;
                                   
                                            this.localParametroCotizacion=param;
                                       

                               }
                            

                        /**
                        * field for Tercero
                        * This was an Array!
                        */

                        
                                    protected coop.equidad.servicios.suscripcion.Tercero[] localTercero ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTerceroTracker = false ;

                           public boolean isTerceroSpecified(){
                               return localTerceroTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return coop.equidad.servicios.suscripcion.Tercero[]
                           */
                           public  coop.equidad.servicios.suscripcion.Tercero[] getTercero(){
                               return localTercero;
                           }

                           
                        


                               
                              /**
                               * validate the array for Tercero
                               */
                              protected void validateTercero(coop.equidad.servicios.suscripcion.Tercero[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Tercero
                              */
                              public void setTercero(coop.equidad.servicios.suscripcion.Tercero[] param){
                              
                                   validateTercero(param);

                               localTerceroTracker = param != null;
                                      
                                      this.localTercero=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param coop.equidad.servicios.suscripcion.Tercero
                             */
                             public void addTercero(coop.equidad.servicios.suscripcion.Tercero param){
                                   if (localTercero == null){
                                   localTercero = new coop.equidad.servicios.suscripcion.Tercero[]{};
                                   }

                            
                                 //update the setting tracker
                                localTerceroTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localTercero);
                               list.add(param);
                               this.localTercero =
                             (coop.equidad.servicios.suscripcion.Tercero[])list.toArray(
                            new coop.equidad.servicios.suscripcion.Tercero[list.size()]);

                             }
                             

                        /**
                        * field for Detalle
                        * This was an Array!
                        */

                        
                                    protected coop.equidad.servicios.suscripcion.Detalle[] localDetalle ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDetalleTracker = false ;

                           public boolean isDetalleSpecified(){
                               return localDetalleTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return coop.equidad.servicios.suscripcion.Detalle[]
                           */
                           public  coop.equidad.servicios.suscripcion.Detalle[] getDetalle(){
                               return localDetalle;
                           }

                           
                        


                               
                              /**
                               * validate the array for Detalle
                               */
                              protected void validateDetalle(coop.equidad.servicios.suscripcion.Detalle[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Detalle
                              */
                              public void setDetalle(coop.equidad.servicios.suscripcion.Detalle[] param){
                              
                                   validateDetalle(param);

                               localDetalleTracker = param != null;
                                      
                                      this.localDetalle=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param coop.equidad.servicios.suscripcion.Detalle
                             */
                             public void addDetalle(coop.equidad.servicios.suscripcion.Detalle param){
                                   if (localDetalle == null){
                                   localDetalle = new coop.equidad.servicios.suscripcion.Detalle[]{};
                                   }

                            
                                 //update the setting tracker
                                localDetalleTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localDetalle);
                               list.add(param);
                               this.localDetalle =
                             (coop.equidad.servicios.suscripcion.Detalle[])list.toArray(
                            new coop.equidad.servicios.suscripcion.Detalle[list.size()]);

                             }
                             

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME));
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.example.org/SrvPoliza/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":crearCotizacion",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "crearCotizacion",
                           xmlWriter);
                   }

               
                   }
                if (localCompTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "comp", xmlWriter);
                             

                                          if (localComp==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("comp cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localComp);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSucurTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "sucur", xmlWriter);
                             

                                          if (localSucur==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("sucur cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSucur);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFeciniTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "fecini", xmlWriter);
                             

                                          if (localFecini==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("fecini cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFecini));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFecterTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "fecter", xmlWriter);
                             

                                          if (localFecter==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("fecter cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFecter));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localComisionTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "comision", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localComision)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("comision cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localComision));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localVasegTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "vaseg", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localVaseg)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("vaseg cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVaseg));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localProductoTracker){
                                       if (localProducto!=null){
                                            for (int i = 0;i < localProducto.length;i++){
                                                if (localProducto[i] != null){
                                                 localProducto[i].serialize(new javax.xml.namespace.QName("","producto"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("producto cannot be null!!");
                                        
                                    }
                                 } if (localParametroCotizacionTracker){
                                            if (localParametroCotizacion==null){
                                                 throw new org.apache.axis2.databinding.ADBException("parametroCotizacion cannot be null!!");
                                            }
                                           localParametroCotizacion.serialize(new javax.xml.namespace.QName("","parametroCotizacion"),
                                               xmlWriter);
                                        } if (localTerceroTracker){
                                       if (localTercero!=null){
                                            for (int i = 0;i < localTercero.length;i++){
                                                if (localTercero[i] != null){
                                                 localTercero[i].serialize(new javax.xml.namespace.QName("","tercero"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("tercero cannot be null!!");
                                        
                                    }
                                 } if (localDetalleTracker){
                                       if (localDetalle!=null){
                                            for (int i = 0;i < localDetalle.length;i++){
                                                if (localDetalle[i] != null){
                                                 localDetalle[i].serialize(new javax.xml.namespace.QName("","detalle"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("detalle cannot be null!!");
                                        
                                    }
                                 }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://www.example.org/SrvPoliza/")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace,attName,attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace,attName,attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace), namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{
        private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static CrearCotizacion parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            CrearCotizacion object =
                new CrearCotizacion();

            int event;
            javax.xml.namespace.QName currentQName = null;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                currentQName = reader.getName();
                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"crearCotizacion".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (CrearCotizacion)coop.equidad.servicios.suscripcion.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list7 = new java.util.ArrayList();
                    
                        java.util.ArrayList list9 = new java.util.ArrayList();
                    
                        java.util.ArrayList list10 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","comp").equals(reader.getName()) || new javax.xml.namespace.QName("","comp").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"comp" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setComp(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","sucur").equals(reader.getName()) || new javax.xml.namespace.QName("","sucur").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"sucur" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSucur(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","fecini").equals(reader.getName()) || new javax.xml.namespace.QName("","fecini").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"fecini" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFecini(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","fecter").equals(reader.getName()) || new javax.xml.namespace.QName("","fecter").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"fecter" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFecter(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","comision").equals(reader.getName()) || new javax.xml.namespace.QName("","comision").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"comision" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setComision(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setComision(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","vaseg").equals(reader.getName()) || new javax.xml.namespace.QName("","vaseg").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"vaseg" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setVaseg(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setVaseg(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","producto").equals(reader.getName()) || new javax.xml.namespace.QName("","producto").equals(reader.getName()) ){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                    list7.add(coop.equidad.servicios.suscripcion.Producto.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone7 = false;
                                                        while(!loopDone7){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone7 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("","producto").equals(reader.getName())){
                                                                    list7.add(coop.equidad.servicios.suscripcion.Producto.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone7 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setProducto((coop.equidad.servicios.suscripcion.Producto[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                coop.equidad.servicios.suscripcion.Producto.class,
                                                                list7));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","parametroCotizacion").equals(reader.getName()) || new javax.xml.namespace.QName("","parametroCotizacion").equals(reader.getName()) ){
                                
                                                object.setParametroCotizacion(coop.equidad.servicios.suscripcion.ParametroCotizacion.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","tercero").equals(reader.getName()) || new javax.xml.namespace.QName("","tercero").equals(reader.getName()) ){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                    list9.add(coop.equidad.servicios.suscripcion.Tercero.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone9 = false;
                                                        while(!loopDone9){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone9 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("","tercero").equals(reader.getName())){
                                                                    list9.add(coop.equidad.servicios.suscripcion.Tercero.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone9 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setTercero((coop.equidad.servicios.suscripcion.Tercero[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                coop.equidad.servicios.suscripcion.Tercero.class,
                                                                list9));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","detalle").equals(reader.getName()) || new javax.xml.namespace.QName("","detalle").equals(reader.getName()) ){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                    list10.add(coop.equidad.servicios.suscripcion.Detalle.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone10 = false;
                                                        while(!loopDone10){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone10 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("","detalle").equals(reader.getName())){
                                                                    list10.add(coop.equidad.servicios.suscripcion.Detalle.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone10 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setDetalle((coop.equidad.servicios.suscripcion.Detalle[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                coop.equidad.servicios.suscripcion.Detalle.class,
                                                                list10));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // 2 - A start element we are not expecting indicates a trailing invalid property
                                
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    