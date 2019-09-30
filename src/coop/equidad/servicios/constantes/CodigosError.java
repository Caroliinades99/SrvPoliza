package coop.equidad.servicios.constantes;

public enum CodigosError {
	
	/**
	 * 	message crearCotizacion
	 */
	COD_VALCRC_PARAMCOT("1001", "No envia objeto parametros cotizacion"),
	COD_VALCRC_PARAMCOT_USUARIO("1002", "El campo 'usuario' esta vacio o no es valido"),
	COD_VALCRC_PARAMCOT_TIPO_OBJ("1003", "El campo 'tipoObjeto' esta vacio o no es valido"),
	
	COD_VALCRC_POL("1004", "No envia objeto poliza"),
	COD_VALCRC_POL_SUCUR("1005", "El campo 'sucur' esta vacio o no es valido"),
	COD_VALCRC_POL_COMP("1006", "El campo 'comp' esta vacio o no es valido"),	
	COD_VALCRC_POL_VASEG("1007", "El campo 'vaseg' esta vacio o no es valido"),
	COD_VALCRC_POL_TOMADOR("1008", "El campo 'tomador' esta vacio o no es valido"),
	COD_VALCRC_POL_ASEG("1009", "El campo 'asegurado' esta vacio o no es valido"),
	COD_VALCRC_POL_BENEF("1010", "El campo 'beneficiario' esta vacio o no es valido"),
	COD_VALCRC_POL_AGENTE("1011", "El campo 'agente' esta vacio o no es valido"),
	COD_VALCRC_POL_FECINI("1012", "El campo 'fecIni' esta vacio o no es valido"),
	COD_VALCRC_POL_FECTER("1013", "El campo 'fecTer' esta vacio o no es valido"),
	COD_VALCRC_BS_POL_FECINITER("1014", "La 'fecTer' debe ser igual o posterior a la 'fecIni'"),
	COD_VALCRC_POL_DIAS("1015", "El campo 'dias' esta vacio o no es valido"),
	COD_VALCRC_POL_COMISION("1016", "El campo 'comision' esta vacio o no es valido"),
	
	
	COD_VALCRC_POL_PROD("1017", "No envia informacion del producto en la peticion o excede el maximo permitido"),
	COD_VALCRC_POL_PRODUCTO_DET("1018", "Datos incompletos o no validos en producto"),
	COD_VALCRC_POL_TERCERO("1019", "No envia terceros en la peticion"),
	COD_VALCRC_POL_TERCERO_DET("1020", "Datos incompletos o no validos en terceros"),	
	
	COD_VALCRC_BS_POL_TERCERO_DET_OBL("1021", "No envia todos los terceros obligatorios"),
	COD_VALCRC_BS_POL_TERCERO_DET_TOMADOR("1022", "No envia codigo vinculacion del tomador"),
	COD_VALCRC_BS_POL_TERCERO_DET_ASEGURADO("1023", "No envia codigo vinculacion del asegurado"),
	COD_VALCRC_BS_POL_TERCERO_DET_BENEFICIARIO("1024", "No envia codigo vinculacion del beneficiario"),
	COD_VALCRC_BS_POL_TERCERO_DET_AGENTE("1025", "No envia codigo vinculacion del agente"),
	COD_VALCRC_BD_POL_TERCERO_EXI_AGENTE("1026", "No existe intermediario con el codigo enviado"),
	COD_VALCRC_BD_POL_TERCERO_TP_JUR_SARLAFT("9043", "Falta diligenciar formato único"),
	
	
	COD_VALCRC_POL_DETALLE("1027", "No envia detalles en la peticion"),
	COD_VALCRC_POL_DETALLE_DET("1028", "Datos incompletos o no validos en detalles"),
	
	COD_VALCRC_POL_COBERT("1029", "No envia coberturas en la peticion"),
	COD_VALCRC_POL_COBERT_DET("1030", "Datos incompletos o no validos en coberturas"),
	
	COD_VALCRC_POL_CTACTE("1031", "No envia cuenta corriente en la peticion"),
	COD_VALCRC_POL_CTACTE_DET("1032", "Datos incompletos o no validos en cuenta corriente"),

	COD_VALCRC_SPSEGURIDAD("1033", "No pasa la validacion de seguridad"),
	COD_VALCRC_SPVALDETOBL("1034", ""),
	COD_VALCRC_SPTAR("1035", "No se llevo a cabo el proceso de tarifar"),
	COD_VALCRC_SP_VAL_TAR("1036", "Restricción en la emisión, por favor comunicarse con la aseguradora"),
	COD_VALCRC_BD_POL_TERCERO_EXITOSO("1037", "Tercero Exitoso"),
	COD_VALCRC_SEXO("1038", "El campo 'sexo' esta vacio o no es valido"),
	
	
	/**
	 * 	message validarCotizacion
	 */
	COD_VALVLC_COT("2001", "El campo 'certif' esta vacio o no es valido."),
	COD_VALVLC_SUCUR("2002", "El campo 'sucur' esta vacio o no es valido."),
	COD_VALVLC_CODPLA("2003", "El campo 'codpla' esta vacio o no es valido."),
	COD_VALVLC_ORDEN("2004", "El campo 'orden' esta vacio o no es valido."),
	COD_VALVLC_POLEX("2005", "No existe cotizacion con los parametros ingresados"),	
	COD_VALVLC_SPTAR("2005", "No se llevo a cabo el proceso de tarifar."),
	
	
	/**
	 * 	message consultarPoliza
	 */
	COD_VALCSP_COT("3001", "El campo 'certif' esta vacio o no es valido."),
	COD_VALCSP_SUCUR("3002", "El campo 'sucur' esta vacio o no es valido."),
	COD_VALCSP_CODPLA("3003", "El campo 'codpla' esta vacio o no es valido."),
	COD_VALCSP_ORDEN("3004", "El campo 'orden' esta vacio o no es valido."),
	COD_VALCSP_POLEX("3005", "No existe poliza con los parametros ingresados"),	
	
	/**
	 * 	message buscarPolizas
	 */
	COD_VALBSP_PAR("4001", "No envia parametros de busqueda de polizas."),
	COD_VALASE_PAR("4002", "Valor invalido para el parametro 'Asegurado'."),
	COD_VALCER_PAR("4003", "Valor invalido para el parametro 'Certif'."),
	COD_VALCOP_PAR("4004", "Valor invalido para el parametro 'Codpla'."),
	COD_VALPOL_PAR("4005", "Valor invalido para el parametro 'Poliza'."),
	COD_VALSUC_PAR("4006", "Valor invalido para el parametro 'Sucur'."),
	
	/**
	 * 	message cancelarCertificado
	 */
	COD_CANCERT_SUCUR("5001", "El campo 'sucur' esta vacio o no es valido."),	
	COD_CANCERT_POLIZA("5002", "El campo 'poliza' esta vacio o no es valido."),
	COD_CANCERT_CERTIF("5003", "El campo 'certif' esta vacio o no es valido."),	
	COD_CANCERT_CODPLA("5004", "El campo 'codpla' esta vacio o no es valido."),
	COD_CANCERT_FECANC("5005", "El campo 'fechaCancelacion' esta vacio o no es valido."),
	COD_CANCERT_CAUSA("5006", "El campo 'causa' esta vacio o no es valido."),
	COD_CANCERT_POLEX("5007", "No existe poliza con los parametros ingresados"),
	COD_CANCERT_SPCAN("5008", "No se llevo a cabo el proceso de cancelacion."),
	
	/**
	 * 	message anularCertificado
	 */
	COD_ANUCERT_SUCUR("6001", "El campo 'sucur' esta vacio o no es valido."),	
	COD_ANUCERT_POLIZA("6002", "El campo 'poliza' esta vacio o no es valido."),
	COD_ANUCERT_CERTIF("6003", "El campo 'certif' esta vacio o no es valido."),	
	COD_ANUCERT_CODPLA("6004", "El campo 'codpla' esta vacio o no es valido."),
	COD_ANUCERT_POLEX("6006", "No existe poliza con los parametros ingresados"),
	COD_ANUCERT_SPANU("6007", "No se llevo a cabo el proceso de anulacion."),
	
	/**
	 * message actualizarCertificado
	 */
	COD_ACTCOT_SUCUR("7001", "El campo 'sucur' esta vacio o no es valido."),
	COD_ACTCOT_CERT("7002", "El campo 'certif' esta vacio o no es valido."),	
	COD_ACTCOT_CODPLA("7003", "El campo 'codpla' esta vacio o no es valido."),
	COD_ACTCOT_ORDEN("7004", "El campo 'orden' esta vacio o no es valido."),
	COD_ACTCOT_POLEX("7005", "No existe cotizacion con los parametros ingresados"),
	COD_ACTCOT_ERR("7006", "No se llevo a cabo el proceso de actualizacion."),	
	COD_ACTCOT_DETALLE("7007", "No envia detalles para actualizar."),
	COD_ACTCOT_DETALLE_DET("7008", "Datos incompletos o no validos en detalles."),
	
	
	COD_EMIPOL_COT("8001", "El campo 'cotizacion' esta vacio o no es valido."),
	COD_EMIPOL_SUCUR("8002", "El campo 'sucur' esta vacio o no es valido."),
	COD_EMIPOL_CODPLA("8003", "El campo 'codpla' esta vacio o no es valido."),
	COD_EMIPOL_ORDEN("8004", "El campo 'orden' esta vacio o no es valido."),
	COD_EMIPOL_COTEX("8005", "No existe cotizacion con los parametros ingresados."),
	COD_EMIPOL_DET("8006", "Error detalle unico."),
	COD_EMIPOL_RCT("8007", "Restriccion comunicarse con la aseguradora."),
	COD_EMIPOL_ERR("8008", "No se llevo a cabo el proceso de emision."),
	COD_EMIPOL_SARLAF("8009", "El tomador no registra SARLAF."),
	COD_EMIPOL_INESPERADO("9999", "Error inesperado.");

	private final String codError;
	private final String descError;
	
	private CodigosError(String codError, String descError) {
		this.codError = codError;
		this.descError = descError;
	}
	
	public String getCodError() {
		return codError;
	}
	
	public String getDescError() {
		return descError;
	}

}
