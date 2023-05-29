package nossoSuperBancoDigital;

public class Teste {
	public static void main(String[] args) {
		FuncionarioTeste fun1 = new FuncionarioTeste();
		fun1.setSalario(3000.0);
		//fun1.setTipo(2);
		//System.out.println(fun1.getTipo());
		//System.out.println(fun1.getBonificacao());
		
		FuncionarioTeste fun2 = new FuncionarioTeste();
		fun2.setSalario(5000.0);
		fun2.setTipo(1);
		
		System.out.println(fun2.getTipo());
		System.out.println(fun2.getBonificacao());
	}
}