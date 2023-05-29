package tratamentoDeExecoes;
import java.util.Scanner;
import java.util.InputMismatchException; 
public class MatematicaComTry {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int a, b, resultado;
		
		try {
			System.out.print("Informe o 1� valor: ");
			a = leitor.nextInt();
			
			System.out.print("Informe o 2� valor: ");
			b = leitor.nextInt();
			resultado = a / b;
			
			System.out.println("O resultado da divis�o �: " + resultado);
			
		} catch (ArithmeticException AE) {
			System.out.println("Divis�o por zero n�o existe!");
		} catch (InputMismatchException IME) {
			System.out.println("O valor informado n�o � inteiro!");
		}
		
		System.out.println("\n\n\tO programa pode continuar...!");
		
	}

}
