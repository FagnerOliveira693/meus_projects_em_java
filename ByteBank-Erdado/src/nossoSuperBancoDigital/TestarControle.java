package nossoSuperBancoDigital;

public class TestarControle {

	public static void main(String[] args) {
		Gerente gerenteDoObjetos = new Gerente();
		gerenteDoObjetos.setNome("Miguel Lorenzo");
		gerenteDoObjetos.setCpf("223.223.223-23");
		gerenteDoObjetos.setMatricula(368369);
		gerenteDoObjetos.setRg("44.444.444-4");
		gerenteDoObjetos.setSalario(7500.0);
		
		Funcionario f1 = new Funcionario();
		
		f1.setSalario(3000.0);
		ControleDeBonificacoes controle = new ControleDeBonificacoes();
		controle.registrarBonificacoesDosFuncionarios(gerenteDoObjetos);
		controle.registrarBonificacoesDosFuncionarios(f1);
		System.out.println(controle.getSomaDasBonificacoes());
	}
	
}
