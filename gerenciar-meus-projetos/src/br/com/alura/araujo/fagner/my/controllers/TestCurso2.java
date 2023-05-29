package br.com.alura.araujo.fagner.my.controllers;

import java.util.Collections;
import java.util.List;

import br.com.alura.araujo.fagner.my.model.Aula;
import br.com.alura.araujo.fagner.my.model.Curso;

public class TestCurso2 {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando coleções no Java!","Fagner Miguel");
		javaColecoes.adicionar(new Aula("Trabalhando com ArraysLists",21));
		javaColecoes.adicionar(new Aula("Criando uma aula... ",20));
		javaColecoes.adicionar(new Aula("Modelando com coleções! " ,24));
		
		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(aulas);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
	}
}
