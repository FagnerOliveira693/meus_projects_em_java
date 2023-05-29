package bancoByteBank;

public class TestarMetodosComStatic {

	public static void main(String[] args) {
		
		Conta contaDaFernanda = new Conta(3196, 24660);
		
		
		
		
		Conta contaDoFranklin = new Conta(3196, 24661);
		
		
		
		
		
		Conta contaDaNoelia = new Conta(3196, 24662);
		
		
		
		
		
		
		
		Conta contaDoArnaldo = new Conta(3196, 24663);
		
		Conta contaDaKamila = new Conta(3196, 24665);
		
		Conta contaDaZoeMiwa = new Conta(3196, 24666);
		
		Conta contaDoMiguel = new Conta(3196, 24667);
		
		Conta contaDoFagner = new Conta(3196, 24668);
		
		Conta contaDaNeia = new Conta(3196, 24669);
		
		System.out.println("O total de contas abertas, é: " + Conta.getTotal() + " contas... ");
	}
}
