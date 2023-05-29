package primeirasAulasFaculdade;

import java.util.Scanner;

public class CalculoDeMedias {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		float nota1, nota2, nota3, media;
		
		System.out.println("\n\tPor favor, informe as notas! ");
		
		System.out.print("\n\tInforme a nota 1: ");
		nota1 = leitor.nextFloat();
		
		System.out.print("\n\tInforme a nota 2: ");
		nota2 = leitor.nextFloat();
		
		System.out.print("\n\tInforme a nota 3: ");
		nota3 = leitor.nextFloat();
		
		media = calculaMedia(nota1, nota2, nota3);
		
		System.out.println("\n\tA média, é: " + media);
		
		
	}
	
	public static float calculaMedia(float n1, float n2, float n3) {
		
		
		float media;
		
		if (n1 < n2 && n1 < n3) {
			media = (n2 + n3) /2;
		} else if (n2 < n3) {
			media = (n1 + n3) / 2;
		} else {
			media = (n1 + n2) / 2;
		}
		return media;
	}

}
