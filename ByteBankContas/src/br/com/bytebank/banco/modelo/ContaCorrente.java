package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numeroDaConta) {
		super(agencia, numeroDaConta);
		
	}
	
	@Override
	public void sacar(double valor) throws SaldoInsuficienteException {
		double valorASacar = valor + 6.50;
		super.sacar(valorASacar);
	}
	
	@Override
	public void depositar(double valor) {
		super.saldo += valor;
		
	}
	
	@Override
	public double getValorDoImposto() {
		
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {
		
		return "ContaCorrente, " + super.toString();
	}
	
}
