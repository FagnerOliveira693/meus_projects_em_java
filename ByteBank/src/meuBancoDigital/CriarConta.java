package meuBancoDigital;

public class CriarConta {

	public static void main(String[] args) {
		System.out.println("Ol�! Seja muito bem vindo(a) Ao seu \n\t\t(Banco Digital!) ");
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 350.0;
		primeiraConta.titular = "Miguel";
		System.out.println(primeiraConta.titular + ", Seu saldo dispon�vel, �: " + primeiraConta.saldo);
		System.out.println();
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 1350.0;
		segundaConta.titular = "Fagner";
		//segundaConta.agencia;
		System.out.println(segundaConta.titular + ", sua ag�ncia, �: " + segundaConta.agencia + ", seu saldo, � de: " + segundaConta.saldo + " reais...");
	}
}
