package primeirasAulasFaculdade;

import java.util.Scanner;

public class CompararStrings {
	public static void main(String[] args) {
		String nome1, nome2;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o primeiro nome: ");
		nome1 = leitor.next();
		System.out.println("Informe o segundo nome: ");
		nome2 = leitor.next();
		
		if (nome1.equalsIgnoreCase(nome2)) {
			System.out.println("\n\tOs nomes digitados são iguais! ");
		} else {
			System.out.println("\n\tOs nomes digitados são diferentes!");
		}
	}

}
