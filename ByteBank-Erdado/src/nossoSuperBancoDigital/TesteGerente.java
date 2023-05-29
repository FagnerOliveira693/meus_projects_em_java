package nossoSuperBancoDigital;

public class TesteGerente {

	public static void main(String[] args) {
		Autenticavel referencia = new Cliente();
		
		Gerente g1 = new Gerente();
		g1.setNome("Franklin Oliveira Araujo");
		g1.setCpf("225.225.225-25");
		g1.setRa(8592);
		g1.setSalario(3500.0);
		System.out.println(g1.getNome());
		System.out.println(g1.getRa());
		System.out.println(g1.getSalario());
		
		System.out.println(g1.getBonificacao());
		
		g1.setSenhaDeAutoEscalao(32245);
		
		boolean autenticou = g1.autenticarSenha(32245);
		
		System.out.println(autenticou);
	}
}