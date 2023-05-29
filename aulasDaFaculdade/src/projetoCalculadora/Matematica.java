package projetoCalculadora;

public class Matematica {
	int a, b;
	
	public Matematica(int x, int y) {
		a = x;
		b = y;
	}
	
	public int soma() {
		return a + b;
	}
	
	public int subtrai() {
		return a - b;
	}
	
	public int multiplicar() {
		return a * b;
	}
	
	public int dividir () {
		return a / b;
	}

}
