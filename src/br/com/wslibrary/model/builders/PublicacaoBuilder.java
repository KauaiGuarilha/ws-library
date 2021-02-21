package br.com.wslibrary.model.builders;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import br.com.wslibrary.model.entity.Autor;
import br.com.wslibrary.model.entity.Publicacao;


public class PublicacaoBuilder {
	
	public static class Builder {
		
		private int id;
		private String titulo;
		private int paginaInicial;
		private int paginaFinal;
		private int anoPublicacao;
		private List<Autor> autor;
		
		public Builder addId(int id) {
			this.id = id;
			return this;
		}
		
		public Builder addTitulo(String titulo) {
			this.titulo = titulo;
			return this;
		}
		
		public Builder addPaginaInicial(int paginaInicial) {
			this.paginaInicial = paginaInicial;
			return this;
		}
		
		public Builder addPaginaFinal(int paginaFinal) {
			this.paginaFinal = paginaFinal;
			return this;
		}
		
		public Builder addAnoPublicacao(int anoPublicacao) {
			this.anoPublicacao = anoPublicacao;
			return this;
		}
		
		public Builder addAutor(List<Autor> autor) {
			this.autor = autor;
			return this;
		}
		
		public Publicacao build() {
			return new Publicacao(this.id, this.titulo, this.paginaInicial, this.paginaFinal, this.anoPublicacao, this.autor);
		}
	}
}
