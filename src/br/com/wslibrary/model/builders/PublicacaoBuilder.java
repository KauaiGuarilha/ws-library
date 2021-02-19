package br.com.wslibrary.model.builders;

import javax.xml.bind.annotation.XmlRootElement;

import br.com.wslibrary.model.entity.Publicacao;

@XmlRootElement
public class PublicacaoBuilder {
	
	public static class Builder {
		
		private int id;
		private String titulo;
		private int paginaInicial;
		private int paginaFinal;
		private int anoPublicacao;
		//private List<Autor> autores;
		
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
		
		/*public Builder addAutor(List<Autor> autores) {
			this.autores = autores;
			return this;
		}*/
		
		public Publicacao build() {
			return new Publicacao(this.id, this.titulo, this.paginaInicial, this.paginaFinal, this.anoPublicacao);
		}
	}
}
