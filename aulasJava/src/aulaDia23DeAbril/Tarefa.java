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
		System.out.println("Ol�! " + nome + "!" + " Seja muit�ssimo bem-vindo! \n" + "Sua idade, �: " + idade + " anos \n" + "Seu telefone, �: " + cel);
		teclado.close();

	}

}
