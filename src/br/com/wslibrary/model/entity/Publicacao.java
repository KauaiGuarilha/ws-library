package br.com.wslibrary.model.entity;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Publicacao {

	private int id;
	private String titulo;
	private int paginaInicial;
	private int paginaFinal;
	private int anoPublicacao;
	//private List<Autor> autores;
	
	Publicacao() {
		super();
	}

	public Publicacao(int id, String titulo, int paginaInicial, int paginaFinal, int anoPublicacao) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.paginaInicial = paginaInicial;
		this.paginaFinal = paginaFinal;
		this.anoPublicacao = anoPublicacao;
	}	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getPaginaInicial() {
		return paginaInicial;
	}

	public void setPaginaInicial(int paginaInicial) {
		this.paginaInicial = paginaInicial;
	}

	public int getPaginaFinal() {
		return paginaFinal;
	}

	public void setPaginaFinal(int paginaFinal) {
		this.paginaFinal = paginaFinal;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	@Override
	public String toString() {
		return "Publicacao [id=" + id + ", titulo=" + titulo + ", paginaInicial=" + paginaInicial + ", paginaFinal="
				+ paginaFinal + ", anoPublicacao=" + anoPublicacao + "]";
	}	

	/*@Override
	public int hashCode() {
		return this.codigo.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Publicacao item = (Publicacao)obj;
		return this.codigo.equals(item.codigo);
	}*/	
	
	
}
