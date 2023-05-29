package aulaDoDia18DeJunho;

import java.util.Scanner;

public class ExercicioPessoas {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Verificando pessoas maiores e menores de idade: ");
		int maiores = 0;
		int menores = 0;
		for ( int i = 0; i < 3; i++) {
			System.out.println("Digite o primeiro nome: ");
			String nome = entrada.nextLine();
			System.out.println("Digite a idade de " + nome + ": ");
			int idade = entrada.nextInt();
			entrada.nextLine();
			
			if ( idade >= 18) {
				maiores++;
				System.out.println(nome + " é maior de idade!");
				
			} else {
				menores++;
				System.out.println(nome + " é menor de idade!");
			}
			System.out.println("Fim do programa! ");
		}
	}

}
