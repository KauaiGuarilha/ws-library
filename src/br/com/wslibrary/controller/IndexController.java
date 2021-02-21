package br.com.wslibrary.controller;

import javax.xml.ws.Endpoint;

public class IndexController {

	public static void main(String[] args) {

		PublicacaoController publicacaoController = new PublicacaoController();				
		String url = "http://localhost:8080/ws-library";
		
		System.out.println("Servidor rodando "+ url + "?wsdl");
		
		Endpoint.publish(url, publicacaoController);
	}
}
