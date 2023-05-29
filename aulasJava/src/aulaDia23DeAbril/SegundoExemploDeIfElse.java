package aulaDia23DeAbril;

import java.util.Scanner;

public class SegundoExemploDeIfElse {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = teclado.nextLine();
		System.out.println("Digite sua idade: ");
		int idade = teclado.nextInt();
		
		if ( idade >= 18) {
			System.out.println("Olá " + nome + "!\n Você tem: " + idade + " anos. Show de bola! É maior de idade. \n Pode executar sem problemas as tarefas.");
		}
		else {
			System.out.println("Olá " + nome + "!\n Você tem: " + idade + " anos. \n Puts carinha! Você é menor de idade! \n Não pode executar as tarefas por ter menos de 18 anos.");
		}
		
		teclado.close();

	}

}
