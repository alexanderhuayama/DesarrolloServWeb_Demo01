package com.service.run;

import java.net.URL;
import java.util.List;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import com.service.bean.Jugador;
import com.service.ws.Fifa;

public class FifaConsumidor {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://localhost:9999/ws/fifa?wsdl");
		// fifaServices: de sun-jaxws.xml
		// http://ws.cibertec.edu/: BienvenidaPais.java
		QName qname = new QName("http://ws.service.com/", "fifaServices");

		Service service = Service.create(url, qname);

		Fifa infoFifa = service.getPort(Fifa.class);

		System.out.println(infoFifa.bienvenidaPais("PERU"));

		System.out.println(infoFifa.obtenerCapitan("COLOMBIA"));

		System.out.println(infoFifa.obtenerEntrenador("ARGENTINA"));

		List<Jugador> lst = infoFifa.obtenerJugadores("PERU");

		for (Jugador obj : lst) {
			System.out.println("Jugador: " + obj.getNombre() + " - " + obj.getPosicion());
		}
	}
}
