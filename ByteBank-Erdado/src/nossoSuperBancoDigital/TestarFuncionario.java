package nossoSuperBancoDigital;

public class TestarFuncionario {

	public static void main(String[] args) {
		Diretor diretor = new Diretor();
		diretor.setSenhaDeAutoEscalao(32245);
		
		//System.out.println(diretor.g);
		SistemaInterno sisInt = new SistemaInterno();
		sisInt.autenticarSenha(diretor);
		
	}
	
}