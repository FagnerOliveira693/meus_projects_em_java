package aulaDoDia14DeMaio;

public class ClasseData {
	int dia;
	int mes;
	int ano;
	
	ClasseData() {
		//dia est� recebendo 1; m�s, est� recebendo 1; e ano, est� recebendo 1970.
		this(1, 1, 1970);
	}
	ClasseData(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada() {
		final String formato = "/%d/%d/%d";
		return String.format(formato, this.dia, mes, ano);
		
	}

}
