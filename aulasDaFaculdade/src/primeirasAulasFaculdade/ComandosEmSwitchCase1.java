package primeirasAulasFaculdade;

import java.util.Scanner;

public class ComandosEmSwitchCase1 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("\n\t*** Programa de informa��o dos meses do ano: ***");
		
		System.out.println("\tDigite um n�mero inteiro para que seja exibido na tela, o m�s correspondente: ");
		int numero = leitor.nextInt();
		
		switch (numero) {
		case 1:
			System.out.println("\tO n�mero digitado, � correspondente ao m�s, de: Janeiro!!! \n\t\tPois, voc� digitou, o n�mero: " + numero);
			break;
		case 2:
			System.out.println("\tO n�mero digitado, � correspondente ao m�s, de: Fevereiro!!! \n\t\tPois, voc� digitou, o n�mero: " + numero);
			break;
		case 3:
			System.out.println("\tO n�mero digitado, � correspondente ao m�s, de: Mar�o!!! \n\t\tPois, voc� digitou, o n�mero: " + numero);
			break;
		case 4:
			System.out.println("\tO n�mero digitado, � correspondente ao m�s, de: Abril!!! \n\t\tPois, voc� digitou, o n�mero: " + numero);
			break;
		case 5:
			System.out.println("\tO n�mero digitado, � correspondente ao m�s, de: Maio!!! \n\t\tPois, voc� digitou, o n�mero: " + numero);
			break;
		case 6:
			System.out.println("\tO n�mero digitado, � correspondente ao m�s, de: junho!!! \n\t\tPois, voc� digitou, o n�mero: " + numero);
			break;
		case 7:
			System.out.println("\tO n�mero digitado, � correspondente ao m�s, de: Julho!!! \n\t\tPois, voc� digitou, o n�mero: " + numero);
			break;
		case 8:
			System.out.println("\tO n�mero digitado, � correspondente ao m�s, de: Agosto!!! \n\t\tPois, voc� digitou, o n�mero: " + numero);
			break;
		case 9:
			System.out.println("\tO n�mero digitado, � correspondente ao m�s, de: Setembro!!! \n\t\tPois, voc� digitou, o n�mero: " + numero);
			break;
		case 10:
			System.out.println("\tO n�mero digitado, � correspondente ao m�s, de: Outubro!!! \n\t\tPois, voc� digitou, o n�mero: " + numero);
			break;
		case 11:
			System.out.println("\tO n�mero digitado, � correspondente ao m�s, de: Novembro!!! \n\t\tPois, voc� digitou, o n�mero: " + numero);
			break;
		case 12:
			System.out.println("\tO n�mero digitado, � correspondente ao m�s, de: Dezembro!!! \n\t\tPois, voc� digitou, o n�mero: " + numero);
			break;
			default:
				System.out.println("\t\tDesculpe maninho... A op��o digitada, � inv�lida... Voc� digitou: " + numero + " \nFavor se atentar em informar apenas n�meros referentes aos meses do ano!!! \n\tDica: n�meros entre 1 e 12. ");
		}
	}

}
