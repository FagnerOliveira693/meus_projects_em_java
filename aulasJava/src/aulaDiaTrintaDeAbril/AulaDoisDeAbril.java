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
			System.out.println("Ol� " + nome + "! \nTudo bem contigo? \nVoc� tem: " + idade + " Anos! Show de bola. \nVoc� � menor de idade! Ainda n�o precisa votar. \nMuito obrigado por sua visita em nosso programa!");
		}
		else if ( idade <= 21) {
			System.out.println("Ol� " + nome + "! Tudo bem com voc�? \nCara, voc� tem: " + idade + " Anos! \nTope de mais!!! \nVoc� � maior de idade e, j� pode solicitar o t�tulo de eleitor! \nVamos exercer nossa cidadania. ");
		}
		else if ( idade <= 65) {
			System.out.println("Ol� " + nome + "! \nTudo joia? \nSeja muito bem-vindo! \nVoc� tem: " + idade + " Anos! \nVoc� � adulto e, seu voto, � obrigat�rio! \nVamos continuar exercendo cidadania? \nVolte sempre ao nosso programa!!!");
		}
		else {
			System.out.println("Ol� " + nome + "! \nTudo bem com o senhor(A)? \nSua idade �: " + idade + " Anos! O senhor(A) � mais que adulto! \nN�o se preocupe, seu voto n�o mais � obrigat�rio! \nMeus parab�ns pela sua idade, t�? \nE, por favor, volte sempre ao nosso programa? \nUm forte abra��o!!!!! ");
		}
	}

}
