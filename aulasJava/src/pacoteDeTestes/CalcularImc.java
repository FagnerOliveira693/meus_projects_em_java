package pacoteDeTestes;

public class CalcularImc {
	public static void main(String[] args) {
		double peso = 99.5;
		double altura = 1.82;
		double imc = peso / (altura * altura);
		System.out.println("Seu imc, é: " + imc);
		if (imc <= 19) {
			System.out.println("Você está muito abaixo do peso! Está muito magro / desnutrido. Seu imc, é: " + imc);
		}
		else if (imc >= 20 && imc <= 25) {
			System.out.println("Parabéns!!! Seu peso está normal!!! Seu imc, é: " + imc);
		}
		else if (imc >= 25.0 && imc <= 30) {
			System.out.println("É!! Você está sobrepeso!!! Mas, não se preocupe, um regiminho, tudo ageita! Seu imc, é: " + imc);
		}
		else if (imc >= 30.0 && imc <= 35) {
			System.out.println("é!!! A coisa está ficando feia. Seu imc, é: " + imc);
		}
		else if (imc >= 36 && imc <= 40 ) {
			System.out.println("Eita!!!! Com urgência, procure um médico! Você está muitíssimo acima do peso. Seu imc, é: " + imc);
		}
		else {
			System.out.println("Você está super, hiper, mega acima do peso! Com máxima urgência, procure um médico. Seu imc, é: " + imc);
		}
		
	}

}
