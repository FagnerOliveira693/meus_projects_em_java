package tratamentoDeExcecoes;

public class FluxoComError {

	public static void main(String[] args) {
		System.out.println("In�cio do m�todo main!!! ");
		metodo1();
		System.out.println("Fim do m�todo main!!! ");
	}
	
	private static void metodo1() {
		System.out.println("In�cio do m�todo 1!!! ");
		metodo2();
		System.out.println("Fim do m�todo 1!!! ");
	}
	
	private static void metodo2() {
		System.out.println("In�cio do m�todo 2!!! ");
		//metodo2();
		System.out.println("Fim do m�todo 2!!! ");
	}
}
