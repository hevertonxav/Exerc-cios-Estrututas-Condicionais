
/*O Hipermercado Tabajara está com uma promoção de carnes que é
imperdível. Confira:
   
                  Até 5 Kg        Acima de 5 Kg
   File Duplo   R$ 4,90 por Kg   R$ 5,80 por Kg
   Alcatra      R$ 5,90 por Kg   R$ 6,80 por Kg
   Picanha      R$ 6,90 por Kg   R$ 7,80 por Kg

Para atender a todos os clientes, cada cliente poderá levar
apenas um dos tipos de carne da promoção, porém não há
limites para a quantidade de carne por cliente. Se compra for
feita no cartão Tabajara o cliente receberá ainda um desconto
de 5% sobre o total a compra. Escreva um programa que peça
o tipo e a quantidade de carne comprada pelo usuário e gere
um cupom fiscal, contendo as informações da compra: tipo e
quantidade de carne, preço total, tipo de pagamento, valor do
desconto e valor a pagar.*/


package curso.java.heverton;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PromocaoCarnes {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String carne;
		double precoPorKg = 0;
		double valorSemDesconto;
		double valorPagar = 0;
		String cartao;
		double qtdeCarne;
		double valorDesconto = 0;
		String output;
	    output = "";
	    String output2;
	    output2 = "Tipo de carne: ";
		
	
		
		System.out.println("Digite o tipo de carne: ");
		System.out.println("F - filé duplo");
		System.out.println("A - alcatra");
		System.out.println("P - picanha");
        carne = scan.next();
		
		System.out.println("Digite a quantidade de carne em kg: ");
		qtdeCarne = scan.nextDouble();
		
		if(carne.equalsIgnoreCase("F")) {
			
			output2 += "filé duplo";
			
			if(qtdeCarne <= 5) {
				
				precoPorKg = 4.9;
						
			} else {
				
				precoPorKg = 5.8;

			}
		
		} else if(carne.equalsIgnoreCase("A")) {
			
			output2 += "alcatra";

			if(qtdeCarne <= 5) {
				
				precoPorKg = 5.9;
						
			} else {
				
				precoPorKg = 6.8;

			}
		
		}  else if(carne.equalsIgnoreCase("P")) {
			
			output2 += "picanha";

			if(qtdeCarne <= 5) {
				
				precoPorKg = 6.9;
						
			} else {
				
				precoPorKg = 7.8;

			}
		
		} else {
			
			System.out.println("Código inválido");
		
		}
		
		valorSemDesconto = qtdeCarne * precoPorKg;
		
		System.out.println("O cliente vai pagar no cartão? [S - sim / N - não]");
		cartao = scan.next();
		
		if(cartao.equalsIgnoreCase("S")) {
			
			valorPagar = valorSemDesconto * (0.95);
		    output += "Pagamento feito pelo cartão Tabajara";
		    valorDesconto = valorSemDesconto * (0.05);
			
		} else if(cartao.equalsIgnoreCase("N")) {
			
			valorPagar = valorSemDesconto;
			output += "Pagamento não foi feito pelo cartão Tabajara";
		    valorDesconto = 0;

			
		} else {
			
			System.out.println("Código inválido");

		}
		
		DecimalFormat df = new DecimalFormat("####0.00");

		System.out.println(output2);
		System.out.println("Quantidade: " + qtdeCarne + " kg");
		System.out.println("Preço total: R$ " + df.format(valorSemDesconto));
		System.out.println(output);
		System.out.println("Valor do desconto: R$ " + df.format(valorDesconto));
		System.out.println("Valor total: R$ " + df.format(valorPagar));
    
    }

}
