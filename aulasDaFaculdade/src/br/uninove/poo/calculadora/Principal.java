package br.uninove.poo.calculadora;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		float numero1, numero2;
		
		Calculadora calc = new Calculadora();
		
		System.out.print("Informe o 1º valor: ");
		numero1 = leitor.nextFloat();
		
		System.out.print("Informe o 2º valor: ");
		numero2 = leitor.nextFloat();
		
		calc.setA(numero1);
		calc.setB(numero2);
		
		System.out.println("As 4 operações aplicadas aos valores " + calc.getA() + " e " + calc.getB() + " são ");
		
		System.out.println("\tSoma: " + calc.somar());
		System.out.println("\tSubtração: " + calc.subtrair());
		System.out.println("\tMultiplicação: " + calc.multiplicar());
		System.out.println("\tDivisão: " + calc.dividir());
		
		leitor.close();
	}

}
