
/*Faça um Programa que peça uma data no formato dd/mm/aaaa e
determine se a mesma é uma data válida.*/


package curso.java.heverton;

import java.util.Scanner;

public class DataValida {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
			
		 System.out.println("Digite o dia: ");
		 int dia = scan.nextInt();
		 
		 System.out.println("Digite o mês: ");
		 int mes = scan.nextInt();
		 
		 System.out.println("Digite o ano: ");
		 int ano = scan.nextInt();
		 
		 
		 System.out.println( dia + "/" + mes + "/" + ano + " é uma data válida? ");
		 
		 /*Temos que trabalhar a questão dos dias total de um mês, pois nem todos 
		 os meses tem 31 dias, alguns tem 30 e somente fevereiro tem 28 ou 29 dependendo do ano.
		 Primeiramente temos que fazer um if que vai abranger todo o limite de dias, pegando de 1 a 31,
		 já que não existe meses com  mais de 31 dias*/
		 if( mes < 0 && mes > 12 || dia < 0 && dia > 31){
			 
	         System.out.println( "Resposta: Não");

		 } else {
		  
	     //esse if é relacionado ao mês de fevereiro 
		 if( dia == 29 && mes == 2) {
			 
			 //esse if é relacionado ao ano bissexto pois nem todos os anos fevereiro tem 29 dias
			 if((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
					
					System.out.println("Resposta: Sim");
				
			 } else {
			     
			    System.out.println( "Resposta: Não");
			 
			 }
			 
		 } else {
		      
			  //para englobar apenas meses com 31 dias
			  if ( dia == 31) {
				 
				 switch(mes) {
				 
				 case 2:
				 case 4:
				 case 6:
				 case 9:
				 case 11:  System.out.println( "Resposta: Não"); break;//meses que possuem 30 dias, exceto fevereiro
				 default:  System.out.println( "Resposta: Sim"); 

					
				 }
				 
			  } else {
				  
				  System.out.println("Resposta: Sim");
			  }
		          
		  }
		 
	    }

	}

}
