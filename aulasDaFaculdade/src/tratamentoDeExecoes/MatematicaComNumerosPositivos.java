package tratamentoDeExecoes;

import java.util.Scanner;

public class MatematicaComNumerosPositivos {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		float x, y, resultado;
		
		System.out.println("Calculadora de valores positivos");
		
		System.out.print("\t Valor 1: ");
		x = leitor.nextFloat();
		
		System.out.print("\t Valor 2: ");
		y = leitor.nextFloat();
		
		try {
			if (y > x) {
				throw new IllegalArgumentException("Puts Amig�o!!! Y n�o pode ser subtra�do de X, pois, � maior que X!");
			} else {
				resultado = x - y;
				System.out.println("\tO resultado da subtra��o, �: " + resultado);
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}