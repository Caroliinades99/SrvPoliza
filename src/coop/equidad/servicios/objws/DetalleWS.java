package coop.equidad.servicios.objws;

import java.util.List;

import coop.equidad.model.entity.OsDetallePz;
import coop.equidad.servicios.suscripcion.Detalle;
import coop.equidad.servicios.suscripcion.PolizaSequence_type2;
import coop.equidad.servicios.utils.UtilCommon;

public class DetalleWS {
	
	/**
	 * 
	 * @param osDetalles
	 * @return
	 */
	public static PolizaSequence_type2 detalleEntityToWS ( List<OsDetallePz> osDetalles ) {
		PolizaSequence_type2 polizaSequence_type2 = new PolizaSequence_type2();
		polizaSequence_type2.setDetalle(getDetalles(osDetalles));	
		
		return polizaSequence_type2;
	}
	
	/**
	 * 
	 * @param osDetalles
	 * @return
	 */
	public static Detalle[] getDetalles( List<OsDetallePz> osDetalles ) {
		Detalle[] detalleArray = new Detalle[osDetalles.size()];
		
		for( int i=0; i<osDetalles.size(); i++ ) {
			detalleArray[i] = getDetalle(osDetalles.get(i));
		}
		
		return detalleArray;
	}
	
	/**
	 * 
	 * @param osDetalle
	 * @return
	 */
	public static Detalle getDetalle(OsDetallePz osDetalle) {
		Detalle detalle = new Detalle();
		detalle.setInciso(UtilCommon.getIntFromBigDecimal(osDetalle.getInciso()));
		detalle.setValdate(osDetalle.getValdate());
		detalle.setValnumber(osDetalle.getValnumber());//UtilCommon.getFloatFromBigDecimal(osDetalle.getValnumber()));
		detalle.setValstring(osDetalle.getValstring());
		
		return detalle;
	}
	
}
