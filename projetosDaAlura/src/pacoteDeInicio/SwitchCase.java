package pacoteDeInicio;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um n�mero para ser exibido o m�s correspondente... ");
		int mes = leitor.nextInt();
		
		switch (mes) {
		case 1:
			System.out.println("O m�s escolhido por voc�, �: Janeiro! ");
		break;
		case 2:
			System.out.println("O m�s escolhido por voc�, �: Fevereiro! ");
		break;
		case 3:
			System.out.println("O m�s escolhido por voc�, �: Mar�o! ");
			break;
		case 4:
			System.out.println("O m�s escolhido por voc�, �: Abril! ");
			break;
		case 5:
			System.out.println("O m�s escolhido por voc�, �: Maio! ");
			break;
		case 6:
			System.out.println("O m�s escolhido por voc�, �: Junho! ");
		break;
		case 7:
			System.out.println("O m�s escolhido por voc�, �: Julho! ");
			break;
		case 8:
			System.out.println("O m�s escolhido por voc�, �: Agosto! ");
			break;
		case 9:
			System.out.println("O m�s escolhido por voc�, �: Setembro! ");
			break;
		case 10:
			System.out.println("O m�s escolhido por voc�, �: Outubro! ");
			break;
		case 11:
			System.out.println("O m�s escolhido por voc�, �: Novembro! ");
			break;
		case 12:
			System.out.println("O m�s escolhido por voc�, �: Dezembro! ");
			break;
		
		default:
			System.out.println("Ops... M�s inv�lido! Voc� n�o informou um n�mero correto para ser exibido em tela... ");
			break;
		}
	}
}