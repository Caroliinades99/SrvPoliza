
/**
 * Poliza.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:09:26 BST)
 */

            
                package coop.equidad.servicios.suscripcion;
            

            /**
            *  Poliza bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Poliza
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Poliza
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
                        * field for Codpla
                        */

                        
                                    protected java.lang.String localCodpla ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCodplaTracker = false ;

                           public boolean isCodplaSpecified(){
                               return localCodplaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCodpla(){
                               return localCodpla;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Codpla
                               */
                               public void setCodpla(java.lang.String param){
                            localCodplaTracker = param != null;
                                   
                                            this.localCodpla=param;
                                       

                               }
                            

                        /**
                        * field for Certif
                        */

                        
                                    protected java.lang.String localCertif ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCertifTracker = false ;

                           public boolean isCertifSpecified(){
                               return localCertifTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCertif(){
                               return localCertif;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Certif
                               */
                               public void setCertif(java.lang.String param){
                            localCertifTracker = param != null;
                                   
                                            this.localCertif=param;
                                       

                               }
                            

                        /**
                        * field for Orden
                        */

                        
                                    protected int localOrden ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOrdenTracker = false ;

                           public boolean isOrdenSpecified(){
                               return localOrdenTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getOrden(){
                               return localOrden;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Orden
                               */
                               public void setOrden(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localOrdenTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localOrden=param;
                                       

                               }
                            

                        /**
                        * field for Estado
                        */

                        
                                    protected int localEstado ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEstadoTracker = false ;

                           public boolean isEstadoSpecified(){
                               return localEstadoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getEstado(){
                               return localEstado;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Estado
                               */
                               public void setEstado(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localEstadoTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localEstado=param;
                                       

                               }
                            

                        /**
                        * field for Poliza
                        */

                        
                                    protected java.lang.String localPoliza ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPolizaTracker = false ;

                           public boolean isPolizaSpecified(){
                               return localPolizaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPoliza(){
                               return localPoliza;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Poliza
                               */
                               public void setPoliza(java.lang.String param){
                            localPolizaTracker = param != null;
                                   
                                            this.localPoliza=param;
                                       

                               }
                            

                        /**
                        * field for Tomador
                        */

                        
                                    protected int localTomador ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTomadorTracker = false ;

                           public boolean isTomadorSpecified(){
                               return localTomadorTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getTomador(){
                               return localTomador;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Tomador
                               */
                               public void setTomador(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localTomadorTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localTomador=param;
                                       

                               }
                            

                        /**
                        * field for Asegurado
                        */

                        
                                    protected int localAsegurado ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAseguradoTracker = false ;

                           public boolean isAseguradoSpecified(){
                               return localAseguradoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getAsegurado(){
                               return localAsegurado;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Asegurado
                               */
                               public void setAsegurado(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localAseguradoTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localAsegurado=param;
                                       

                               }
                            

                        /**
                        * field for Beneficiario
                        */

                        
                                    protected int localBeneficiario ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBeneficiarioTracker = false ;

                           public boolean isBeneficiarioSpecified(){
                               return localBeneficiarioTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getBeneficiario(){
                               return localBeneficiario;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Beneficiario
                               */
                               public void setBeneficiario(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localBeneficiarioTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localBeneficiario=param;
                                       

                               }
                            

                        /**
                        * field for Cliente
                        */

                        
                                    protected int localCliente ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localClienteTracker = false ;

                           public boolean isClienteSpecified(){
                               return localClienteTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getCliente(){
                               return localCliente;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Cliente
                               */
                               public void setCliente(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localClienteTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localCliente=param;
                                       

                               }
                            

                        /**
                        * field for Agente
                        */

                        
                                    protected int localAgente ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAgenteTracker = false ;

                           public boolean isAgenteSpecified(){
                               return localAgenteTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getAgente(){
                               return localAgente;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Agente
                               */
                               public void setAgente(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localAgenteTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localAgente=param;
                                       

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
                        * field for Participacion
                        */

                        
                                    protected float localParticipacion ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localParticipacionTracker = false ;

                           public boolean isParticipacionSpecified(){
                               return localParticipacionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getParticipacion(){
                               return localParticipacion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Participacion
                               */
                               public void setParticipacion(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localParticipacionTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localParticipacion=param;
                                       

                               }
                            

                        /**
                        * field for Tipcer
                        */

                        
                                    protected java.lang.String localTipcer ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTipcerTracker = false ;

                           public boolean isTipcerSpecified(){
                               return localTipcerTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTipcer(){
                               return localTipcer;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Tipcer
                               */
                               public void setTipcer(java.lang.String param){
                            localTipcerTracker = param != null;
                                   
                                            this.localTipcer=param;
                                       

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
                        * field for Fecexp
                        */

                        
                                    protected java.util.Date localFecexp ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFecexpTracker = false ;

                           public boolean isFecexpSpecified(){
                               return localFecexpTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getFecexp(){
                               return localFecexp;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Fecexp
                               */
                               public void setFecexp(java.util.Date param){
                            localFecexpTracker = param != null;
                                   
                                            this.localFecexp=param;
                                       

                               }
                            

                        /**
                        * field for Fecori
                        */

                        
                                    protected java.util.Date localFecori ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFecoriTracker = false ;

                           public boolean isFecoriSpecified(){
                               return localFecoriTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getFecori(){
                               return localFecori;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Fecori
                               */
                               public void setFecori(java.util.Date param){
                            localFecoriTracker = param != null;
                                   
                                            this.localFecori=param;
                                       

                               }
                            

                        /**
                        * field for Fecren
                        */

                        
                                    protected java.util.Date localFecren ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFecrenTracker = false ;

                           public boolean isFecrenSpecified(){
                               return localFecrenTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getFecren(){
                               return localFecren;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Fecren
                               */
                               public void setFecren(java.util.Date param){
                            localFecrenTracker = param != null;
                                   
                                            this.localFecren=param;
                                       

                               }
                            

                        /**
                        * field for Dias
                        */

                        
                                    protected int localDias ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDiasTracker = false ;

                           public boolean isDiasSpecified(){
                               return localDiasTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getDias(){
                               return localDias;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Dias
                               */
                               public void setDias(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localDiasTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localDias=param;
                                       

                               }
                            

                        /**
                        * field for Hordes
                        */

                        
                                    protected java.lang.String localHordes ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHordesTracker = false ;

                           public boolean isHordesSpecified(){
                               return localHordesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getHordes(){
                               return localHordes;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Hordes
                               */
                               public void setHordes(java.lang.String param){
                            localHordesTracker = param != null;
                                   
                                            this.localHordes=param;
                                       

                               }
                            

                        /**
                        * field for Horhas
                        */

                        
                                    protected java.lang.String localHorhas ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHorhasTracker = false ;

                           public boolean isHorhasSpecified(){
                               return localHorhasTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getHorhas(){
                               return localHorhas;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Horhas
                               */
                               public void setHorhas(java.lang.String param){
                            localHorhasTracker = param != null;
                                   
                                            this.localHorhas=param;
                                       

                               }
                            

                        /**
                        * field for Moneda
                        */

                        
                                    protected int localMoneda ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMonedaTracker = false ;

                           public boolean isMonedaSpecified(){
                               return localMonedaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getMoneda(){
                               return localMoneda;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Moneda
                               */
                               public void setMoneda(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localMonedaTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localMoneda=param;
                                       

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
                        * field for Vprima
                        */

                        
                                    protected float localVprima ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localVprimaTracker = false ;

                           public boolean isVprimaSpecified(){
                               return localVprimaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getVprima(){
                               return localVprima;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Vprima
                               */
                               public void setVprima(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localVprimaTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localVprima=param;
                                       

                               }
                            

                        /**
                        * field for Vbase
                        */

                        
                                    protected float localVbase ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localVbaseTracker = false ;

                           public boolean isVbaseSpecified(){
                               return localVbaseTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getVbase(){
                               return localVbase;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Vbase
                               */
                               public void setVbase(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localVbaseTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localVbase=param;
                                       

                               }
                            

                        /**
                        * field for Cambio
                        */

                        
                                    protected int localCambio ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCambioTracker = false ;

                           public boolean isCambioSpecified(){
                               return localCambioTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getCambio(){
                               return localCambio;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Cambio
                               */
                               public void setCambio(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localCambioTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localCambio=param;
                                       

                               }
                            

                        /**
                        * field for Tipcoa
                        */

                        
                                    protected int localTipcoa ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTipcoaTracker = false ;

                           public boolean isTipcoaSpecified(){
                               return localTipcoaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getTipcoa(){
                               return localTipcoa;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Tipcoa
                               */
                               public void setTipcoa(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localTipcoaTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localTipcoa=param;
                                       

                               }
                            

                        /**
                        * field for Coaseg
                        */

                        
                                    protected float localCoaseg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCoasegTracker = false ;

                           public boolean isCoasegSpecified(){
                               return localCoasegTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getCoaseg(){
                               return localCoaseg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Coaseg
                               */
                               public void setCoaseg(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localCoasegTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localCoaseg=param;
                                       

                               }
                            

                        /**
                        * field for Coalider
                        */

                        
                                    protected java.lang.String localCoalider ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCoaliderTracker = false ;

                           public boolean isCoaliderSpecified(){
                               return localCoaliderTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCoalider(){
                               return localCoalider;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Coalider
                               */
                               public void setCoalider(java.lang.String param){
                            localCoaliderTracker = param != null;
                                   
                                            this.localCoalider=param;
                                       

                               }
                            

                        /**
                        * field for Antcodpla
                        */

                        
                                    protected java.lang.String localAntcodpla ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAntcodplaTracker = false ;

                           public boolean isAntcodplaSpecified(){
                               return localAntcodplaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAntcodpla(){
                               return localAntcodpla;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Antcodpla
                               */
                               public void setAntcodpla(java.lang.String param){
                            localAntcodplaTracker = param != null;
                                   
                                            this.localAntcodpla=param;
                                       

                               }
                            

                        /**
                        * field for Antcertif
                        */

                        
                                    protected java.lang.String localAntcertif ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAntcertifTracker = false ;

                           public boolean isAntcertifSpecified(){
                               return localAntcertifTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAntcertif(){
                               return localAntcertif;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Antcertif
                               */
                               public void setAntcertif(java.lang.String param){
                            localAntcertifTracker = param != null;
                                   
                                            this.localAntcertif=param;
                                       

                               }
                            

                        /**
                        * field for Antorden
                        */

                        
                                    protected int localAntorden ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAntordenTracker = false ;

                           public boolean isAntordenSpecified(){
                               return localAntordenTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getAntorden(){
                               return localAntorden;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Antorden
                               */
                               public void setAntorden(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localAntordenTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localAntorden=param;
                                       

                               }
                            

                        /**
                        * field for Fecout
                        */

                        
                                    protected java.util.Date localFecout ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFecoutTracker = false ;

                           public boolean isFecoutSpecified(){
                               return localFecoutTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getFecout(){
                               return localFecout;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Fecout
                               */
                               public void setFecout(java.util.Date param){
                            localFecoutTracker = param != null;
                                   
                                            this.localFecout=param;
                                       

                               }
                            

                        /**
                        * field for Cotizacion
                        */

                        
                                    protected java.lang.String localCotizacion ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCotizacionTracker = false ;

                           public boolean isCotizacionSpecified(){
                               return localCotizacionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCotizacion(){
                               return localCotizacion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Cotizacion
                               */
                               public void setCotizacion(java.lang.String param){
                            localCotizacionTracker = param != null;
                                   
                                            this.localCotizacion=param;
                                       

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
                        * field for Forpag
                        */

                        
                                    protected int localForpag ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localForpagTracker = false ;

                           public boolean isForpagSpecified(){
                               return localForpagTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getForpag(){
                               return localForpag;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Forpag
                               */
                               public void setForpag(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localForpagTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localForpag=param;
                                       

                               }
                            

                        /**
                        * field for Tipflo
                        */

                        
                                    protected int localTipflo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTipfloTracker = false ;

                           public boolean isTipfloSpecified(){
                               return localTipfloTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getTipflo(){
                               return localTipflo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Tipflo
                               */
                               public void setTipflo(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localTipfloTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localTipflo=param;
                                       

                               }
                            

                        /**
                        * field for Clasifrea
                        */

                        
                                    protected java.lang.String localClasifrea ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localClasifreaTracker = false ;

                           public boolean isClasifreaSpecified(){
                               return localClasifreaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getClasifrea(){
                               return localClasifrea;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Clasifrea
                               */
                               public void setClasifrea(java.lang.String param){
                            localClasifreaTracker = param != null;
                                   
                                            this.localClasifrea=param;
                                       

                               }
                            

                        /**
                        * field for Cumulo
                        */

                        
                                    protected java.lang.String localCumulo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCumuloTracker = false ;

                           public boolean isCumuloSpecified(){
                               return localCumuloTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCumulo(){
                               return localCumulo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Cumulo
                               */
                               public void setCumulo(java.lang.String param){
                            localCumuloTracker = param != null;
                                   
                                            this.localCumulo=param;
                                       

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
                        * field for Diafact
                        */

                        
                                    protected int localDiafact ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDiafactTracker = false ;

                           public boolean isDiafactSpecified(){
                               return localDiafactTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getDiafact(){
                               return localDiafact;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Diafact
                               */
                               public void setDiafact(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localDiafactTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localDiafact=param;
                                       

                               }
                            

                        /**
                        * field for Valgastos
                        */

                        
                                    protected float localValgastos ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localValgastosTracker = false ;

                           public boolean isValgastosSpecified(){
                               return localValgastosTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getValgastos(){
                               return localValgastos;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Valgastos
                               */
                               public void setValgastos(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localValgastosTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localValgastos=param;
                                       

                               }
                            

                        /**
                        * field for Porgastos
                        */

                        
                                    protected float localPorgastos ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPorgastosTracker = false ;

                           public boolean isPorgastosSpecified(){
                               return localPorgastosTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getPorgastos(){
                               return localPorgastos;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Porgastos
                               */
                               public void setPorgastos(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localPorgastosTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localPorgastos=param;
                                       

                               }
                            

                        /**
                        * field for Planorden
                        */

                        
                                    protected java.lang.String localPlanorden ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPlanordenTracker = false ;

                           public boolean isPlanordenSpecified(){
                               return localPlanordenTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPlanorden(){
                               return localPlanorden;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Planorden
                               */
                               public void setPlanorden(java.lang.String param){
                            localPlanordenTracker = param != null;
                                   
                                            this.localPlanorden=param;
                                       

                               }
                            

                        /**
                        * field for Pordescuento
                        */

                        
                                    protected float localPordescuento ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPordescuentoTracker = false ;

                           public boolean isPordescuentoSpecified(){
                               return localPordescuentoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getPordescuento(){
                               return localPordescuento;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Pordescuento
                               */
                               public void setPordescuento(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localPordescuentoTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localPordescuento=param;
                                       

                               }
                            

                        /**
                        * field for Porrecargo
                        */

                        
                                    protected float localPorrecargo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPorrecargoTracker = false ;

                           public boolean isPorrecargoSpecified(){
                               return localPorrecargoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getPorrecargo(){
                               return localPorrecargo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Porrecargo
                               */
                               public void setPorrecargo(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localPorrecargoTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localPorrecargo=param;
                                       

                               }
                            

                        /**
                        * field for Tipocarga
                        */

                        
                                    protected int localTipocarga ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTipocargaTracker = false ;

                           public boolean isTipocargaSpecified(){
                               return localTipocargaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getTipocarga(){
                               return localTipocarga;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Tipocarga
                               */
                               public void setTipocarga(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localTipocargaTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localTipocarga=param;
                                       

                               }
                            

                        /**
                        * field for Motivocan
                        */

                        
                                    protected int localMotivocan ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMotivocanTracker = false ;

                           public boolean isMotivocanSpecified(){
                               return localMotivocanTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getMotivocan(){
                               return localMotivocan;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Motivocan
                               */
                               public void setMotivocan(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localMotivocanTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localMotivocan=param;
                                       

                               }
                            

                        /**
                        * field for Pollider
                        */

                        
                                    protected java.lang.String localPollider ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPolliderTracker = false ;

                           public boolean isPolliderSpecified(){
                               return localPolliderTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPollider(){
                               return localPollider;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Pollider
                               */
                               public void setPollider(java.lang.String param){
                            localPolliderTracker = param != null;
                                   
                                            this.localPollider=param;
                                       

                               }
                            

                        /**
                        * field for Cerlider
                        */

                        
                                    protected java.lang.String localCerlider ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCerliderTracker = false ;

                           public boolean isCerliderSpecified(){
                               return localCerliderTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCerlider(){
                               return localCerlider;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Cerlider
                               */
                               public void setCerlider(java.lang.String param){
                            localCerliderTracker = param != null;
                                   
                                            this.localCerlider=param;
                                       

                               }
                            

                        /**
                        * field for Ordengrupo
                        */

                        
                                    protected int localOrdengrupo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOrdengrupoTracker = false ;

                           public boolean isOrdengrupoSpecified(){
                               return localOrdengrupoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getOrdengrupo(){
                               return localOrdengrupo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Ordengrupo
                               */
                               public void setOrdengrupo(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localOrdengrupoTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localOrdengrupo=param;
                                       

                               }
                            

                        /**
                        * field for Plaza
                        */

                        
                                    protected java.lang.String localPlaza ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPlazaTracker = false ;

                           public boolean isPlazaSpecified(){
                               return localPlazaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPlaza(){
                               return localPlaza;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Plaza
                               */
                               public void setPlaza(java.lang.String param){
                            localPlazaTracker = param != null;
                                   
                                            this.localPlaza=param;
                                       

                               }
                            

                        /**
                        * field for Amarreplan
                        */

                        
                                    protected java.lang.String localAmarreplan ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAmarreplanTracker = false ;

                           public boolean isAmarreplanSpecified(){
                               return localAmarreplanTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAmarreplan(){
                               return localAmarreplan;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Amarreplan
                               */
                               public void setAmarreplan(java.lang.String param){
                            localAmarreplanTracker = param != null;
                                   
                                            this.localAmarreplan=param;
                                       

                               }
                            

                        /**
                        * field for Amarrecertif
                        */

                        
                                    protected java.lang.String localAmarrecertif ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAmarrecertifTracker = false ;

                           public boolean isAmarrecertifSpecified(){
                               return localAmarrecertifTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAmarrecertif(){
                               return localAmarrecertif;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Amarrecertif
                               */
                               public void setAmarrecertif(java.lang.String param){
                            localAmarrecertifTracker = param != null;
                                   
                                            this.localAmarrecertif=param;
                                       

                               }
                            

                        /**
                        * field for Amarreorden
                        */

                        
                                    protected int localAmarreorden ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAmarreordenTracker = false ;

                           public boolean isAmarreordenSpecified(){
                               return localAmarreordenTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getAmarreorden(){
                               return localAmarreorden;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Amarreorden
                               */
                               public void setAmarreorden(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localAmarreordenTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localAmarreorden=param;
                                       

                               }
                            

                        /**
                        * field for Amarrepoliza
                        */

                        
                                    protected java.lang.String localAmarrepoliza ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAmarrepolizaTracker = false ;

                           public boolean isAmarrepolizaSpecified(){
                               return localAmarrepolizaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAmarrepoliza(){
                               return localAmarrepoliza;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Amarrepoliza
                               */
                               public void setAmarrepoliza(java.lang.String param){
                            localAmarrepolizaTracker = param != null;
                                   
                                            this.localAmarrepoliza=param;
                                       

                               }
                            

                        /**
                        * field for Fecterplan
                        */

                        
                                    protected java.util.Date localFecterplan ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFecterplanTracker = false ;

                           public boolean isFecterplanSpecified(){
                               return localFecterplanTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getFecterplan(){
                               return localFecterplan;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Fecterplan
                               */
                               public void setFecterplan(java.util.Date param){
                            localFecterplanTracker = param != null;
                                   
                                            this.localFecterplan=param;
                                       

                               }
                            

                        /**
                        * field for Tipfac
                        */

                        
                                    protected int localTipfac ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTipfacTracker = false ;

                           public boolean isTipfacSpecified(){
                               return localTipfacTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getTipfac(){
                               return localTipfac;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Tipfac
                               */
                               public void setTipfac(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localTipfacTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localTipfac=param;
                                       

                               }
                            

                        /**
                        * field for Valiva
                        */

                        
                                    protected float localValiva ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localValivaTracker = false ;

                           public boolean isValivaSpecified(){
                               return localValivaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getValiva(){
                               return localValiva;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Valiva
                               */
                               public void setValiva(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localValivaTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localValiva=param;
                                       

                               }
                            

                        /**
                        * field for Nivel
                        */

                        
                                    protected int localNivel ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNivelTracker = false ;

                           public boolean isNivelSpecified(){
                               return localNivelTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getNivel(){
                               return localNivel;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Nivel
                               */
                               public void setNivel(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localNivelTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localNivel=param;
                                       

                               }
                            

                        /**
                        * field for Rol
                        */

                        
                                    protected int localRol ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRolTracker = false ;

                           public boolean isRolSpecified(){
                               return localRolTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getRol(){
                               return localRol;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Rol
                               */
                               public void setRol(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localRolTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localRol=param;
                                       

                               }
                            

                        /**
                        * field for Cesioncomision
                        */

                        
                                    protected float localCesioncomision ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCesioncomisionTracker = false ;

                           public boolean isCesioncomisionSpecified(){
                               return localCesioncomisionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getCesioncomision(){
                               return localCesioncomision;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Cesioncomision
                               */
                               public void setCesioncomision(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localCesioncomisionTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localCesioncomision=param;
                                       

                               }
                            

                        /**
                        * field for Certifcausacion
                        */

                        
                                    protected int localCertifcausacion ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCertifcausacionTracker = false ;

                           public boolean isCertifcausacionSpecified(){
                               return localCertifcausacionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getCertifcausacion(){
                               return localCertifcausacion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Certifcausacion
                               */
                               public void setCertifcausacion(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localCertifcausacionTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localCertifcausacion=param;
                                       

                               }
                            

                        /**
                        * field for Pordescesion
                        */

                        
                                    protected float localPordescesion ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPordescesionTracker = false ;

                           public boolean isPordescesionSpecified(){
                               return localPordescesionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getPordescesion(){
                               return localPordescesion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Pordescesion
                               */
                               public void setPordescesion(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localPordescesionTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localPordescesion=param;
                                       

                               }
                            

                        /**
                        * field for Fecimpuestos
                        */

                        
                                    protected java.util.Date localFecimpuestos ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFecimpuestosTracker = false ;

                           public boolean isFecimpuestosSpecified(){
                               return localFecimpuestosTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getFecimpuestos(){
                               return localFecimpuestos;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Fecimpuestos
                               */
                               public void setFecimpuestos(java.util.Date param){
                            localFecimpuestosTracker = param != null;
                                   
                                            this.localFecimpuestos=param;
                                       

                               }
                            

                        /**
                        * field for Impresa
                        */

                        
                                    protected int localImpresa ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localImpresaTracker = false ;

                           public boolean isImpresaSpecified(){
                               return localImpresaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getImpresa(){
                               return localImpresa;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Impresa
                               */
                               public void setImpresa(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localImpresaTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localImpresa=param;
                                       

                               }
                            

                        /**
                        * field for Ubicacion
                        */

                        
                                    protected java.lang.String localUbicacion ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUbicacionTracker = false ;

                           public boolean isUbicacionSpecified(){
                               return localUbicacionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUbicacion(){
                               return localUbicacion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Ubicacion
                               */
                               public void setUbicacion(java.lang.String param){
                            localUbicacionTracker = param != null;
                                   
                                            this.localUbicacion=param;
                                       

                               }
                            

                        /**
                        * field for PolizaSequence_type0
                        */

                        
                                    protected coop.equidad.servicios.suscripcion.PolizaSequence_type0 localPolizaSequence_type0 ;
                                

                           /**
                           * Auto generated getter method
                           * @return coop.equidad.servicios.suscripcion.PolizaSequence_type0
                           */
                           public  coop.equidad.servicios.suscripcion.PolizaSequence_type0 getPolizaSequence_type0(){
                               return localPolizaSequence_type0;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PolizaSequence_type0
                               */
                               public void setPolizaSequence_type0(coop.equidad.servicios.suscripcion.PolizaSequence_type0 param){
                            
                                            this.localPolizaSequence_type0=param;
                                       

                               }
                            

                        /**
                        * field for PolizaSequence_type1
                        */

                        
                                    protected coop.equidad.servicios.suscripcion.PolizaSequence_type1 localPolizaSequence_type1 ;
                                

                           /**
                           * Auto generated getter method
                           * @return coop.equidad.servicios.suscripcion.PolizaSequence_type1
                           */
                           public  coop.equidad.servicios.suscripcion.PolizaSequence_type1 getPolizaSequence_type1(){
                               return localPolizaSequence_type1;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PolizaSequence_type1
                               */
                               public void setPolizaSequence_type1(coop.equidad.servicios.suscripcion.PolizaSequence_type1 param){
                            
                                            this.localPolizaSequence_type1=param;
                                       

                               }
                            

                        /**
                        * field for PolizaSequence_type2
                        */

                        
                                    protected coop.equidad.servicios.suscripcion.PolizaSequence_type2 localPolizaSequence_type2 ;
                                

                           /**
                           * Auto generated getter method
                           * @return coop.equidad.servicios.suscripcion.PolizaSequence_type2
                           */
                           public  coop.equidad.servicios.suscripcion.PolizaSequence_type2 getPolizaSequence_type2(){
                               return localPolizaSequence_type2;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PolizaSequence_type2
                               */
                               public void setPolizaSequence_type2(coop.equidad.servicios.suscripcion.PolizaSequence_type2 param){
                            
                                            this.localPolizaSequence_type2=param;
                                       

                               }
                            

                        /**
                        * field for PolizaSequence_type3
                        */

                        
                                    protected coop.equidad.servicios.suscripcion.PolizaSequence_type3 localPolizaSequence_type3 ;
                                

                           /**
                           * Auto generated getter method
                           * @return coop.equidad.servicios.suscripcion.PolizaSequence_type3
                           */
                           public  coop.equidad.servicios.suscripcion.PolizaSequence_type3 getPolizaSequence_type3(){
                               return localPolizaSequence_type3;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PolizaSequence_type3
                               */
                               public void setPolizaSequence_type3(coop.equidad.servicios.suscripcion.PolizaSequence_type3 param){
                            
                                            this.localPolizaSequence_type3=param;
                                       

                               }
                            

                        /**
                        * field for PolizaSequence_type4
                        */

                        
                                    protected coop.equidad.servicios.suscripcion.PolizaSequence_type4 localPolizaSequence_type4 ;
                                

                           /**
                           * Auto generated getter method
                           * @return coop.equidad.servicios.suscripcion.PolizaSequence_type4
                           */
                           public  coop.equidad.servicios.suscripcion.PolizaSequence_type4 getPolizaSequence_type4(){
                               return localPolizaSequence_type4;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PolizaSequence_type4
                               */
                               public void setPolizaSequence_type4(coop.equidad.servicios.suscripcion.PolizaSequence_type4 param){
                            
                                            this.localPolizaSequence_type4=param;
                                       

                               }
                            

                        /**
                        * field for PolizaSequence_type5
                        */

                        
                                    protected coop.equidad.servicios.suscripcion.PolizaSequence_type5 localPolizaSequence_type5 ;
                                

                           /**
                           * Auto generated getter method
                           * @return coop.equidad.servicios.suscripcion.PolizaSequence_type5
                           */
                           public  coop.equidad.servicios.suscripcion.PolizaSequence_type5 getPolizaSequence_type5(){
                               return localPolizaSequence_type5;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PolizaSequence_type5
                               */
                               public void setPolizaSequence_type5(coop.equidad.servicios.suscripcion.PolizaSequence_type5 param){
                            
                                            this.localPolizaSequence_type5=param;
                                       

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
                           namespacePrefix+":Poliza",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Poliza",
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
                             } if (localCodplaTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "codpla", xmlWriter);
                             

                                          if (localCodpla==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("codpla cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCodpla);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCertifTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "certif", xmlWriter);
                             

                                          if (localCertif==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("certif cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCertif);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOrdenTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "orden", xmlWriter);
                             
                                               if (localOrden==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("orden cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOrden));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEstadoTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "estado", xmlWriter);
                             
                                               if (localEstado==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("estado cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEstado));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPolizaTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "poliza", xmlWriter);
                             

                                          if (localPoliza==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("poliza cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPoliza);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTomadorTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "tomador", xmlWriter);
                             
                                               if (localTomador==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("tomador cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTomador));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAseguradoTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "asegurado", xmlWriter);
                             
                                               if (localAsegurado==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("asegurado cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAsegurado));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localBeneficiarioTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "beneficiario", xmlWriter);
                             
                                               if (localBeneficiario==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("beneficiario cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBeneficiario));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localClienteTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "cliente", xmlWriter);
                             
                                               if (localCliente==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("cliente cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCliente));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAgenteTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "agente", xmlWriter);
                             
                                               if (localAgente==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("agente cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAgente));
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
                             } if (localParticipacionTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "participacion", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localParticipacion)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("participacion cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localParticipacion));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTipcerTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "tipcer", xmlWriter);
                             

                                          if (localTipcer==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("tipcer cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTipcer);
                                            
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
                             } if (localFecexpTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "fecexp", xmlWriter);
                             

                                          if (localFecexp==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("fecexp cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFecexp));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFecoriTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "fecori", xmlWriter);
                             

                                          if (localFecori==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("fecori cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFecori));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFecrenTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "fecren", xmlWriter);
                             

                                          if (localFecren==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("fecren cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFecren));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDiasTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "dias", xmlWriter);
                             
                                               if (localDias==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("dias cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDias));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localHordesTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "hordes", xmlWriter);
                             

                                          if (localHordes==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("hordes cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localHordes);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localHorhasTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "horhas", xmlWriter);
                             

                                          if (localHorhas==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("horhas cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localHorhas);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMonedaTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "moneda", xmlWriter);
                             
                                               if (localMoneda==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("moneda cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMoneda));
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
                             } if (localVasegTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "vaseg", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localVaseg)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("vaseg cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVaseg));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localVprimaTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "vprima", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localVprima)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("vprima cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVprima));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localVbaseTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "vbase", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localVbase)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("vbase cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVbase));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCambioTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "cambio", xmlWriter);
                             
                                               if (localCambio==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("cambio cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCambio));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTipcoaTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "tipcoa", xmlWriter);
                             
                                               if (localTipcoa==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("tipcoa cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTipcoa));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCoasegTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "coaseg", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localCoaseg)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("coaseg cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCoaseg));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCoaliderTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "coalider", xmlWriter);
                             

                                          if (localCoalider==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("coalider cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCoalider);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAntcodplaTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "antcodpla", xmlWriter);
                             

                                          if (localAntcodpla==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("antcodpla cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAntcodpla);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAntcertifTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "antcertif", xmlWriter);
                             

                                          if (localAntcertif==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("antcertif cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAntcertif);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAntordenTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "antorden", xmlWriter);
                             
                                               if (localAntorden==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("antorden cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAntorden));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFecoutTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "fecout", xmlWriter);
                             

                                          if (localFecout==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("fecout cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFecout));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCotizacionTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "cotizacion", xmlWriter);
                             

                                          if (localCotizacion==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("cotizacion cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCotizacion);
                                            
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
                             } if (localForpagTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "forpag", xmlWriter);
                             
                                               if (localForpag==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("forpag cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localForpag));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTipfloTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "tipflo", xmlWriter);
                             
                                               if (localTipflo==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("tipflo cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTipflo));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localClasifreaTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "clasifrea", xmlWriter);
                             

                                          if (localClasifrea==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("clasifrea cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localClasifrea);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCumuloTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "cumulo", xmlWriter);
                             

                                          if (localCumulo==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("cumulo cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCumulo);
                                            
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
                             } if (localDiafactTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "diafact", xmlWriter);
                             
                                               if (localDiafact==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("diafact cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDiafact));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localValgastosTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "valgastos", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localValgastos)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("valgastos cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localValgastos));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPorgastosTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "porgastos", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localPorgastos)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("porgastos cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPorgastos));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPlanordenTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "planorden", xmlWriter);
                             

                                          if (localPlanorden==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("planorden cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPlanorden);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPordescuentoTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "pordescuento", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localPordescuento)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("pordescuento cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPordescuento));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPorrecargoTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "porrecargo", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localPorrecargo)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("porrecargo cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPorrecargo));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTipocargaTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "tipocarga", xmlWriter);
                             
                                               if (localTipocarga==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("tipocarga cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTipocarga));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMotivocanTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "motivocan", xmlWriter);
                             
                                               if (localMotivocan==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("motivocan cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMotivocan));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPolliderTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "pollider", xmlWriter);
                             

                                          if (localPollider==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("pollider cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPollider);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCerliderTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "cerlider", xmlWriter);
                             

                                          if (localCerlider==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("cerlider cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCerlider);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOrdengrupoTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "ordengrupo", xmlWriter);
                             
                                               if (localOrdengrupo==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("ordengrupo cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOrdengrupo));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPlazaTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "plaza", xmlWriter);
                             

                                          if (localPlaza==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("plaza cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPlaza);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAmarreplanTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "amarreplan", xmlWriter);
                             

                                          if (localAmarreplan==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("amarreplan cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAmarreplan);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAmarrecertifTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "amarrecertif", xmlWriter);
                             

                                          if (localAmarrecertif==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("amarrecertif cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAmarrecertif);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAmarreordenTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "amarreorden", xmlWriter);
                             
                                               if (localAmarreorden==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("amarreorden cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAmarreorden));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAmarrepolizaTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "amarrepoliza", xmlWriter);
                             

                                          if (localAmarrepoliza==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("amarrepoliza cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAmarrepoliza);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFecterplanTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "fecterplan", xmlWriter);
                             

                                          if (localFecterplan==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("fecterplan cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFecterplan));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTipfacTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "tipfac", xmlWriter);
                             
                                               if (localTipfac==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("tipfac cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTipfac));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localValivaTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "valiva", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localValiva)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("valiva cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localValiva));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNivelTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "nivel", xmlWriter);
                             
                                               if (localNivel==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("nivel cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNivel));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRolTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "rol", xmlWriter);
                             
                                               if (localRol==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("rol cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRol));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCesioncomisionTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "cesioncomision", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localCesioncomision)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("cesioncomision cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCesioncomision));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCertifcausacionTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "certifcausacion", xmlWriter);
                             
                                               if (localCertifcausacion==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("certifcausacion cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCertifcausacion));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPordescesionTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "pordescesion", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localPordescesion)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("pordescesion cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPordescesion));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFecimpuestosTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "fecimpuestos", xmlWriter);
                             

                                          if (localFecimpuestos==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("fecimpuestos cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFecimpuestos));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localImpresaTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "impresa", xmlWriter);
                             
                                               if (localImpresa==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("impresa cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localImpresa));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUbicacionTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "ubicacion", xmlWriter);
                             

                                          if (localUbicacion==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ubicacion cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUbicacion);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                            if (localPolizaSequence_type0==null){
                                                 throw new org.apache.axis2.databinding.ADBException("PolizaSequence_type0 cannot be null!!");
                                            }
                                           localPolizaSequence_type0.serialize(null,xmlWriter);
                                        
                                            if (localPolizaSequence_type1==null){
                                                 throw new org.apache.axis2.databinding.ADBException("PolizaSequence_type1 cannot be null!!");
                                            }
                                           localPolizaSequence_type1.serialize(null,xmlWriter);
                                        
                                            if (localPolizaSequence_type2==null){
                                                 throw new org.apache.axis2.databinding.ADBException("PolizaSequence_type2 cannot be null!!");
                                            }
                                           localPolizaSequence_type2.serialize(null,xmlWriter);
                                        
                                            if (localPolizaSequence_type3==null){
                                                 throw new org.apache.axis2.databinding.ADBException("PolizaSequence_type3 cannot be null!!");
                                            }
                                           localPolizaSequence_type3.serialize(null,xmlWriter);
                                        
                                            if (localPolizaSequence_type4==null){
                                                 throw new org.apache.axis2.databinding.ADBException("PolizaSequence_type4 cannot be null!!");
                                            }
                                           localPolizaSequence_type4.serialize(null,xmlWriter);
                                        
                                            if (localPolizaSequence_type5==null){
                                                 throw new org.apache.axis2.databinding.ADBException("PolizaSequence_type5 cannot be null!!");
                                            }
                                           localPolizaSequence_type5.serialize(null,xmlWriter);
                                        
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
        public static Poliza parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Poliza object =
                new Poliza();

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
                    
                            if (!"Poliza".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Poliza)coop.equidad.servicios.suscripcion.ExtensionMapper.getTypeObject(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","codpla").equals(reader.getName()) || new javax.xml.namespace.QName("","codpla").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"codpla" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCodpla(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","certif").equals(reader.getName()) || new javax.xml.namespace.QName("","certif").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"certif" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCertif(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","orden").equals(reader.getName()) || new javax.xml.namespace.QName("","orden").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"orden" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOrden(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setOrden(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","estado").equals(reader.getName()) || new javax.xml.namespace.QName("","estado").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"estado" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEstado(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setEstado(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","poliza").equals(reader.getName()) || new javax.xml.namespace.QName("","poliza").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"poliza" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPoliza(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","tomador").equals(reader.getName()) || new javax.xml.namespace.QName("","tomador").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"tomador" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTomador(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTomador(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","asegurado").equals(reader.getName()) || new javax.xml.namespace.QName("","asegurado").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"asegurado" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAsegurado(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setAsegurado(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","beneficiario").equals(reader.getName()) || new javax.xml.namespace.QName("","beneficiario").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"beneficiario" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBeneficiario(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setBeneficiario(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","cliente").equals(reader.getName()) || new javax.xml.namespace.QName("","cliente").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"cliente" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCliente(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setCliente(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","agente").equals(reader.getName()) || new javax.xml.namespace.QName("","agente").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"agente" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAgente(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setAgente(java.lang.Integer.MIN_VALUE);
                                           
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","participacion").equals(reader.getName()) || new javax.xml.namespace.QName("","participacion").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"participacion" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setParticipacion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setParticipacion(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","tipcer").equals(reader.getName()) || new javax.xml.namespace.QName("","tipcer").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"tipcer" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTipcer(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","fecexp").equals(reader.getName()) || new javax.xml.namespace.QName("","fecexp").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"fecexp" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFecexp(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","fecori").equals(reader.getName()) || new javax.xml.namespace.QName("","fecori").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"fecori" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFecori(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","fecren").equals(reader.getName()) || new javax.xml.namespace.QName("","fecren").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"fecren" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFecren(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","dias").equals(reader.getName()) || new javax.xml.namespace.QName("","dias").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"dias" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDias(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setDias(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","hordes").equals(reader.getName()) || new javax.xml.namespace.QName("","hordes").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"hordes" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setHordes(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","horhas").equals(reader.getName()) || new javax.xml.namespace.QName("","horhas").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"horhas" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setHorhas(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","moneda").equals(reader.getName()) || new javax.xml.namespace.QName("","moneda").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"moneda" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMoneda(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setMoneda(java.lang.Integer.MIN_VALUE);
                                           
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","vprima").equals(reader.getName()) || new javax.xml.namespace.QName("","vprima").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"vprima" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setVprima(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setVprima(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","vbase").equals(reader.getName()) || new javax.xml.namespace.QName("","vbase").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"vbase" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setVbase(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setVbase(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","cambio").equals(reader.getName()) || new javax.xml.namespace.QName("","cambio").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"cambio" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCambio(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setCambio(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","tipcoa").equals(reader.getName()) || new javax.xml.namespace.QName("","tipcoa").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"tipcoa" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTipcoa(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTipcoa(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","coaseg").equals(reader.getName()) || new javax.xml.namespace.QName("","coaseg").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"coaseg" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCoaseg(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setCoaseg(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","coalider").equals(reader.getName()) || new javax.xml.namespace.QName("","coalider").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"coalider" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCoalider(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","antcodpla").equals(reader.getName()) || new javax.xml.namespace.QName("","antcodpla").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"antcodpla" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAntcodpla(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","antcertif").equals(reader.getName()) || new javax.xml.namespace.QName("","antcertif").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"antcertif" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAntcertif(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","antorden").equals(reader.getName()) || new javax.xml.namespace.QName("","antorden").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"antorden" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAntorden(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setAntorden(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","fecout").equals(reader.getName()) || new javax.xml.namespace.QName("","fecout").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"fecout" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFecout(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","cotizacion").equals(reader.getName()) || new javax.xml.namespace.QName("","cotizacion").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"cotizacion" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCotizacion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
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
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","forpag").equals(reader.getName()) || new javax.xml.namespace.QName("","forpag").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"forpag" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setForpag(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setForpag(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","tipflo").equals(reader.getName()) || new javax.xml.namespace.QName("","tipflo").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"tipflo" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTipflo(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTipflo(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","clasifrea").equals(reader.getName()) || new javax.xml.namespace.QName("","clasifrea").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"clasifrea" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setClasifrea(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","cumulo").equals(reader.getName()) || new javax.xml.namespace.QName("","cumulo").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"cumulo" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCumulo(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","diafact").equals(reader.getName()) || new javax.xml.namespace.QName("","diafact").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"diafact" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDiafact(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setDiafact(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","valgastos").equals(reader.getName()) || new javax.xml.namespace.QName("","valgastos").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"valgastos" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setValgastos(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setValgastos(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","porgastos").equals(reader.getName()) || new javax.xml.namespace.QName("","porgastos").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"porgastos" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPorgastos(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPorgastos(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","planorden").equals(reader.getName()) || new javax.xml.namespace.QName("","planorden").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"planorden" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPlanorden(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","pordescuento").equals(reader.getName()) || new javax.xml.namespace.QName("","pordescuento").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"pordescuento" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPordescuento(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPordescuento(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","porrecargo").equals(reader.getName()) || new javax.xml.namespace.QName("","porrecargo").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"porrecargo" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPorrecargo(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPorrecargo(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","tipocarga").equals(reader.getName()) || new javax.xml.namespace.QName("","tipocarga").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"tipocarga" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTipocarga(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTipocarga(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","motivocan").equals(reader.getName()) || new javax.xml.namespace.QName("","motivocan").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"motivocan" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMotivocan(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setMotivocan(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","pollider").equals(reader.getName()) || new javax.xml.namespace.QName("","pollider").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"pollider" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPollider(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","cerlider").equals(reader.getName()) || new javax.xml.namespace.QName("","cerlider").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"cerlider" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCerlider(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ordengrupo").equals(reader.getName()) || new javax.xml.namespace.QName("","ordengrupo").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ordengrupo" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOrdengrupo(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setOrdengrupo(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","plaza").equals(reader.getName()) || new javax.xml.namespace.QName("","plaza").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"plaza" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPlaza(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","amarreplan").equals(reader.getName()) || new javax.xml.namespace.QName("","amarreplan").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"amarreplan" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAmarreplan(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","amarrecertif").equals(reader.getName()) || new javax.xml.namespace.QName("","amarrecertif").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"amarrecertif" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAmarrecertif(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","amarreorden").equals(reader.getName()) || new javax.xml.namespace.QName("","amarreorden").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"amarreorden" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAmarreorden(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setAmarreorden(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","amarrepoliza").equals(reader.getName()) || new javax.xml.namespace.QName("","amarrepoliza").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"amarrepoliza" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAmarrepoliza(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","fecterplan").equals(reader.getName()) || new javax.xml.namespace.QName("","fecterplan").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"fecterplan" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFecterplan(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","tipfac").equals(reader.getName()) || new javax.xml.namespace.QName("","tipfac").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"tipfac" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTipfac(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTipfac(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","valiva").equals(reader.getName()) || new javax.xml.namespace.QName("","valiva").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"valiva" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setValiva(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setValiva(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","nivel").equals(reader.getName()) || new javax.xml.namespace.QName("","nivel").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"nivel" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNivel(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setNivel(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","rol").equals(reader.getName()) || new javax.xml.namespace.QName("","rol").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"rol" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRol(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setRol(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","cesioncomision").equals(reader.getName()) || new javax.xml.namespace.QName("","cesioncomision").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"cesioncomision" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCesioncomision(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setCesioncomision(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","certifcausacion").equals(reader.getName()) || new javax.xml.namespace.QName("","certifcausacion").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"certifcausacion" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCertifcausacion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setCertifcausacion(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","pordescesion").equals(reader.getName()) || new javax.xml.namespace.QName("","pordescesion").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"pordescesion" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPordescesion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPordescesion(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","fecimpuestos").equals(reader.getName()) || new javax.xml.namespace.QName("","fecimpuestos").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"fecimpuestos" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFecimpuestos(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","impresa").equals(reader.getName()) || new javax.xml.namespace.QName("","impresa").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"impresa" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setImpresa(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setImpresa(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ubicacion").equals(reader.getName()) || new javax.xml.namespace.QName("","ubicacion").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ubicacion" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUbicacion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() ){
                                
                                                object.setPolizaSequence_type0(coop.equidad.servicios.suscripcion.PolizaSequence_type0.Factory.parse(reader));
                                            
                              }  // End of if for expected property start element
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() ){
                                
                                                object.setPolizaSequence_type1(coop.equidad.servicios.suscripcion.PolizaSequence_type1.Factory.parse(reader));
                                            
                              }  // End of if for expected property start element
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() ){
                                
                                                object.setPolizaSequence_type2(coop.equidad.servicios.suscripcion.PolizaSequence_type2.Factory.parse(reader));
                                            
                              }  // End of if for expected property start element
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() ){
                                
                                                object.setPolizaSequence_type3(coop.equidad.servicios.suscripcion.PolizaSequence_type3.Factory.parse(reader));
                                            
                              }  // End of if for expected property start element
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() ){
                                
                                                object.setPolizaSequence_type4(coop.equidad.servicios.suscripcion.PolizaSequence_type4.Factory.parse(reader));
                                            
                              }  // End of if for expected property start element
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() ){
                                
                                                object.setPolizaSequence_type5(coop.equidad.servicios.suscripcion.PolizaSequence_type5.Factory.parse(reader));
                                            
                              }  // End of if for expected property start element
                                  
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




	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Poliza [");
		if (localSucur != null) {
			builder.append("localSucur=");
			builder.append(localSucur);
			builder.append(", ");
		}
		builder.append("localSucurTracker=");
		builder.append(localSucurTracker);
		builder.append(", ");
		if (localCodpla != null) {
			builder.append("localCodpla=");
			builder.append(localCodpla);
			builder.append(", ");
		}
		builder.append("localCodplaTracker=");
		builder.append(localCodplaTracker);
		builder.append(", ");
		if (localCertif != null) {
			builder.append("localCertif=");
			builder.append(localCertif);
			builder.append(", ");
		}
		builder.append("localCertifTracker=");
		builder.append(localCertifTracker);
		builder.append(", localOrden=");
		builder.append(localOrden);
		builder.append(", localOrdenTracker=");
		builder.append(localOrdenTracker);
		builder.append(", localEstado=");
		builder.append(localEstado);
		builder.append(", localEstadoTracker=");
		builder.append(localEstadoTracker);
		builder.append(", ");
		if (localPoliza != null) {
			builder.append("localPoliza=");
			builder.append(localPoliza);
			builder.append(", ");
		}
		builder.append("localPolizaTracker=");
		builder.append(localPolizaTracker);
		builder.append(", localTomador=");
		builder.append(localTomador);
		builder.append(", localTomadorTracker=");
		builder.append(localTomadorTracker);
		builder.append(", localAsegurado=");
		builder.append(localAsegurado);
		builder.append(", localAseguradoTracker=");
		builder.append(localAseguradoTracker);
		builder.append(", localBeneficiario=");
		builder.append(localBeneficiario);
		builder.append(", localBeneficiarioTracker=");
		builder.append(localBeneficiarioTracker);
		builder.append(", localCliente=");
		builder.append(localCliente);
		builder.append(", localClienteTracker=");
		builder.append(localClienteTracker);
		builder.append(", localAgente=");
		builder.append(localAgente);
		builder.append(", localAgenteTracker=");
		builder.append(localAgenteTracker);
		builder.append(", localComision=");
		builder.append(localComision);
		builder.append(", localComisionTracker=");
		builder.append(localComisionTracker);
		builder.append(", localParticipacion=");
		builder.append(localParticipacion);
		builder.append(", localParticipacionTracker=");
		builder.append(localParticipacionTracker);
		builder.append(", ");
		if (localTipcer != null) {
			builder.append("localTipcer=");
			builder.append(localTipcer);
			builder.append(", ");
		}
		builder.append("localTipcerTracker=");
		builder.append(localTipcerTracker);
		builder.append(", ");
		if (localTipdoc != null) {
			builder.append("localTipdoc=");
			builder.append(localTipdoc);
			builder.append(", ");
		}
		builder.append("localTipdocTracker=");
		builder.append(localTipdocTracker);
		builder.append(", ");
		if (localFecini != null) {
			builder.append("localFecini=");
			builder.append(localFecini);
			builder.append(", ");
		}
		builder.append("localFeciniTracker=");
		builder.append(localFeciniTracker);
		builder.append(", ");
		if (localFecter != null) {
			builder.append("localFecter=");
			builder.append(localFecter);
			builder.append(", ");
		}
		builder.append("localFecterTracker=");
		builder.append(localFecterTracker);
		builder.append(", ");
		if (localFecexp != null) {
			builder.append("localFecexp=");
			builder.append(localFecexp);
			builder.append(", ");
		}
		builder.append("localFecexpTracker=");
		builder.append(localFecexpTracker);
		builder.append(", ");
		if (localFecori != null) {
			builder.append("localFecori=");
			builder.append(localFecori);
			builder.append(", ");
		}
		builder.append("localFecoriTracker=");
		builder.append(localFecoriTracker);
		builder.append(", ");
		if (localFecren != null) {
			builder.append("localFecren=");
			builder.append(localFecren);
			builder.append(", ");
		}
		builder.append("localFecrenTracker=");
		builder.append(localFecrenTracker);
		builder.append(", localDias=");
		builder.append(localDias);
		builder.append(", localDiasTracker=");
		builder.append(localDiasTracker);
		builder.append(", ");
		if (localHordes != null) {
			builder.append("localHordes=");
			builder.append(localHordes);
			builder.append(", ");
		}
		builder.append("localHordesTracker=");
		builder.append(localHordesTracker);
		builder.append(", ");
		if (localHorhas != null) {
			builder.append("localHorhas=");
			builder.append(localHorhas);
			builder.append(", ");
		}
		builder.append("localHorhasTracker=");
		builder.append(localHorhasTracker);
		builder.append(", localMoneda=");
		builder.append(localMoneda);
		builder.append(", localMonedaTracker=");
		builder.append(localMonedaTracker);
		builder.append(", ");
		if (localSucrea != null) {
			builder.append("localSucrea=");
			builder.append(localSucrea);
			builder.append(", ");
		}
		builder.append("localSucreaTracker=");
		builder.append(localSucreaTracker);
		builder.append(", ");
		if (localSucmod != null) {
			builder.append("localSucmod=");
			builder.append(localSucmod);
			builder.append(", ");
		}
		builder.append("localSucmodTracker=");
		builder.append(localSucmodTracker);
		builder.append(", ");
		if (localFecrea != null) {
			builder.append("localFecrea=");
			builder.append(localFecrea);
			builder.append(", ");
		}
		builder.append("localFecreaTracker=");
		builder.append(localFecreaTracker);
		builder.append(", ");
		if (localFecmod != null) {
			builder.append("localFecmod=");
			builder.append(localFecmod);
			builder.append(", ");
		}
		builder.append("localFecmodTracker=");
		builder.append(localFecmodTracker);
		builder.append(", localVaseg=");
		builder.append(localVaseg);
		builder.append(", localVasegTracker=");
		builder.append(localVasegTracker);
		builder.append(", localVprima=");
		builder.append(localVprima);
		builder.append(", localVprimaTracker=");
		builder.append(localVprimaTracker);
		builder.append(", localVbase=");
		builder.append(localVbase);
		builder.append(", localVbaseTracker=");
		builder.append(localVbaseTracker);
		builder.append(", localCambio=");
		builder.append(localCambio);
		builder.append(", localCambioTracker=");
		builder.append(localCambioTracker);
		builder.append(", localTipcoa=");
		builder.append(localTipcoa);
		builder.append(", localTipcoaTracker=");
		builder.append(localTipcoaTracker);
		builder.append(", localCoaseg=");
		builder.append(localCoaseg);
		builder.append(", localCoasegTracker=");
		builder.append(localCoasegTracker);
		builder.append(", ");
		if (localCoalider != null) {
			builder.append("localCoalider=");
			builder.append(localCoalider);
			builder.append(", ");
		}
		builder.append("localCoaliderTracker=");
		builder.append(localCoaliderTracker);
		builder.append(", ");
		if (localAntcodpla != null) {
			builder.append("localAntcodpla=");
			builder.append(localAntcodpla);
			builder.append(", ");
		}
		builder.append("localAntcodplaTracker=");
		builder.append(localAntcodplaTracker);
		builder.append(", ");
		if (localAntcertif != null) {
			builder.append("localAntcertif=");
			builder.append(localAntcertif);
			builder.append(", ");
		}
		builder.append("localAntcertifTracker=");
		builder.append(localAntcertifTracker);
		builder.append(", localAntorden=");
		builder.append(localAntorden);
		builder.append(", localAntordenTracker=");
		builder.append(localAntordenTracker);
		builder.append(", ");
		if (localFecout != null) {
			builder.append("localFecout=");
			builder.append(localFecout);
			builder.append(", ");
		}
		builder.append("localFecoutTracker=");
		builder.append(localFecoutTracker);
		builder.append(", ");
		if (localCotizacion != null) {
			builder.append("localCotizacion=");
			builder.append(localCotizacion);
			builder.append(", ");
		}
		builder.append("localCotizacionTracker=");
		builder.append(localCotizacionTracker);
		builder.append(", ");
		if (localCodcia != null) {
			builder.append("localCodcia=");
			builder.append(localCodcia);
			builder.append(", ");
		}
		builder.append("localCodciaTracker=");
		builder.append(localCodciaTracker);
		builder.append(", localForpag=");
		builder.append(localForpag);
		builder.append(", localForpagTracker=");
		builder.append(localForpagTracker);
		builder.append(", localTipflo=");
		builder.append(localTipflo);
		builder.append(", localTipfloTracker=");
		builder.append(localTipfloTracker);
		builder.append(", ");
		if (localClasifrea != null) {
			builder.append("localClasifrea=");
			builder.append(localClasifrea);
			builder.append(", ");
		}
		builder.append("localClasifreaTracker=");
		builder.append(localClasifreaTracker);
		builder.append(", ");
		if (localCumulo != null) {
			builder.append("localCumulo=");
			builder.append(localCumulo);
			builder.append(", ");
		}
		builder.append("localCumuloTracker=");
		builder.append(localCumuloTracker);
		builder.append(", ");
		if (localNumdoc != null) {
			builder.append("localNumdoc=");
			builder.append(localNumdoc);
			builder.append(", ");
		}
		builder.append("localNumdocTracker=");
		builder.append(localNumdocTracker);
		builder.append(", localDiafact=");
		builder.append(localDiafact);
		builder.append(", localDiafactTracker=");
		builder.append(localDiafactTracker);
		builder.append(", localValgastos=");
		builder.append(localValgastos);
		builder.append(", localValgastosTracker=");
		builder.append(localValgastosTracker);
		builder.append(", localPorgastos=");
		builder.append(localPorgastos);
		builder.append(", localPorgastosTracker=");
		builder.append(localPorgastosTracker);
		builder.append(", ");
		if (localPlanorden != null) {
			builder.append("localPlanorden=");
			builder.append(localPlanorden);
			builder.append(", ");
		}
		builder.append("localPlanordenTracker=");
		builder.append(localPlanordenTracker);
		builder.append(", localPordescuento=");
		builder.append(localPordescuento);
		builder.append(", localPordescuentoTracker=");
		builder.append(localPordescuentoTracker);
		builder.append(", localPorrecargo=");
		builder.append(localPorrecargo);
		builder.append(", localPorrecargoTracker=");
		builder.append(localPorrecargoTracker);
		builder.append(", localTipocarga=");
		builder.append(localTipocarga);
		builder.append(", localTipocargaTracker=");
		builder.append(localTipocargaTracker);
		builder.append(", localMotivocan=");
		builder.append(localMotivocan);
		builder.append(", localMotivocanTracker=");
		builder.append(localMotivocanTracker);
		builder.append(", ");
		if (localPollider != null) {
			builder.append("localPollider=");
			builder.append(localPollider);
			builder.append(", ");
		}
		builder.append("localPolliderTracker=");
		builder.append(localPolliderTracker);
		builder.append(", ");
		if (localCerlider != null) {
			builder.append("localCerlider=");
			builder.append(localCerlider);
			builder.append(", ");
		}
		builder.append("localCerliderTracker=");
		builder.append(localCerliderTracker);
		builder.append(", localOrdengrupo=");
		builder.append(localOrdengrupo);
		builder.append(", localOrdengrupoTracker=");
		builder.append(localOrdengrupoTracker);
		builder.append(", ");
		if (localPlaza != null) {
			builder.append("localPlaza=");
			builder.append(localPlaza);
			builder.append(", ");
		}
		builder.append("localPlazaTracker=");
		builder.append(localPlazaTracker);
		builder.append(", ");
		if (localAmarreplan != null) {
			builder.append("localAmarreplan=");
			builder.append(localAmarreplan);
			builder.append(", ");
		}
		builder.append("localAmarreplanTracker=");
		builder.append(localAmarreplanTracker);
		builder.append(", ");
		if (localAmarrecertif != null) {
			builder.append("localAmarrecertif=");
			builder.append(localAmarrecertif);
			builder.append(", ");
		}
		builder.append("localAmarrecertifTracker=");
		builder.append(localAmarrecertifTracker);
		builder.append(", localAmarreorden=");
		builder.append(localAmarreorden);
		builder.append(", localAmarreordenTracker=");
		builder.append(localAmarreordenTracker);
		builder.append(", ");
		if (localAmarrepoliza != null) {
			builder.append("localAmarrepoliza=");
			builder.append(localAmarrepoliza);
			builder.append(", ");
		}
		builder.append("localAmarrepolizaTracker=");
		builder.append(localAmarrepolizaTracker);
		builder.append(", ");
		if (localFecterplan != null) {
			builder.append("localFecterplan=");
			builder.append(localFecterplan);
			builder.append(", ");
		}
		builder.append("localFecterplanTracker=");
		builder.append(localFecterplanTracker);
		builder.append(", localTipfac=");
		builder.append(localTipfac);
		builder.append(", localTipfacTracker=");
		builder.append(localTipfacTracker);
		builder.append(", localValiva=");
		builder.append(localValiva);
		builder.append(", localValivaTracker=");
		builder.append(localValivaTracker);
		builder.append(", localNivel=");
		builder.append(localNivel);
		builder.append(", localNivelTracker=");
		builder.append(localNivelTracker);
		builder.append(", localRol=");
		builder.append(localRol);
		builder.append(", localRolTracker=");
		builder.append(localRolTracker);
		builder.append(", localCesioncomision=");
		builder.append(localCesioncomision);
		builder.append(", localCesioncomisionTracker=");
		builder.append(localCesioncomisionTracker);
		builder.append(", localCertifcausacion=");
		builder.append(localCertifcausacion);
		builder.append(", localCertifcausacionTracker=");
		builder.append(localCertifcausacionTracker);
		builder.append(", localPordescesion=");
		builder.append(localPordescesion);
		builder.append(", localPordescesionTracker=");
		builder.append(localPordescesionTracker);
		builder.append(", ");
		if (localFecimpuestos != null) {
			builder.append("localFecimpuestos=");
			builder.append(localFecimpuestos);
			builder.append(", ");
		}
		builder.append("localFecimpuestosTracker=");
		builder.append(localFecimpuestosTracker);
		builder.append(", localImpresa=");
		builder.append(localImpresa);
		builder.append(", localImpresaTracker=");
		builder.append(localImpresaTracker);
		builder.append(", ");
		if (localUbicacion != null) {
			builder.append("localUbicacion=");
			builder.append(localUbicacion);
			builder.append(", ");
		}
		builder.append("localUbicacionTracker=");
		builder.append(localUbicacionTracker);
		builder.append(", ");
		if (localPolizaSequence_type0 != null) {
			builder.append("localPolizaSequence_type0=");
			builder.append(localPolizaSequence_type0);
			builder.append(", ");
		}
		if (localPolizaSequence_type1 != null) {
			builder.append("localPolizaSequence_type1=");
			builder.append(localPolizaSequence_type1);
			builder.append(", ");
		}
		if (localPolizaSequence_type2 != null) {
			builder.append("localPolizaSequence_type2=");
			builder.append(localPolizaSequence_type2);
			builder.append(", ");
		}
		if (localPolizaSequence_type3 != null) {
			builder.append("localPolizaSequence_type3=");
			builder.append(localPolizaSequence_type3);
			builder.append(", ");
		}
		if (localPolizaSequence_type4 != null) {
			builder.append("localPolizaSequence_type4=");
			builder.append(localPolizaSequence_type4);
			builder.append(", ");
		}
		if (localPolizaSequence_type5 != null) {
			builder.append("localPolizaSequence_type5=");
			builder.append(localPolizaSequence_type5);
		}
		builder.append("]");
		return builder.toString();
	}

        

        }
           
    