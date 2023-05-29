package pacoteDeInicio;

public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 20;
		int quantidadeDePessoas = 3;
		boolean acompanhado = quantidadeDePessoas >= 2;
		
		System.out.println("Valor de acompanhado = " + acompanhado);
		
		if (idade >= 18 && acompanhado) {
			System.out.println("seja bem vindo");
		} else {
			System.out.println("infelizmente você não pode entrar");
		}
	}

}
