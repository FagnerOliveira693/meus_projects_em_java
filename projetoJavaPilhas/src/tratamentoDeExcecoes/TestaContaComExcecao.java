package tratamentoDeExcecoes;

public class TestaContaComExcecao {

	public static void main(String[] args) throws MinhaExcecao {
		Conta conta = new Conta();
		//try {
			conta.deposita();
		//} catch (MinhaExcecao ex) {
			//System.out.println("Tratamento ...... ");
		//}
	}
}
