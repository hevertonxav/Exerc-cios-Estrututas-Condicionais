
/*Faça um programa para a leitura de duas notas parciais de um aluno.
O programa deve calcular a média alcançada por aluno e apresentar:
o A mensagem "Aprovado", se a média alcançada for maior ou
igual a sete;
o A mensagem "Reprovado", se a média for menor do que sete;
o A mensagem "Aprovado com Distinção", se a média for igual a
dez.*/



package curso.java.heverton;

import java.util.Scanner;

public class MediaNotasEscolares {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota do aluno: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Entre com a segunda nota do aluno: ");
		double nota2 = scan.nextDouble();
		
		//cálculo da média
		double media = (nota1 + nota2)/2;
		
		if (media >= 7) {
			
			if(media == 10) {
				
				System.out.println("APROVADO COM DISTINÇÃO");

			} else {
		    
		        System.out.println("APROVADO"); 
		   
			}
			
		} else {
			
			System.out.println("REPROVADO");

		}

	}

}
