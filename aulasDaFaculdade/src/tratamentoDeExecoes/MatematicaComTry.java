package tratamentoDeExecoes;
import java.util.Scanner;
import java.util.InputMismatchException; 
public class MatematicaComTry {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int a, b, resultado;
		
		try {
			System.out.print("Informe o 1º valor: ");
			a = leitor.nextInt();
			
			System.out.print("Informe o 2º valor: ");
			b = leitor.nextInt();
			resultado = a / b;
			
			System.out.println("O resultado da divisão é: " + resultado);
			
		} catch (ArithmeticException AE) {
			System.out.println("Divisão por zero não existe!");
		} catch (InputMismatchException IME) {
			System.out.println("O valor informado não é inteiro!");
		}
		
		System.out.println("\n\n\tO programa pode continuar...!");
		
	}

}
