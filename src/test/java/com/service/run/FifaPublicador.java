package com.service.run;

import javax.xml.ws.Endpoint;
import com.service.ws.FifaImpl;

public class FifaPublicador {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9999/ws/fifa", new FifaImpl());
	}
}
