package sistemaDecadastroDaFaculdade;



public class Principal {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		Professor p1 = new Professor();
		a1.nome = "Fagner Araujo";
		a1.registroAcademico = 1234567890;
		a1.cpf = "03303303350";
		a1.RG = "00111777-0";
		a1.curso = "Tecnologia em análise em desenvolvimento de sistemas";
		a1.dataNascimento = "15/02/1992";
		a1.dataIngresso = "02/02/2021";
		a1.endereco = "Rua Doutor Eduardo Dias Coelho, nº 9B";
		a1.notaVestibular = 9;
		a1.telCelular = "11987654321";
		a1.telFixo = "114321-4321";
		
		p1.nome = "Mestre Alan";
		p1.salario = 8500;
		p1.matricula = 987654123;
		p1.cpf = "99988877752";
		p1.dataNascimento = "19/11/1980";
		p1.RG = "88999777-6";
		p1.endereco = "Avenida das Galaxias Direita, 01";
		p1.telCelular = "(299) 23232";
		p1.telFixo = "(299) 1212121";
		p1.dataContratacao = "01/01/1901";
		
		//System.out.println("Dados pessoais do aluno: ");
		System.out.println("Dados pessoais e proficionais do professor: ");
		System.out.println(p1.retornarDados());
	}

}
