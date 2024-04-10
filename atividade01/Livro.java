package atividade01;

public class Livro {
	
	//Atributos da classe
	private String titulo;
	private String autor;
	private String editora;
	private int anoPublicacao;
	private int quantidadeEstoque;
	
	
	//Construtor
	public Livro() {}
	
	public Livro(String titulo, String autor, String editora, int anoPublicacao, int quantidadeEstoque) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.anoPublicacao = anoPublicacao;
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	//Métodos de Acesso
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
}
