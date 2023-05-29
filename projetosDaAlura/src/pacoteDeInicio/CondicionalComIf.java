package pacoteDeInicio;

public class CondicionalComIf {
	public static void main(String[] args) {
		System.out.println("Testando condicionais... ");
		int idade = 31;
		int quantidadeDePessoas = 3;
		if (idade >= 18) {
			System.out.println("Wal... Você é maior de idade! \n\tPode sim participar do curso... ");
			System.out.println("Seja muitíssmo bem vindo(a) ");
		} else {
			if (quantidadeDePessoas >= 2) {
				System.out.println("Você não é maior de idade! Mas, " + "pode entrar, pois, está acompanhado... ");
			} else {
				System.out.println("Puts maninho... Você é menor de idade! \n\tNão pode participar do curso... ");
			}
		}
	}
}