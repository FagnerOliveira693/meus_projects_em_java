package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TestesDeContas {

	public static void main(String[] args) throws SaldoInsuficienteException {
		ContaCorrente conta1 = new ContaCorrente(3196, 2819);
		conta1.depositar(1000);
		
		ContaPoupanca cp1 = new ContaPoupanca(222, 222);
		cp1.depositar(1000);
		
		conta1.transfere(500.0, cp1);
		
		conta1.sacar(300);
		System.out.println("Saldo de conta corrente: " + conta1.getSaldo());
		System.out.println("Saldo de conta poupança: " + cp1.getSaldo());
		
		
		
		
	}
}
