package Vectores;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
	
		/*Crea un vector con un tamaño de 10, el algoritmo te solicitará por teclado 10
números y terminará mostrando por pantalla la media de valores del vector.
	 */
		float suma,vNumeros[];
		float media;
		vNumeros=new float[10];
		Scanner leer=new Scanner(System.in);
		
		suma=0;
		media=0;
		
		System.out.println("Escribe diez numeros");
		for (int i=0; i<vNumeros.length; i++) {
			vNumeros[i]=leer.nextInt();
			suma=suma+vNumeros[i];
			media=suma/i;
		}
		System.out.println("la media de todos los numeros es " + media);
	}

}
