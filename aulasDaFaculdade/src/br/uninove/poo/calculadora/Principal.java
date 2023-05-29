package br.uninove.poo.calculadora;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		float numero1, numero2;
		
		Calculadora calc = new Calculadora();
		
		System.out.print("Informe o 1� valor: ");
		numero1 = leitor.nextFloat();
		
		System.out.print("Informe o 2� valor: ");
		numero2 = leitor.nextFloat();
		
		calc.setA(numero1);
		calc.setB(numero2);
		
		System.out.println("As 4 opera��es aplicadas aos valores " + calc.getA() + " e " + calc.getB() + " s�o ");
		
		System.out.println("\tSoma: " + calc.somar());
		System.out.println("\tSubtra��o: " + calc.subtrair());
		System.out.println("\tMultiplica��o: " + calc.multiplicar());
		System.out.println("\tDivis�o: " + calc.dividir());
		
		leitor.close();
	}

}
