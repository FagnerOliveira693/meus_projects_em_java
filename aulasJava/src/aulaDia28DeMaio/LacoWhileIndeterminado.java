package aulaDia28DeMaio;

import java.util.Scanner;

public class LacoWhileIndeterminado {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String valor = "";
		while ( !valor.equalsIgnoreCase("Sair")) {
			System.out.println("Duv�do voc� acertar o que estou pensando: ");
			valor = entrada.next();
		}
		System.out.println("Wal!!! Voc� acertou. Parab�ns. At� a pr�xima... ");
		entrada.close();
		
	}

}
