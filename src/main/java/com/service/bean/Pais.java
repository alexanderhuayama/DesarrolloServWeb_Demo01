package com.service.bean;

import java.util.List;

public class Pais {

	private String capitan;
	private String entrenador;

	List<Jugador> lstJugadores;

	public Pais(String capitan, String entrenador) {
		this.capitan = capitan;
		this.entrenador = entrenador;

	}

	public String getCapitan() {
		return capitan;
	}

	public void setCapitan(String capitan) {
		this.capitan = capitan;
	}

	public String getEntrenador() {
		return entrenador;
	}

	public void setEntrenador(String entrenador) {
		this.entrenador = entrenador;
	}

	public List<Jugador> getLstJugadores() {
		return lstJugadores;
	}

	public void setLstJugadores(List<Jugador> lstJugadores) {
		this.lstJugadores = lstJugadores;
	}
}
