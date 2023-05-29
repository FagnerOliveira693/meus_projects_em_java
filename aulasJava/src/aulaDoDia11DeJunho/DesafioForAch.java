package aulaDoDia11DeJunho;

public class DesafioForAch {
	public static void main(String[] args) {
		String[] nomes = {"Fagner", "Jéssica", "Joares", "Alan"};
		for (String nome: nomes) {
			System.out.println(nome);
		
		}
		
		System.out.println();
		System.out.println();
		
		int[] idade = {30, 24, 35, 18, 28, 36, 22, 23};
		for ( int i = 0; i < idade.length; i++) {
			System.out.println(idade[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		for ( String mes: meses) {
			System.out.println(mes);
		}
		
		System.out.println();
		System.out.println();
		
		String[] mesesDoAno = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		System.out.println("O último mês do ano, é: " + mesesDoAno[11]);
	}

}
