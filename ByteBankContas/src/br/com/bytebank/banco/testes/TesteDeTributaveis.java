package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.CalculadorDeImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteDeTributaveis {

	public static void main(String[] args) {
		ContaCorrente corrente1 = new ContaCorrente(3196, 3576);
		corrente1.depositar(100.0);
		
		System.out.println(corrente1.getSaldo());
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registrar(corrente1);
		calc.registrar(seguro);
		
		
		System.out.println("O total de taxas, é: " + calc.getTotalDeImposto() + " reais... ");
		
		ContaPoupanca conPou = new ContaPoupanca(2278, 5568);
		conPou.depositar(800);
		System.out.println(conPou.getSaldo());
	}
}
