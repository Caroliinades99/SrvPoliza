package coop.equidad.servicios.utils;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import coop.equidad.servicios.constantes.CONSTANTES;

public class UtilCommon {
	
	/**
	 * 
	 * @param value
	 * @return
	 */
	public static String getStringFromInteger( Integer value ) {
		if( value != null ) {
			return value.toString();
		} else {
			return null;
		}
	}
	
	
	public static String getStringFromString( String value ) {
		if( value != null ) {
			return value;
		} else {
			return null;
		}
	}
	
	/**
	 * 
	 * @param value
	 * @return
	 */
	public static String getStringFromFloat( Float value ) {
		if( value != null ) {
			return value.toString();
		} else {
			return null;
		}
	}
	
	/**
	 * 
	 * @param value
	 * @return
	 */
	public static Integer getIntegerFromString( String value ) {
		Integer integer = new Integer(0);
		
		try {
			integer = Integer.valueOf(value);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}		
		
		return integer;
	}
	
	/**
	 * 
	 * @param value
	 * @return
	 */
	public static Float getFloatFromString( String value ) {
		Float floatVal = new Float(0);
		
		try {
			floatVal = Float.valueOf(value);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}		
		
		return floatVal;
	}
	
	/**
	 * 
	 * @param value
	 * @return
	 */
	public static BigDecimal getBigDecimalFromInt( int value ) {
		BigDecimal bigDecimal = new BigDecimal(value);
		return bigDecimal;
	}
	
	/**
	 * 
	 * @param value
	 * @return
	 */
	public static BigDecimal getBigDecimalFromfloat( float value ) {
		BigDecimal bigDecimal = new BigDecimal(value);
		return bigDecimal;
	}
	
	/**
	 * 
	 * @param value
	 * @return
	 */
	public static int getIntFromBigDecimal( BigDecimal value ) {
		if( value != null ) {
			return value.intValue();
		} else {
			return 0;
		}
	}
	
	/**
	 * 
	 * @param value
	 * @return
	 */
	public static float getFloatFromBigDecimal( BigDecimal value ) {
		if( value != null ) {
			return value.floatValue();
		} else {
			return 0;
		}
	}
	
	/**
	 * 
	 * @param value
	 * @return
	 */
	public static long getLongFromBigDecimal( BigDecimal value ) {
		if( value != null ) {
			return value.longValue();
		} else {
			return 0;
		}
	}
	
	/**
	 * 
	 * @param fecha
	 * @return
	 */
	public static String getFechaFormato( Date fecha ) {
		SimpleDateFormat fdate = new SimpleDateFormat(CONSTANTES.FORMATO_FECHA_1);
		if( fecha != null ) {
			return fdate.format(fecha);
		} else {
			return null;
		}
	}	
	
	/**
	 * 
	 * @param fechaIni
	 * @param fechaFin
	 * @return
	 */
	public static long getDiasDiff( Date fechaIni, Date fechaFin ) {
		long diff = fechaFin.getTime() - fechaIni.getTime();		
		diff = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	    
	    return diff;
	}
	
	/**
	 * 
	 * @param fechaIni
	 * @param fechafin
	 * @return
	 */
	public static boolean isFechaPost( Date fechaIni, Date fechafin ) {
		boolean isPost = false;
		
		if( fechaIni.after(fechafin) ) {
			isPost = true;
		}
		
		return isPost;
	}
	
	/**
	 * 
	 * @param format
	 * @param cod
	 * @return
	 */
	public static String getStringComp (String format, String cod) {		
		String stringComp = String.format(format, Integer.parseInt(cod));
		
		return stringComp;
	}
	
}
