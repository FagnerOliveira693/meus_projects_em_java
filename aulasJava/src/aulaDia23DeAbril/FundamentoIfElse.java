package aulaDia23DeAbril;

import java.util.Scanner;

public class FundamentoIfElse {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		int idade = teclado.nextInt();
		if ( idade < 18) {
			System.out.println("Voc� tem: " + idade + " anos. � menor de idade!");
		}
		else {
			if ( idade >= 60) {
				System.out.println("Voc� tem: " + idade + " anos. Muito show! Est� na melhor idade.");
			}
			else {
				System.out.println("Voc� tem: " + idade + " anos. � maior de idade.");
			}
		}
		teclado.close();
		
		

	}

}
