package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numeroDaConta) {
		super(agencia, numeroDaConta);
	}
	
	@Override
	public void depositar(double valor) {
		super.saldo += valor;
		
	}
	
	@Override
	public String toString() {
		
		return "ContaPoupanca, " + super.toString();
	}
	
}
