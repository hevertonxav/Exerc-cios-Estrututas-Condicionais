
/*Faça um programa que lê as duas notas parciais obtidas por um aluno
numa disciplina ao longo de um semestre, e calcule a sua média. A
atribuição de conceitos obedece à tabela abaixo:
 
 - Média de Aproveitamento   Conceito
 - Entre 9.0 e 10.0             A
 - Entre 7.5 e 9.0              B
 - Entre 6.0 e 7.5              C
 - Entre 4.0 e 6.0              D
 - Entre 4.0 e zero             E

O algoritmo deve mostrar na tela as notas, a média, o conceito
correspondente e a mensagem “APROVADO” se o conceito for
A, B ou C ou “REPROVADO” se o conceito for D ou E.*/


package curso.java.heverton;

import java.util.Scanner;

public class ResultadoSemestre {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean aprovacao;
		String conceito;
		
		System.out.println("Informe a primeira nota do aluno: ");
	    double nota1 = scan.nextDouble();
	    
	    System.out.println("Informe a segunda nota do aluno: ");
	    double nota2 = scan.nextDouble();
	    
	    double media = (nota1 + nota2)/2;
	    
	    
	    
	    if (media <= 10 && media >= 9) {
	    	
			conceito = "A";
			aprovacao = true;

	    } else if (media < 9 && media >= 7.5 ) {
	    	
			conceito = "B";
			aprovacao = true;


	     } else if (media < 7.5 && media >= 6 ) {
		    	
				conceito = "C";
				aprovacao = true;


		 } else if (media < 6 && media >= 4 ) {
		    	
				conceito = "D";
				aprovacao = false;


		 } else {
			 
				conceito = "E";
				aprovacao = false;
         
		 }
	    
	    
	     System.out.println("Notas: " + nota1 + " - " + nota2);
	     System.out.println("Média: " + media);
	     System.out.println("Conceito: " + conceito);
	    
	     if (aprovacao) {
	    	 
	    	 System.out.println("Aprovado");
	    	 
	     } else {
	    	 
	    	 System.out.println("Reprovado");

	     }
	     
	    
	    
	 }

}
