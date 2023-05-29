package primeirasAulasFaculdade;

import java.util.Scanner;

public class ComandosEmSwitchCase1 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("\n\t*** Programa de informação dos meses do ano: ***");
		
		System.out.println("\tDigite um número inteiro para que seja exibido na tela, o mês correspondente: ");
		int numero = leitor.nextInt();
		
		switch (numero) {
		case 1:
			System.out.println("\tO número digitado, é correspondente ao mês, de: Janeiro!!! \n\t\tPois, você digitou, o número: " + numero);
			break;
		case 2:
			System.out.println("\tO número digitado, é correspondente ao mês, de: Fevereiro!!! \n\t\tPois, você digitou, o número: " + numero);
			break;
		case 3:
			System.out.println("\tO número digitado, é correspondente ao mês, de: Março!!! \n\t\tPois, você digitou, o número: " + numero);
			break;
		case 4:
			System.out.println("\tO número digitado, é correspondente ao mês, de: Abril!!! \n\t\tPois, você digitou, o número: " + numero);
			break;
		case 5:
			System.out.println("\tO número digitado, é correspondente ao mês, de: Maio!!! \n\t\tPois, você digitou, o número: " + numero);
			break;
		case 6:
			System.out.println("\tO número digitado, é correspondente ao mês, de: junho!!! \n\t\tPois, você digitou, o número: " + numero);
			break;
		case 7:
			System.out.println("\tO número digitado, é correspondente ao mês, de: Julho!!! \n\t\tPois, você digitou, o número: " + numero);
			break;
		case 8:
			System.out.println("\tO número digitado, é correspondente ao mês, de: Agosto!!! \n\t\tPois, você digitou, o número: " + numero);
			break;
		case 9:
			System.out.println("\tO número digitado, é correspondente ao mês, de: Setembro!!! \n\t\tPois, você digitou, o número: " + numero);
			break;
		case 10:
			System.out.println("\tO número digitado, é correspondente ao mês, de: Outubro!!! \n\t\tPois, você digitou, o número: " + numero);
			break;
		case 11:
			System.out.println("\tO número digitado, é correspondente ao mês, de: Novembro!!! \n\t\tPois, você digitou, o número: " + numero);
			break;
		case 12:
			System.out.println("\tO número digitado, é correspondente ao mês, de: Dezembro!!! \n\t\tPois, você digitou, o número: " + numero);
			break;
			default:
				System.out.println("\t\tDesculpe maninho... A opção digitada, é inválida... Você digitou: " + numero + " \nFavor se atentar em informar apenas números referentes aos meses do ano!!! \n\tDica: números entre 1 e 12. ");
		}
	}

}
