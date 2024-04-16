package atividade03;

public class CamaroteSuperior extends Vip {
	
	private double addValor;

	public CamaroteSuperior() {}

	public CamaroteSuperior(double valor, double valorAdicional, double addValor) {
		super(valor, valorAdicional);
		this.addValor = addValor;
	}

	public double getAddValor() {
		return addValor;
	}

	public void setAddValor(double addValor) {
		this.addValor = addValor;
	}
	
	@Override
	public String imprimeValor() {
		return "Valor do Ingresso: R$ " + 
				(this.getValor() + this.getValorAdicional() +
						this.addValor); 
	}

}
