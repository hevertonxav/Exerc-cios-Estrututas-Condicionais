/*Faça um Programa para um caixa eletrônico. O programa deverá
perguntar ao usuário a valor do saque e depois informar quantas notas
de cada valor serão fornecidas. As notas disponíveis serão as de 1, 5,
10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de 600
reais. O programa não deve se preocupar com a quantidade de notas
existentes na máquina.
a. Exemplo 1: Para sacar a quantia de 256 reais, o programa
fornece duas notas de 100, uma nota de 50, uma nota de 5 e
uma nota de 1;
b. Exemplo 2: Para sacar a quantia de 399 reais, o programa
fornece três notas de 100, uma nota de 50, quatro notas de 10,
uma nota de 5 e quatro notas de 1.*/





package curso.java.heverton;

import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		
		int saque;	
       
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("------------------------------------------------");
		System.out.println("Notas disponíveis para saque: 1, 5, 10, 50, 100 ");
		System.out.println("------------------------------------------------");
	   
		
		System.out.println("Qual valor você quer sacar? ");
        saque = scan.nextInt();
	    
	    if( saque <= 600 && saque >= 10) {
	    	
	         if(saque >= 100) {
	        	 
	        	int nota100 = saque/100;
	        	
	        	saque = saque - nota100 * 100;
	        	
	        	if (nota100 > 1) {
		         
	        		System.out.println(nota100 + " notas de 100 reais");
	        	
	        	} else {
	        		
	        		System.out.println(nota100 + " nota de 100 reais");

	        	}
		         
             }
	         
	         if (saque < 100 && saque >= 50) {
	        	 
	        	 int nota50 = saque/50;
		        	
		         saque = saque - nota50 * 50;
		         
		         if (nota50 > 1) {
			         
		        		System.out.println(nota50 + " notas de 50 reais");
		        	
		         } else {
		        		
		        		System.out.println(nota50 + " nota de 50 reais");

		         }
	        	 
	          }
	         
              if (saque < 50 && saque >= 10) {
	        	 
	        	  int nota10 = saque/10;
		        	
		          saque = saque - nota10 * 10;
		         
		         if (nota10 > 1) {
			         
		        		System.out.println(nota10 + " notas de 10 reais");
		        	
		         } else {
		        		
		        		System.out.println(nota10 + " nota de 10 reais");

		         }
	        	 
	           }
              
               if (saque < 10 && saque >= 5) {
 	        	 
 	        	 int nota5 = saque/5;
 		        	
 		         saque = saque - nota5 * 5;
 		         
 		         if (nota5 > 1) {
 			         
 		        		System.out.println(nota5 + " notas de 5 reais");
 		        	
 		         } else {
 		        		
 		        		System.out.println(nota5 + " nota de 5 reais");

 		         }
 	        	 
 	           }
               
               if (saque < 5 && saque >= 1) {
   	        	 
   	        	 int nota1 = saque/1;
   		        	
   		         saque = saque - nota1 ;
   		         
   		         if (nota1 > 1) {
   			         
   		        		System.out.println(nota1 + " notas de 1 real");
   		        	
   		         } else {
   		        		
   		        		System.out.println(nota1 + " nota de 1 real");

   		         }
   	        	 
   	           }
 	         
         } else {
        	 
             System.out.println("Valor excedeu o limite de saque.");
         
         }

	}

}
