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
			System.out.println("Ol� " + nome + "! Seja muito bem-vindo! \nVoc� tem: " + idade + " anos. \nVoc� � menor de idade! N�o precisa votar!");
		}
		else if ( idade <= 21) {
			System.out.println("Ol� " + nome + "! Seja muito bem-vindo! \nVoc� tem: " + idade + " anos. \nVoc� � menor de idade! N�o precisa votar! \nMas, j� pode tirar seu t�tulo de eleitor!");
		}
		else {
			System.out.println("Ol� " + nome + "! Seja muito bem-vindo! \nVoc� tem: " + idade + " anos. \nVoc� � maior de idade! \nSeu voto, � obrigat�rio! Vamos exercer cidadania? \n� isso a�!"); 
		}
		entrada.close();
	}

}
