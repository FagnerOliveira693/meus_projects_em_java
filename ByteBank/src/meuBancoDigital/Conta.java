package meuBancoDigital;

public class Conta {
	
	private double saldo;
	int agencia = 3196;
	int numeroDaConta;
	Cliente titular;
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public String sacar(double valor) {
		if (this.pegarSaldo() >= valor) {
			this.saldo -= valor;
			String mensagemDeSucesso = "Saque realizado com sucesso... ";
			return mensagemDeSucesso;
		} else {
			String mensagemDeInsucesso = "Puts... Você não tem saldo suficiente para ser realizado o saque! ";
			return mensagemDeInsucesso;
		}
		
		
	}
	
	public boolean transferir(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.depositar(valor);
			return true;
		} else {
			return false;
		}
	}
	
	public double pegarSaldo() {
		return this.saldo;
	}

}
