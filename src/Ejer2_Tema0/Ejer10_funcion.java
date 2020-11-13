package Ejer2_Tema0;

import java.util.Scanner;


public static int suma(String frase,String letra) {
		int suma=0;
		
	for (int i = 0; i < frase.length(); i++) {
		if (frase.substring(i, i + 1).equalsIgnoreCase(letra)) {
			suma = suma + 1;
		}
		return suma;
	}
	



public class Ejer10_funcion {

	public static void main(String[] args) {
		/*
		 * Hacer un pseudoc�digo que cuente las veces que aparece una determinada letra
		 * en una frase que introduciremos por teclado.
		 */

		String frase, letra;
		Scanner leer = new Scanner(System.in);

		System.out.println("Escribe una frase");
		frase = leer.nextLine();
		System.out.println("Que letra quieres buscar?");
		letra = leer.nextLine();
		
		System.out.println("En la frase la letra " + letra + " aparece " + suma + " veces");
	}

}
