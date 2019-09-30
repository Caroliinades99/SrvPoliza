
/**
 * Cobertura.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:09:26 BST)
 */

            
                package coop.equidad.servicios.suscripcion;
            

            /**
            *  Cobertura bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Cobertura
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Cobertura
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
                        * field for Inciso
                        */

                        
                                    protected int localInciso ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIncisoTracker = false ;

                           public boolean isIncisoSpecified(){
                               return localIncisoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getInciso(){
                               return localInciso;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Inciso
                               */
                               public void setInciso(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localIncisoTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localInciso=param;
                                       

                               }
                            

                        /**
                        * field for Codcla
                        */

                        
                                    protected java.lang.String localCodcla ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCodclaTracker = false ;

                           public boolean isCodclaSpecified(){
                               return localCodclaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCodcla(){
                               return localCodcla;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Codcla
                               */
                               public void setCodcla(java.lang.String param){
                            localCodclaTracker = param != null;
                                   
                                            this.localCodcla=param;
                                       

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
                        * field for Estant
                        */

                        
                                    protected int localEstant ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEstantTracker = false ;

                           public boolean isEstantSpecified(){
                               return localEstantTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getEstant(){
                               return localEstant;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Estant
                               */
                               public void setEstant(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localEstantTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localEstant=param;
                                       

                               }
                            

                        /**
                        * field for Tasa
                        */

                        
                                    protected float localTasa ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTasaTracker = false ;

                           public boolean isTasaSpecified(){
                               return localTasaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getTasa(){
                               return localTasa;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Tasa
                               */
                               public void setTasa(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localTasaTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localTasa=param;
                                       

                               }
                            

                        /**
                        * field for Vaseg
                        */

                        
                                    protected long localVaseg ;
                                
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
                           public  long getVaseg(){
                               return localVaseg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Vaseg
                               */
                               public void setVaseg(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localVasegTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localVaseg=param;
                                       

                               }
                            

                        /**
                        * field for Prima
                        */

                        
                                    protected float localPrima ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPrimaTracker = false ;

                           public boolean isPrimaSpecified(){
                               return localPrimaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getPrima(){
                               return localPrima;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Prima
                               */
                               public void setPrima(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localPrimaTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localPrima=param;
                                       

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
                        * field for Cumcat
                        */

                        
                                    protected int localCumcat ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCumcatTracker = false ;

                           public boolean isCumcatSpecified(){
                               return localCumcatTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getCumcat(){
                               return localCumcat;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Cumcat
                               */
                               public void setCumcat(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localCumcatTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localCumcat=param;
                                       

                               }
                            

                        /**
                        * field for Deduca
                        */

                        
                                    protected float localDeduca ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDeducaTracker = false ;

                           public boolean isDeducaSpecified(){
                               return localDeducaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getDeduca(){
                               return localDeduca;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Deduca
                               */
                               public void setDeduca(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localDeducaTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localDeduca=param;
                                       

                               }
                            

                        /**
                        * field for Deducm
                        */

                        
                                    protected float localDeducm ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDeducmTracker = false ;

                           public boolean isDeducmSpecified(){
                               return localDeducmTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getDeducm(){
                               return localDeducm;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Deducm
                               */
                               public void setDeducm(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localDeducmTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localDeducm=param;
                                       

                               }
                            

                        /**
                        * field for Deducp
                        */

                        
                                    protected float localDeducp ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDeducpTracker = false ;

                           public boolean isDeducpSpecified(){
                               return localDeducpTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getDeducp(){
                               return localDeducp;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Deducp
                               */
                               public void setDeducp(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localDeducpTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localDeducp=param;
                                       

                               }
                            

                        /**
                        * field for Monded
                        */

                        
                                    protected int localMonded ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMondedTracker = false ;

                           public boolean isMondedSpecified(){
                               return localMondedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getMonded(){
                               return localMonded;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Monded
                               */
                               public void setMonded(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localMondedTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localMonded=param;
                                       

                               }
                            

                        /**
                        * field for Monval
                        */

                        
                                    protected int localMonval ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMonvalTracker = false ;

                           public boolean isMonvalSpecified(){
                               return localMonvalTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getMonval(){
                               return localMonval;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Monval
                               */
                               public void setMonval(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localMonvalTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localMonval=param;
                                       

                               }
                            

                        /**
                        * field for Tipo
                        */

                        
                                    protected int localTipo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTipoTracker = false ;

                           public boolean isTipoSpecified(){
                               return localTipoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getTipo(){
                               return localTipo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Tipo
                               */
                               public void setTipo(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localTipoTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localTipo=param;
                                       

                               }
                            

                        /**
                        * field for Prirev
                        */

                        
                                    protected float localPrirev ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPrirevTracker = false ;

                           public boolean isPrirevSpecified(){
                               return localPrirevTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getPrirev(){
                               return localPrirev;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Prirev
                               */
                               public void setPrirev(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localPrirevTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localPrirev=param;
                                       

                               }
                            

                        /**
                        * field for Pricau
                        */

                        
                                    protected float localPricau ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPricauTracker = false ;

                           public boolean isPricauSpecified(){
                               return localPricauTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getPricau(){
                               return localPricau;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Pricau
                               */
                               public void setPricau(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localPricauTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localPricau=param;
                                       

                               }
                            

                        /**
                        * field for Vasant
                        */

                        
                                    protected float localVasant ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localVasantTracker = false ;

                           public boolean isVasantSpecified(){
                               return localVasantTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getVasant(){
                               return localVasant;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Vasant
                               */
                               public void setVasant(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localVasantTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localVasant=param;
                                       

                               }
                            

                        /**
                        * field for Tasant
                        */

                        
                                    protected float localTasant ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTasantTracker = false ;

                           public boolean isTasantSpecified(){
                               return localTasantTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getTasant(){
                               return localTasant;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Tasant
                               */
                               public void setTasant(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localTasantTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localTasant=param;
                                       

                               }
                            

                        /**
                        * field for Priant
                        */

                        
                                    protected float localPriant ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPriantTracker = false ;

                           public boolean isPriantSpecified(){
                               return localPriantTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getPriant(){
                               return localPriant;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Priant
                               */
                               public void setPriant(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localPriantTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localPriant=param;
                                       

                               }
                            

                        /**
                        * field for Impuesto
                        */

                        
                                    protected int localImpuesto ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localImpuestoTracker = false ;

                           public boolean isImpuestoSpecified(){
                               return localImpuestoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getImpuesto(){
                               return localImpuesto;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Impuesto
                               */
                               public void setImpuesto(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localImpuestoTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localImpuesto=param;
                                       

                               }
                            

                        /**
                        * field for Codram
                        */

                        
                                    protected java.lang.String localCodram ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCodramTracker = false ;

                           public boolean isCodramSpecified(){
                               return localCodramTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCodram(){
                               return localCodram;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Codram
                               */
                               public void setCodram(java.lang.String param){
                            localCodramTracker = param != null;
                                   
                                            this.localCodram=param;
                                       

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
                        * field for Fecfin
                        */

                        
                                    protected java.util.Date localFecfin ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFecfinTracker = false ;

                           public boolean isFecfinSpecified(){
                               return localFecfinTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getFecfin(){
                               return localFecfin;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Fecfin
                               */
                               public void setFecfin(java.util.Date param){
                            localFecfinTracker = param != null;
                                   
                                            this.localFecfin=param;
                                       

                               }
                            

                        /**
                        * field for Vasegpol
                        */

                        
                                    protected float localVasegpol ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localVasegpolTracker = false ;

                           public boolean isVasegpolSpecified(){
                               return localVasegpolTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getVasegpol(){
                               return localVasegpol;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Vasegpol
                               */
                               public void setVasegpol(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localVasegpolTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localVasegpol=param;
                                       

                               }
                            

                        /**
                        * field for Carencia
                        */

                        
                                    protected int localCarencia ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCarenciaTracker = false ;

                           public boolean isCarenciaSpecified(){
                               return localCarenciaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getCarencia(){
                               return localCarencia;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Carencia
                               */
                               public void setCarencia(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localCarenciaTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localCarencia=param;
                                       

                               }
                            

                        /**
                        * field for Tasariesgo
                        */

                        
                                    protected float localTasariesgo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTasariesgoTracker = false ;

                           public boolean isTasariesgoSpecified(){
                               return localTasariesgoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getTasariesgo(){
                               return localTasariesgo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Tasariesgo
                               */
                               public void setTasariesgo(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localTasariesgoTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localTasariesgo=param;
                                       

                               }
                            

                        /**
                        * field for Tasaperiodo
                        */

                        
                                    protected float localTasaperiodo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTasaperiodoTracker = false ;

                           public boolean isTasaperiodoSpecified(){
                               return localTasaperiodoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getTasaperiodo(){
                               return localTasaperiodo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Tasaperiodo
                               */
                               public void setTasaperiodo(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localTasaperiodoTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localTasaperiodo=param;
                                       

                               }
                            

                        /**
                        * field for Tasaproteccion
                        */

                        
                                    protected float localTasaproteccion ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTasaproteccionTracker = false ;

                           public boolean isTasaproteccionSpecified(){
                               return localTasaproteccionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getTasaproteccion(){
                               return localTasaproteccion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Tasaproteccion
                               */
                               public void setTasaproteccion(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localTasaproteccionTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localTasaproteccion=param;
                                       

                               }
                            

                        /**
                        * field for Gruporea
                        */

                        
                                    protected int localGruporea ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGruporeaTracker = false ;

                           public boolean isGruporeaSpecified(){
                               return localGruporeaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getGruporea(){
                               return localGruporea;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Gruporea
                               */
                               public void setGruporea(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localGruporeaTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localGruporea=param;
                                       

                               }
                            

                        /**
                        * field for Monprima
                        */

                        
                                    protected int localMonprima ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMonprimaTracker = false ;

                           public boolean isMonprimaSpecified(){
                               return localMonprimaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getMonprima(){
                               return localMonprima;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Monprima
                               */
                               public void setMonprima(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localMonprimaTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localMonprima=param;
                                       

                               }
                            

                        /**
                        * field for Primapoliza
                        */

                        
                                    protected float localPrimapoliza ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPrimapolizaTracker = false ;

                           public boolean isPrimapolizaSpecified(){
                               return localPrimapolizaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getPrimapoliza(){
                               return localPrimapoliza;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Primapoliza
                               */
                               public void setPrimapoliza(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localPrimapolizaTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localPrimapoliza=param;
                                       

                               }
                            

                        /**
                        * field for Primareas
                        */

                        
                                    protected float localPrimareas ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPrimareasTracker = false ;

                           public boolean isPrimareasSpecified(){
                               return localPrimareasTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getPrimareas(){
                               return localPrimareas;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Primareas
                               */
                               public void setPrimareas(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localPrimareasTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localPrimareas=param;
                                       

                               }
                            

                        /**
                        * field for Pricaureas
                        */

                        
                                    protected float localPricaureas ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPricaureasTracker = false ;

                           public boolean isPricaureasSpecified(){
                               return localPricaureasTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getPricaureas(){
                               return localPricaureas;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Pricaureas
                               */
                               public void setPricaureas(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localPricaureasTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localPricaureas=param;
                                       

                               }
                            

                        /**
                        * field for Prirevreas
                        */

                        
                                    protected float localPrirevreas ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPrirevreasTracker = false ;

                           public boolean isPrirevreasSpecified(){
                               return localPrirevreasTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getPrirevreas(){
                               return localPrirevreas;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Prirevreas
                               */
                               public void setPrirevreas(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localPrirevreasTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localPrirevreas=param;
                                       

                               }
                            

                        /**
                        * field for Coapactado
                        */

                        
                                    protected float localCoapactado ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCoapactadoTracker = false ;

                           public boolean isCoapactadoSpecified(){
                               return localCoapactadoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getCoapactado(){
                               return localCoapactado;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Coapactado
                               */
                               public void setCoapactado(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localCoapactadoTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localCoapactado=param;
                                       

                               }
                            

                        /**
                        * field for Pordedvalor
                        */

                        
                                    protected float localPordedvalor ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPordedvalorTracker = false ;

                           public boolean isPordedvalorSpecified(){
                               return localPordedvalorTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getPordedvalor(){
                               return localPordedvalor;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Pordedvalor
                               */
                               public void setPordedvalor(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localPordedvalorTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localPordedvalor=param;
                                       

                               }
                            

                        /**
                        * field for Tasareas
                        */

                        
                                    protected float localTasareas ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTasareasTracker = false ;

                           public boolean isTasareasSpecified(){
                               return localTasareasTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getTasareas(){
                               return localTasareas;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Tasareas
                               */
                               public void setTasareas(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localTasareasTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localTasareas=param;
                                       

                               }
                            

                        /**
                        * field for Copago
                        */

                        
                                    protected float localCopago ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCopagoTracker = false ;

                           public boolean isCopagoSpecified(){
                               return localCopagoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getCopago(){
                               return localCopago;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Copago
                               */
                               public void setCopago(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localCopagoTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localCopago=param;
                                       

                               }
                            

                        /**
                        * field for Moncopago
                        */

                        
                                    protected int localMoncopago ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMoncopagoTracker = false ;

                           public boolean isMoncopagoSpecified(){
                               return localMoncopagoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getMoncopago(){
                               return localMoncopago;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Moncopago
                               */
                               public void setMoncopago(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localMoncopagoTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localMoncopago=param;
                                       

                               }
                            

                        /**
                        * field for Consumo
                        */

                        
                                    protected int localConsumo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localConsumoTracker = false ;

                           public boolean isConsumoSpecified(){
                               return localConsumoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getConsumo(){
                               return localConsumo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Consumo
                               */
                               public void setConsumo(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localConsumoTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localConsumo=param;
                                       

                               }
                            

                        /**
                        * field for Dedmax
                        */

                        
                                    protected float localDedmax ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDedmaxTracker = false ;

                           public boolean isDedmaxSpecified(){
                               return localDedmaxTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getDedmax(){
                               return localDedmax;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Dedmax
                               */
                               public void setDedmax(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localDedmaxTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localDedmax=param;
                                       

                               }
                            

                        /**
                        * field for Indvariable
                        */

                        
                                    protected float localIndvariable ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIndvariableTracker = false ;

                           public boolean isIndvariableSpecified(){
                               return localIndvariableTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getIndvariable(){
                               return localIndvariable;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Indvariable
                               */
                               public void setIndvariable(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localIndvariableTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localIndvariable=param;
                                       

                               }
                            

                        /**
                        * field for Descuentos
                        */

                        
                                    protected float localDescuentos ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDescuentosTracker = false ;

                           public boolean isDescuentosSpecified(){
                               return localDescuentosTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getDescuentos(){
                               return localDescuentos;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Descuentos
                               */
                               public void setDescuentos(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localDescuentosTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localDescuentos=param;
                                       

                               }
                            

                        /**
                        * field for Recargos
                        */

                        
                                    protected float localRecargos ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRecargosTracker = false ;

                           public boolean isRecargosSpecified(){
                               return localRecargosTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getRecargos(){
                               return localRecargos;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Recargos
                               */
                               public void setRecargos(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localRecargosTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localRecargos=param;
                                       

                               }
                            

                        /**
                        * field for Numpag
                        */

                        
                                    protected int localNumpag ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNumpagTracker = false ;

                           public boolean isNumpagSpecified(){
                               return localNumpagTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getNumpag(){
                               return localNumpag;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Numpag
                               */
                               public void setNumpag(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localNumpagTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localNumpag=param;
                                       

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
                           namespacePrefix+":Cobertura",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Cobertura",
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
                             } if (localIncisoTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "inciso", xmlWriter);
                             
                                               if (localInciso==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("inciso cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInciso));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCodclaTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "codcla", xmlWriter);
                             

                                          if (localCodcla==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("codcla cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCodcla);
                                            
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
                             } if (localEstantTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "estant", xmlWriter);
                             
                                               if (localEstant==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("estant cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEstant));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTasaTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "tasa", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localTasa)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("tasa cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTasa));
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
                             } if (localPrimaTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "prima", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localPrima)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("prima cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrima));
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
                             } if (localCumcatTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "cumcat", xmlWriter);
                             
                                               if (localCumcat==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("cumcat cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCumcat));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDeducaTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "deduca", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localDeduca)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("deduca cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDeduca));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDeducmTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "deducm", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localDeducm)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("deducm cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDeducm));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDeducpTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "deducp", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localDeducp)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("deducp cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDeducp));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMondedTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "monded", xmlWriter);
                             
                                               if (localMonded==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("monded cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMonded));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMonvalTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "monval", xmlWriter);
                             
                                               if (localMonval==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("monval cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMonval));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTipoTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "tipo", xmlWriter);
                             
                                               if (localTipo==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("tipo cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTipo));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPrirevTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "prirev", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localPrirev)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("prirev cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrirev));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPricauTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "pricau", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localPricau)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("pricau cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPricau));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localVasantTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "vasant", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localVasant)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("vasant cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVasant));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTasantTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "tasant", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localTasant)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("tasant cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTasant));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPriantTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "priant", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localPriant)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("priant cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPriant));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localImpuestoTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "impuesto", xmlWriter);
                             
                                               if (localImpuesto==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("impuesto cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localImpuesto));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCodramTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "codram", xmlWriter);
                             

                                          if (localCodram==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("codram cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCodram);
                                            
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
                             } if (localFecfinTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "fecfin", xmlWriter);
                             

                                          if (localFecfin==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("fecfin cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFecfin));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localVasegpolTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "vasegpol", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localVasegpol)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("vasegpol cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVasegpol));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCarenciaTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "carencia", xmlWriter);
                             
                                               if (localCarencia==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("carencia cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCarencia));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTasariesgoTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "tasariesgo", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localTasariesgo)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("tasariesgo cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTasariesgo));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTasaperiodoTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "tasaperiodo", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localTasaperiodo)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("tasaperiodo cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTasaperiodo));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTasaproteccionTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "tasaproteccion", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localTasaproteccion)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("tasaproteccion cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTasaproteccion));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGruporeaTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "gruporea", xmlWriter);
                             
                                               if (localGruporea==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("gruporea cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGruporea));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMonprimaTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "monprima", xmlWriter);
                             
                                               if (localMonprima==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("monprima cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMonprima));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPrimapolizaTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "primapoliza", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localPrimapoliza)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("primapoliza cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrimapoliza));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPrimareasTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "primareas", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localPrimareas)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("primareas cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrimareas));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPricaureasTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "pricaureas", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localPricaureas)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("pricaureas cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPricaureas));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPrirevreasTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "prirevreas", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localPrirevreas)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("prirevreas cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrirevreas));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCoapactadoTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "coapactado", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localCoapactado)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("coapactado cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCoapactado));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPordedvalorTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "pordedvalor", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localPordedvalor)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("pordedvalor cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPordedvalor));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTasareasTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "tasareas", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localTasareas)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("tasareas cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTasareas));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCopagoTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "copago", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localCopago)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("copago cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCopago));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMoncopagoTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "moncopago", xmlWriter);
                             
                                               if (localMoncopago==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("moncopago cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMoncopago));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localConsumoTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "consumo", xmlWriter);
                             
                                               if (localConsumo==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("consumo cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localConsumo));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDedmaxTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "dedmax", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localDedmax)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("dedmax cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDedmax));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIndvariableTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "indvariable", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localIndvariable)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("indvariable cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIndvariable));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDescuentosTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "descuentos", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localDescuentos)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("descuentos cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescuentos));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRecargosTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "recargos", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localRecargos)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("recargos cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRecargos));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNumpagTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "numpag", xmlWriter);
                             
                                               if (localNumpag==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("numpag cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumpag));
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
        public static Cobertura parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Cobertura object =
                new Cobertura();

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
                    
                            if (!"Cobertura".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Cobertura)coop.equidad.servicios.suscripcion.ExtensionMapper.getTypeObject(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","inciso").equals(reader.getName()) || new javax.xml.namespace.QName("","inciso").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"inciso" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setInciso(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setInciso(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","codcla").equals(reader.getName()) || new javax.xml.namespace.QName("","codcla").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"codcla" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCodcla(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
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
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setEstado(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","estant").equals(reader.getName()) || new javax.xml.namespace.QName("","estant").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"estant" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEstant(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setEstant(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","tasa").equals(reader.getName()) || new javax.xml.namespace.QName("","tasa").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"tasa" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTasa(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTasa(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","vaseg").equals(reader.getName()) || new javax.xml.namespace.QName("","vaseg").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"vaseg" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setVaseg(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setVaseg(0);
                                               //object.setVaseg(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","prima").equals(reader.getName()) || new javax.xml.namespace.QName("","prima").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"prima" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPrima(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPrima(java.lang.Float.NaN);
                                           
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","cumcat").equals(reader.getName()) || new javax.xml.namespace.QName("","cumcat").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"cumcat" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCumcat(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setCumcat(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","deduca").equals(reader.getName()) || new javax.xml.namespace.QName("","deduca").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"deduca" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDeduca(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setDeduca(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","deducm").equals(reader.getName()) || new javax.xml.namespace.QName("","deducm").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"deducm" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDeducm(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setDeducm(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","deducp").equals(reader.getName()) || new javax.xml.namespace.QName("","deducp").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"deducp" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDeducp(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setDeducp(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","monded").equals(reader.getName()) || new javax.xml.namespace.QName("","monded").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"monded" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMonded(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setMonded(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","monval").equals(reader.getName()) || new javax.xml.namespace.QName("","monval").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"monval" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMonval(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setMonval(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","tipo").equals(reader.getName()) || new javax.xml.namespace.QName("","tipo").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"tipo" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTipo(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTipo(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","prirev").equals(reader.getName()) || new javax.xml.namespace.QName("","prirev").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"prirev" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPrirev(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPrirev(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","pricau").equals(reader.getName()) || new javax.xml.namespace.QName("","pricau").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"pricau" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPricau(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPricau(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","vasant").equals(reader.getName()) || new javax.xml.namespace.QName("","vasant").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"vasant" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setVasant(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setVasant(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","tasant").equals(reader.getName()) || new javax.xml.namespace.QName("","tasant").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"tasant" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTasant(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTasant(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","priant").equals(reader.getName()) || new javax.xml.namespace.QName("","priant").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"priant" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPriant(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPriant(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","impuesto").equals(reader.getName()) || new javax.xml.namespace.QName("","impuesto").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"impuesto" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setImpuesto(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setImpuesto(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","codram").equals(reader.getName()) || new javax.xml.namespace.QName("","codram").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"codram" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCodram(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","fecfin").equals(reader.getName()) || new javax.xml.namespace.QName("","fecfin").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"fecfin" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFecfin(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","vasegpol").equals(reader.getName()) || new javax.xml.namespace.QName("","vasegpol").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"vasegpol" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setVasegpol(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setVasegpol(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","carencia").equals(reader.getName()) || new javax.xml.namespace.QName("","carencia").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"carencia" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCarencia(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setCarencia(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","tasariesgo").equals(reader.getName()) || new javax.xml.namespace.QName("","tasariesgo").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"tasariesgo" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTasariesgo(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTasariesgo(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","tasaperiodo").equals(reader.getName()) || new javax.xml.namespace.QName("","tasaperiodo").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"tasaperiodo" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTasaperiodo(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTasaperiodo(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","tasaproteccion").equals(reader.getName()) || new javax.xml.namespace.QName("","tasaproteccion").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"tasaproteccion" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTasaproteccion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTasaproteccion(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","gruporea").equals(reader.getName()) || new javax.xml.namespace.QName("","gruporea").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"gruporea" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGruporea(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setGruporea(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","monprima").equals(reader.getName()) || new javax.xml.namespace.QName("","monprima").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"monprima" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMonprima(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setMonprima(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","primapoliza").equals(reader.getName()) || new javax.xml.namespace.QName("","primapoliza").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"primapoliza" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPrimapoliza(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPrimapoliza(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","primareas").equals(reader.getName()) || new javax.xml.namespace.QName("","primareas").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"primareas" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPrimareas(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPrimareas(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","pricaureas").equals(reader.getName()) || new javax.xml.namespace.QName("","pricaureas").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"pricaureas" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPricaureas(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPricaureas(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","prirevreas").equals(reader.getName()) || new javax.xml.namespace.QName("","prirevreas").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"prirevreas" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPrirevreas(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPrirevreas(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","coapactado").equals(reader.getName()) || new javax.xml.namespace.QName("","coapactado").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"coapactado" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCoapactado(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setCoapactado(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","pordedvalor").equals(reader.getName()) || new javax.xml.namespace.QName("","pordedvalor").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"pordedvalor" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPordedvalor(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPordedvalor(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","tasareas").equals(reader.getName()) || new javax.xml.namespace.QName("","tasareas").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"tasareas" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTasareas(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTasareas(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","copago").equals(reader.getName()) || new javax.xml.namespace.QName("","copago").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"copago" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCopago(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setCopago(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","moncopago").equals(reader.getName()) || new javax.xml.namespace.QName("","moncopago").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"moncopago" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMoncopago(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setMoncopago(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","consumo").equals(reader.getName()) || new javax.xml.namespace.QName("","consumo").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"consumo" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setConsumo(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setConsumo(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","dedmax").equals(reader.getName()) || new javax.xml.namespace.QName("","dedmax").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"dedmax" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDedmax(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setDedmax(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","indvariable").equals(reader.getName()) || new javax.xml.namespace.QName("","indvariable").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"indvariable" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIndvariable(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setIndvariable(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","descuentos").equals(reader.getName()) || new javax.xml.namespace.QName("","descuentos").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"descuentos" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDescuentos(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setDescuentos(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","recargos").equals(reader.getName()) || new javax.xml.namespace.QName("","recargos").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"recargos" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRecargos(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setRecargos(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","numpag").equals(reader.getName()) || new javax.xml.namespace.QName("","numpag").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"numpag" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNumpag(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setNumpag(java.lang.Integer.MIN_VALUE);
                                           
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
           
    