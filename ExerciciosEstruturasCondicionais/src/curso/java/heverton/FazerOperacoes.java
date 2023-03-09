/*Faça um Programa que leia 2 números e em seguida pergunte ao
usuário qual operação ele deseja realizar. O resultado da operação
deve ser acompanhado de uma frase que diga se o número é:
a. par ou ímpar;
b. positivo ou negativo;*/

package curso.java.heverton;

import java.util.Scanner;

public class FazerOperacoes {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 	
	     System.out.println("Digite o primeiro numero: ");
	     int a = scan.nextInt();
	     
	     System.out.println("Digite o segundo numero: ");
	     int b = scan.nextInt();
	     
	     System.out.println("---------------------------------");
         System.out.println("Qual operação você deseja fazer? ");
	     System.out.println("---------------------------------");

	     System.out.println("Digite uma das opções abaixo: ");
	     System.out.println("Digite + para soma");
	     System.out.println("Digite - para subtração");
	     System.out.println("Digite * para multiplicação ");
	     System.out.println("Digite / para divisão ");

	     
	     String op = scan.next();
	     
	     int resultado = 0;
	     boolean valida = true;
	     
	     switch(op) {
	     
	     case "+": resultado = a + b;break;
	     case "-": resultado = a - b;break;
	     case "*": resultado = a * b;break;
	     case "/": resultado = a / b;break;
	     default: System.out.println("Operação inválida");
	         valida = false;      
	      
	     }
	     
	     if(valida) {
	    	 
	    	 if(resultado % 2 == 0) {
	         	
	         	System.out.print( resultado + " é par e");
	         	
	         } else {
	         	
	         	System.out.print(resultado + " é ímpar e");
	         	
	         }
	    	 
	       	 if(resultado > 0) {
		         	
		        System.out.print(" positivo");
		         	
		     } else if(resultado < 0) {
		         	
		         System.out.print(" negativo");
		         	
		      } else {
		    	  
			         System.out.print(" neutro");
			   
		      }
	     }
	  }
 }


