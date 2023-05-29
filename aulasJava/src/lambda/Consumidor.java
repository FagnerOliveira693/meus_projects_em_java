package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome + "!!!");
		
		Produto p1 = new Produto("Caneta", 12.34, 0.50);
		Produto p2 = new Produto("Celular motorola", 1200, 0.45);
		Produto p3 = new Produto("Celular Sansung s22", 5800, 0.30);
		Produto p4 = new Produto("Smart phone Iphone 13 promax", 7800, 0.40);
		Produto p5 = new Produto("Notebook Sansung última geração I9", 5800, 0.35);
		
		imprimirNome.accept(p1);
		imprimirNome.accept(p2);
		imprimirNome.accept(p3);
		imprimirNome.accept(p4);
		imprimirNome.accept(p5);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}

}
