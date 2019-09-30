package coop.equidad.servicios.objws;

import java.util.List;

import coop.equidad.model.entity.DetallePK;
import coop.equidad.model.entity.OsDetalle;
import coop.equidad.servicios.suscripcion.Detalle;
import coop.equidad.servicios.suscripcion.PolizaSequence_type2;
import coop.equidad.servicios.utils.UtilCommon;

public class DetalleCtWS {
	
	/**
	 * 
	 * @param osDetalles
	 * @return
	 */
	public static PolizaSequence_type2 detalleEntityToWS ( List<OsDetalle> osDetalles ) {
		PolizaSequence_type2 polizaSequence_type2 = new PolizaSequence_type2();
		polizaSequence_type2.setDetalle(getDetalles(osDetalles));	
		
		return polizaSequence_type2;
	}
	
	/**
	 * 
	 * @param osDetalles
	 * @return
	 */
	public static Detalle[] getDetalles( List<OsDetalle> osDetalles ) {
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
	public static Detalle getDetalle(OsDetalle osDetalle) {
		Detalle detalle = new Detalle();
		detalle.setCoddet(osDetalle.getId().getCoddet());
		detalle.setInciso(UtilCommon.getIntFromBigDecimal(osDetalle.getInciso()));
		detalle.setValdate(osDetalle.getValdate());
		detalle.setValnumber(osDetalle.getValnumber());//UtilCommon.getFloatFromBigDecimal(osDetalle.getValnumber()));
		detalle.setValstring(osDetalle.getValstring());
		
		return detalle;
	}
	
	/**
	 * 
	 * @param detalle
	 * @return
	 */
	public static OsDetalle getDetalle(Detalle detalle) {		
		DetallePK detallePK = new DetallePK();
		detallePK.setCertif(detalle.getCertif());
		detallePK.setCoddet(detalle.getCoddet());
		detallePK.setCodpla(detalle.getCodpla());
		detallePK.setSucur(detalle.getSucur());
		
		OsDetalle osDetalle = new OsDetalle();
		osDetalle.setId(detallePK);	
		osDetalle.setInciso(UtilCommon.getBigDecimalFromInt(detalle.getInciso()));
		osDetalle.setValdate(detalle.getValdate());
		osDetalle.setValnumber(detalle.getValnumber());//UtilCommon.getBigDecimalFromfloat(detalle.getValnumber()));
		osDetalle.setValstring(detalle.getValstring());
		
		return osDetalle;
	}
	
}
