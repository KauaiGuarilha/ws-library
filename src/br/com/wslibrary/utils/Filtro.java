package br.com.wslibrary.utils;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Filtro {

	private TipoItem titulo;

	public TipoItem getTitulo() {
		return titulo;
	}

	public void setTitulo(TipoItem titulo) {
		this.titulo = titulo;
	}
}
