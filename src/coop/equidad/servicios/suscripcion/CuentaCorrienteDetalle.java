
/**
 * CuentaCorrienteDetalle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:09:26 BST)
 */

            
                package coop.equidad.servicios.suscripcion;
            

            /**
            *  CuentaCorrienteDetalle bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class CuentaCorrienteDetalle
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = CuentaCorrienteDetalle
                Namespace URI = http://www.example.org/SrvPoliza/
                Namespace Prefix = ns1
                */
            

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
                        * field for Person
                        */

                        
                                    protected java.lang.String localPerson ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPersonTracker = false ;

                           public boolean isPersonSpecified(){
                               return localPersonTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPerson(){
                               return localPerson;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Person
                               */
                               public void setPerson(java.lang.String param){
                            localPersonTracker = param != null;
                                   
                                            this.localPerson=param;
                                       

                               }
                            

                        /**
                        * field for Origen
                        */

                        
                                    protected int localOrigen ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOrigenTracker = false ;

                           public boolean isOrigenSpecified(){
                               return localOrigenTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getOrigen(){
                               return localOrigen;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Origen
                               */
                               public void setOrigen(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localOrigenTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localOrigen=param;
                                       

                               }
                            

                        /**
                        * field for Tipdoc
                        */

                        
                                    protected java.lang.String localTipdoc ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTipdocTracker = false ;

                           public boolean isTipdocSpecified(){
                               return localTipdocTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTipdoc(){
                               return localTipdoc;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Tipdoc
                               */
                               public void setTipdoc(java.lang.String param){
                            localTipdocTracker = param != null;
                                   
                                            this.localTipdoc=param;
                                       

                               }
                            

                        /**
                        * field for Numdoc
                        */

                        
                                    protected java.lang.String localNumdoc ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNumdocTracker = false ;

                           public boolean isNumdocSpecified(){
                               return localNumdocTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getNumdoc(){
                               return localNumdoc;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Numdoc
                               */
                               public void setNumdoc(java.lang.String param){
                            localNumdocTracker = param != null;
                                   
                                            this.localNumdoc=param;
                                       

                               }
                            

                        /**
                        * field for Nrocta
                        */

                        
                                    protected java.lang.String localNrocta ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNroctaTracker = false ;

                           public boolean isNroctaSpecified(){
                               return localNroctaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getNrocta(){
                               return localNrocta;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Nrocta
                               */
                               public void setNrocta(java.lang.String param){
                            localNroctaTracker = param != null;
                                   
                                            this.localNrocta=param;
                                       

                               }
                            

                        /**
                        * field for Tipval
                        */

                        
                                    protected int localTipval ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTipvalTracker = false ;

                           public boolean isTipvalSpecified(){
                               return localTipvalTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getTipval(){
                               return localTipval;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Tipval
                               */
                               public void setTipval(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localTipvalTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localTipval=param;
                                       

                               }
                            

                        /**
                        * field for Totdoc
                        */

                        
                                    protected float localTotdoc ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTotdocTracker = false ;

                           public boolean isTotdocSpecified(){
                               return localTotdocTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getTotdoc(){
                               return localTotdoc;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Totdoc
                               */
                               public void setTotdoc(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localTotdocTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localTotdoc=param;
                                       

                               }
                            

                        /**
                        * field for Totrec
                        */

                        
                                    protected float localTotrec ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTotrecTracker = false ;

                           public boolean isTotrecSpecified(){
                               return localTotrecTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getTotrec(){
                               return localTotrec;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Totrec
                               */
                               public void setTotrec(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localTotrecTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localTotrec=param;
                                       

                               }
                            

                        /**
                        * field for Sucrea
                        */

                        
                                    protected java.lang.String localSucrea ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSucreaTracker = false ;

                           public boolean isSucreaSpecified(){
                               return localSucreaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSucrea(){
                               return localSucrea;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Sucrea
                               */
                               public void setSucrea(java.lang.String param){
                            localSucreaTracker = param != null;
                                   
                                            this.localSucrea=param;
                                       

                               }
                            

                        /**
                        * field for Sucmod
                        */

                        
                                    protected java.lang.String localSucmod ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSucmodTracker = false ;

                           public boolean isSucmodSpecified(){
                               return localSucmodTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSucmod(){
                               return localSucmod;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Sucmod
                               */
                               public void setSucmod(java.lang.String param){
                            localSucmodTracker = param != null;
                                   
                                            this.localSucmod=param;
                                       

                               }
                            

                        /**
                        * field for Fecrea
                        */

                        
                                    protected java.util.Date localFecrea ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFecreaTracker = false ;

                           public boolean isFecreaSpecified(){
                               return localFecreaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getFecrea(){
                               return localFecrea;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Fecrea
                               */
                               public void setFecrea(java.util.Date param){
                            localFecreaTracker = param != null;
                                   
                                            this.localFecrea=param;
                                       

                               }
                            

                        /**
                        * field for Fecmod
                        */

                        
                                    protected java.util.Date localFecmod ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFecmodTracker = false ;

                           public boolean isFecmodSpecified(){
                               return localFecmodTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getFecmod(){
                               return localFecmod;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Fecmod
                               */
                               public void setFecmod(java.util.Date param){
                            localFecmodTracker = param != null;
                                   
                                            this.localFecmod=param;
                                       

                               }
                            

                        /**
                        * field for Codcia
                        */

                        
                                    protected java.lang.String localCodcia ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCodciaTracker = false ;

                           public boolean isCodciaSpecified(){
                               return localCodciaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCodcia(){
                               return localCodcia;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Codcia
                               */
                               public void setCodcia(java.lang.String param){
                            localCodciaTracker = param != null;
                                   
                                            this.localCodcia=param;
                                       

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


        
               return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(this,parentQName));
            
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
                           namespacePrefix+":CuentaCorrienteDetalle",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "CuentaCorrienteDetalle",
                           xmlWriter);
                   }

               
                   }
                if (localSucurTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "sucur", xmlWriter);
                             

                                          if (localSucur==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("sucur cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSucur);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPersonTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "person", xmlWriter);
                             

                                          if (localPerson==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("person cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPerson);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOrigenTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "origen", xmlWriter);
                             
                                               if (localOrigen==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("origen cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOrigen));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTipdocTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "tipdoc", xmlWriter);
                             

                                          if (localTipdoc==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("tipdoc cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTipdoc);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNumdocTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "numdoc", xmlWriter);
                             

                                          if (localNumdoc==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("numdoc cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localNumdoc);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNroctaTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "nrocta", xmlWriter);
                             

                                          if (localNrocta==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("nrocta cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localNrocta);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTipvalTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "tipval", xmlWriter);
                             
                                               if (localTipval==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("tipval cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTipval));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTotdocTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "totdoc", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localTotdoc)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("totdoc cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotdoc));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTotrecTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "totrec", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localTotrec)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("totrec cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotrec));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSucreaTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "sucrea", xmlWriter);
                             

                                          if (localSucrea==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("sucrea cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSucrea);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSucmodTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "sucmod", xmlWriter);
                             

                                          if (localSucmod==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("sucmod cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSucmod);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFecreaTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "fecrea", xmlWriter);
                             

                                          if (localFecrea==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("fecrea cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFecrea));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFecmodTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "fecmod", xmlWriter);
                             

                                          if (localFecmod==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("fecmod cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFecmod));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCodciaTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "codcia", xmlWriter);
                             

                                          if (localCodcia==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("codcia cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCodcia);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
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
        public static CuentaCorrienteDetalle parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            CuentaCorrienteDetalle object =
                new CuentaCorrienteDetalle();

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
                    
                            if (!"CuentaCorrienteDetalle".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (CuentaCorrienteDetalle)coop.equidad.servicios.suscripcion.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","person").equals(reader.getName()) || new javax.xml.namespace.QName("","person").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"person" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPerson(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","origen").equals(reader.getName()) || new javax.xml.namespace.QName("","origen").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"origen" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOrigen(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setOrigen(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","tipdoc").equals(reader.getName()) || new javax.xml.namespace.QName("","tipdoc").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"tipdoc" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTipdoc(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","numdoc").equals(reader.getName()) || new javax.xml.namespace.QName("","numdoc").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"numdoc" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNumdoc(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","nrocta").equals(reader.getName()) || new javax.xml.namespace.QName("","nrocta").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"nrocta" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNrocta(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","tipval").equals(reader.getName()) || new javax.xml.namespace.QName("","tipval").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"tipval" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTipval(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTipval(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","totdoc").equals(reader.getName()) || new javax.xml.namespace.QName("","totdoc").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"totdoc" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTotdoc(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTotdoc(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","totrec").equals(reader.getName()) || new javax.xml.namespace.QName("","totrec").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"totrec" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTotrec(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTotrec(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","sucrea").equals(reader.getName()) || new javax.xml.namespace.QName("","sucrea").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"sucrea" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSucrea(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","sucmod").equals(reader.getName()) || new javax.xml.namespace.QName("","sucmod").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"sucmod" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSucmod(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","fecrea").equals(reader.getName()) || new javax.xml.namespace.QName("","fecrea").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"fecrea" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFecrea(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","fecmod").equals(reader.getName()) || new javax.xml.namespace.QName("","fecmod").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"fecmod" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFecmod(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","codcia").equals(reader.getName()) || new javax.xml.namespace.QName("","codcia").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"codcia" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCodcia(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
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
           
    