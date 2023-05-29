package alocadoraDeImoveisbancoByteBank;

public class Carro {

	private int anoDeLancamento;
	private String modeloDoVeiculo;
	private double precoDoVeiculo;
	private double kMRodado;
	
	public Carro(int anoDeLancamento, String modeloDoVeiculo, double precoDoVeiculo, double kMRodado) {
		if (anoDeLancamento >= 1991) {
			this.anoDeLancamento = anoDeLancamento;
		} else {
			System.out.println("O ano informado está inválido. Por isso usaremos 2017!");
			this.anoDeLancamento = 2017;
		}
		
		if (modeloDoVeiculo != null) {
			this.modeloDoVeiculo = modeloDoVeiculo;
		} else {
			System.out.println("O modelo não foi informado. Por isso usaremos Gol!");
			this.modeloDoVeiculo = "Gol";
		}
		
		if (precoDoVeiculo > 0) {
			this.precoDoVeiculo = precoDoVeiculo;
		} else {
			System.out.println("O preço não é válido. Por isso usaremos 40000.0!");
			this.precoDoVeiculo = 40800.0;
		}
		
		if (kMRodado > 1) {
			this.kMRodado = kMRodado;
		} else {
			System.out.println("Ops... Você não informou quantos KM rodados tem este veículo! \n\tPor este motivo, colocaremos o mínimo de KM rodados, que é 1 KM rodado!  ");
			this.kMRodado = 1;
		}
		System.out.println("Wal... Este modelo, é " + this.modeloDoVeiculo + "! E, foi lançado, no ano: " + this.anoDeLancamento + ". Ele já está com " + this.kMRodado + " KM rodado. \n\tE, está no valor, de: " + this.precoDoVeiculo + " reais. ");
	}
	
	public Carro(String modeloDoVeiculo, double precoDoVeiculo, double kMRodado) {
		this(2017, modeloDoVeiculo, precoDoVeiculo, kMRodado);
		
		//System.out.println("Show de bola... Este modelo, é " + this.modeloDoVeiculo + "! E, foi lançado, no ano: " + this.anoDeLancamento + ". Ele já está com " + this.kMRodado + " KM rodado. \n\tE, está no valor, de: " + this.precoDoVeiculo + " reais. ");
		
		
		
		
	}
	
	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}
	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}
	public String getModeloDoVeiculo() {
		return modeloDoVeiculo;
	}
	public void setModeloDoVeiculo(String modeloDoVeiculo) {
		this.modeloDoVeiculo = modeloDoVeiculo;
	}
	public double getPrecoDoVeiculo() {
		return precoDoVeiculo;
	}
	public void setPrecoDoVeiculo(double precoDoVeiculo) {
		this.precoDoVeiculo = precoDoVeiculo;
	}
	public double getkMRodado() {
		return kMRodado;
	}
	public void setkMRodado(double kMRodado) {
		this.kMRodado = kMRodado;
	}
	
	
	
}