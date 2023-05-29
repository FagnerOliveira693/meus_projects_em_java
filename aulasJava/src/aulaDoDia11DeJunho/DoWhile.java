package aulaDoDia11DeJunho;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String texto = "";
		
		do {
			System.out.println("Você precisa falar:\nAs palavras mágicas... ");
			System.out.print("Quer sair? ");
			texto = entrada.nextLine();
		} while (!texto.equalsIgnoreCase("Por favor"));
		
		System.out.println("Obrigado! Por digitar o que estava esperando! ");
		
		entrada.close();
	}

}
