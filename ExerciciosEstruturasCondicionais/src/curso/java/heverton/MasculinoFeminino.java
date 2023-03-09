
/*Faça um Programa que verifique se uma letra digitada é "F" ou "M".
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.*/


package curso.java.heverton;

import java.util.Scanner;

public class MasculinoFeminino {

	public static void main(String[] args) {
		
		String sexo;
		
        Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o sexo da pessoa: ");
		sexo = scan.next();
		
		if (sexo.equals("M")) {
			
			System.out.println("Masculino");
        
		} else if (sexo.equals("F")) {
			
			System.out.println("Feminino");
		
		} else {
			
			System.out.println("Sexo Inválido");
			
		}
		

	}

}
