package nossoSuperBancoDigital;

public class Administrador extends Funcionario implements Autenticavel {

	
	private AutenticacaoUtil autenticador;
	
	public Administrador() {
		this.autenticador = new AutenticacaoUtil();
	}
	@Override
	public double getBonificacao() {
		System.out.println("Chamando o método do administrador! ");

		return 500;
	}
	
	@Override
	public void setSenhaDeAutenticacao(int senhaDeAutenticacao) {
		this.autenticador.autenticarSenha(senhaDeAutenticacao);
		
	}
	
	@Override
	public boolean autenticarSenha(int senhaDeAutenticacao) {
		return this.autenticador.autenticarSenha(senhaDeAutenticacao);
		
	}
	
}