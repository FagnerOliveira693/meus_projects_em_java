package pacoteDeTestes;

import java.util.Scanner;

public class Teste1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome = "";
		while (!nome.equalsIgnoreCase("Fagner Araujo")) {
			System.out.println("Qual é meu nome: ");
			nome = teclado.nextLine();
		}
		System.out.println("Show de bola carinha! \nAté logo! Você acertou. Meu nome, é: " + nome);
		
		teclado.close();

	}

}
