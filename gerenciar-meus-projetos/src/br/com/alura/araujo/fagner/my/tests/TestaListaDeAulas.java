package br.com.alura.araujo.fagner.my.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.alura.araujo.fagner.my.model.Aula;

public class TestaListaDeAulas {

	public static void main(String[] args) {
		
		Aula aula1 = new Aula("Revistando as ArraysLists", 21);
		Aula aula2 = new Aula("Lista de objetos", 20);
		Aula aula3 = new Aula("Relacionamento de listas e objetos", 15);
		
		
		ArrayList<Aula> aulas = new ArrayList<>();
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		//System.out.println(aulas);
		
		Collections.sort(aulas);
		
		//System.out.println(aulas);
		
		aulas.sort(Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
		
	}
}
