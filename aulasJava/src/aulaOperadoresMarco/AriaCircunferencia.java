package aulaOperadoresMarco;

public class AriaCircunferencia {
	public static void main(String[] args) {
		double raio = 3.4;
		final double PI = 3.14159;
		
		double aria = PI * raio * raio;
		System.out.println(aria);
		raio = 10;
		aria = PI * raio * raio;
		System.out.println("Aria " + aria + " m2.");
	}

}
