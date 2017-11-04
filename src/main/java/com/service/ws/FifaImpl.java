package com.service.ws;

import java.util.List;

import javax.jws.WebService;

import com.service.bean.Jugador;
import com.service.bean.Pais;

@WebService(endpointInterface = "com.service.ws.Fifa", serviceName = "fifaServices")
public class FifaImpl {

	private UtilData datos;

	public FifaImpl() {
		datos = new UtilData();
		datos.cargarData();
	}

	public String bienvenidaPais(String pais) {
		String saludo = pais + " BIENVENIDO A RUSSIA 2018";

		return saludo;
	}

	public String obtenerCapitan(String pais) {
		System.out.println("entro - obtenerCapitan()");

		/*
		 * String capitan; if(pais.equals("PERU")){ capitan = "PAOLO GUERRERO"; }else
		 * if(pais.equals("COLOMBIA")){ capitan = "RADAMEL FALCAO"; }else{ capitan =
		 * "TU PAIS NO CLASIFICO"; } return capitan;
		 */

		return datos.getPais(pais).getEntrenador();
	}

	public String obtenerEntrenador(String nombrePais) {
		System.out.println("entro - obtenerEntrenador()");

		Pais pais = datos.getPais(nombrePais);

		if (pais != null) {
			return pais.getEntrenador();
		} else {
			return "PAIS NO EXISTE";
		}

	}

	public List<Jugador> obtenerJugadores(String nombrePais) {
		System.out.println("entro - obtenerJugadores()");
		Pais pais = datos.getPais(nombrePais);

		if (pais != null) {
			return pais.getLstJugadores();
		} else {
			return null;
		}

	}
}
