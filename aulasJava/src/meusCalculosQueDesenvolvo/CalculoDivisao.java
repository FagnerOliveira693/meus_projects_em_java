package meusCalculosQueDesenvolvo;

import java.util.Scanner;

public class CalculoDivisao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o primeiro número para divisão: ");
		double num1 = entrada.nextDouble();
System.out.println("Informe o segundo número para divisão: ");
double num2 = entrada.nextDouble();
double media = num1 / num2;
System.out.println("Legal não é? O resultado da sua divisão, é: " + media);

if (media >= 800) {
	System.out.println("Sensacional de mais meu lindo!!! Muitíssimo show de bola! Você super atingio a média estabelecida.");
}
else {
	System.out.println("Putz meu lindo! Infelizmente, não foi desta vez. Mas, continue estudando, tá? ");
}
	}

}
