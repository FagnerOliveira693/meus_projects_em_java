package aulaOperadoresMarco;

public class Unario {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		a ++;
		//Este código acima, quer dizer a + 1! E a mesma coisa, quando colocamos, a--, que quer dizer, a - 1!
		a --;
		
		//System.out.println(a);
		
		++ b;
		//Este código, quer dizer: b++ b. b + b + 1. 
		//System.out.println(b);
		-- b;  // b recebe b - 1.
		//System.out.println(b);
		
		System.out.println("Mine desafio!");
		System.out.println(++a == b--);
		System.out.println(a == b);
		

	}

}
