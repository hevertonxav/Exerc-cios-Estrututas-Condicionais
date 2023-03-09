
/*Uma fruteira está vendendo frutas com a seguinte tabela de preços:
  
         Até 5 Kg         Acima de 5 Kg
Morango  R$ 2,50 por Kg   R$ 2,20 por Kg
Maçã     R$ 1,80 por Kg   R$ 1,50 por Kg

Se o cliente comprar mais de 8 Kg em frutas ou o valor total da
compra ultrapassar R$ 25,00, receberá ainda um desconto de
10% sobre este total. Escreva um algoritmo para ler a
quantidade (em Kg) de morangos e a quantidade (em Kg) de
maças adquiridas e escreva o valor a ser pago pelo cliente.*/

package curso.java.heverton;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VendasFrutas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double morangos;
		double macas;
		double totalFrutas;
		double valorSemDesconto;
		double precoMorango;
		double precoMaca;
		double valorPagar;
		
		System.out.println("Digite a quantidade de morangos em kg: ");
		morangos = scan.nextDouble();
		
		System.out.println("Digite a quantidade de maçãs em kg: ");
		macas = scan.nextDouble();
		
		totalFrutas = morangos + macas;
		
		if(morangos <= 5) {
			
			precoMorango = 2.5;
			
		} else {
			
			precoMorango = 2.2;

		}
		
        if(macas <= 5) {
			
			precoMaca = 1.8;
			
		} else {
			
			precoMaca = 1.5;

		}
        
        valorSemDesconto = (precoMorango * morangos) + (precoMaca * macas);
        
        if(totalFrutas > 8 || valorSemDesconto > 25 ) {
        	
        	valorPagar = valorSemDesconto * (0.9);
        	
        } else {
        	
        	valorPagar = valorSemDesconto;

        }
        
   	    DecimalFormat df = new DecimalFormat("#####.00");
        
   	    System.out.println("------------------------------------------");
		System.out.println("Total à pagar: R$ " + df.format(valorPagar));
		System.out.println("------------------------------------------");

   }

}
