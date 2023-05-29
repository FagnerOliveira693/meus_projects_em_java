package nossoSuperBancoDigital;

public class Cliente implements Autenticavel {

	
	private AutenticacaoUtil autenticador;
	
	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenhaDeAutenticacao(int senhaDeAutenticacao) {
		
		this.autenticador.setSenhaDeAutenticacao(senhaDeAutenticacao);
	}
	
	@Override
	public boolean autenticarSenha(int senhaDeAutenticacao) {
		return this.autenticador.autenticarSenha(senhaDeAutenticacao);
		
	}
}