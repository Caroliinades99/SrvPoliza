package coop.equidad.servicios.utils;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

/**
 * 
 * @author 
 *
 */
public class UtilVal {
	
	public static boolean validaString ( String value ) {
		if( !StringUtils.isNotBlank(value) ) {
			return true;
		} 		
		return false;
	}
	
	public static boolean validaVacioDouble ( Double value ) {
		if( value == null ) {
			return true;
		}
		return false;
	}
	
	public static boolean validaVacioFloat ( Float value ) {
		if( value == null ) {
			return true;
		}
		return false;
	}
	
	public static boolean validaVacioInteger ( Integer value ) {
		if( value == null ) {
			return true;
		}
		return false;
	}
	
	public static boolean validaVacioIntegerZero ( Integer value ) {
		if( value == null || value == 0 ) {
			return true;
		}
		return false;
	}
	
	public static boolean validaVacioLongZero ( Long value ) {
		if( value == null || value == 0 ) {
			return true;
		}
		return false;
	}
	
	public static boolean validaRangoDouble ( double value, double minVal, double maxVal ) {
		if( !(value >= minVal && value <= maxVal) ) {
			return true;
		} 
		return false;
	}
	
	
	public static boolean validaVacioDate ( Calendar value ) {
		if( value == null ) {
			return true;
		}
		return false;
	}
	
	public static boolean validaVacioDate ( Date value ) {
		if( value == null ) {
			return true;
		}
		return false;
	}
	
	public static boolean validaLongitudString ( String value, int minLong, int maxLong ) {
		if( !(value.length() >= minLong && value.length() <= maxLong ) ) {
			return true;
		} 
		return false;
	}
	
	public static boolean validaLongitudStringNull ( String value, int minLong, int maxLong ) {
		if( value == null || !(value.length() >= minLong && value.length() <= maxLong ) ) {
			return true;
		} 
		return false;
	}
	
	public static boolean validaDatoSexo ( String value ) {
		if( !("0".equals(value) || "1".equals(value)) ) {
			return true;
		} 
		return false;
	}	
	
	public static boolean validaNumero( String value ) {
		boolean isNum = false;
		
		try {
			Integer.valueOf(value);
		} catch (NumberFormatException e) {
			isNum = true;
		}
		
		return isNum;
	}
	
	public static boolean isFechaPost( Date fechaIni, Date fechafin ) {
		boolean isPost = false;
		
		if( fechaIni.after(fechafin) ) {
			isPost = true;
		}
		
		return isPost;
	}
	
	public static boolean validaFechaRetro( Date fechaIni, Date fechaFin, int diasMax ) {		
		long diasDiff = UtilCommon.getDiasDiff(fechaIni, fechaFin);		

		if( diasDiff < 0 || diasDiff > diasMax ) {	
			return true;
		}

		return false;
	}
	
	public static boolean validaMaxLongArray( Object[] array, int maxLength ) {
		if( array == null || array.length == 0 || array.length > maxLength ) {
			return true;
		}
		
		return false;
	}
	
	public static boolean validaArrayString( String[] array, int maxLength ) {
		if( array == null || array.length == 0 || array.length > maxLength ) {
			return true;
		}
		
		return false;
	}
	
	public static boolean validaLongitudArrayString ( String[] array, int minLong, int maxLong ) {
		boolean valida = true;
		
		for( String value: array ) {
			if ( !validaLongitudString(value, minLong, maxLong))  {
				valida = false;
			}
		}
		
		return valida;
	}
}
