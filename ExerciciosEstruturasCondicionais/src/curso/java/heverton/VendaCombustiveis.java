/*Um posto está vendendo combustíveis com a seguinte tabela de
descontos:

- Álcool:
 a. até 20 litros, desconto de 3% por litro
 b. acima de 20 litros, desconto de 5% por litro

- Gasolina:
 c. até 20 litros, desconto de 4% por litro
 d. acima de 20 litros, desconto de 6% por litro 
 
Escreva um algoritmo que leia o número de litros vendidos, o tipo de
combustível (codificado da seguinte forma: A-álcool, G-gasolina),
calcule e imprima o valor a ser pago pelo cliente
sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço
do litro do álcool é R$ 1,90.*/


package curso.java.heverton;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VendaCombustiveis {

	public static void main(String[] args) {
		
     Scanner scan = new Scanner(System.in);
	 
     double litros;
     String comb;
     int desconto = 0;
     double precoPorLitro = 0;
     double valorDesconto;
     double valorSemDesconto;
     double valorPagar;
     
     
	 System.out.println("Quantos litros de combustível o cliente deseja comprar? ");
	 litros = scan.nextDouble();
	 
	 System.out.println("Qual tipo  de combustível o cliente deseja comprar? ");
	 System.out.println("A - álcool G - gasolina ");
     comb = scan.next();
	 
     if (comb.equalsIgnoreCase("A")) {
    	 
    	 precoPorLitro = 1.90;
    	 
    	 if(litros <= 20) {
    		 
    		 desconto = 3;
    		 
    	 } else {
    		 
    		 desconto = 5;
    		 
    	 }
    
     } else if (comb.equalsIgnoreCase("G")) {
    	 
    	 precoPorLitro = 2.50;
    	 
    	 if(litros <= 20) {
    		 
    		 desconto = 4;
    		 
    	 } else {
    		 
    		 desconto = 6;
    		 
    	 }
    
     } else {
    	 
    	 System.out.println("Código inválido");

     }
     
     valorDesconto = litros * precoPorLitro * ((double)desconto/100);
     valorSemDesconto = litros * precoPorLitro;
	 valorPagar = valorSemDesconto - valorDesconto;
	
	 DecimalFormat df = new DecimalFormat("#####.00");

	 System.out.println("----------------------------");
	 System.out.println("Valor à pagar: R$ " + df.format(valorPagar));
	 System.out.println("----------------------------");

     }

}
