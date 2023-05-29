package aulaOperadoresMarco;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print("Dia!\n");
		
		System.out.println("Bom");
		System.out.println("Dia!");
		
		System.out.printf("Mega sena: %d %d %d %d %d %d %n", 
				1, 2, 3, 4, 5, 6);
		System.out.printf("Salário: %.1f%n", 1234.678);
		System.out.printf("nome: %s%n", "Fagner");
		
		System.out.println();
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = teclado.next();
		System.out.print("Digite o sobre nome: ");
		String sobreNome = teclado.next();
		System.out.print("Digite sua idade: ");
		int idade = teclado.nextInt();
		System.out.printf("%s %s tem %d anos.%n", 
				nome, sobreNome, idade);
		
		teclado.close();
		
		

	}

}
