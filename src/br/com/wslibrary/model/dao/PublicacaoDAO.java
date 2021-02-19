package br.com.wslibrary.model.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import br.com.wslibrary.model.builders.PublicacaoBuilder;
import br.com.wslibrary.model.entity.Publicacao;


public class PublicacaoDAO {

	private static Map<String, Publicacao> ITENS = new LinkedHashMap<>();

	public PublicacaoDAO() {
		popularPublicacaoNoMapa();
	}
	
	public void cadastrar(Publicacao publicacao) {
		ITENS.put(publicacao.getTitulo(), publicacao);
	}

	public ArrayList<Publicacao> todosItens(List<Publicacao> filtros) {
		
		ArrayList<Publicacao> resultados = new ArrayList<Publicacao>();
		Collection<Publicacao> todosItens = ITENS.values();

		if (filtros == null || filtros.isEmpty()) {
			resultados.addAll(todosItens);
			return resultados;
		}
			
		return resultados;
	}

	public ArrayList<Publicacao> todosItens() {
		return new ArrayList<>(ITENS.values());
	}
	
	private void popularPublicacaoNoMapa() {
		ITENS.put("Teste1", new PublicacaoBuilder.Builder().addId(1).addTitulo("Pub1").addPaginaInicial(0).addPaginaFinal(100).addAnoPublicacao(2021).build());
		ITENS.put("Teste2", new PublicacaoBuilder.Builder().addId(1).addTitulo("Pub2").addPaginaInicial(0).addPaginaFinal(101).addAnoPublicacao(2022).build());
		ITENS.put("Teste3", new PublicacaoBuilder.Builder().addId(1).addTitulo("Pub3").addPaginaInicial(0).addPaginaFinal(102).addAnoPublicacao(2023).build());
		ITENS.put("Teste4", new PublicacaoBuilder.Builder().addId(1).addTitulo("Pub4").addPaginaInicial(0).addPaginaFinal(103).addAnoPublicacao(2024).build());
		ITENS.put("Teste5", new PublicacaoBuilder.Builder().addId(1).addTitulo("Pub5").addPaginaInicial(0).addPaginaFinal(104).addAnoPublicacao(2025).build());
	}



}
