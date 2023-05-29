package primeirasAulasFaculdade;

public class LacoDeRepeticaoWhile1 {
	public static void main(String[] args) {
		int i = 200;
		while(i >= 2) {
			if (i % 2 == 0)
				System.out.println(i);
				--i;
		}
	}

}
