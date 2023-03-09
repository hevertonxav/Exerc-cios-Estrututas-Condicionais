/*Faça um programa para o cálculo de uma folha de pagamento,
sabendo que os descontos são do Imposto de Renda, que depende do
salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o
FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é
a empresa que deposita). O Salário Líquido corresponde ao Salário
Bruto menos os descontos. O programa deverá pedir ao usuário o
valor da sua hora e a quantidade de horas trabalhadas no mês.
   
   + Desconto do IR:
    
     - Salário Bruto até 900 (inclusive) - isento
     - Salário Bruto até 1500 (inclusive) - desconto de 5%
     - Salário Bruto até 2500 (inclusive) - desconto de 10%
     - Salário Bruto acima de 2500 - desconto de 20% 
     
    Imprima na tela as informações, dispostas conforme o 
    exemplo abaixo. No exemplo o valor da hora é 5 e 
    a quantidade de hora é 220.
       
       Salário Bruto: (5 * 220) : R$ 1100,00
       (-) IR (5%) : R$ 55,00
       (-) INSS ( 10%) : R$ 110,00
       FGTS (11%) : R$ 121,00
       Total de descontos : R$ 165,00
       Salário Liquido : R$ 935,00 */


package curso.java.heverton;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FolhaDePagamento {

	public static void main(String[] args) {
        
		    Scanner scan = new Scanner(System.in);
			
		    double valorHora;// valor da hora do usuárop
		    double horas; //quantidade de horas trabalhadas no mês
		    int percentualDesc; //percentual de desconto do IR
		    double salBruto; //salário bruto
		    double ir; //valor descontado do IR
		    double inss; //valor descontado do INSS
		    double fgts; //valor descontado do FGTS
		    double totDescontos; //valor total de descontos
		    double salLiquido; //salário líquido
		    
		    
			System.out.println("Informe o valor da sua hora: ");
			valorHora = scan.nextDouble();
			
			System.out.println("Informe as horas trabalhadas nesse mês: ");
			horas = scan.nextDouble();
			
			salBruto = valorHora * horas;
			
			if(salBruto <= 900) {
				
				percentualDesc = 0;
				
			} else if(salBruto > 900 && salBruto <= 1500) {
				
				percentualDesc = 5;
				
			} else if(salBruto > 1500 && salBruto <= 2500) {
				
				percentualDesc = 10;
				
			} else {
				
				percentualDesc = 20;
				
			}
			
			
			ir = salBruto * ((double)percentualDesc/100);
			inss = salBruto * 0.1;
			fgts = salBruto * 0.11;
			totDescontos = ir + inss;
			salLiquido = salBruto - totDescontos;
			
		    DecimalFormat df = new DecimalFormat("####0.00");

			System.out.print("Salário Bruto: " + "(" + valorHora + " * " + horas + ") : ");
			System.out.println("R$ " + df.format(salBruto));
			System.out.println("(-) IR (" + percentualDesc + "%) : R$ " + df.format(ir));
			System.out.println("(-) INSS (10) : R$ " + df.format(inss));
			System.out.println("FGTS (11%) : R$ " + df.format(fgts));
			System.out.println("Total de Descontos : R$ " + df.format(totDescontos));
			System.out.println("Salário Líquido : R$ " + df.format(salLiquido));
			
	}
}
