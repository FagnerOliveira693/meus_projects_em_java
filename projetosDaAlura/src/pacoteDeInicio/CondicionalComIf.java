package pacoteDeInicio;

public class CondicionalComIf {
	public static void main(String[] args) {
		System.out.println("Testando condicionais... ");
		int idade = 31;
		int quantidadeDePessoas = 3;
		if (idade >= 18) {
			System.out.println("Wal... Voc� � maior de idade! \n\tPode sim participar do curso... ");
			System.out.println("Seja muit�ssmo bem vindo(a) ");
		} else {
			if (quantidadeDePessoas >= 2) {
				System.out.println("Voc� n�o � maior de idade! Mas, " + "pode entrar, pois, est� acompanhado... ");
			} else {
				System.out.println("Puts maninho... Voc� � menor de idade! \n\tN�o pode participar do curso... ");
			}
		}
	}
}