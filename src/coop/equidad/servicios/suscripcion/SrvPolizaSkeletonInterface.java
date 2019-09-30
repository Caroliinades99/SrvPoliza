
/**
 * SrvPolizaSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:08:57 BST)
 */
    package coop.equidad.servicios.suscripcion;
    /**
     *  SrvPolizaSkeletonInterface java skeleton interface for the axisService
     */
    public interface SrvPolizaSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param cancelarCertificado
         */

        
                public coop.equidad.servicios.suscripcion.CancelarCertificadoResponse cancelarCertificado
                (
                  coop.equidad.servicios.suscripcion.CancelarCertificado cancelarCertificado, String token
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param consultarPoliza
         */

        
                public coop.equidad.servicios.suscripcion.ConsultarPolizaResponse consultarPoliza
                (
                  coop.equidad.servicios.suscripcion.ConsultarPoliza consultarPoliza, String token
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param buscarPolizas
         */

        
                public coop.equidad.servicios.suscripcion.BuscarPolizasResponse buscarPolizas
                (
                  coop.equidad.servicios.suscripcion.BuscarPolizas buscarPolizas, String token
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param emitirPoliza
         */

        
                public coop.equidad.servicios.suscripcion.EmitirPolizaResponse emitirPoliza
                (
                  coop.equidad.servicios.suscripcion.EmitirPoliza emitirPoliza, String token
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param crearCotizacion
         */

        
                public coop.equidad.servicios.suscripcion.CrearCotizacionResponse crearCotizacion
                (
                  coop.equidad.servicios.suscripcion.CrearCotizacion crearCotizacion, String token
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param anularCertificado
         */

        
                public coop.equidad.servicios.suscripcion.AnularCertificadoResponse anularCertificado
                (
                  coop.equidad.servicios.suscripcion.AnularCertificado anularCertificado, String token
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param validarCotizacion
         */

        
                public coop.equidad.servicios.suscripcion.ValidarCotizacionResponse validarCotizacion
                (
                  coop.equidad.servicios.suscripcion.ValidarCotizacion validarCotizacion, String token
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param actualizarCotizacion
         */

        
                public coop.equidad.servicios.suscripcion.ActualizarCotizacionResponse actualizarCotizacion
                (
                  coop.equidad.servicios.suscripcion.ActualizarCotizacion actualizarCotizacion, String token
                 )
            ;
        
         }
    