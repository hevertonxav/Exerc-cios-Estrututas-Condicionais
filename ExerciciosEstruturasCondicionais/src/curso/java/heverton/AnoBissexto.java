
/*Faça um Programa que peça um número correspondente a um
determinado ano e em seguida informe se este ano é ou não bissexto.*/



package curso.java.heverton;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o ano: ");
		int ano = scan.nextInt();
		
		if(ano % 4 == 0 && ano % 100 != 0) {
			
			System.out.println("É ano bissexto.");
		
		} else if ( ano % 400 == 0 && ano % 100 == 0) {
			
			System.out.println("É ano bissexto.");

		} else {
			
			System.out.println("Não é ano bissexto.");

			
		}
		
	}

}
