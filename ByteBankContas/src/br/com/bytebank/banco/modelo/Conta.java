package br.com.bytebank.banco.modelo;

/**
 * Esta classe, é a moldura de uma conta bancária.
 * @author Fagner Araujo.
 *
 */


public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	/**
	 * Construtor para inicializar o objeto a partir da agencia e numero.
	 * @param agencia
	 * @param numero
	 */
	
	
	public Conta(int agencia, int numero) {
		if (agencia < 1) {
			throw new IllegalArgumentException("Ops... Número de agência inválido! ");
		}
		
		if (numero < 1) {
			throw new IllegalArgumentException("Ops... Número da conta inválido! ");
		}
		Conta.total++;
		// System.out.println("O total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		// this.saldo = 100;
		// System.out.println("Estou criando uma conta " + this.numero);
	}

	public abstract void depositar(double valor);

	public void sacar(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", valor: " + valor);

		}

		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.sacar(valor);
		
		destino.depositar(valor);
		
		
		
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public String toString() {
		
		return "Número: " + this.numero + "Agência: " + this.agencia;
	}
	

}
