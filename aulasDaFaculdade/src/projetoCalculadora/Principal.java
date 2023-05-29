package projetoCalculadora;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int x, y;
		System.out.println("Informe o primeiro número: ");
		x = leitor.nextInt();
		
		System.out.println("Informe o segundo número: ");
		y = leitor.nextInt();
		
		Matematica mate = new Matematica(x, y);
		System.out.println("--------------------");
		System.out.println("O valor da operação soma, é: " + mate.soma());
		System.out.println("O valor da operação subtração, é: " + mate.subtrai());
		System.out.println("O valor da operação multiplicação, é: " + mate.multiplicar());
		System.out.println("O valor da operação divisão, é: " + mate.dividir());
		System.out.println("--------------------");
	}

}
