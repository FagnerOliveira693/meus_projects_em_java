package funcoesBasicasJava;

import java.util.Scanner;

public class AulaDia19Marco {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("Informe o nome da esposa: ");
		String esposa = entrada.nextLine();
		System.out.println("Informe o nome da m�e: ");
		String mae = entrada.nextLine();
		System.out.println("Informe sua idade: ");
		int idade = entrada.nextInt();
		System.out.println("Informe a idade da esposa: ");
		int idadeEsposa = entrada.nextInt();
		System.out.println("Informe a idade de sua m�e: ");
		int idadeMae = entrada.nextInt();
		
		
		System.out.println("Ol�! Tudo bem contigo? Seja muito bem-vindo! Meu nome, �: \n" + nome + "!\n" + " � isso mesmo! Eu tenho: \n" + idade + " Anos! Que legal, n�? O nome da minha esposa, �: \n" + esposa + "!\n" + " Legal n�o �? Minha esposa, tem: " + idadeEsposa + " Anos!\n" + " E agora, pra finalizar, o nome da minha mames, �: \n" + mae + "!" + "\n E, olha s� que bacana, minha m�e, � uma senhora jovem! Ela tem: \n" + idadeMae + " Anos!");
	
		
	}

}
