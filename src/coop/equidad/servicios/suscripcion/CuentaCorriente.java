
/**
 * CuentaCorriente.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:09:26 BST)
 */

            
                package coop.equidad.servicios.suscripcion;
            

            /**
            *  CuentaCorriente bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class CuentaCorriente
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = CuentaCorriente
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
                        * field for Fecdoc
                        */

                        
                                    protected java.util.Date localFecdoc ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFecdocTracker = false ;

                           public boolean isFecdocSpecified(){
                               return localFecdocTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getFecdoc(){
                               return localFecdoc;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Fecdoc
                               */
                               public void setFecdoc(java.util.Date param){
                            localFecdocTracker = param != null;
                                   
                                            this.localFecdoc=param;
                                       

                               }
                            

                        /**
                        * field for Fecven
                        */

                        
                                    protected java.util.Date localFecven ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFecvenTracker = false ;

                           public boolean isFecvenSpecified(){
                               return localFecvenTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getFecven(){
                               return localFecven;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Fecven
                               */
                               public void setFecven(java.util.Date param){
                            localFecvenTracker = param != null;
                                   
                                            this.localFecven=param;
                                       

                               }
                            

                        /**
                        * field for Feccam
                        */

                        
                                    protected java.util.Date localFeccam ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFeccamTracker = false ;

                           public boolean isFeccamSpecified(){
                               return localFeccamTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getFeccam(){
                               return localFeccam;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Feccam
                               */
                               public void setFeccam(java.util.Date param){
                            localFeccamTracker = param != null;
                                   
                                            this.localFeccam=param;
                                       

                               }
                            

                        /**
                        * field for Feccon
                        */

                        
                                    protected java.util.Date localFeccon ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFecconTracker = false ;

                           public boolean isFecconSpecified(){
                               return localFecconTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getFeccon(){
                               return localFeccon;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Feccon
                               */
                               public void setFeccon(java.util.Date param){
                            localFecconTracker = param != null;
                                   
                                            this.localFeccon=param;
                                       

                               }
                            

                        /**
                        * field for Estado
                        */

                        
                                    protected java.lang.String localEstado ;
                                
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
                           * @return java.lang.String
                           */
                           public  java.lang.String getEstado(){
                               return localEstado;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Estado
                               */
                               public void setEstado(java.lang.String param){
                            localEstadoTracker = param != null;
                                   
                                            this.localEstado=param;
                                       

                               }
                            

                        /**
                        * field for Codtra
                        */

                        
                                    protected java.lang.String localCodtra ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCodtraTracker = false ;

                           public boolean isCodtraSpecified(){
                               return localCodtraTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCodtra(){
                               return localCodtra;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Codtra
                               */
                               public void setCodtra(java.lang.String param){
                            localCodtraTracker = param != null;
                                   
                                            this.localCodtra=param;
                                       

                               }
                            

                        /**
                        * field for Oriant
                        */

                        
                                    protected java.lang.String localOriant ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOriantTracker = false ;

                           public boolean isOriantSpecified(){
                               return localOriantTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOriant(){
                               return localOriant;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Oriant
                               */
                               public void setOriant(java.lang.String param){
                            localOriantTracker = param != null;
                                   
                                            this.localOriant=param;
                                       

                               }
                            

                        /**
                        * field for Tipant
                        */

                        
                                    protected java.lang.String localTipant ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTipantTracker = false ;

                           public boolean isTipantSpecified(){
                               return localTipantTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTipant(){
                               return localTipant;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Tipant
                               */
                               public void setTipant(java.lang.String param){
                            localTipantTracker = param != null;
                                   
                                            this.localTipant=param;
                                       

                               }
                            

                        /**
                        * field for Numant
                        */

                        
                                    protected java.lang.String localNumant ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNumantTracker = false ;

                           public boolean isNumantSpecified(){
                               return localNumantTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getNumant(){
                               return localNumant;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Numant
                               */
                               public void setNumant(java.lang.String param){
                            localNumantTracker = param != null;
                                   
                                            this.localNumant=param;
                                       

                               }
                            

                        /**
                        * field for Ctaant
                        */

                        
                                    protected java.lang.String localCtaant ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCtaantTracker = false ;

                           public boolean isCtaantSpecified(){
                               return localCtaantTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCtaant(){
                               return localCtaant;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Ctaant
                               */
                               public void setCtaant(java.lang.String param){
                            localCtaantTracker = param != null;
                                   
                                            this.localCtaant=param;
                                       

                               }
                            

                        /**
                        * field for Oripos
                        */

                        
                                    protected java.lang.String localOripos ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOriposTracker = false ;

                           public boolean isOriposSpecified(){
                               return localOriposTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOripos(){
                               return localOripos;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Oripos
                               */
                               public void setOripos(java.lang.String param){
                            localOriposTracker = param != null;
                                   
                                            this.localOripos=param;
                                       

                               }
                            

                        /**
                        * field for Tippos
                        */

                        
                                    protected java.lang.String localTippos ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTipposTracker = false ;

                           public boolean isTipposSpecified(){
                               return localTipposTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTippos(){
                               return localTippos;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Tippos
                               */
                               public void setTippos(java.lang.String param){
                            localTipposTracker = param != null;
                                   
                                            this.localTippos=param;
                                       

                               }
                            

                        /**
                        * field for Numpos
                        */

                        
                                    protected java.lang.String localNumpos ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNumposTracker = false ;

                           public boolean isNumposSpecified(){
                               return localNumposTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getNumpos(){
                               return localNumpos;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Numpos
                               */
                               public void setNumpos(java.lang.String param){
                            localNumposTracker = param != null;
                                   
                                            this.localNumpos=param;
                                       

                               }
                            

                        /**
                        * field for Ctapos
                        */

                        
                                    protected java.lang.String localCtapos ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCtaposTracker = false ;

                           public boolean isCtaposSpecified(){
                               return localCtaposTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCtapos(){
                               return localCtapos;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Ctapos
                               */
                               public void setCtapos(java.lang.String param){
                            localCtaposTracker = param != null;
                                   
                                            this.localCtapos=param;
                                       

                               }
                            

                        /**
                        * field for Oriref
                        */

                        
                                    protected int localOriref ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOrirefTracker = false ;

                           public boolean isOrirefSpecified(){
                               return localOrirefTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getOriref(){
                               return localOriref;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Oriref
                               */
                               public void setOriref(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localOrirefTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localOriref=param;
                                       

                               }
                            

                        /**
                        * field for Tipref
                        */

                        
                                    protected java.lang.String localTipref ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTiprefTracker = false ;

                           public boolean isTiprefSpecified(){
                               return localTiprefTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTipref(){
                               return localTipref;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Tipref
                               */
                               public void setTipref(java.lang.String param){
                            localTiprefTracker = param != null;
                                   
                                            this.localTipref=param;
                                       

                               }
                            

                        /**
                        * field for Numref
                        */

                        
                                    protected java.lang.String localNumref ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNumrefTracker = false ;

                           public boolean isNumrefSpecified(){
                               return localNumrefTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getNumref(){
                               return localNumref;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Numref
                               */
                               public void setNumref(java.lang.String param){
                            localNumrefTracker = param != null;
                                   
                                            this.localNumref=param;
                                       

                               }
                            

                        /**
                        * field for Ctaref
                        */

                        
                                    protected java.lang.String localCtaref ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCtarefTracker = false ;

                           public boolean isCtarefSpecified(){
                               return localCtarefTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCtaref(){
                               return localCtaref;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Ctaref
                               */
                               public void setCtaref(java.lang.String param){
                            localCtarefTracker = param != null;
                                   
                                            this.localCtaref=param;
                                       

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
                        * field for Tascam
                        */

                        
                                    protected float localTascam ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTascamTracker = false ;

                           public boolean isTascamSpecified(){
                               return localTascamTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getTascam(){
                               return localTascam;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Tascam
                               */
                               public void setTascam(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localTascamTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localTascam=param;
                                       

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
                        * field for Ramo
                        */

                        
                                    protected java.lang.String localRamo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRamoTracker = false ;

                           public boolean isRamoSpecified(){
                               return localRamoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRamo(){
                               return localRamo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Ramo
                               */
                               public void setRamo(java.lang.String param){
                            localRamoTracker = param != null;
                                   
                                            this.localRamo=param;
                                       

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
                        * field for Cencos
                        */

                        
                                    protected java.lang.String localCencos ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCencosTracker = false ;

                           public boolean isCencosSpecified(){
                               return localCencosTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCencos(){
                               return localCencos;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Cencos
                               */
                               public void setCencos(java.lang.String param){
                            localCencosTracker = param != null;
                                   
                                            this.localCencos=param;
                                       

                               }
                            

                        /**
                        * field for Agente
                        */

                        
                                    protected java.lang.String localAgente ;
                                
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
                           * @return java.lang.String
                           */
                           public  java.lang.String getAgente(){
                               return localAgente;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Agente
                               */
                               public void setAgente(java.lang.String param){
                            localAgenteTracker = param != null;
                                   
                                            this.localAgente=param;
                                       

                               }
                            

                        /**
                        * field for Preimp
                        */

                        
                                    protected java.lang.String localPreimp ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPreimpTracker = false ;

                           public boolean isPreimpSpecified(){
                               return localPreimpTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPreimp(){
                               return localPreimp;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Preimp
                               */
                               public void setPreimp(java.lang.String param){
                            localPreimpTracker = param != null;
                                   
                                            this.localPreimp=param;
                                       

                               }
                            

                        /**
                        * field for Flag01
                        */

                        
                                    protected java.lang.String localFlag01 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFlag01Tracker = false ;

                           public boolean isFlag01Specified(){
                               return localFlag01Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getFlag01(){
                               return localFlag01;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Flag01
                               */
                               public void setFlag01(java.lang.String param){
                            localFlag01Tracker = param != null;
                                   
                                            this.localFlag01=param;
                                       

                               }
                            

                        /**
                        * field for Flag02
                        */

                        
                                    protected java.lang.String localFlag02 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFlag02Tracker = false ;

                           public boolean isFlag02Specified(){
                               return localFlag02Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getFlag02(){
                               return localFlag02;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Flag02
                               */
                               public void setFlag02(java.lang.String param){
                            localFlag02Tracker = param != null;
                                   
                                            this.localFlag02=param;
                                       

                               }
                            

                        /**
                        * field for Flag03
                        */

                        
                                    protected java.lang.String localFlag03 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFlag03Tracker = false ;

                           public boolean isFlag03Specified(){
                               return localFlag03Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getFlag03(){
                               return localFlag03;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Flag03
                               */
                               public void setFlag03(java.lang.String param){
                            localFlag03Tracker = param != null;
                                   
                                            this.localFlag03=param;
                                       

                               }
                            

                        /**
                        * field for Flag04
                        */

                        
                                    protected java.lang.String localFlag04 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFlag04Tracker = false ;

                           public boolean isFlag04Specified(){
                               return localFlag04Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getFlag04(){
                               return localFlag04;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Flag04
                               */
                               public void setFlag04(java.lang.String param){
                            localFlag04Tracker = param != null;
                                   
                                            this.localFlag04=param;
                                       

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
                        * field for Comisi
                        */

                        
                                    protected float localComisi ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localComisiTracker = false ;

                           public boolean isComisiSpecified(){
                               return localComisiTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getComisi(){
                               return localComisi;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Comisi
                               */
                               public void setComisi(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localComisiTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localComisi=param;
                                       

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
                        * field for Cruce
                        */

                        
                                    protected int localCruce ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCruceTracker = false ;

                           public boolean isCruceSpecified(){
                               return localCruceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getCruce(){
                               return localCruce;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Cruce
                               */
                               public void setCruce(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localCruceTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localCruce=param;
                                       

                               }
                            

                        /**
                        * field for Cencos2
                        */

                        
                                    protected int localCencos2 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCencos2Tracker = false ;

                           public boolean isCencos2Specified(){
                               return localCencos2Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getCencos2(){
                               return localCencos2;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Cencos2
                               */
                               public void setCencos2(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localCencos2Tracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localCencos2=param;
                                       

                               }
                            

                        /**
                        * field for Ccos2
                        */

                        
                                    protected int localCcos2 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCcos2Tracker = false ;

                           public boolean isCcos2Specified(){
                               return localCcos2Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getCcos2(){
                               return localCcos2;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Ccos2
                               */
                               public void setCcos2(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localCcos2Tracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localCcos2=param;
                                       

                               }
                            

                        /**
                        * field for Sucurtraslado
                        */

                        
                                    protected java.lang.String localSucurtraslado ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSucurtrasladoTracker = false ;

                           public boolean isSucurtrasladoSpecified(){
                               return localSucurtrasladoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSucurtraslado(){
                               return localSucurtraslado;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Sucurtraslado
                               */
                               public void setSucurtraslado(java.lang.String param){
                            localSucurtrasladoTracker = param != null;
                                   
                                            this.localSucurtraslado=param;
                                       

                               }
                            

                        /**
                        * field for Impmod
                        */

                        
                                    protected int localImpmod ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localImpmodTracker = false ;

                           public boolean isImpmodSpecified(){
                               return localImpmodTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getImpmod(){
                               return localImpmod;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Impmod
                               */
                               public void setImpmod(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localImpmodTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localImpmod=param;
                                       

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
                        * field for Oritraslado
                        */

                        
                                    protected int localOritraslado ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOritrasladoTracker = false ;

                           public boolean isOritrasladoSpecified(){
                               return localOritrasladoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getOritraslado(){
                               return localOritraslado;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Oritraslado
                               */
                               public void setOritraslado(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localOritrasladoTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localOritraslado=param;
                                       

                               }
                            

                        /**
                        * field for Tiptraslado
                        */

                        
                                    protected java.lang.String localTiptraslado ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTiptrasladoTracker = false ;

                           public boolean isTiptrasladoSpecified(){
                               return localTiptrasladoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTiptraslado(){
                               return localTiptraslado;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Tiptraslado
                               */
                               public void setTiptraslado(java.lang.String param){
                            localTiptrasladoTracker = param != null;
                                   
                                            this.localTiptraslado=param;
                                       

                               }
                            

                        /**
                        * field for Numtraslado
                        */

                        
                                    protected java.lang.String localNumtraslado ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNumtrasladoTracker = false ;

                           public boolean isNumtrasladoSpecified(){
                               return localNumtrasladoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getNumtraslado(){
                               return localNumtraslado;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Numtraslado
                               */
                               public void setNumtraslado(java.lang.String param){
                            localNumtrasladoTracker = param != null;
                                   
                                            this.localNumtraslado=param;
                                       

                               }
                            

                        /**
                        * field for Ctatraslado
                        */

                        
                                    protected java.lang.String localCtatraslado ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCtatrasladoTracker = false ;

                           public boolean isCtatrasladoSpecified(){
                               return localCtatrasladoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCtatraslado(){
                               return localCtatraslado;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Ctatraslado
                               */
                               public void setCtatraslado(java.lang.String param){
                            localCtatrasladoTracker = param != null;
                                   
                                            this.localCtatraslado=param;
                                       

                               }
                            

                        /**
                        * field for Valdet1
                        */

                        
                                    protected java.lang.String localValdet1 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localValdet1Tracker = false ;

                           public boolean isValdet1Specified(){
                               return localValdet1Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getValdet1(){
                               return localValdet1;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Valdet1
                               */
                               public void setValdet1(java.lang.String param){
                            localValdet1Tracker = param != null;
                                   
                                            this.localValdet1=param;
                                       

                               }
                            

                        /**
                        * field for Valdet2
                        */

                        
                                    protected java.lang.String localValdet2 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localValdet2Tracker = false ;

                           public boolean isValdet2Specified(){
                               return localValdet2Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getValdet2(){
                               return localValdet2;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Valdet2
                               */
                               public void setValdet2(java.lang.String param){
                            localValdet2Tracker = param != null;
                                   
                                            this.localValdet2=param;
                                       

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
                        * field for Numalterno
                        */

                        
                                    protected java.lang.String localNumalterno ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNumalternoTracker = false ;

                           public boolean isNumalternoSpecified(){
                               return localNumalternoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getNumalterno(){
                               return localNumalterno;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Numalterno
                               */
                               public void setNumalterno(java.lang.String param){
                            localNumalternoTracker = param != null;
                                   
                                            this.localNumalterno=param;
                                       

                               }
                            

                        /**
                        * field for Fechaimpresion
                        */

                        
                                    protected java.util.Date localFechaimpresion ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFechaimpresionTracker = false ;

                           public boolean isFechaimpresionSpecified(){
                               return localFechaimpresionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getFechaimpresion(){
                               return localFechaimpresion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Fechaimpresion
                               */
                               public void setFechaimpresion(java.util.Date param){
                            localFechaimpresionTracker = param != null;
                                   
                                            this.localFechaimpresion=param;
                                       

                               }
                            

                        /**
                        * field for Fechapago
                        */

                        
                                    protected java.util.Date localFechapago ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFechapagoTracker = false ;

                           public boolean isFechapagoSpecified(){
                               return localFechapagoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getFechapago(){
                               return localFechapago;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Fechapago
                               */
                               public void setFechapago(java.util.Date param){
                            localFechapagoTracker = param != null;
                                   
                                            this.localFechapago=param;
                                       

                               }
                            

                        /**
                        * field for CuentaCorrienteSequence_type0
                        */

                        
                                    protected coop.equidad.servicios.suscripcion.CuentaCorrienteSequence_type0 localCuentaCorrienteSequence_type0 ;
                                

                           /**
                           * Auto generated getter method
                           * @return coop.equidad.servicios.suscripcion.CuentaCorrienteSequence_type0
                           */
                           public  coop.equidad.servicios.suscripcion.CuentaCorrienteSequence_type0 getCuentaCorrienteSequence_type0(){
                               return localCuentaCorrienteSequence_type0;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CuentaCorrienteSequence_type0
                               */
                               public void setCuentaCorrienteSequence_type0(coop.equidad.servicios.suscripcion.CuentaCorrienteSequence_type0 param){
                            
                                            this.localCuentaCorrienteSequence_type0=param;
                                       

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
                           namespacePrefix+":CuentaCorriente",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "CuentaCorriente",
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
                             } if (localFecdocTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "fecdoc", xmlWriter);
                             

                                          if (localFecdoc==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("fecdoc cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFecdoc));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFecvenTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "fecven", xmlWriter);
                             

                                          if (localFecven==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("fecven cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFecven));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFeccamTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "feccam", xmlWriter);
                             

                                          if (localFeccam==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("feccam cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFeccam));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFecconTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "feccon", xmlWriter);
                             

                                          if (localFeccon==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("feccon cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFeccon));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEstadoTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "estado", xmlWriter);
                             

                                          if (localEstado==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("estado cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localEstado);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCodtraTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "codtra", xmlWriter);
                             

                                          if (localCodtra==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("codtra cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCodtra);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOriantTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "oriant", xmlWriter);
                             

                                          if (localOriant==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("oriant cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOriant);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTipantTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "tipant", xmlWriter);
                             

                                          if (localTipant==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("tipant cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTipant);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNumantTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "numant", xmlWriter);
                             

                                          if (localNumant==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("numant cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localNumant);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCtaantTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "ctaant", xmlWriter);
                             

                                          if (localCtaant==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ctaant cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCtaant);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOriposTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "oripos", xmlWriter);
                             

                                          if (localOripos==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("oripos cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOripos);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTipposTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "tippos", xmlWriter);
                             

                                          if (localTippos==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("tippos cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTippos);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNumposTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "numpos", xmlWriter);
                             

                                          if (localNumpos==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("numpos cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localNumpos);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCtaposTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "ctapos", xmlWriter);
                             

                                          if (localCtapos==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ctapos cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCtapos);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOrirefTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "oriref", xmlWriter);
                             
                                               if (localOriref==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("oriref cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOriref));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTiprefTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "tipref", xmlWriter);
                             

                                          if (localTipref==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("tipref cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTipref);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNumrefTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "numref", xmlWriter);
                             

                                          if (localNumref==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("numref cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localNumref);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCtarefTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "ctaref", xmlWriter);
                             

                                          if (localCtaref==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ctaref cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCtaref);
                                            
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
                             } if (localTascamTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "tascam", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localTascam)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("tascam cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTascam));
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
                             } if (localRamoTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "ramo", xmlWriter);
                             

                                          if (localRamo==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ramo cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRamo);
                                            
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
                             } if (localCencosTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "cencos", xmlWriter);
                             

                                          if (localCencos==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("cencos cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCencos);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAgenteTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "agente", xmlWriter);
                             

                                          if (localAgente==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("agente cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAgente);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPreimpTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "preimp", xmlWriter);
                             

                                          if (localPreimp==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("preimp cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPreimp);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFlag01Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "flag01", xmlWriter);
                             

                                          if (localFlag01==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("flag01 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localFlag01);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFlag02Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "flag02", xmlWriter);
                             

                                          if (localFlag02==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("flag02 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localFlag02);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFlag03Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "flag03", xmlWriter);
                             

                                          if (localFlag03==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("flag03 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localFlag03);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFlag04Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "flag04", xmlWriter);
                             

                                          if (localFlag04==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("flag04 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localFlag04);
                                            
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
                             } if (localTipvalTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "tipval", xmlWriter);
                             
                                               if (localTipval==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("tipval cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTipval));
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
                             } if (localComisiTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "comisi", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localComisi)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("comisi cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localComisi));
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
                             } if (localCruceTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "cruce", xmlWriter);
                             
                                               if (localCruce==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("cruce cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCruce));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCencos2Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "cencos2", xmlWriter);
                             
                                               if (localCencos2==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("cencos2 cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCencos2));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCcos2Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "ccos2", xmlWriter);
                             
                                               if (localCcos2==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("ccos2 cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCcos2));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSucurtrasladoTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "sucurtraslado", xmlWriter);
                             

                                          if (localSucurtraslado==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("sucurtraslado cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSucurtraslado);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localImpmodTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "impmod", xmlWriter);
                             
                                               if (localImpmod==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("impmod cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localImpmod));
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
                             } if (localOritrasladoTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "oritraslado", xmlWriter);
                             
                                               if (localOritraslado==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("oritraslado cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOritraslado));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTiptrasladoTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "tiptraslado", xmlWriter);
                             

                                          if (localTiptraslado==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("tiptraslado cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTiptraslado);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNumtrasladoTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "numtraslado", xmlWriter);
                             

                                          if (localNumtraslado==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("numtraslado cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localNumtraslado);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCtatrasladoTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "ctatraslado", xmlWriter);
                             

                                          if (localCtatraslado==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ctatraslado cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCtatraslado);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localValdet1Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "valdet1", xmlWriter);
                             

                                          if (localValdet1==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("valdet1 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localValdet1);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localValdet2Tracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "valdet2", xmlWriter);
                             

                                          if (localValdet2==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("valdet2 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localValdet2);
                                            
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
                             } if (localNumalternoTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "numalterno", xmlWriter);
                             

                                          if (localNumalterno==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("numalterno cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localNumalterno);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFechaimpresionTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "fechaimpresion", xmlWriter);
                             

                                          if (localFechaimpresion==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("fechaimpresion cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFechaimpresion));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFechapagoTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "fechapago", xmlWriter);
                             

                                          if (localFechapago==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("fechapago cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFechapago));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                            if (localCuentaCorrienteSequence_type0==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CuentaCorrienteSequence_type0 cannot be null!!");
                                            }
                                           localCuentaCorrienteSequence_type0.serialize(null,xmlWriter);
                                        
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
        public static CuentaCorriente parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            CuentaCorriente object =
                new CuentaCorriente();

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
                    
                            if (!"CuentaCorriente".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (CuentaCorriente)coop.equidad.servicios.suscripcion.ExtensionMapper.getTypeObject(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","fecdoc").equals(reader.getName()) || new javax.xml.namespace.QName("","fecdoc").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"fecdoc" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFecdoc(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","fecven").equals(reader.getName()) || new javax.xml.namespace.QName("","fecven").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"fecven" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFecven(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","feccam").equals(reader.getName()) || new javax.xml.namespace.QName("","feccam").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"feccam" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFeccam(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","feccon").equals(reader.getName()) || new javax.xml.namespace.QName("","feccon").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"feccon" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFeccon(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","estado").equals(reader.getName()) || new javax.xml.namespace.QName("","estado").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"estado" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEstado(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","codtra").equals(reader.getName()) || new javax.xml.namespace.QName("","codtra").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"codtra" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCodtra(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","oriant").equals(reader.getName()) || new javax.xml.namespace.QName("","oriant").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"oriant" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOriant(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","tipant").equals(reader.getName()) || new javax.xml.namespace.QName("","tipant").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"tipant" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTipant(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","numant").equals(reader.getName()) || new javax.xml.namespace.QName("","numant").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"numant" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNumant(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ctaant").equals(reader.getName()) || new javax.xml.namespace.QName("","ctaant").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ctaant" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCtaant(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","oripos").equals(reader.getName()) || new javax.xml.namespace.QName("","oripos").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"oripos" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOripos(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","tippos").equals(reader.getName()) || new javax.xml.namespace.QName("","tippos").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"tippos" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTippos(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","numpos").equals(reader.getName()) || new javax.xml.namespace.QName("","numpos").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"numpos" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNumpos(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ctapos").equals(reader.getName()) || new javax.xml.namespace.QName("","ctapos").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ctapos" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCtapos(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","oriref").equals(reader.getName()) || new javax.xml.namespace.QName("","oriref").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"oriref" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOriref(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setOriref(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","tipref").equals(reader.getName()) || new javax.xml.namespace.QName("","tipref").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"tipref" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTipref(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","numref").equals(reader.getName()) || new javax.xml.namespace.QName("","numref").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"numref" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNumref(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ctaref").equals(reader.getName()) || new javax.xml.namespace.QName("","ctaref").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ctaref" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCtaref(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","tascam").equals(reader.getName()) || new javax.xml.namespace.QName("","tascam").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"tascam" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTascam(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTascam(java.lang.Float.NaN);
                                           
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ramo").equals(reader.getName()) || new javax.xml.namespace.QName("","ramo").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ramo" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRamo(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","cencos").equals(reader.getName()) || new javax.xml.namespace.QName("","cencos").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"cencos" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCencos(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","agente").equals(reader.getName()) || new javax.xml.namespace.QName("","agente").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"agente" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAgente(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","preimp").equals(reader.getName()) || new javax.xml.namespace.QName("","preimp").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"preimp" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPreimp(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","flag01").equals(reader.getName()) || new javax.xml.namespace.QName("","flag01").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"flag01" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFlag01(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","flag02").equals(reader.getName()) || new javax.xml.namespace.QName("","flag02").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"flag02" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFlag02(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","flag03").equals(reader.getName()) || new javax.xml.namespace.QName("","flag03").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"flag03" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFlag03(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","flag04").equals(reader.getName()) || new javax.xml.namespace.QName("","flag04").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"flag04" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFlag04(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","comisi").equals(reader.getName()) || new javax.xml.namespace.QName("","comisi").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"comisi" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setComisi(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setComisi(java.lang.Float.NaN);
                                           
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","cruce").equals(reader.getName()) || new javax.xml.namespace.QName("","cruce").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"cruce" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCruce(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setCruce(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","cencos2").equals(reader.getName()) || new javax.xml.namespace.QName("","cencos2").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"cencos2" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCencos2(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setCencos2(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ccos2").equals(reader.getName()) || new javax.xml.namespace.QName("","ccos2").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ccos2" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCcos2(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setCcos2(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","sucurtraslado").equals(reader.getName()) || new javax.xml.namespace.QName("","sucurtraslado").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"sucurtraslado" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSucurtraslado(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","impmod").equals(reader.getName()) || new javax.xml.namespace.QName("","impmod").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"impmod" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setImpmod(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setImpmod(java.lang.Integer.MIN_VALUE);
                                           
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","oritraslado").equals(reader.getName()) || new javax.xml.namespace.QName("","oritraslado").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"oritraslado" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOritraslado(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setOritraslado(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","tiptraslado").equals(reader.getName()) || new javax.xml.namespace.QName("","tiptraslado").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"tiptraslado" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTiptraslado(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","numtraslado").equals(reader.getName()) || new javax.xml.namespace.QName("","numtraslado").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"numtraslado" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNumtraslado(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ctatraslado").equals(reader.getName()) || new javax.xml.namespace.QName("","ctatraslado").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ctatraslado" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCtatraslado(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","valdet1").equals(reader.getName()) || new javax.xml.namespace.QName("","valdet1").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"valdet1" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setValdet1(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","valdet2").equals(reader.getName()) || new javax.xml.namespace.QName("","valdet2").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"valdet2" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setValdet2(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","numalterno").equals(reader.getName()) || new javax.xml.namespace.QName("","numalterno").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"numalterno" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNumalterno(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","fechaimpresion").equals(reader.getName()) || new javax.xml.namespace.QName("","fechaimpresion").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"fechaimpresion" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFechaimpresion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","fechapago").equals(reader.getName()) || new javax.xml.namespace.QName("","fechapago").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"fechapago" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFechapago(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() ){
                                
                                                object.setCuentaCorrienteSequence_type0(coop.equidad.servicios.suscripcion.CuentaCorrienteSequence_type0.Factory.parse(reader));
                                            
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

        

        }
           
    