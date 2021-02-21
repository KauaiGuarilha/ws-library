package br.com.wslibrary.controller;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebParam.Mode;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.WebServiceProvider;

import br.com.wslibrary.model.dao.PublicacaoDAO;
import br.com.wslibrary.model.entity.Publicacao;
import br.com.wslibrary.utils.Filtro;
import br.com.wslibrary.utils.Filtros;
import br.com.wslibrary.utils.ListaPublicacoes;

@WebService
public class PublicacaoController {

	private PublicacaoDAO publicacaoDao = new PublicacaoDAO();
	
	@WebMethod(operationName = "RetornarPublicacoes")
	@WebResult(name = "publicacoes")
	public ListaPublicacoes retornaPublicacoes(){		
		System.out.println("Retornar Publicações");
		
		List<Publicacao> lista = publicacaoDao.todosItens();
		return new ListaPublicacoes(lista);		
	}
	
	@WebMethod(operationName = "RetornarPublicacao")
	@WebResult(name = "publicacao")
	public ListaPublicacoes retornaPublicacao(@WebParam(name = "filtros") Filtros filtros){		
		System.out.println("Retornar Publicação");

		List<Filtro> listaFiltros = filtros.getLista();
		List<Publicacao> listaPublicacao = publicacaoDao.todosItens(listaFiltros);
		
		return new ListaPublicacoes(listaPublicacao);		
	}
}
