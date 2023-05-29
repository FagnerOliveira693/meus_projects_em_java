package br.com.alura.araujo.fagner.my.controllers;

import java.util.List;

import br.com.alura.araujo.fagner.my.model.Aula;
import br.com.alura.araujo.fagner.my.model.Curso;

public class TestCurso {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções em Java!", "Miguel Lorenzo");
		System.out.println(javaColecoes.getInstrutor());
		System.out.println(javaColecoes.getNome());
		
		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(aulas);
		
		javaColecoes.adicionar(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adicionar(new Aula("Criando uma aula", 20));
		javaColecoes.adicionar(new Aula("Modelando com coleções", 24));
		javaColecoes.adicionar(new Aula("Java com seus construtores", 26));
		
		System.out.println(javaColecoes.getAulas());
		//System.out.println(aulas);
		
	}
}
