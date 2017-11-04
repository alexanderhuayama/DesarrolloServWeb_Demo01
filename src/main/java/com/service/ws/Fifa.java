package com.service.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.service.bean.Jugador;

@WebService
public interface Fifa {
	@WebMethod
	public String bienvenidaPais(String nombrePais);

	@WebMethod
	public String obtenerCapitan(String nombrePais);

	@WebMethod
	public String obtenerEntrenador(String nombrePais);

	@WebMethod
	public List<Jugador> obtenerJugadores(String nombrePais);
}
