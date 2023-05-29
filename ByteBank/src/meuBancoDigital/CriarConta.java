package meuBancoDigital;

public class CriarConta {

	public static void main(String[] args) {
		System.out.println("Olá! Seja muito bem vindo(a) Ao seu \n\t\t(Banco Digital!) ");
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 350.0;
		primeiraConta.titular = "Miguel";
		System.out.println(primeiraConta.titular + ", Seu saldo disponível, é: " + primeiraConta.saldo);
		System.out.println();
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 1350.0;
		segundaConta.titular = "Fagner";
		//segundaConta.agencia;
		System.out.println(segundaConta.titular + ", sua agência, é: " + segundaConta.agencia + ", seu saldo, é de: " + segundaConta.saldo + " reais...");
	}
}
