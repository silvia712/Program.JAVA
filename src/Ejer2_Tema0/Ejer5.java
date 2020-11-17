package Ejer2_Tema0;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		/*. Hacer un pseudocódigo que solo nos permita introducir S o N.
		 */
		
		String letra;
		Scanner leer= new Scanner(System.in);
		letra="";
		
		System.out.println("Escribe una letra");
		letra=leer.nextLine();
		
		do {
			System.out.println("error de letra. Escribe una letra");
			letra=leer.nextLine();
		} while (letra !="s" || letra!="n");
		
		
	
	}

}
