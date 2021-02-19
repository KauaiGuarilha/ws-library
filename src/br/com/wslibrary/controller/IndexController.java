package br.com.wslibrary.controller;

import javax.xml.ws.Endpoint;

public class IndexController {

	public static void main(String[] args) {

		PublicacaoController service = new PublicacaoController();				
		String url = "http://localhost:8080/ws-library";
		
		Endpoint.publish(url, service);
	}
}
