package aulaDia28DeMaio;

public class WhileExercicio01 {
	public static void main(String[] args) {
		int cont = 0;
		while ( cont <= 200) {
			System.out.printf("i = %d\n", cont);
			cont += 25;
		}
		
		System.out.println();
		for ( int i = 0; i<= 200; i+= 25) {
			System.out.printf("j = %d\n", i);
		}
		System.out.println();
		
		for ( ; cont <= 645; cont+=60) {
			System.out.printf("k = %d\n", cont);
		}
		
		System.out.println();
		
		for ( ; cont <= 3000; cont+=105) {
			System.out.printf("m = %d\n", cont);
		}
	}

}
