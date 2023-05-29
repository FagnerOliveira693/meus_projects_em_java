package pacoteDeInicio;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um número para ser exibido o mês correspondente... ");
		int mes = leitor.nextInt();
		
		switch (mes) {
		case 1:
			System.out.println("O mês escolhido por você, é: Janeiro! ");
		break;
		case 2:
			System.out.println("O mês escolhido por você, é: Fevereiro! ");
		break;
		case 3:
			System.out.println("O mês escolhido por você, é: Março! ");
			break;
		case 4:
			System.out.println("O mês escolhido por você, é: Abril! ");
			break;
		case 5:
			System.out.println("O mês escolhido por você, é: Maio! ");
			break;
		case 6:
			System.out.println("O mês escolhido por você, é: Junho! ");
		break;
		case 7:
			System.out.println("O mês escolhido por você, é: Julho! ");
			break;
		case 8:
			System.out.println("O mês escolhido por você, é: Agosto! ");
			break;
		case 9:
			System.out.println("O mês escolhido por você, é: Setembro! ");
			break;
		case 10:
			System.out.println("O mês escolhido por você, é: Outubro! ");
			break;
		case 11:
			System.out.println("O mês escolhido por você, é: Novembro! ");
			break;
		case 12:
			System.out.println("O mês escolhido por você, é: Dezembro! ");
			break;
		
		default:
			System.out.println("Ops... Mês inválido! Você não informou um número correto para ser exibido em tela... ");
			break;
		}
	}
}