package sistemaDecadastroDaFaculdade;

public class PessoaGenerica {
	String nome, RG, cpf, endereco, telFixo, telCelular, dataNascimento;
	public String retornarDados() {
		String dados = " ";
		dados += "nome: " + nome + "\n";
		dados += "\tRG: " + RG + "\n";
		dados += "\tCPF: " + String.valueOf(cpf) + "\n";
		dados += "\tTelefone fixo: " + telFixo + "\n";
		dados += "\tTelefone cel.: " + telCelular + "\n";
		
		return dados;
		
	}

}
