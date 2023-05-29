package cadastroDePessoas;

import java.util.Scanner;
import java.util.ArrayList;
public class TesteDePessoas {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Pessoas listaDePessoas[] = new Pessoas[4];
		//Pessoa 1
		
		listaDePessoas[0] = new Pessoas();
		listaDePessoas[0].nome = leitor.nextLine();
		listaDePessoas[0].email = leitor.next();
		listaDePessoas[0].nomeDaMae = leitor.nextLine();
		listaDePessoas[0].cpf = leitor.next();
		listaDePessoas[0].idade = leitor.nextInt();
		listaDePessoas[0].telefone = leitor.nextInt();
		listaDePessoas[0].registroGeral = leitor.nextInt();
		
		//Pessoa 2
		listaDePessoas[1] = new Pessoas();
		listaDePessoas[1].nome = leitor.nextLine();
		listaDePessoas[1].email = leitor.next();
		listaDePessoas[1].nomeDaMae = leitor.nextLine();
		listaDePessoas[1].nomeDaMae = leitor.nextLine();
		listaDePessoas[1].cpf = leitor.next();
		listaDePessoas[1].telefone = leitor.nextInt();
		listaDePessoas[1].registroGeral = leitor.nextInt();
		
		//Pessoa 3
		listaDePessoas[2] = new Pessoas();
		listaDePessoas[2].nome = leitor.nextLine();
		listaDePessoas[2].email = leitor.next();
		listaDePessoas[2].nomeDaMae = leitor.nextLine();
		listaDePessoas[2].cpf = leitor.next();
		listaDePessoas[2].idade = leitor.nextInt();
		listaDePessoas[2].telefone = leitor.nextInt();
		listaDePessoas[2].registroGeral = leitor.nextInt();
		
		//Pessoa 4
		listaDePessoas[3] = new Pessoas();
		listaDePessoas[3].nome = leitor.nextLine();
		listaDePessoas[3].email = leitor.next();
		listaDePessoas[3].nomeDaMae = leitor.nextLine();
		listaDePessoas[3].cpf = leitor.next();
		listaDePessoas[3].idade = leitor.nextInt();
		listaDePessoas[3].telefone = leitor.nextInt();
		listaDePessoas[3].registroGeral = leitor.nextInt();
		
		int i = 0;
		while (i <= 3) {
			System.out.println("Dados da pessoa cadastrada: " + (i + 1) + ":");
			System.out.println("\t" + listaDePessoas[i].nome);
			System.out.println("\t" + listaDePessoas[i].email);
			System.out.println("\t" + listaDePessoas[i].nomeDaMae);System.out.println("\t" + listaDePessoas[i].cpf);
			System.out.println("\t" + listaDePessoas[i].idade);
			System.out.println("\t" + listaDePessoas[i].telefone);
			System.out.println("\t" + listaDePessoas[i].registroGeral);
			i++;
		}

		
	}

}
