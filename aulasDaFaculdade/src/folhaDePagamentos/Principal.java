package folhaDePagamentos;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		//Vari�veis auxiliares.
		
		String nomeAux;
		double salarioAux;
		int diasAux;
		//Le os dados para um funcion�rio mensalista:
		
		System.out.print("Qual o nome do funcion�rio mensalista? ");
		nomeAux = leitor.next();
		
		System.out.print("Qual o valor do sal�rio bruto do funcion�rio mensalista?");
		salarioAux = leitor.nextDouble();
		
		//Constr�i um funcion�rio mensalista na mem�ria (inst�ncia)
		
		FuncionarioMensalista fuMe = new FuncionarioMensalista(nomeAux, salarioAux);
		
		//Le os dados para um funcion�rio diarista:
		
		System.out.print("\nQual o nome do funcion�rio diarista? ");
		nomeAux = leitor.next();
		
		System.out.print("Qual o valor da hora deste funcion�rio diarista?");
		salarioAux = leitor.nextDouble();
		
		System.out.print("Quantos dias ele trabalhou?");
		diasAux = leitor.nextInt();
		//Cria a inst�ncia de um funcion�rio diarista na mem�ria, j� com os dados:
		
		FuncionarioDiarista fD = new FuncionarioDiarista(nomeAux, salarioAux, diasAux);
		
		//Agora vamos imprimir os dados de cada um e o sal�rio bruto (calculado):
		System.out.println("Dados e sal�rio do Funcion�rio mensalista: ");
		System.out.println("\tNome: " + fuMe.nome);
		System.out.println("\tSal�rio Bruto: " + fuMe.calcularSalarioLiquido());
		
		System.out.println("------\nDados e sal�rio do Funcion�rio diarista: ");
		System.out.println("\tNome: " + fD.nome);
		System.out.println("\tSal�rio Bruto: " + fD.calcularSalarioLiquido());
		
		System.out.println("\n\tSal�rio bruto: " + fD.calcularSalarioLiquido());
		
		leitor.close();
	}
	
	

}
