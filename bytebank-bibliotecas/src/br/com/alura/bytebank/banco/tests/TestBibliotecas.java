package br.com.alura.bytebank.banco.tests;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TestBibliotecas {

	public static void main(String[] args) throws SaldoInsuficienteException {
		Conta conCor = new ContaCorrente(3196, 2259);
		conCor.depositar(2500);
		
		try {
			conCor.sacar(3000);
			System.out.println("Saque realizado com sucesso... ");
		} catch (SaldoInsuficienteException ex) {
			//String msg = ex.getMessage();
			System.out.println("Ops... Saldo insuficiente para saque! \n\tGentileza verificar... ");
			//System.out.println("Exception " + msg);
			//ex.printStackTrace();
		}
		
		finally {
			System.out.println("Volte sempre!!! ");
		}
		System.out.println("Saldo atual, é de: " + conCor.getSaldo() + " reais... ");
	}
}
