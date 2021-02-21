package br.com.wslibrary.utils;

import javax.xml.bind.annotation.XmlEnumValue;

public enum TipoItem {

	@XmlEnumValue("Titulo")
	TITULO("Titulo");
	
	private String nome;

	TipoItem(String nome) { 
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public static boolean existe(String valor) {
		try{
			TipoItem.valueOf(valor.toUpperCase());
		}catch(IllegalArgumentException e) {
			return false;
		}
		return true;
	}
}
