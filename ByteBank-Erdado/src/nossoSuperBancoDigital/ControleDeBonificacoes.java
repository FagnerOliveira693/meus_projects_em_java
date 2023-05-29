package nossoSuperBancoDigital;

public class ControleDeBonificacoes {
	private double somaDasBonificacoes;
	
	public void registrarAsBonificacoesDosFuncionarios(Funcionario funcionariosColaboradores) {
		double bonificacaoDosColaboradores = funcionariosColaboradores.getBonificacao();
		this.somaDasBonificacoes += bonificacaoDosColaboradores;
	}
	
	public double getSomaDasBonificacoes() {
		return somaDasBonificacoes;
	}
	
	
}