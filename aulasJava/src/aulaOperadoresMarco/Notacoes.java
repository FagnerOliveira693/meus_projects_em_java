package aulaOperadoresMarco;

public class Notacoes {

	public static void main(String[] args) {
		String s = "Bom dia X";
		s = s.replace("X", "Senhora");
		
s = s.toUpperCase();
s = s.concat("!!!");

		System.out.println(s);
		
		String x = "Fagner".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X".replace("X", "Neia").toUpperCase().concat("!!!!!");
		System.out.println(y);
		

	}

}
