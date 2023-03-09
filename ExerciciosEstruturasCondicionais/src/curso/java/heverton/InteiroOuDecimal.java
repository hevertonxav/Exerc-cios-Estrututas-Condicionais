/*Faça um Programa que peça um número e informe se o número é
inteiro ou decimal. Dica: utilize uma função de arredondamento.*/


package curso.java.heverton;

import java.util.Scanner;

public class InteiroOuDecimal {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
		
        System.out.println("Digite um número: ");
        double numero = scan.nextDouble();
        
        long numeroInteiro = Math.round(numero);
        
        if (numero == numeroInteiro) {
        	
        	/*usei o Math.round() pra quando imprimir o dado o número sair 
        	 sem o zero após a vírgula (isso se tiver só o zero).
        	 Exemplo: 5,0*/
        	
        	System.out.println(Math.round(numero) + " é inteiro");

        } else {
        	
        	System.out.println(numero + " é decimal");

        }

	}

}
