package coop.equidad.servicios.objws;

import java.util.List;

import coop.equidad.model.entity.OsReaseguroPz;
import coop.equidad.servicios.suscripcion.PolizaSequence_type5;
import coop.equidad.servicios.suscripcion.Reaseguro;

public class ReaseguroWS {
	
	/**
	 * 
	 * @param osReaseguros
	 * @return
	 */
	public static PolizaSequence_type5 reaseguroEntityToWS ( List<OsReaseguroPz> osReaseguros ) {
		PolizaSequence_type5 polizaSequence_type5 = new PolizaSequence_type5();
		//polizaSequence_type5.setReaseguro(getReaseguros(osReaseguros));
		
		return polizaSequence_type5;
	}
	
	/**
	 * 
	 * @param osReaseguros
	 * @return
	 */
	public static Reaseguro[] getReaseguros( List<OsReaseguroPz> osReaseguros ) {
		Reaseguro[] reaseguroArray = new Reaseguro[osReaseguros.size()];
		
		for( int i=0; i<osReaseguros.size(); i++ ) {
			reaseguroArray[i] = getReaseguro(osReaseguros.get(i));
		}
		
		return reaseguroArray;
	}
	
	/**
	 * 
	 * @param osReaseguro
	 * @return
	 */
	public static Reaseguro getReaseguro(OsReaseguroPz osReaseguro) {
		Reaseguro reaseguro = new Reaseguro();
		reaseguro.setCertif(osReaseguro.getId().getCertif());
		reaseguro.setCodpla(osReaseguro.getId().getCodpla());
		reaseguro.setComision(0);
		reaseguro.setFecini(osReaseguro.getFecini());
		reaseguro.setFecter(osReaseguro.getFecfin());
		reaseguro.setSucur(osReaseguro.getId().getSucur());
		reaseguro.setTomador(0);

		return reaseguro;
	}
	
}
