package atividade03;

public class Vip extends Ingresso {

	private double valorAdicional;
	
	public Vip() {}

	public Vip(double valor, double valorAdicional) {
		super(valor);
		this.valorAdicional = valorAdicional;	
	}
	
	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	@Override
	public String imprimeValor() {
		return "Valor do Ingresso: R$ " + 
				(this.getValor() + this.valorAdicional); 
	}

}
