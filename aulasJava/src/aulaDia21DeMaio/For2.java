package aulaDia21DeMaio;

import java.util.Scanner;

public class For2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escolha qual tabuada deseja que seja apresentada na tela: ");
		int valor = entrada.nextInt();
		for ( int i = 1; i < 11; i++) {
			System.out.printf("[%d X %d = %d]\n", valor, i, valor*i);
		}
		System.out.println("\nFim!");
		entrada.close();
	}

}
