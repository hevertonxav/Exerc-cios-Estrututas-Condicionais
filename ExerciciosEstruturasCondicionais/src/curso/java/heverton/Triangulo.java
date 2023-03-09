
/* um Programa que peça os 3 lados de um triângulo. O programa
deverá informar se os valores podem ser um triângulo. Indique, caso
os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou
escaleno.

+ Dicas:
 
 - Três lados formam um triângulo quando a soma de quaisquer
dois lados for maior que o terceiro;
 - Triângulo Equilátero: três lados iguais;
 - Triângulo Isósceles: quaisquer dois lados iguais;
 - Triângulo Escaleno: três lados diferentes*/



package curso.java.heverton;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Informe a medida do primeiro lado do triângulo: ");
	    double l1 = scan.nextDouble();
	    
	    System.out.println("Informe a medida do segundo lado do triângulo: ");
	    double l2 = scan.nextDouble();
	    
	    System.out.println("Informe a medida do terceiro lado do triângulo: ");
	    double l3 = scan.nextDouble();
	    
	    if((l1 + l2) > l3 && (l1 + l3) > l2 && (l2 + l3) > l1 ) {
	        
			System.out.println("É um triângulo.");
			
			if (l1 == l2 && l1 == l3 && l2 == l3) {
				
				System.out.println("Tipo: equilátero");

			} else if (l1 == l2 || l1 == l3 || l2 == l3) {
				
				System.out.println("Tipo: isósceles");

			} else {
				
				System.out.println("Tipo: escaleno");

			}

	    	
	    } else {
	    	
			System.out.println("Não é um triângulo.");

	    }
	    

	}

}
