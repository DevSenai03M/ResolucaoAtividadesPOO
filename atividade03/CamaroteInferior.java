package atividade03;

public class CamaroteInferior extends Vip {
	
	private String localizacao;

	public CamaroteInferior() {}

	public CamaroteInferior(double valor, double valorAdicional, String localizacao) {
		super(valor, valorAdicional);
		this.localizacao = localizacao;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	@Override
	public String toString() {
		return "Localização: " + this.localizacao;
	}

}
