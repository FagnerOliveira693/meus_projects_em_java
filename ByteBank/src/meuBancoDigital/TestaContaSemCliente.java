package meuBancoDigital;

public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaDaKamila = new Conta();
		contaDaKamila.depositar(1200.0);
		System.out.println("Seu saldo disponível, é: " + contaDaKamila.pegarSaldo());
		
		//System.out.println(contaDaKamila.titular.nome);
		
		//System.out.println(contaDaKamila.titular);
		
		contaDaKamila.titular = new Cliente();
		//System.out.println(contaDaKamila.titular);
		contaDaKamila.titular.nome = "Kamila Oliveira";
		contaDaKamila.titular.cpf = "333.333.333-33";
		contaDaKamila.titular.dataDeNascimento = "28/03/2015";
		contaDaKamila.titular.profissao = "Programadora de sistemas";
		contaDaKamila.titular.rg = "32.333.333-3";
		System.out.println(contaDaKamila.titular.nome);
		System.out.println(contaDaKamila.titular.cpf);
		System.out.println(contaDaKamila.titular.dataDeNascimento);
		System.out.println(contaDaKamila.titular.profissao);
		System.out.println(contaDaKamila.titular.rg);
		
		contaDaKamila.sacar(2500);
		System.out.println(contaDaKamila.pegarSaldo());
	}
}
