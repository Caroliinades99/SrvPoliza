package coop.equidad.servicios.objws;

import java.util.List;

import coop.equidad.model.entity.OsTerceroPz;
import coop.equidad.servicios.suscripcion.PolizaSequence_type1;
import coop.equidad.servicios.suscripcion.Tercero;
import coop.equidad.servicios.utils.UtilCommon;

public class TerceroWS {
	
	/**
	 * 
	 * @param osTerceros
	 * @return
	 */
	public static PolizaSequence_type1 terceroEntityToWS ( List<OsTerceroPz> osTerceros) {
		PolizaSequence_type1 polizaSequence_type1 = new PolizaSequence_type1();
		polizaSequence_type1.setTercero(getTerceros(osTerceros));	
		
		return polizaSequence_type1;
	}
	
	/**
	 * 
	 * @param osTerceros
	 * @return
	 */
	public static Tercero[] getTerceros( List<OsTerceroPz> osTerceros ) {
		Tercero[] terceroArray = new Tercero[osTerceros.size()];
		
		for( int i=0; i<osTerceros.size(); i++ ) {
			terceroArray[i] = getTercero(osTerceros.get(i));
		}
		
		return terceroArray;
	}
	
	/**
	 * 
	 * @param osTercero
	 * @return
	 */
	public static Tercero getTercero(OsTerceroPz osTercero) {
		Tercero tercero = new Tercero();
		tercero.setVinculacion(UtilCommon.getIntFromBigDecimal(osTercero.getId().getVinculacion()));
		tercero.setCodigo(UtilCommon.getIntegerFromString(osTercero.getCodigo()));
		tercero.setParentesco(UtilCommon.getIntFromBigDecimal(osTercero.getParentesco()));
		tercero.setNombre(osTercero.getNombre());
		
		return tercero;
	}
	
}
