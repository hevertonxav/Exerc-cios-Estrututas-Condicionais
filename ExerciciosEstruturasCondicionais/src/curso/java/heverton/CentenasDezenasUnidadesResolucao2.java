
/*Faça um Programa que leia um número inteiro menor que 1000 e
imprima a quantidade de centenas, dezenas e unidades do mesmo.
  - Observando os termos no plural a colocação do "e", da vírgula
  entre outros. Exemplo:
  - 326 = 3 centenas, 2 dezenas e 6 unidades
  - 12 = 1 dezena e 2 unidades 
Testar com: 326, 300, 100, 320,310,305, 301, 101, 311, 111, 
25, 20, 10, 21, 11, 1, 7 e 16*/

package curso.java.heverton;

import java.util.Scanner;

public class CentenasDezenasUnidadesResolucao2 {
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
        System.out.println("Digite um número: ");
        int numero = scan.nextInt();
        
        if(numero < 1000 && numero > 0) {
        	
			 String n = String.valueOf(numero);
	
             if(n.length() == 3) {
				 
				 if(n.charAt(0) != '1') {
					 
					 if(n.indexOf("00") == 1) {
						 
			             System.out.print(n.charAt(0) + " centenas");

					 } else if(n.indexOf('0') >= 2 && n.charAt(2) == '0') {
						 
		        		 System.out.print(n.charAt(0) + " centenas e ");

					 } else if(n.charAt(1) == '0') {
						 
		        		 System.out.print(n.charAt(0) + " centenas e ");
                         n = n.replace("0","");
					 
					 } else {
						 
		        		 System.out.print(n.charAt(0) + " centenas, ");

					 }
					 	 
				 } else {
					 
					 if(n.indexOf("00") == 1){
						 
			        	 System.out.print("1 centena ");

					 } else if(n.indexOf('0') == 2) {
						 
		        		 System.out.print("1 centena e");

					 } else if (n.charAt(1) == '0') {
						 
		        		 System.out.print("1 centena e");
                         n = n.replace("0","");

					 } else {
		        			
		        		 System.out.print("1 centena, ");

		        	 }
				 }
				 
				 int position = 0;
			     n = n.substring(0,position) + n.substring(position+1);
			 
			 } if(n.length() == 2 && n.charAt(0) != '0') {
	             
				 if (n.charAt(0) != '1') {
    		        	
        			if (n.indexOf("0") == 1) {
    	        			
    		        	System.out.print(n.charAt(0) + " dezenas ");

    	        	} else {
    	        			
    		        	System.out.print(n.charAt(0) + " dezenas e ");

    	            }
    	        	
				 } else {
					 
					 if (n.indexOf("0") == 1) {
 	        			
	    		        System.out.print(" 1 dezena ");

	    	         } else {
	    	        			
	    		        System.out.print(" 1 dezena e ");

	    	         }
	    	        	
				 }
				 
				 int position = 0;
			     n = n.substring(0,position) + n.substring(position+1);
				 
			 } if(n.length() == 1 && n.charAt(0) != '0') {
				 
				 if(n.charAt(0) != '1') {
					 
			        System.out.print(n.charAt(0) + " unidades");

				 } else {
					 
			        System.out.print(" 1 unidade");

				 }
			 }

        }  else {
        	
    		System.out.print("Número inválido, digite um número menor do que 1000 e maior do que 0.");

        }

	}   

}
