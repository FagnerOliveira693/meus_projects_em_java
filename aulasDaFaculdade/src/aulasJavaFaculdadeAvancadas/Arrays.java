package aulasJavaFaculdadeAvancadas;



public class Arrays {
	public static void main(String[] args) {
		
		String nomes[] = new String[4];
		nomes[0] = "Fagner Araujo";
		nomes[1] = "Miguel Araujo";
		nomes[2] = "Kamila Araujo";
		nomes[3] = "Calebe Araujo";
		
		
		for(int i = 0; i <= 3; i++) {
			System.out.print("Na posição " + i + " do array, temos: ");
			System.out.println(nomes[i]);
			
		}
	}

}
