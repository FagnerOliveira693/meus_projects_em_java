package br.com.alura.araujo.fagner.my.controllers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestList {

	
	public static void main(String[] args) {
		
		
		System.out.println("**** ArrayList vs LinkedList ***");
		
		List<Integer> numerosDeArraysLists = new ArrayList<>();
		List<Integer> numerosDeLinkedsLists = new LinkedList<>();
		int quantidadeDeElementos = 1000000;
		
		long tempoDeArrayList = queroInserirElementosNo(numerosDeArraysLists, quantidadeDeElementos);
		
		long tempoDeLinkedsList = queroInserirElementosNo(numerosDeLinkedsLists, quantidadeDeElementos);
		
		System.out.println("Inser��o na ArrayList demorou  " + tempoDeArrayList);
		
		System.out.println("Inser��o na LinkedList demorou " + tempoDeLinkedsList);
		
		tempoDeArrayList = removePrimeirosElementos(numerosDeArraysLists);
		
		tempoDeLinkedsList = removePrimeirosElementos(numerosDeLinkedsLists);
		
		System.out.println("Remo��o da ArrayList demorou  " + tempoDeArrayList);
		
		System.out.println("Remo��o da LinkedList demorou " + tempoDeLinkedsList);
		
		
	}
	
	private static long removePrimeirosElementos(List<Integer> numeros) {
		long ini = System.currentTimeMillis();
		
		int i = 0;
		
		while (i < 100) {
			numeros.remove(0);
			i++;
		}
		long fim = System.currentTimeMillis();
		return fim - ini;
	}
	
	private static long queroInserirElementosNo(List<Integer> numeros, int quantidade) {
		long ini = System.currentTimeMillis();
		int i = 0;
		while (i < quantidade ) {
			numeros.add(i);
			i++;
		}
		long fim = System.currentTimeMillis();
		return fim - ini;
	}
	
	
	
}
