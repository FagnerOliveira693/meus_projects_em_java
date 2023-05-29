package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteComException {

	public static void main(String[] args) throws SaldoInsuficienteException {
		
		//ContaCorrente conta = null;
		
		//outra.deposita(200);
		
		ContaCorrente cc = new ContaCorrente(555, 222);
		cc.depositar(300);
		
		ContaPoupanca cp = new ContaPoupanca(888, 777);
		cp.depositar(500);
		
		System.out.println(cp.getSaldo());
		System.out.println(cc.getSaldo());
		
		
	}
}
