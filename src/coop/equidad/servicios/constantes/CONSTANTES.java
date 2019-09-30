package coop.equidad.servicios.constantes;

import java.math.BigDecimal;

public class CONSTANTES {
	/**
	 */
	public static final String COD_VIDA = "3";
	public static final String COD_GEN = "1";

	public final static String COD_RESP_EXITOSO = "1";
	public final static String COD_RESP_FALLIDO = "0";

	public final static String PR_SEGURIDAD = "osiris.pk_webservices.pr_seguridad";
	public final static String PR_NROCOTIZACION = "osiris.pk_webservices.pr_nrocotizacion";
	public final static String PR_PERSONAS = "osiris.pk_webservices.pr_personas";
	public final static String PR_COTPERSONAS = "osiris.pk_webservices.pr_cotpersonas";
	public final static String PR_DETALLES = "osiris.pk_webservices.pr_detalles";
	public final static String PR_VALIDA_DETALLES_OBLIGATORIOS = "osiris.pk_webservices.pr_validadetallesobligatorios";
	public final static String PR_COBERTURAS = "osiris.pk_webservices.pr_coberturas";
	public final static String PR_CARATULA = "osiris.pk_webservices.pr_caratula";
	public final static String PR_REASEGUROS = "osiris.pk_webservices.pr_reaseguros";
	public final static String PR_TARIFAR = "osiris.pk_webservices.pr_tarifar";
	public final static String PR_EMITIR_POLIZA = "osiris.pk_webservices.pr_emitir_poliza";
	public final static String PR_CANCELAR_CERTIF = "osiris.pk_webservices.pr_cancelarpoliza";
	public final static String PR_ANULAR_CERTIF = "osiris.pk_webservices.pr_anularpoliza";
	public final static String PR_LISTAS_PARA_COBERTURAS = "osiris.pk_webservices.pr_listas";
	public final static String PR_UPDATE_COBERTURAS = "osiris.pk_webservices.pr_update_coberturas";
	public final static String PR_CREATE_TEXTOS = "osiris.create_textos";

	public final static String PREF_NRO_COT = "W";

	public final static String FORMATO_FECHA_1 = "yyyyMMdd";
	public final static String FORMATO_FECHA_2 = "ddMMyyyy";

	/**
	 */
	public final static String RESP_SP_SEG_OK = "WF_SEG_001";
	public final static String RESP_SP_SEG_ERR = "WF_SEG_002";
	public final static String RESP_SP_PER_OK = "WF_PER_001";
	public final static String RESP_SP_PER_ERR = "WF_PER_002";
	public final static String RESP_SP_DET_OK = "WF_DET_001";
	public final static String RESP_SP_DET_ERR = "WF_DET_002";
	public final static String RESP_SP_VDET_OK = "WF_VDE_001";
	public final static String RESP_SP_VDET_ERR = "WF_VDE_002";
	public final static String RESP_SP_COB_OK = "WF_COB_001";
	public final static String RESP_SP_COB_ERR = "WF_COB_002";
	public final static String RESP_SP_CAR_OK = "WF_CAR_001";
	public final static String RESP_SP_CAR_ERR = "WF_CAR_002";
	public final static String RESP_SP_CTA_OK = "WF_CTA_001";
	public final static String RESP_SP_CTA_ERR = "WF_CTA_002";
	public final static String RESP_SP_REA_OK = "WF_REA_001";
	public final static String RESP_SP_REA_ERR = "WF_REA_002";

	public final static String RESP_SUSCRIP_OK = "SUS_SEG_OK";
	public final static String RESP_SUSCRIP_30 = "SUS_SEG_30";
	public final static String RESP_SUSCRIP_46 = "SUS_SEG_46";
	public final static String RESP_SUSCRIP_999 = "SUS_SEG_999";

	public final static String RESP_VAL_POL_ERR = "WF_VAL_002";
	public final static String RESP_CSP_POL_ERR = "WF_CSP_002";
	public final static String RESP_CAN_CRT_ERR = "WF_CAN_002";
	public final static String RESP_ANU_CRT_ERR = "WF_CAN_002";
	public final static String RESP_ACT_COT_NEX = "WF_ACT_001";
	public final static String RESP_ACT_COT_ERR = "WF_ACT_002";
	public final static String RESP_EMI_POL_NEX = "WF_EMI_001";

	/**
	 */
	public final static String RESP_SP_TAR_OK = "WF_TAR_001";
	public final static String RESP_SP_TAR_ERR = "WF_TAR_002";
	public final static String RESP_SP_UNK_ERR = "WF_ERR_00";
	public final static String RESP_SP_EMI_OK = "WF_EMI_01";
	public final static String RESP_SP_EMI_DET = "WF_EMI_02";
	public final static String RESP_SP_EMI_RCT = "WF_EMI_03";
	public final static String RESP_SP_EMI_ERR = "WF_EMI_04";
	public final static String RESP_SP_EMI_SARLAF = "WF_EMI_05";
	public final static String RESP_SP_TAR_VAL_OK = "0";
	public final static String RESP_SP_SARLAF_OK = "WF_SARLAF_001";
	public final static String RESP_SP_SARLAF_ERR = "WF_SARLAF_002";

	public final static String COD_DET_IVA = "DET_IVA";
	public final static String COD_DET_GASTOS = "DET_GASTOS";
	public final static String COD_DET_TOTAL = "DET_TOTAL";

	/**
	 */
	public final static int RESP_SP_CAN_OK = 0;
	public final static int RESP_SP_CAN_ERR = 1;
	public final static int RESP_SP_ANU_OK = 0;
	public final static int RESP_SP_ANU_ERR = 1;

	/**
	 */
	public final static String COD_RESP_ERROR_MESSAGE = "0001";
	public final static String COD_RESP_ERROR_CAUSE = "0002";

	/**
	 */
	public final static int COD_VINC_ASEGURADO = 1;
	public final static int COD_VINC_BENEFICIARIO = 2;
	public final static int COD_VINC_AGENTE = 3;
	public final static int COD_VINC_TOMADOR = 0;
	public final static int CODVIN_INTER = 2;

	/**
	 */
	public final static int COD_ORDEN = 1;
	public final static int COD_INCISO = 0;
	public final static int DIAS_RETRO_CANC = 15;
	public final static int MAX_PRODUCTOS_COTIZA = 10;
	public final static int VLR_PRIMA_DEF = 1234;
	public final static int MAX_RESULT_SINGLE = 1;

	/**
	 * 
	 */
	public final static String PARAM_TAR_ERR = "error";
	public final static String PARAM_TAR_MSJ = "mensaje";
	public final static String PARAM_TAR_IND = "w_ind";
	public final static String PARAM_TAR_VPRIMA = "w_vprima";
	public final static String PARAM_TAR_VASEG = "w_vaseg";
	public final static String PARAM_TAR_VIVA = "w_iva";
	public final static String PARAM_TAR_VGASTOS = "w_gastos";
	public final static String PARAM_TAR_VTOTAL = "w_total";
	public final static String PARAM_EMI_IND = "w_ind";
	public final static String PARAM_EMI_POLIZA = "w_poliza";

	/**
	 * 
	 */
	public static final String COD_DET_NEMOTEC_FALA = "FALA0002";
	public static final String COD_DET_NEMOTEC_MASC = "PLANM003";
	public static final String FORMAT_STRING_5DIG = "%05d";

	/**
	 * 
	 */
	public static final String TIPO_PERSONA_NATURAL = "1";
	public static final String TIPO_PERSONA_JURIDICA = "2";
	public static final BigDecimal CLASE_PARAMETRO_VALSARLAFT = new BigDecimal("600");
	public static final String TIPO_PARAMETRO_VALSARLAFT = "VSARLAFT";
	public static final String VALSARLAFT_SIN_REGLA = "0";

	/**
	 * 
	 */
	public static final String MESG_SUSCRIPCION = "No es posible cotizar los valores enviados no cumplen con los requeridos por el producto";
	public static final String MESG_SUSCRIPCION_30 = "EXCEDE LOS VALORES PERMITIDOS DE COBERTURA";
	public static final String MESG_SUSCRIPCION_45 = "EXCEDE EL PERIODO DE COBERTURA DEFINIDO PARA EL PRODUCTO";

	public static String getMessage(String codigo) {
		if (codigo.equalsIgnoreCase(RESP_SUSCRIP_30))
			return MESG_SUSCRIPCION_30;
		else if (codigo.equalsIgnoreCase(MESG_SUSCRIPCION_45))
			return MESG_SUSCRIPCION_45;
		else
			return MESG_SUSCRIPCION;
	}

	/*
	 * 
	 * */

	public static final String TIPO_AUTO = "AUTOS";
	public static final BigDecimal CLASE_TIPO_AUTO = new BigDecimal("100");
	public static final String SEXO_MASCULINO = "M";
	public static final String SEXO_FEMENINO = "F";
	public static final String SEXO_PJ = "PJ";

}
