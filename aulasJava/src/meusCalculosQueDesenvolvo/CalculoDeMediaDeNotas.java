package meusCalculosQueDesenvolvo;

import java.util.Scanner;

public class CalculoDeMediaDeNotas {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("------------------------------");
		System.out.println("Olá! Seja muito bem-vindo ao resultado final de média dos alunos!");
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
