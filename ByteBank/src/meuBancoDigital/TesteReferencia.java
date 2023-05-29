package meuBancoDigital;

public class TesteReferencia {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.saldo = 2580.0;
		//conta1.titular = "Fagner";
		//conta1.agencia
		System.out.println(conta1.titular + ", tudo bem com você? \n\tSua agência, é: " + conta1.agencia + ", seu saldo, é: " + conta1.saldo + " reais... ");
		
		Conta segundaConta = conta1;
		segundaConta.saldo += 350.0;
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
	}
}
