package br.com.wslibrary.model.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import br.com.wslibrary.model.builders.AutorBuilder;
import br.com.wslibrary.model.builders.PublicacaoBuilder;
import br.com.wslibrary.model.entity.Autor;
import br.com.wslibrary.model.entity.Publicacao;
import br.com.wslibrary.model.utils.Filtro;

public class PublicacaoDAO {

	private static List<Publicacao> ITENS = new ArrayList<>();

	public PublicacaoDAO() {
		popularPublicacaoNoMapa();
	}
	
	public void cadastrar(Publicacao publicacao) {
		ITENS.add(publicacao);
	}

	public ArrayList<Publicacao> todosItens(List<Filtro> filtros) {
		
		ArrayList<Publicacao> resultados = new ArrayList<Publicacao>();
		Collection<Publicacao> todosItens = ITENS;

		if (filtros.get(0).getTitulo() == null || filtros.isEmpty()) {
			resultados.addAll(todosItens);
			return resultados;
		}
		
		for(Filtro filtro : filtros) {
			for (Publicacao publicacao : todosItens) {
				
				String tituloFiltro = filtro.getTitulo().getNome();
				
				if(itemPossuiTitulo(publicacao, tituloFiltro) == true) {
					resultados.add(publicacao);
				}
			}
		}
			
		return resultados;
	}

	public ArrayList<Publicacao> todosItens() {
		return new ArrayList<>(ITENS);
	}
	

	private boolean itemPossuiTitulo(Publicacao tipoPub, String tipo) {
		return tipoPub.getTitulo().equals(tipo);
	}
	
	private void popularPublicacaoNoMapa() {
		
		Autor autor1 = new AutorBuilder.Builder().addId(1).addNome("Autor1").addCpf("111.111.111-11").build();
		Autor autor2 = new AutorBuilder.Builder().addId(2).addNome("Autor2").addCpf("222.222.222-22").build();
		Autor autor3 = new AutorBuilder.Builder().addId(3).addNome("Autor3").addCpf("333.333.333-33").build();
		
		List<Autor> autores1 = new ArrayList<>();
		autores1.add(autor1);
		
		List<Autor> autores2 = new ArrayList<>();
		autores2.add(autor2);
		
		List<Autor> autores3 = new ArrayList<>();
		autores3.add(autor3);
		
		ITENS.add(new PublicacaoBuilder.Builder().addId(1).addTitulo("Pub1").addPaginaInicial(0).addPaginaFinal(100).addAnoPublicacao(2021).addAutor(autores1).build());
		ITENS.add(new PublicacaoBuilder.Builder().addId(1).addTitulo("Pub2").addPaginaInicial(0).addPaginaFinal(101).addAnoPublicacao(2022).addAutor(autores2).build());
		ITENS.add(new PublicacaoBuilder.Builder().addId(1).addTitulo("Pub3").addPaginaInicial(0).addPaginaFinal(102).addAnoPublicacao(2023).addAutor(autores3).build());
	}
}
