package br.com.wslibrary.controller;

import java.util.List;

import javax.jws.WebService;
import javax.xml.ws.WebServiceProvider;

import br.com.wslibrary.model.dao.PublicacaoDAO;
import br.com.wslibrary.model.entity.Publicacao;

@WebService
public class PublicacaoController {

	private PublicacaoDAO publicacaoDao = new PublicacaoDAO();
	
	public List<Publicacao> getPublicacao(){
		
		System.out.println("Chamando getItens()");
		List<Publicacao> lista = publicacaoDao.todosItens();
		return lista;		
	}
}
