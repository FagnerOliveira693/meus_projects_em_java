package meusCalculosQueDesenvolvo;

import java.util.Scanner;

public class CalculoMultiplicacao {
	
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Informe o primeiro número para ser realizada a multiplicação: ");
	double num1 = entrada.nextDouble();
	System.out.println("Informe o segundo número para ser realizada a multiplicação: ");
	double num2 = entrada.nextDouble();
	double multi = num1 * num2;
	System.out.println("O resultado da sua multiplicação, é: " + multi);
	if (multi >= 500) {
		System.out.println("Ual!!! Sensacional cara! Muito de mais você, em? Parabéns! Continue assim!");
	}
	else {
		System.out.println("Putz!!! Não foi desta vez meu lindo! Continue estudando, tá? Não desanime.");
	}
	

}
}
