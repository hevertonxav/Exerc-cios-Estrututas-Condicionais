

//Faça um Programa que leia três números e mostre o maior deles.


package curso.java.heverton;

import java.util.Scanner;

public class MostrarMaiorNumero {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
			
		 System.out.println("Entre com o primeiro número: ");
	     int n1 = scan.nextInt();
	     
	     System.out.println("Entre com o segundo número: ");
	     int n2 = scan.nextInt();
	     
	     System.out.println("Entre com o terceiro número: ");
	     int n3 = scan.nextInt();
	     
	     if(n1 > n2 && n1 > n3) {
	    	 
	    	 System.out.println(n1 + " é o maior número");
	    	 
	     } else if(n2 >= n1 && n2 >= n3) {
	    	 
	    	 System.out.println(n2 + " é o maior número");
	    	 
	     } else {
	    	 
	    	 System.out.println(n3 + " é o maior número");
	    	 
	     }
	
	}

}
