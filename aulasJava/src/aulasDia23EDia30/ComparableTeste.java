package aulasDia23EDia30;

import java.util.TreeSet;

public class ComparableTeste {
	public static void main(String[] args) {
		TreeSet<Integer> numeros = new TreeSet<Integer>();
		numeros.add(50);
		numeros.add(45);
		numeros.add(39);
		numeros.add(38);
		numeros.add(34);
		numeros.add(25);
		numeros.add(30);
		numeros.add(18);
		numeros.add(7);
		numeros.add(4);
		numeros.add(2);
		numeros.add(17);
		numeros.add(15);
		numeros.add(123);
		numeros.add(-16);
		numeros.add(55);
		numeros.add(122);
		numeros.add(85);
		numeros.add(98);
		numeros.add(44);
		numeros.add(10);
		numeros.add(11);
		numeros.add(12);
		numeros.add(21);
		for (Integer n: numeros) {
			System.out.println(n);
		}
	}

}
