package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteSaca {

	public static void main(String[] args) {
		Conta conPou = new ContaPoupanca(5775, 5775);
		conPou.depositar(2000);
		
		Conta conta = new ContaCorrente(123, 321);
		conta.depositar(1000);
		
		try {
			conta.sacar(250);
			conPou.transfere(350, conta);
		} catch (SaldoInsuficienteException ex) {
			System.out.println("Exception " + ex.getMessage());
			ex.printStackTrace();
		}
		System.out.println(conta.getSaldo());
		System.out.println(conPou.getSaldo());
	}
}
