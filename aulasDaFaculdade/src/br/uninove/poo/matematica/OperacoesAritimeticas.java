package br.uninove.poo.matematica;

public class OperacoesAritimeticas {
	public float multiplicar(float a, float b) {
		return a * b;
	}
	
	public float somar(float a, float b) {
		return a + b;
	}
	
	public float subtrair(float a, float b) {
		return a - b;
	}
	
	public float dividir(float a, float b) {
		try {
			return a / b;
		} catch (Exception ex) {
			System.out.println("Erro: Não é possível realizar divisão por zero!!! " + ex.getMessage());
			return 0;
		}
		
	}

}
