package meusCalculosQueDesenvolvo;

import java.util.Scanner;

public class CalculoDeMediaDeNotas {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("------------------------------");
		System.out.println("Ol�! Seja muito bem-vindo ao resultado final de m�dia dos alunos!");
		System.out.println("------------------------------");
		System.out.println("Informe a primeira nota: ");
		double nota1 = entrada.nextDouble();
		System.out.println("Informe a segunda nota: ");
		double nota2 = entrada.nextDouble();
		System.out.println("Informe a terceira nota: ");
		double nota3 = entrada.nextDouble();
		System.out.println("Informe a quarta nota: ");
		double nota4 = entrada.nextDouble();
		double soma = nota1 + nota2 + nota3 + nota4;
		double media = soma / 4;
		if (media == 10) {
			System.out.println("Sensacional!!! Cara, voc� foi muito show de bola! Aprovad�ssimo! Seu conseito, �: Excelente! Sua nota, �: " + media);
		}
		else {
			if (media >= 8) {
				System.out.println("Show de bola! Meu lindo, voc� foi super aprovado. Seu conseito, �: �timo! Sua nota, �: " + media);
			}
			else {
				if (media >= 6) {
					System.out.println("Bom! Voc� foi aprovado! Seu conseito, foi: Bom! Sua nota, �: " + media);
				}
				else {
					if (media >= 4) {
						System.out.println("Pucha meu querido, voc� est� em recupera��o! Mas, ainda tem chanses. Seu conseito, foi: Regular. Sua nota, �: " + media);
					}
					else {
						System.out.println("Putz meu lindo!!! Infelizmente, voc� foi reprovado. Seu conseito, foi: Ruim! Sua nota, �: " + media);
					}
				}
			}
		}

	}

}
