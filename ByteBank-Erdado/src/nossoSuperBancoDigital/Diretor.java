package nossoSuperBancoDigital;

public class Diretor extends Funcionario implements Autenticavel {

	
	private int senhaDeAutoEscalao;
	
	@Override
	public double getBonificacao() {
		
		return super.getSalario() + super.getSalario() + 2000.0;
	}
	
	@Override
	public void setSenhaDeAutoEscalao(int senhaDeAutoEscalao) {
		this.senhaDeAutoEscalao = senhaDeAutoEscalao;
		
	}
	
	@Override
	public boolean autenticarSenha(int senhaDeAutoEscalao) {
		if (this.senhaDeAutoEscalao == senhaDeAutoEscalao) {
			return true;
		} else {
			return false;
		}
		
	}
}
