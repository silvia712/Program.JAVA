package Ejer2_Tema0;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		/*. Hacer un pseudocódigo que solo nos permita introducir S o N.
		 */
		
		String letra;
		Scanner leer= new Scanner(System.in);
		
		System.out.println("Escribe una letra");
		letra=leer.nextLine();
	
		while (letra.equalsIgnoreCase("s") || (letra.equalsIgnoreCase("n")){
			System.out.println("error en letra. Escribe s o n");
			letra=leer.nextLine();
		}
		do {
			
		} while (letra !="s" || letra!="n");
		
		if (letra.equalsIgnoreCase("s") || (letra.equalsIgnoreCase("n")){
			System.out.println("acertaste");
		}
	}

}
