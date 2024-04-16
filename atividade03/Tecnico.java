package atividade03;

public class Tecnico extends Assistente{
	private double bonusSalarial;
	
	public Tecnico() {}
	
	public Tecnico(String nome, double salario,String matricula, double bonus) {
		super(nome, salario, matricula);
		this.bonusSalarial = bonus;
	}

	public double getBonusSalarial() {
		return bonusSalarial;
	}

	public void setBonusSalarial(double bonusSalarial) {
		this.bonusSalarial = bonusSalarial;
	}
	
	@Override
	public double ganhoAnual() {
		return (this.getSalario()+this.bonusSalarial) * 12;
	}
}
