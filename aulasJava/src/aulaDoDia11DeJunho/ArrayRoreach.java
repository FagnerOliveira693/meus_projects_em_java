package aulaDoDia11DeJunho;

public class ArrayRoreach {
	public static void main(String[] args) {
		double[] nota = {9.9, 8.7, 7.7, 9.4};
		
		for ( int i = 0; i < nota.length; i++) {
			System.out.print(nota[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		for ( double notas: nota ) {
			System.out.println(notas + " ");
		}
	}

}
