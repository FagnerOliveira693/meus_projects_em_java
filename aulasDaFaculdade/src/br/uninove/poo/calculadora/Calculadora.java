package br.uninove.poo.calculadora;

public class Calculadora {
	private float a, b;
	
	public float getA() {
		return a;
	}
	public void setA(float a) {
		this.a = a;
	}
	
	public float getB() {
		return b;
	}
	public void setB(float b) {
		this.b = b;
	}
	
	public float somar() {
		return a + b;
	}
	
	public float subtrair() {
		return a - b;
	}
	
	public float multiplicar() {
		return a * b;
	}
	
	public float dividir() {
		try {
			return a / b;
		} catch (Exception e) {
			System.out.println("Erro: Impossível divisão por zero... " + e.getMessage());
			return 0;
		}
		
	}
	

}
