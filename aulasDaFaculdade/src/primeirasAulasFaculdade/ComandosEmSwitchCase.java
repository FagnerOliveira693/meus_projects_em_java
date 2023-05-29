package primeirasAulasFaculdade;

import java.util.Scanner;

public class ComandosEmSwitchCase {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe um valor inteiro: ");
		int num1 = leitor.nextInt();
		
		switch (num1) {
		case 0:
			System.out.println("A variável recebeu o valor 0");
			break;
		case 1:
			System.out.println("A variável recebeu o valor 1");
			break;
		case 2:
			System.out.println("A variável recebeu o valor 2");
			break;
			default:
				System.out.println("\tA variável recebeu qualquer outro valor não testado acima\n");
		}
	}

}
