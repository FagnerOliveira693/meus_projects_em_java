package br.uninove.poo.principal;

import br.uninove.poo.matematica.Trigonometria;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Trigonometria tri = new Trigonometria();
		float base, altura;
		
		System.out.print("Informe o valor da base do tri�ngulo: ");
		base = leitor.nextFloat();
		
		System.out.print("Informe o valor da altura do tri�ngulo: ");
		altura = leitor.nextFloat();
		
		System.out.print("\nA �rea deste tri�ngulo �: ");
		
		System.out.println(tri.areaDoTriangulo(base, altura));
		
		leitor.close();
	}

}
