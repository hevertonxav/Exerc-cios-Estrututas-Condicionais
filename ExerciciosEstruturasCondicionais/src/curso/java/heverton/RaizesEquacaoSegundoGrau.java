
/*Faça um programa que calcule as raízes de uma equação do segundo
grau, na forma ax2 + bx + c. O programa deverá pedir os valores de a,
b e c e fazer as consistências, informando ao usuário nas seguintes
situações:
   a. Se o usuário informar o valor de A igual a zero, a equação não é
   do segundo grau e o programa não deve fazer pedir os demais
   valores, sendo encerrado;
   b. Se o delta calculado for negativo, a equação não possui raizes
   reais. Informe ao usuário e encerre o programa;
   c. Se o delta calculado for igual a zero a equação possui apenas
   uma raiz real; informe-a ao usuário;
   d. Se o delta for positivo, a equação possui duas raiz reais;
   informe-as ao usuário;*/



package curso.java.heverton;

import java.util.Scanner;

public class RaizesEquacaoSegundoGrau {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
		
		System.out.println("----------------------------------------------");

		System.out.println("Cálculo das raízes da equação de segundo grau.");
		System.out.println("Modelo da equação ax² + bx + c");
        
		System.out.println("----------------------------------------------");


		System.out.println("Informe o valor de a: ");
	    double a = scan.nextDouble();
	    
	    if( a == 0) {
	    	
			System.out.println("Não é equação de segundo grau, logo não é possível achar as raízes");
			System.out.println("FIM");

	    } else {
	    
	        System.out.println("Informe o valor de b: ");
	        double b = scan.nextDouble();
	    
	        System.out.println("Informe o valor de c: ");
	        double c = scan.nextDouble();
	   
            
			double delta = Math.pow(b, 2) - 4 * a * c;
	        double raiz1 = (((-b) + Math.sqrt(delta))/ 2*a);
	        double raiz2 = (((-b) - Math.sqrt(delta))/ 2*a);
	       
	        
	        if (delta < 0) {
	        	
	        	System.out.println("A equação não possui raízes reais");
				System.out.println("FIM");
	        	
	        } else {
	        	
	        	if(delta == 0) {
	        		
	        		System.out.println("A equação possui uma raíz real");
	        		System.out.println("Raíz: " + raiz1);
	        		System.out.println("FIM");
	        		
	        	} else {
	        		
	        		System.out.println("A equação possui duas raízes reais");
	        		System.out.println("Raízes: " + raiz1 + " e " + raiz2);
	        		System.out.println("FIM");
	        	
	        	}
	        }
	    }
	}
}
