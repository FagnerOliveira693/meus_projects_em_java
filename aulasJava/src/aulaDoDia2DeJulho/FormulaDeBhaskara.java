package aulaDoDia2DeJulho;

import java.util.Scanner;

public class FormulaDeBhaskara {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Por favor, digite os termos a, b e c da equação respectivamente: ");

		double a = teclado.nextDouble();
		double b = teclado.nextDouble();
		double c = teclado.nextDouble();

		double delta = Math.pow(b, 2) - 4 * a * c;

		double x1 = (double) (-b + Math.sqrt(delta)) / (2 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);

		System.out.printf("O valor do delta é: %.2f%n do x1 é: %f%n e do x2 é: %f%n", delta, x1, x2);
		
		teclado.close();
	}


}
