package nossoSuperBancoDigital;

public class SistemaInterno {

	private int senha = 32245;
	public void autenticarSenha(Autenticavel gerente) {
		boolean autenticouASenha = gerente.autenticarSenha(this.senha);
		if (autenticouASenha) {
			System.out.println("Pode entrar no sistema!");
		} else {
			System.out.println("Não pode entrar no sistema!");
		}
	}
	
}