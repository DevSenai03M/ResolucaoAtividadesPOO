package atividade03;

public class Funcionario {
	private String nome;
	private double salario;
	
	public Funcionario() {}
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void addAumento(double valor) {
		this.salario += valor;
	}
	
	public double ganhoAnual() {
		return this.salario * 12;
	}
	
	public String exibeDados() {
		return String.format("Nome do Funcionário: %s\n"
				+ "Salário: R$ %.2f", this.nome, this.salario);
	}
}
