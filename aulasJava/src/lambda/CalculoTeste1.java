package lambda;

public class CalculoTeste1 {
	public static void main(String[] args) {
		Calculo calcular = new Dividir();
		System.out.println("A divis�o, �: " + Calculo.muitoLegal() + calcular.executar(15, 3));
		
		
		//Calculo calcular = new Somar();
		//System.out.println("A soma, �: " + calcular.executar(2, 4));
		
		calcular = new Subtracao();
		System.out.println("A subtra��o, �: " + Calculo.muitoLegal() + calcular.executar(8, 4));
		
		//calcular = new Multiplicar();
		//System.out.println("A multiplica��o, �: " + calcular.executar(2, 3));
		
	}

}
