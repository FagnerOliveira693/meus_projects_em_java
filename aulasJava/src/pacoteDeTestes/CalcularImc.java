package pacoteDeTestes;

public class CalcularImc {
	public static void main(String[] args) {
		double peso = 99.5;
		double altura = 1.82;
		double imc = peso / (altura * altura);
		System.out.println("Seu imc, �: " + imc);
		if (imc <= 19) {
			System.out.println("Voc� est� muito abaixo do peso! Est� muito magro / desnutrido. Seu imc, �: " + imc);
		}
		else if (imc >= 20 && imc <= 25) {
			System.out.println("Parab�ns!!! Seu peso est� normal!!! Seu imc, �: " + imc);
		}
		else if (imc >= 25.0 && imc <= 30) {
			System.out.println("�!! Voc� est� sobrepeso!!! Mas, n�o se preocupe, um regiminho, tudo ageita! Seu imc, �: " + imc);
		}
		else if (imc >= 30.0 && imc <= 35) {
			System.out.println("�!!! A coisa est� ficando feia. Seu imc, �: " + imc);
		}
		else if (imc >= 36 && imc <= 40 ) {
			System.out.println("Eita!!!! Com urg�ncia, procure um m�dico! Voc� est� muit�ssimo acima do peso. Seu imc, �: " + imc);
		}
		else {
			System.out.println("Voc� est� super, hiper, mega acima do peso! Com m�xima urg�ncia, procure um m�dico. Seu imc, �: " + imc);
		}
		
	}

}
