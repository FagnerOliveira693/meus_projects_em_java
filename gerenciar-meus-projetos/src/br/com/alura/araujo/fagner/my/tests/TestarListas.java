package br.com.alura.araujo.fagner.my.tests;

import java.util.ArrayList;
import java.util.Collections;

public class TestarListas {

	public static void main(String[] args) {
		String curso1, curso2, curso3, curso4, curso5, curso6;
		curso1 = "java primeiros projetos";
		curso2 = "java orentação a objetos";
		curso3 = "java organizando pacotes e classes";
		curso4 = "java listas e arrays";
		curso5 = "java springs frame worcs";
		curso6 = "java spring boot ";
		
		ArrayList<String> cursos = new ArrayList<String>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		cursos.add(curso5);
		cursos.add(curso6);
		
		Collections.sort(cursos);
		
		System.out.println(cursos);
	}
}
