package Vectores;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		/*
		 * Crea dos vectores que tengan el mismo tamaño (lo pedirá por teclado), en uno
		 * de ellos almacenaras nombres de personas como cadenas, en el otro vector ira
		 * almacenando la edad de los nombres. Crea un procedimiento (subproceso) que
		 * muestre por pantalla el contenido de los dos vectores.
		 */

		int numero, vEdad[];
		String vNombres[];
		Scanner leer = new Scanner(System.in);
		Scanner leerEdad = new Scanner(System.in);
		
		System.out.println("Cuantos nombres quieres guardar?");
		numero = leerEdad.nextInt();

		vNombres = new String[numero];
		vEdad = new int[numero];

		System.out.println("Escribe los nombres y sus edades");
		for (int i = 0; i < vNombres.length; i++) {
			vNombres[i] = leer.nextLine();
			vEdad[i] = leerEdad.nextInt();
		}
		for (int i=0;i<vNombres.length;i++) {
			System.out.println(vNombres[i] + "-" + vEdad[i]);
		}

	}

}