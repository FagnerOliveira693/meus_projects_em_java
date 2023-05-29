package nossoSuperBancoDigital;

import java.util.Scanner;

public class TesteDoSistema {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a senha do diretor: ");
		int senhaDoDiretor = leitor.nextInt();
		
		Diretor diretor = new Diretor();
		diretor.setNome("Fagner Araujo");
		diretor.setSalario(15000.0);
		diretor.setSenhaDeAutoEscalao(senhaDoDiretor);
		System.out.println(diretor.getNome());
		System.out.println(diretor.getBonificacao());
		
		Cliente cliente = new Cliente();
		System.out.println("Senha do cliente: ");
		int pedeSenhaDoCliente = leitor.nextInt();
		cliente.setSenhaDeAutoEscalao(pedeSenhaDoCliente);
		
		
		
		
		
		Gerente gerente = new Gerente();
		System.out.println("Digite a senha do gerente: ");
		int senhaDoGerente = leitor.nextInt();
		gerente.setSalario(8500.0);
		gerente.setNome("Miguel Lorenzo");
		gerente.setSenhaDeAutoEscalao(senhaDoGerente);
		System.out.println(gerente.getNome());
		System.out.println(gerente.getBonificacao());
		
		SistemaInterno sisInt = new SistemaInterno();
		sisInt.autenticarSenha(diretor);
		sisInt.autenticarSenha(gerente);
		sisInt.autenticarSenha(cliente);
		
		leitor.close();
	}
	
}