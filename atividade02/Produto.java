package atividade02;

public class Produto {
	
	private String nome;
	private double precoCusto;
	private double precoVenda;
	private double margemLucro;
	
	public Produto() {}

	public Produto(String nome, double precoCusto, double precoVenda, double margemLucro) {
		super();
		this.nome = nome;
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
		this.margemLucro = margemLucro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		if(precoVenda < precoCusto) {
			System.out.println("Valor inferior ao custo!");
		}else {
			this.precoVenda = precoVenda;
		}	
	}

	public double getMargemLucro() {
		return margemLucro;
	}

	public void setMargemLucro(double margemLucro) {
		this.margemLucro = margemLucro;
	}
	
	public void calcularMargemLucro() {
		this.margemLucro = this.precoVenda - this.precoCusto;
	}
	
	public int getMargemLucroPorcentagem() {
		return (int) ((this.margemLucro/this.precoVenda) * 100);
	}
	
	

}
