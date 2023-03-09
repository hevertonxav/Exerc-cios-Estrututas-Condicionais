
/* Faça um Programa que peça um valor e mostre na tela se o valor é
positivo ou negativo. */


package curso.java.heverton;

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");
		int n = scan.nextInt();
		
		if (n > 0) { 
			
			System.out.println("O número é positivo.");
		
		} else if (n < 0) {
			
			System.out.println("O número é negativo");
			
		} else {
			
			//caso o número seja zero
			System.out.println("O número é neutro");
			
		}		
		
	}

}
