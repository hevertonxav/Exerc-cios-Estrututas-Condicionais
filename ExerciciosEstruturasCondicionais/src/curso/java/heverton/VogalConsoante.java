
/*Faça um Programa que verifique se uma letra digitada é vogal ou
consoante.*/

package curso.java.heverton;

import java.util.Scanner;

public class VogalConsoante {

	public static void main(String[] args) {
        
		String letra;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra: ");
		letra = scan.next();
		
		switch(letra) {
		    case "a":
		    case "A":
		    case "e":
		    case "E":
		    case "i":
		    case "I":
		    case "o":
		    case "O":
		    case "u":
		    case "U":System.out.println("É uma vogal");break;
		    default:System.out.println("É uma consoante");
		
		}

	}

}
