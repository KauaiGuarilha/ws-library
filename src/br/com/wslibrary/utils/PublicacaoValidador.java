package br.com.wslibrary.utils;

import java.util.ArrayList;
import java.util.List;

import br.com.wslibrary.exception.PublicacaoValidadorException;
import br.com.wslibrary.model.entity.Publicacao;

public class PublicacaoValidador {

	private Publicacao publicacao;

	public PublicacaoValidador(Publicacao item) {
		this.publicacao = item;
	}

	public void validate() {
		List<String> erros = new ArrayList<>();
		
		String tipo = publicacao.getTitulo();
		
		if(ehVazio(tipo) || !TipoItem.existe(tipo)) {
			erros.add("Tipo invalido");
		}
		
		if(!erros.isEmpty()){
			throw new PublicacaoValidadorException(erros); 
		}
	}

	private boolean ehVazio(String valor) {
		return valor == null || valor.isEmpty();
	}

}
