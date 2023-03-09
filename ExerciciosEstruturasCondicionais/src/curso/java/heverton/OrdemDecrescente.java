
/*Faça um Programa que leia três números e mostre-os em ordem
decrescente.*/


package curso.java.heverton;

import java.util.Scanner;

public class OrdemDecrescente {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número: ");
	    int n1 = scan.nextInt();
	     
	    System.out.println("Entre com o segundo número: ");
	    int n2 = scan.nextInt();
	     
	    System.out.println("Entre com o terceiro número: ");
	    int n3 = scan.nextInt();
	    
	    if(n1 >= n2 && n1 >= n3 && n2 >= n3) {
	    	 
	    	 System.out.println(n1 + " - " + n2 + " - " + n3);
	    	 
	     } else if(n1 >= n2 && n1 >= n3 && n3 >= n2) {
	    	 
	    	 System.out.println(n1 + " - " + n3 + " - " + n2);
	    	 
	     } else if(n2 >= n1 && n2 >= n3 && n1 >= n3) {
	    	 
	    	 System.out.println(n2 + " - " + n1 + " - " + n3);
	    	 
	     } else if(n2 >= n1 && n2 >= n3 && n3 >= n1) {
	    	 
	    	 System.out.println(n2 + " - " + n3 + " - " + n1);
	    	 
	     } else if(n3 >= n1 && n3 >= n2 && n1 >= n2) {
	    	 
	    	 System.out.println(n3 + " - " + n1 + " - " + n2);
	    	 
	     } else {
	    	 
	    	 System.out.println(n3 + " - " + n2 + " - " + n1);
	    	 
	     } 
      }

}
