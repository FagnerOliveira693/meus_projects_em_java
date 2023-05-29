package bancoByteBank;

public class Conta {
	
	private double saldo;
	private int agencia;
	private int numeroDaConta;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("O total de contas abertas, é: " + Conta.total + " contas! ");
		this.agencia = agencia;
		this.numeroDaConta = numero;
		//System.out.println("Wal... Conta aberta com sucesso!!! \n\tSua agência, é: " + this.agencia + " E, sua conta, é: " + this.numeroDaConta);
	}
	
	public void depositar(double valor) {
		if (valor > 0 ) {
			saldo += valor;
		}
	}
	
	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			
			return true;
		} else {
			
			return false;
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
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numeroDaConta;
	}
	
	public void setNumero(int novoNumero) {
		if (novoNumero <=0) {
			System.out.println("Ops... O número da conta é inválido! \n\tNão é permitido números negativos... ");
			return;
		}
		this.numeroDaConta = novoNumero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int novaAgencia) {
		if (novaAgencia <= 0) {
			System.out.println("Ops... Não pode ser um número de agência válido! \n\tGentileza verificar... ");
			return;
		}
		this.agencia = novaAgencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}

}
