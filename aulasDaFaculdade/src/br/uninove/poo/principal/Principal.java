package br.uninove.poo.principal;

import br.uninove.poo.matematica.Trigonometria;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Trigonometria tri = new Trigonometria();
		float base, altura;
		
		System.out.print("Informe o valor da base do triângulo: ");
		base = leitor.nextFloat();
		
		System.out.print("Informe o valor da altura do triângulo: ");
		altura = leitor.nextFloat();
		
		System.out.print("\nA área deste triângulo é: ");
		
		System.out.println(tri.areaDoTriangulo(base, altura));
		
		leitor.close();
	}

}
