package br.com.bytebank.banco.modelo;

public class CalculadorDeImposto {

	private double totalDeImposto;
	
	public void registrar(Tributavel tributavel) {
		double valor = tributavel.getValorDoImposto();
		this.totalDeImposto += valor;
	}
	
	public double getTotalDeImposto() {
		return totalDeImposto;
	}
}
