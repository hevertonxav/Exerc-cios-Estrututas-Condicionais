
/*As Organizações Tabajara resolveram dar um aumento de salário aos
seus colaboradores e lhe contraram para desenvolver o programa que
calculará os reajustes.
 Faça um programa que recebe o salário de um colaborador e o
reajuste segundo o seguinte critério, baseado no salário atual:
 + salários até R$ 280,00 (incluindo) : aumento de 20%
 + salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
 + salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
 + salários de R$ 1500,00 em diante : aumento de 5% Após o
 aumento ser realizado, informe na tela:
   - o salário antes do reajuste;
   - o percentual de aumento aplicado;
   - o valor do aumento;
   - o novo salário, após o aumento.*/



package curso.java.heverton;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ReajusteSalarial {

	public static void main(String[] args) {
		 
		 double sal; //salario do colaborador antes do reajuste
		 int percAumento; //percentual de aumento salarial
		 double valAumento; //valor do aumento
		 double salReajustado; //novo salário após o aumento
		 
		 Scanner scan = new Scanner(System.in);
			
		 System.out.println("Informe o salário do colaborador: ");
	     sal = scan.nextDouble();
	     
	     if(sal <= 280) {
	    	 
	    	 percAumento = 20;
	    	 
	     } else if (sal > 280 && sal <= 700) {
	    	 
	    	 percAumento = 15;
	     
	     } else if (sal > 700 && sal < 1500) {
	    	 
	    	 percAumento = 10;
	     
	     } else {
	    	 
	    	 percAumento = 5;
	     
	     }
	     
	     valAumento = sal * ((double)percAumento/100);
	     salReajustado = sal + valAumento;
	     
		 DecimalFormat df = new DecimalFormat("#####.00");

	     
		 System.out.println("Salário antes do reajuste: R$ " + df.format(sal));
		 System.out.println("Percentual de aumento: " + percAumento + "%");
		 System.out.println("Valor do aumento: R$ " + df.format(valAumento));
		 System.out.println("Salário reajustado: R$ " + df.format(salReajustado));

    }

}
