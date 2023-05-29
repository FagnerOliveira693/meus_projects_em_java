package tratamentoDeExcecoes;

public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Início do método main!!! ");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException | MinhaExcecao ex) {
			String msg = ex.getMessage();
			
			System.out.println("Exception " + msg);
			
			ex.printStackTrace();
		}
		System.out.println("Fim do método main!!! ");
	}
	
	private static void metodo1() throws MinhaExcecao {
		System.out.println("Início do método 1!!! ");
		metodo2();
		System.out.println("Fim do método 1!!! ");
	}
	
	private static void metodo2() throws MinhaExcecao {
		System.out.println("Início do método 2!!!! ");
		throw new MinhaExcecao("Maninho... Deu muito ruim!!! ");
		//System.out.println("Fim do método 2!!!! ");
	}
}
