
/*Faça um programa que pergunte o preço de três produtos e informe
qual produto você deve comprar, sabendo que a decisão é sempre
pelo mais barato.*/


package curso.java.heverton;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MaisBarato {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
			
		 System.out.println("Entre com o preço do primeiro produto: ");
	     double preco1 = scan.nextDouble();
	     
	     System.out.println("Entre com o preço do segundo produto: ");
	     double preco2 = scan.nextDouble();
	     
	     System.out.println("Entre com o preço do terceiro produto: ");
	     double preco3 = scan.nextDouble();
	     
	     
		 DecimalFormat df = new DecimalFormat("#####.00");

	     if (preco1 < preco2 && preco1 < preco3) {
	    	 
	    	 System.out.println("Recomendo comprar o primeiro produto.");
	    	 System.out.println("Preço: R$ " + df.format(preco1));

	    	 
	     } else if (preco2 < preco1 && preco2  < preco3) {
	    	 
	    	 System.out.println("Recomendo comprar o segundo produto.");
	    	 System.out.println("Preço: R$ " + df.format(preco2));
	    	 
	     } else if (preco3 < preco1 && preco3 < preco2) {
	    	 
	    	 System.out.print("Recomendo comprar o terceiro produto.");
	    	 System.out.println("Preço: R$ " + df.format(preco3));
	    	 
	    	 
	     } else { 
	    	 
	    	 System.out.println("Preços iguais, recomendo qualque um dos 3 produtos.");
	    	 System.out.println("Preço: R$ " + df.format(preco1));
	    	 
	    }

    }

}
