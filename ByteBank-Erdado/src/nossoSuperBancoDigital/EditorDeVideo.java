package nossoSuperBancoDigital;

public class EditorDeVideo extends Funcionario {

	
	@Override
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Editor de Video");
		return 300.0;
	}
	
	
}
