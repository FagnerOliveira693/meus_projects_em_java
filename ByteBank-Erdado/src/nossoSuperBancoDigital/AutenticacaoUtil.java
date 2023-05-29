package nossoSuperBancoDigital;

public class AutenticacaoUtil {

	private int senhaDeAutenticacao;
	
	public void setSenhaDeAutenticacao(int senhaDeAutenticacao) {
		this.senhaDeAutenticacao = senhaDeAutenticacao;
	}
	
	public boolean autenticarSenha(int senhaDeAutenticacao) {
		if (this.senhaDeAutenticacao == senhaDeAutenticacao) {
			return true;
		} else {
			return false;
		}
	}
	
}
