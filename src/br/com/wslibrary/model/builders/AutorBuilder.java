package br.com.wslibrary.model.builders;

import javax.xml.bind.annotation.XmlRootElement;

import br.com.wslibrary.model.entity.Autor;

@XmlRootElement
public class AutorBuilder {

	public static class Builder {
		
		private int id;
		private String nome;
		private String cpf;
		
		public Builder addId(int id) {
			this.id = id;
			return this;
		}
		
		public Builder addNome(String nome) {
			this.nome = nome;
			return this;
		}
		
		public Builder addCpf(String cpf) {
			this.cpf = cpf;
			return this;
		}
		
		public Autor build() {
			return new Autor(this.id, this.nome, this.cpf);
		}
	}
}
