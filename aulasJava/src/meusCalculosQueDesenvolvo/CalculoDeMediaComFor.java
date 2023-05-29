package meusCalculosQueDesenvolvo;

import java.util.Scanner;

public class CalculoDeMediaComFor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("------------------------------");
		System.out.println("Olá! Seja muito bem-vindo ao meu programa de cálculo de média dos alunos!");
		System.out.println("------------------------------");
		double soma = 0;
		
		for (double cont = 1; cont <= 4; cont++) {
			System.out.println("Informe a nota do aluno: ");
			double nota = entrada.nextDouble();
			soma += nota;
		}
		double media = soma / 4;
		if (media == 10) {
			System.out.println("Sensacional!!! Cara, você foi muito show de bola! Aprovadíssimo! Seu conseito, é: Excelente! Sua nota, é: " + media);
		}
		else {
			if (media >= 8) {
				System.out.println("Show de bola! Meu lindo, você foi super aprovado. Seu conseito, é: Ótimo! Sua nota, é: " + media);
			}
			else {
				if (media >= 6) {
					System.out.println("Bom! Você foi aprovado! Seu conseito, foi: Bom! Sua nota, é: " + media);
				}
				else {
					if (media >= 4) {
						System.out.println("Pucha meu querido, você está em recuperação! Mas, ainda tem chanses. Seu conseito, foi: Regular. Sua nota, é: " + media);
					}
					else {
						System.out.println("Putz meu lindo!!! Infelizmente, você foi reprovado. Seu conseito, foi: Ruim! Sua nota, é: " + media);
					}
				}
			}
		}

	}

}

