package aulaDia28DeMaio;

import java.util.Scanner;

public class LacoWhileIndeterminado {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String valor = "";
		while ( !valor.equalsIgnoreCase("Sair")) {
			System.out.println("Duvído você acertar o que estou pensando: ");
			valor = entrada.next();
		}
		System.out.println("Wal!!! Você acertou. Parabéns. Até a próxima... ");
		entrada.close();
		
	}

}
