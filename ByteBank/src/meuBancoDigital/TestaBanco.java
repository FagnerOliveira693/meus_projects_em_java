package meuBancoDigital;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente miguel = new Cliente();
		miguel.nome = "Miguel Lorenzo";
		miguel.cpf = "123.456.789.90";
		miguel.dataDeNascimento = "06/05/2020";
		miguel.rg = "12.123.654-8";
		miguel.profissao = "Programador de sistemas";
		
		Conta contaDoMiguel = new Conta();
		contaDoMiguel.depositar(3750.0);
		//System.out.println(contaDoMiguel.saldo);
		
		contaDoMiguel.titular = miguel;
		System.out.println(miguel.cpf);
		//System.out.println(contaDoMiguel.titular.nome);
		System.out.println(contaDoMiguel.titular);
	}
}