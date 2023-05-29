package aula14DeMaioJava;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a nota: ");
		double nota = teclado.nextDouble();
		
		if ( nota > 10 || nota < 0) {
			System.out.println("Nota inválida! Gentileza verificar.");
		}
		else if ( nota >= 8.1) {
			System.out.println("Conceito A! \nParabéns!!! Sensacional. \nSua nota, é: " + nota);
			
		} else if ( nota >= 6.1) {
			System.out.println("Conceito B! \nParabéns! ");
		} else if ( nota >= 4.1) {
			System.out.println("Conceito C! \nPuts!!! \nFicou em recuperação. \nManinho, tem que estudar mais. ");
		} else if ( nota >= 2.1) {
			System.out.println("Conceito D! \nPucha carinha!!! \nNão foi desta vez! Reprovado.  ");
		} else {
			System.out.println("Conceito E! \nÉ meu carinha!!! \nVocê foi muito, mais muito ruim!!! \nQue pena!!! \nNão foi desta vez! \nReprovado. ");
		}
		
		teclado.close();
	}

}
