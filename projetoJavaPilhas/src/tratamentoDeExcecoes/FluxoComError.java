package tratamentoDeExcecoes;

public class FluxoComError {

	public static void main(String[] args) {
		System.out.println("Início do método main!!! ");
		metodo1();
		System.out.println("Fim do método main!!! ");
	}
	
	private static void metodo1() {
		System.out.println("Início do método 1!!! ");
		metodo2();
		System.out.println("Fim do método 1!!! ");
	}
	
	private static void metodo2() {
		System.out.println("Início do método 2!!! ");
		//metodo2();
		System.out.println("Fim do método 2!!! ");
	}
}
