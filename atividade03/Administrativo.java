package atividade03;

public class Administrativo extends Assistente{
	private String turno;
	private double addNoturno;
	
	public Administrativo() {}
	
	public Administrativo(String nome, double salario,String matricula, String turno, double addNoturno) {
		super(nome, salario, matricula);
		this.turno = turno;
		this.addNoturno = addNoturno;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public double getAddNoturno() {
		return addNoturno;
	}

	public void setAddNoturno(double addNoturno) {
		this.addNoturno = addNoturno;
	}
	
	@Override
	public double ganhoAnual() {
		return (this.getSalario()+this.addNoturno) * 12;
	}
}
