package meusCalculosQueDesenvolvo;

import java.util.Scanner;

public class CalculoSoma {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o primeiro n�mero para soma: ");
		double num1 = entrada.nextDouble();
		System.out.println("Informe o segundo n�mero: ");
		double num2 = entrada.nextDouble();
		double soma = num1 + num2;
		System.out.println("O resultado da soma realizada, �: " + soma);
		if (soma >= 100) {
			System.out.println("Sensacional cara! Sua soma atingio a m�dia que estava esperando! Parab�ns!!! Continue assim.");
			
		}
		else {
			System.out.println("Putz!!! N�o foi desta vez meu lindo! Estude mais um pouco!");
		}

	}

}
