package pacoteDeInicio;

import java.util.Scanner;

public class TesteIR {

	public static void main(String[] args) {
		System.out.println("Ol�! Tudo bem com voc�? \n\tSeja muit�ssimo bem vindo(a) ao programa de c�lculo de imposto de renda... \n\t\tConfira abaixo: ");
		Scanner leitor = new Scanner(System.in);
		System.out.println("\tInforme seu sal�rio: ");
		double salario = leitor.nextDouble();
		
		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("No seu caso, seu Imposto de renda que ser� aplicado sobre seu sal�rio, � de: 7.5% e pode deduzir na declara��o o valor de R$ 142 reais... ");
		} else {
			if (salario >= 2800.01 && salario <= 3751.0) {
				System.out.println("O imposto de renda � de 15% e pode deduzir R$ 350 reais... ");
			} else {
				if (salario >= 3751.01 && salario <= 4664.00) {
					System.out.println("O imposto de renda � de 22.5% e pode deduzir R$ 636 reais... ");
				}
			}
		}
	}
}
