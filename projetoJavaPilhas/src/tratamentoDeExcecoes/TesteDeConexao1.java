package tratamentoDeExcecoes;

public class TesteDeConexao1 {

	public static void main(String[] args) {
		try (Conexao conexao = new Conexao()) {
			conexao.lerDados();
		} catch (IllegalStateException ex) {
			System.out.println("Deu erro na conexão... ");
		}
	}
}
