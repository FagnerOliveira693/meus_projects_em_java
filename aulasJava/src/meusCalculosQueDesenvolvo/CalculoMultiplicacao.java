package meusCalculosQueDesenvolvo;

import java.util.Scanner;

public class CalculoMultiplicacao {
	
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Informe o primeiro n�mero para ser realizada a multiplica��o: ");
	double num1 = entrada.nextDouble();
	System.out.println("Informe o segundo n�mero para ser realizada a multiplica��o: ");
	double num2 = entrada.nextDouble();
	double multi = num1 * num2;
	System.out.println("O resultado da sua multiplica��o, �: " + multi);
	if (multi >= 500) {
		System.out.println("Ual!!! Sensacional cara! Muito de mais voc�, em? Parab�ns! Continue assim!");
	}
	else {
		System.out.println("Putz!!! N�o foi desta vez meu lindo! Continue estudando, t�? N�o desanime.");
	}
	

}
}
