package aulaDiaTrintaDeAbril;

import java.util.Scanner;

public class AulaUmDeAbril {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		if ( idade <= 18) {
			System.out.println("Olá " + nome + "! Seja muito bem-vindo! \nVocê tem: " + idade + " anos. \nVocê é menor de idade! Não precisa votar!");
		}
		else if ( idade <= 21) {
			System.out.println("Olá " + nome + "! Seja muito bem-vindo! \nVocê tem: " + idade + " anos. \nVocê é menor de idade! Não precisa votar! \nMas, já pode tirar seu título de eleitor!");
		}
		else {
			System.out.println("Olá " + nome + "! Seja muito bem-vindo! \nVocê tem: " + idade + " anos. \nVocê é maior de idade! \nSeu voto, é obrigatório! Vamos exercer cidadania? \nÉ isso aí!"); 
		}
		entrada.close();
	}

}
