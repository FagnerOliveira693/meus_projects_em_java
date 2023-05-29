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
			System.out.println("Erro: N�o � poss�vel realizar divis�o por zero!!! " + ex.getMessage());
			return 0;
		}
		
	}

}
