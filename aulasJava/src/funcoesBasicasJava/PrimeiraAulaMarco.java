package funcoesBasicasJava;

import java.util.Scanner;

public class PrimeiraAulaMarco {

	public static void main(String[] args) {
		Scanner pessoa = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String nome = pessoa.nextLine();
		System.out.println("Informe sua idade: ");
		int idade = pessoa.nextInt();
		System.out.println("Por favor, informe o nome da sua esposa: ");
		String esposa = pessoa.nextLine();
		System.out.println("Ol�! Tudo bem com voc�? Que legal estar programando em java! Voc� est� falando com: " + nome + " � isso mesmo! E, eu tenho:" + idade + " Anos!" + " Eu sou casado, com: " + esposa);
	}

}
