package br.com.wslibrary.model.utils;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.wslibrary.model.entity.Publicacao;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ListaPublicacoes {
	
	@XmlElement(name = "Publicacao")
	private List<Publicacao> publicacoes;
	
	ListaPublicacoes() {}

	public ListaPublicacoes(List<Publicacao> publicacoes) {
		this.publicacoes = publicacoes;
	}	
	
	public List<Publicacao> getPublicacoes() {
		return publicacoes;
	}
}