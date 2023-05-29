package sistemaDecadastroDaFaculdade;

public class Aluno extends PessoaGenerica {
	int registroAcademico;
	float notaVestibular;
	String curso, dataIngresso;
	
	@Override
	public String retornarDados () {
		String dados;
		
		dados = super.retornarDados();
		
		dados += "\tRegistro Academico: " + registroAcademico + "\n";
		dados += "\tNota no Vestibular: " + notaVestibular + "\n";
		dados += "\tCurso: " + curso + "\n";
		dados += "\tData de ingresso: " + dataIngresso + "\n";
		
		return dados;
		
	}

}
