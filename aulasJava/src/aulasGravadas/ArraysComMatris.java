package aulasGravadas;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysComMatris {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Sejam bem-vindos ao nosso sistema de cadastro de alunos! ");
		
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Olá! " + nome + "! Tudo bem? Quantos alunos deseja cadastrar? ");
		int qtdAlunos = entrada.nextInt();
		System.out.println("Quantas notas por aluno: ");
		int qtdNotas = entrada.nextInt();
		
		double[][] notasTurma = new double[qtdAlunos][qtdNotas];
		double total = 0;
		
		for (int a = 0; a < notasTurma.length; a++ ) {
			for (int n = 0; n < notasTurma[a].length; n++) {
				System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
				notasTurma[a][n] = entrada.nextDouble();
				total += notasTurma[a][n];
				
			}
		}
		System.out.println("............");
		
		double media = total / (qtdAlunos * qtdNotas);
		System.out.println("Média da turma, é: " + media);
		
		
		for (double[] notasDoAluno: notasTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
	}

}
