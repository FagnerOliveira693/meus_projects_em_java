package aulaDia23DeAbril;

import java.util.Scanner;

public class Tarefa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o nome: ");
		String nome = teclado.nextLine();
		System.out.print("Digite a idade: ");
		int idade = teclado.nextInt();
		System.out.print("Informe seu telefone: ");
		String cel = teclado.next();
		System.out.println("Olá! " + nome + "!" + " Seja muitíssimo bem-vindo! \n" + "Sua idade, é: " + idade + " anos \n" + "Seu telefone, é: " + cel);
		teclado.close();

	}

}
