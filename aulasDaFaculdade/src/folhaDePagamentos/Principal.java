package folhaDePagamentos;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		//Variáveis auxiliares.
		
		String nomeAux;
		double salarioAux;
		int diasAux;
		//Le os dados para um funcionário mensalista:
		
		System.out.print("Qual o nome do funcionário mensalista? ");
		nomeAux = leitor.next();
		
		System.out.print("Qual o valor do salário bruto do funcionário mensalista?");
		salarioAux = leitor.nextDouble();
		
		//Constrói um funcionário mensalista na memória (instância)
		
		FuncionarioMensalista fuMe = new FuncionarioMensalista(nomeAux, salarioAux);
		
		//Le os dados para um funcionário diarista:
		
		System.out.print("\nQual o nome do funcionário diarista? ");
		nomeAux = leitor.next();
		
		System.out.print("Qual o valor da hora deste funcionário diarista?");
		salarioAux = leitor.nextDouble();
		
		System.out.print("Quantos dias ele trabalhou?");
		diasAux = leitor.nextInt();
		//Cria a instância de um funcionário diarista na memória, já com os dados:
		
		FuncionarioDiarista fD = new FuncionarioDiarista(nomeAux, salarioAux, diasAux);
		
		//Agora vamos imprimir os dados de cada um e o salário bruto (calculado):
		System.out.println("Dados e salário do Funcionário mensalista: ");
		System.out.println("\tNome: " + fuMe.nome);
		System.out.println("\tSalário Bruto: " + fuMe.calcularSalarioLiquido());
		
		System.out.println("------\nDados e salário do Funcionário diarista: ");
		System.out.println("\tNome: " + fD.nome);
		System.out.println("\tSalário Bruto: " + fD.calcularSalarioLiquido());
		
		System.out.println("\n\tSalário bruto: " + fD.calcularSalarioLiquido());
		
		leitor.close();
	}
	
	

}
