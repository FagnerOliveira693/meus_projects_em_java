package aulaDiaTrintaDeAbril;

import java.util.Scanner;

public class AulaDoisDeAbril {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		System.out.println();
		if ( idade <= 16) {
			System.out.println("Olá " + nome + "! \nTudo bem contigo? \nVocê tem: " + idade + " Anos! Show de bola. \nVocê é menor de idade! Ainda não precisa votar. \nMuito obrigado por sua visita em nosso programa!");
		}
		else if ( idade <= 21) {
			System.out.println("Olá " + nome + "! Tudo bem com você? \nCara, você tem: " + idade + " Anos! \nTope de mais!!! \nVocê é maior de idade e, já pode solicitar o título de eleitor! \nVamos exercer nossa cidadania. ");
		}
		else if ( idade <= 65) {
			System.out.println("Olá " + nome + "! \nTudo joia? \nSeja muito bem-vindo! \nVocê tem: " + idade + " Anos! \nVocê é adulto e, seu voto, é obrigatório! \nVamos continuar exercendo cidadania? \nVolte sempre ao nosso programa!!!");
		}
		else {
			System.out.println("Olá " + nome + "! \nTudo bem com o senhor(A)? \nSua idade é: " + idade + " Anos! O senhor(A) é mais que adulto! \nNão se preocupe, seu voto não mais é obrigatório! \nMeus parabéns pela sua idade, tá? \nE, por favor, volte sempre ao nosso programa? \nUm forte abração!!!!! ");
		}
	}

}
