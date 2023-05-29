package funcoesBasicasJava;

import java.util.Scanner;

public class AulaDia19Marco {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("Informe o nome da esposa: ");
		String esposa = entrada.nextLine();
		System.out.println("Informe o nome da mãe: ");
		String mae = entrada.nextLine();
		System.out.println("Informe sua idade: ");
		int idade = entrada.nextInt();
		System.out.println("Informe a idade da esposa: ");
		int idadeEsposa = entrada.nextInt();
		System.out.println("Informe a idade de sua mãe: ");
		int idadeMae = entrada.nextInt();
		
		
		System.out.println("Olá! Tudo bem contigo? Seja muito bem-vindo! Meu nome, é: \n" + nome + "!\n" + " É isso mesmo! Eu tenho: \n" + idade + " Anos! Que legal, né? O nome da minha esposa, é: \n" + esposa + "!\n" + " Legal não é? Minha esposa, tem: " + idadeEsposa + " Anos!\n" + " E agora, pra finalizar, o nome da minha mames, é: \n" + mae + "!" + "\n E, olha só que bacana, minha mãe, é uma senhora jovem! Ela tem: \n" + idadeMae + " Anos!");
	
		
	}

}
