package nossoSuperBancoDigital;

public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public double getBonificacao() {
		System.out.println("Chamando o método bonificacao do GERENTE");
		return super.getSalario() + 2000.0;
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