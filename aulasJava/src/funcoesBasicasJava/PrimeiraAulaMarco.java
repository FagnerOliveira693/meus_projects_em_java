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
		System.out.println("Olá! Tudo bem com você? Que legal estar programando em java! Você está falando com: " + nome + " É isso mesmo! E, eu tenho:" + idade + " Anos!" + " Eu sou casado, com: " + esposa);
	}

}
