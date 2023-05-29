package primeirasAulasFaculdade;

import java.util.Scanner;

public class CalculoDeImc {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Olá, informe seu nome: ");
		String nome = leitor.nextLine();
		
		float peso, altura, imc;
		System.out.print("Por favor, informe seu peso: ");
		peso = leitor.nextFloat() ;
		
		System.out.print("Por favor, informe sua altura: ");
		altura = leitor.nextFloat();
		
		imc = peso / (altura * altura);
		
		System.out.println("\n\tOlá " + nome + "! Tudo bem contigo? Seu imc, é: " + imc);
	}

}
