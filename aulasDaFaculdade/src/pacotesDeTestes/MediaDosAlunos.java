package pacotesDeTestes;

import java.util.Scanner;

public class MediaDosAlunos {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int i =1;
		float soma = 0;
		while(i <= 4) {
			System.out.println("Informe a nota " + i);
			float nota = leitor.nextInt();
			i++;
			soma += nota;
		}
		float media = soma / 4;
		if (media == 10) {
			System.out.println("Wal!!! Voc� super, hiper, mega power tirou " + media );
		} else {
			System.out.println("Pucha!!!! Voc� n�o tirou 10! Sua nota, foi: " + media);
		}
	}

}
