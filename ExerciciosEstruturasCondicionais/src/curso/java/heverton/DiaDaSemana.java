
/*Faça um Programa que leia um número e exiba o dia correspondente
da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve
aparecer valor inválido.*/


package curso.java.heverton;

import java.util.Scanner;

public class DiaDaSemana {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
			
		 System.out.println("Entre com um número de 1 a 7: ");
	     int numero = scan.nextInt();
	     
	     switch(numero) {
	         
	         case 1: System.out.println("DOMINGO");break;
	         case 2: System.out.println("SEGUNDA-FEIRA");break;
	         case 3: System.out.println("TERÇA-FEIRA");break;
	         case 4: System.out.println("QUARTA-FEIRA");break;
	         case 5: System.out.println("QUINTA-FEIRA");break;
	         case 6: System.out.println("SEXTA-FEIRA");break;
	         case 7: System.out.println("SÁBADO");break;
	         default: System.out.println("VALOR INVÁLIDO");
	     
	     }
	 }
}
