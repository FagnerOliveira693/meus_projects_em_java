package meusCalculosQueDesenvolvo;

import java.util.Scanner;

public class CalculoDivisao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o primeiro n�mero para divis�o: ");
		double num1 = entrada.nextDouble();
System.out.println("Informe o segundo n�mero para divis�o: ");
double num2 = entrada.nextDouble();
double media = num1 / num2;
System.out.println("Legal n�o �? O resultado da sua divis�o, �: " + media);

if (media >= 800) {
	System.out.println("Sensacional de mais meu lindo!!! Muit�ssimo show de bola! Voc� super atingio a m�dia estabelecida.");
}
else {
	System.out.println("Putz meu lindo! Infelizmente, n�o foi desta vez. Mas, continue estudando, t�? ");
}
	}

}
