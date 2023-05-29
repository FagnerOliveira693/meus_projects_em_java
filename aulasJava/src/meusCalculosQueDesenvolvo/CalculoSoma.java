package meusCalculosQueDesenvolvo;

import java.util.Scanner;

public class CalculoSoma {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o primeiro número para soma: ");
		double num1 = entrada.nextDouble();
		System.out.println("Informe o segundo número: ");
		double num2 = entrada.nextDouble();
		double soma = num1 + num2;
		System.out.println("O resultado da soma realizada, é: " + soma);
		if (soma >= 100) {
			System.out.println("Sensacional cara! Sua soma atingio a média que estava esperando! Parabéns!!! Continue assim.");
			
		}
		else {
			System.out.println("Putz!!! Não foi desta vez meu lindo! Estude mais um pouco!");
		}

	}

}
