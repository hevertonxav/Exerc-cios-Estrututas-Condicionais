
//Faça um Programa que peça dois números e imprima o maior deles.


package curso.java.heverton;

import java.util.Scanner;

public class MaiorNumero {
	
	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número: ");
		int n1 = scan.nextInt();
		
		System.out.println("Entre com o segundo número: ");
		int n2 = scan.nextInt();
		
		if (n1 > n2 ) {
			
			System.out.println("O número maior é " + n1);
			
		} else if (n1 < n2){
			
			System.out.println("O número maior é " + n2);
			
		} else {
			
			System.out.println("Os números são iguais.");

		}
		
	}
}
