package projetoCalculadora;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int x, y;
		System.out.println("Informe o primeiro n�mero: ");
		x = leitor.nextInt();
		
		System.out.println("Informe o segundo n�mero: ");
		y = leitor.nextInt();
		
		Matematica mate = new Matematica(x, y);
		System.out.println("--------------------");
		System.out.println("O valor da opera��o soma, �: " + mate.soma());
		System.out.println("O valor da opera��o subtra��o, �: " + mate.subtrai());
		System.out.println("O valor da opera��o multiplica��o, �: " + mate.multiplicar());
		System.out.println("O valor da opera��o divis�o, �: " + mate.dividir());
		System.out.println("--------------------");
	}

}
