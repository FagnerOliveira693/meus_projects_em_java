package aulaOperadoresMarco;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
		 
		 System.out.println("Digite um n�mero: ");
		 double num1 = teclado.nextDouble();
		 System.out.println("Digite outro n�mero: ");
		 double num2 = teclado.nextDouble();
		 System.out.println("Informe a opera��o: ");
		 String opc = teclado.next();
		 double resultado = "+".equals(opc) ? num1 + num2 : 0;
		 resultado = "-".equals(opc) ? num1 - num2 : resultado;
		 resultado = "*".equals(opc) ? num1 * num2 : resultado;
		 resultado = "/".equals(opc) ? num1 / num2 : resultado;
		 resultado = "%".equals(opc) ? num1 % num2 : resultado;
		 
		 System.out.printf("O resultado da sua opera��o, �: " + "%.2f %s %.2f = %.2f", num1, opc, num2, resultado);
		 teclado.close();
		 

	}

}
