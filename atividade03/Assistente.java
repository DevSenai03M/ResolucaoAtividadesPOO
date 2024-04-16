package atividade03;

public class Assistente extends Funcionario {
	private String matricula;
	
	public Assistente() {}
	
	public Assistente(String nome, double salario,String matricula) {
		super(nome, salario);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public String exibeDados() {
		return String.format("Matricula: %s\n"
				+ "Nome do Funcionário: %s\n"
				+ "Salário: R$ %.2f", 
				this.matricula, 
				this.getNome(),
				this.getSalario()); 
	}
}
