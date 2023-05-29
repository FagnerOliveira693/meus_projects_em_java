package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Test {

	public static void main(String[] args) {
		
//		System.out.println("X");
//		System.out.println(3);
//		System.out.println(false);
		
		Object conCor = new ContaCorrente(233, 322);
		
		
		Object conPou = new ContaPoupanca(533, 355);
		
		Object client = new Cliente();
		
		//System.out.println(conCor.toString());
		//System.out.println(conPou.toString());
		
		System.out.println(conCor);
		
		System.out.println(conPou);
		
		//println(conCor);
		
	}
	
	static void println() {
		
	}
	
	static void println(int a) {
		
	}
	
	static void println(boolean valor) {
		
	}
	
	static void println(ContaCorrente conta) {
		
	}
}
