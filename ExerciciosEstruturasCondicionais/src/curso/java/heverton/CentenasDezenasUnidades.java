
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

public class CentenasDezenasUnidades {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
        System.out.println("Digite um número: ");
        int n = scan.nextInt();
        
        if (n < 1000 && n > 0) {
        	
        	if(n >= 100) {
	        	 
	        	int centenas = n/100;
	        	int aux = n - centenas * 100;
                n = n - centenas * 100;
	        	
	        	if (centenas > 1) {
		        	

	        		if (n % 100 == 0) {
	        			
		        		System.out.print(centenas + " centenas");

	        		} else if ( n % 10 == 0) {
	        		    
	        			System.out.print(centenas + " centenas e ");
	        			
	        		} else if (aux < 10 && aux > 0) {
	        			
	        			System.out.print(centenas + " centenas e ");
			        
	        		} else {
	        			
	        			System.out.print(centenas + " centenas, ");

	                 }
	        	
	        	} else {
	        		
                    if (n % 100 == 0) {
	        			
		        		System.out.print("1 centena ");

	        		} else if (n % 10 == 0) {
	        		    
	        			System.out.print("1 centena e");
	        			
	        		} else if (aux < 10 && aux > 0) {
	        			
	        			System.out.print("1 centena e");

	        		} else {
	        			
	        			System.out.print("1 centena, ");

	        		}
	        	
	        	}
		        
        	 } if (n < 100 && n >= 10) {
        		    
        		   int dezenas = n/10;
                   n = n - dezenas * 10;
        		    
        			if (dezenas > 1) {
    		        	
        				if (n % 10 == 0) {
    	        			
    		        		System.out.print(dezenas + " dezenas ");

    	        		} else {
    	        			
    		        		System.out.print(dezenas + " dezenas e ");

    	                }
    	        	
    	        	} else {
    	        		
                        if (n % 10 == 0) {
    	        			
    		        		System.out.print("1 dezena ");

    	        		}  else {
    	        			
    		        		System.out.print("1 dezena e ");

    	                }
    	        		
    	            }
        		 
        	 } if (n < 10 && n > 0 ) {
        		 
        		 int unidades = n;
                 
        		 if(unidades > 1) {
        			 
		        	System.out.print(unidades + " unidades");
		        		
        		 } else  {
        			 
		        	System.out.print(" 1 unidade");

        		 }
        		 
              }
        	
        } else {
        	
    		System.out.print("Número inválido, digite um número menor do que 1000 e maior do que 0.");

        }

	}

}
