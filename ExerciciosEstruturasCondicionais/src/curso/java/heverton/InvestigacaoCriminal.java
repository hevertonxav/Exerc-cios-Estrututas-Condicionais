/*Faça um programa que faça 5 perguntas para uma pessoa sobre um
crime. As perguntas são:
 
 a. "Telefonou para a vítima?"
 b. "Esteve no local do crime?"
 c. "Mora perto da vítima?"
 d. "Devia para a vítima?"
 e. "Já trabalhou com a vítima?" 

O programa deve no final emitir uma classificação sobre a 
participação da pessoa no crime. Se
a pessoa responder positivamente a 2 questões ela deve ser
classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5
como "Assassino". Caso contrário, ele será classificado como
"Inocente".*/



package curso.java.heverton;

import java.util.Scanner;

public class InvestigacaoCriminal {

	public static void main(String[] args) {
		
		int cont = 0;
		
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Telefonou para a vítima? [S - sim / N - não]");
	    String resp1 = scan.next();
	     
	    if (resp1.equalsIgnoreCase("S")) {
	        cont++;
	    }
	    
	    System.out.println("Esteve no local do crime? [S - sim / N - não]");
	    String resp2 = scan.next();
	    
	    if(resp2.equalsIgnoreCase("S")) {
	       cont++;
	    }
	    
	    System.out.println("Mora perto da vítima? [S - sim / N - não]");
	    String resp3 = scan.next();
	    
	    if(resp3.equalsIgnoreCase("S")) {
	       cont++;
	    }
	    
	    System.out.println("Devia para a vítima? [S - sim / N - não]");
	    String resp4 = scan.next();
	    
	    if(resp4.equalsIgnoreCase("S")) {
		   cont++;
	    }
	    
	    System.out.println("Já trabalhou com a vítima? [S - sim / N - não]");
	    String resp5 = scan.next();
	    
	    if(resp5.equalsIgnoreCase("S")) {
		   cont++;
		}
	    
	    if(cont == 2) {
	    	
		    System.out.println("Suspeito");

	    }else if(cont == 3 || cont == 4) {
	    	
		    System.out.println("Cúmplice");

	    }else if(cont == 5) {
	    	
		    System.out.println("Assassino");

	    }else {
	    	
		    System.out.println("Inocente");

	    }
	    
	 }

}
