
/**
 * SrvPolizaCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:08:57 BST)
 */

    package coop.equidad.servicios.suscripcion;

    /**
     *  SrvPolizaCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class SrvPolizaCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public SrvPolizaCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public SrvPolizaCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for cancelarCertificado method
            * override this method for handling normal response from cancelarCertificado operation
            */
           public void receiveResultcancelarCertificado(
                    coop.equidad.servicios.suscripcion.CancelarCertificadoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from cancelarCertificado operation
           */
            public void receiveErrorcancelarCertificado(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for consultarPoliza method
            * override this method for handling normal response from consultarPoliza operation
            */
           public void receiveResultconsultarPoliza(
                    coop.equidad.servicios.suscripcion.ConsultarPolizaResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from consultarPoliza operation
           */
            public void receiveErrorconsultarPoliza(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for buscarPolizas method
            * override this method for handling normal response from buscarPolizas operation
            */
           public void receiveResultbuscarPolizas(
                    coop.equidad.servicios.suscripcion.BuscarPolizasResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from buscarPolizas operation
           */
            public void receiveErrorbuscarPolizas(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for emitirPoliza method
            * override this method for handling normal response from emitirPoliza operation
            */
           public void receiveResultemitirPoliza(
                    coop.equidad.servicios.suscripcion.EmitirPolizaResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from emitirPoliza operation
           */
            public void receiveErroremitirPoliza(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for crearCotizacion method
            * override this method for handling normal response from crearCotizacion operation
            */
           public void receiveResultcrearCotizacion(
                    coop.equidad.servicios.suscripcion.CrearCotizacionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from crearCotizacion operation
           */
            public void receiveErrorcrearCotizacion(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for anularCertificado method
            * override this method for handling normal response from anularCertificado operation
            */
           public void receiveResultanularCertificado(
                    coop.equidad.servicios.suscripcion.AnularCertificadoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from anularCertificado operation
           */
            public void receiveErroranularCertificado(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for validarCotizacion method
            * override this method for handling normal response from validarCotizacion operation
            */
           public void receiveResultvalidarCotizacion(
                    coop.equidad.servicios.suscripcion.ValidarCotizacionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from validarCotizacion operation
           */
            public void receiveErrorvalidarCotizacion(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for actualizarCotizacion method
            * override this method for handling normal response from actualizarCotizacion operation
            */
           public void receiveResultactualizarCotizacion(
                    coop.equidad.servicios.suscripcion.ActualizarCotizacionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from actualizarCotizacion operation
           */
            public void receiveErroractualizarCotizacion(java.lang.Exception e) {
            }
                


    }
    