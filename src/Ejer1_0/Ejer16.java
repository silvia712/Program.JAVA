package Ejer1_0;

import java.util.Scanner;

public class Ejer16 {

	public static void main(String[] args) {
		/*Teniendo en cuenta que la clave es “eureka”, escribir un algoritmo que nos pida una clave.
Solo tenemos 3 intentos para acertar, si fallamos los 3 intentos nos mostrara un
mensaje indicándonos que hemos agotado esos 3 intentos. (Recomiendo utilizar un interruptor). Si
acertamos la clave, saldremos directamente del programa.
		 */

		String contraseña;
		Scanner leer=new Scanner(System.in);
		contraseña="eureka";
		
		
			for (int i=0;i<3;i++) {
				do {
				System.out.println("Escribe una contraseña");
				contraseña=leer.nextLine();	
				} while (!contraseña.equalsIgnoreCase("eureka"));
				
				
			}
			
			
		}
		
		
	}

}
