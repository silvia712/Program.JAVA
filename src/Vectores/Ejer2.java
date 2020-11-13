package Vectores;

import java.util.Scanner;


public class Ejer2 {

	public static void main(String[] args) {
		/*- Realiza el problema anterior creando una funci�n (subproceso)
�calcular_media� la cual reciba como par�metros un vector, el tama�o del
mismo y devuelve la media de los valores del vector.
		 */

		int suma,vNumeros[];
		float media;
		vNumeros=new int[10];
		Scanner leer=new Scanner(System.in);
		
		suma=0;
		media=0;
		
		System.out.println("Escribe diez numeros");
		for (int i = 0; i < vNumeros.length; i++) {
			vNumeros[i]=leer.nextInt();
			suma=suma+vNumeros[i];
		}
		media=suma/10;
		System.out.println("la media de todos los numeros es " + media);
		
		
	}

}
