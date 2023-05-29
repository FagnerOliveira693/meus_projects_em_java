package meusExemplos;

import java.util.Scanner;

public class MatrizComWhile {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Sejam bem-vindos ao nosso sistema de cadastro de alunos! ");
		
		System.out.print("Digite seu nome: ");
		String nome = leitor.nextLine();
		
		System.out.println("\tOlá " + nome + "! Quantos alunos deseja cadastrar: ");
		int qtdAlunos = leitor.nextInt();
		
		System.out.println("\tQuantas notas por aluno: ");
		int qtdNotas = leitor.nextInt();
		
		double[][] notasTurma = new double[qtdAlunos][qtdNotas];
		double total = 0;
		
		int a = 0;
		int nota = 0;
		for (a = 0; a < notasTurma.length; a++) {
			for (nota = 0; nota < notasTurma.length; nota++) {
				System.out.printf("Informe a nota %d do aluno %d: ", nota + 1, a + 1);
				notasTurma[a][nota] = leitor.nextDouble();
				total += notasTurma[a][nota];
				
				
			}
			
		}
		System.out.println();
		
		
		leitor.close();
	}

}
