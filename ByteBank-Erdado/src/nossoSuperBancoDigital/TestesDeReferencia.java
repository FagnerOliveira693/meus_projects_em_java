package nossoSuperBancoDigital;

public class TestesDeReferencia {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Fagner Miguel");
		g1.setSalario(7500.0);
		
		
		Funcionario f1 = new Designer();
		f1.setSalario(2500.0);
		
		EditorDeVideo editor = new EditorDeVideo();
		editor.setSalario(2500.0);
		
		ControleDeBonificacoes controle = new ControleDeBonificacoes();
		controle.registrarAsBonificacoesDosFuncionarios(g1);
		controle.registrarAsBonificacoesDosFuncionarios(f1);
		controle.registrarAsBonificacoesDosFuncionarios(editor);
		
		System.out.println(controle.getSomaDasBonificacoes());
	}
}