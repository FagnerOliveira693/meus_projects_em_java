package meuBancoDigital;

public class TestaMetodos {

	public static void main(String[] args) {
		Conta contaDoFagner = new Conta();
		Conta contaDaNeia = new Conta();
		contaDoFagner.saldo = 350.0;
		contaDoFagner.depositar(150);
		//contaDoFagner.
		System.out.println(contaDoFagner.saldo);
		
		boolean conseguiSacar = contaDoFagner.sacar(100.0);
		System.out.println(contaDoFagner.saldo);
		
		System.out.println(conseguiSacar);
		
		System.out.println();
		contaDaNeia.saldo = 1200.0;
		contaDaNeia.depositar(250.0);
		
		boolean sucessoDeTransferencia = contaDaNeia.transferir(4500.0, contaDoFagner);
		if (sucessoDeTransferencia) {
			System.out.println("Transferência realizada com sucesso!!! ");
		} else {
			System.out.println("Ops... Valor de saldo insuficiente para transferência... \n\tGentileza verificar. ");
		}
		
		System.out.println(contaDaNeia.saldo);
		//contaDaNeia.transferir(450, contaDoFagner);
		System.out.println(contaDaNeia.saldo);
		System.out.println(contaDoFagner.saldo);
	}
}
