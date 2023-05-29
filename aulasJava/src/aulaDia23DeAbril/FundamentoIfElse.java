package aulaDia23DeAbril;

import java.util.Scanner;

public class FundamentoIfElse {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		int idade = teclado.nextInt();
		if ( idade < 18) {
			System.out.println("Você tem: " + idade + " anos. É menor de idade!");
		}
		else {
			if ( idade >= 60) {
				System.out.println("Você tem: " + idade + " anos. Muito show! Está na melhor idade.");
			}
			else {
				System.out.println("Você tem: " + idade + " anos. É maior de idade.");
			}
		}
		teclado.close();
		
		

	}

}
