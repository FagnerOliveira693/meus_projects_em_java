package tratamentoDeExcecoes;

public class TesteDeConexao {

	public static void main(String[] args) {
		Conexao cone = null;
		try {
			cone = new Conexao();
			cone.lerDados();
		} catch (IllegalStateException ex) {
			System.out.println("Deu erro na conexão... ");
		} finally {
			System.out.println("Finally ");
			if (cone != null) {
				cone.close();
			}
		}
		
	}
	
}