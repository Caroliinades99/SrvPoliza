package coop.equidad.servicio;

import coop.equidad.servicios.constantes.CONSTANTES;
import coop.equidad.servicios.oper.ValidarSarlaf;

public class testSarlaft {

	public static void main(String[] args) {
		if (ValidarSarlaf.callValidar("011703", "900047981").equalsIgnoreCase(CONSTANTES.RESP_SP_SARLAF_OK)) {
				System.out.println("t");
		} else {
				System.out.println("f");
		}
	}

}
