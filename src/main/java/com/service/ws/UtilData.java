package com.service.ws;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.service.bean.Jugador;
import com.service.bean.Pais;

public class UtilData {

	Map<String, Pais> data_pais;

	public UtilData() {
		data_pais = new HashMap<String, Pais>();
	}

	void cargarData() {
		Pais peru = new Pais("Paolo Guerrero", "Ricardo Gereca");
		Pais argentina = new Pais("Lionel Messi", "Sampaoli");
		Pais colombia = new Pais("Radamel Falcao", "Ricardo Gereca");
		Pais brasil = new Pais("Neymar", "Tite");

		Jugador jugador1 = new Jugador("Paolo Guerrero", "Delantero");
		Jugador jugador2 = new Jugador("Pedro Gallese", "Arquero");
		Jugador jugador3 = new Jugador("Cuevita", "Medio Campista");

		List<Jugador> lst = new ArrayList<Jugador>();
		lst.add(jugador1);
		lst.add(jugador2);
		lst.add(jugador3);
		peru.setLstJugadores(lst);

		data_pais.put("PERU", peru);
		data_pais.put("ARGENTINA", argentina);
		data_pais.put("COLOMBIA", colombia);
		data_pais.put("BRASIL", brasil);
	}

	Pais getPais(String nombrePais) {
		Pais pais = data_pais.get(nombrePais);
		return pais;
	}
}
