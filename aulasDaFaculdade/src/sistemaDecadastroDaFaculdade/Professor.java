package sistemaDecadastroDaFaculdade;

public class Professor extends PessoaGenerica {
	int matricula;
	String dataContratacao;
	float salario;
	
	@Override
	
	public String retornarDados () {
		String dados;
		
		dados = super.retornarDados();
		
		dados += "\tMatricula: " + matricula + "\n";
		dados += "\tData de contrata��o: " + dataContratacao + "\n";
		dados += "\tSal�rio: " + salario + "\n";
		
		return dados;
	}

}
