package aulaDoDia14DeMaio;

public class ClasseData {
	int dia;
	int mes;
	int ano;
	
	ClasseData() {
		//dia está recebendo 1; mês, está recebendo 1; e ano, está recebendo 1970.
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
