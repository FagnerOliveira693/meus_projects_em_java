package tratamentoDeExcecoes;

public class Conexao implements AutoCloseable {

	public Conexao() {
		System.out.println("Abrindo conex�o com o banco... ");
		//throw new IllegalStateException();
	}
	
	public void lerDados() {
		System.out.println("Recebendo dados");
		throw new IllegalStateException();
	}
	
	@Override
	public void close() {
		System.out.println("Fechando conex�o... ");
	}
	
}