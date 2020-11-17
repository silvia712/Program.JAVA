package Vectores;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
	/*Realiza el problema anterior creando una función (subproceso)
“calcular_media” la cual reciba como parámetros un vector, el tamaño del
mismo y devuelve la media de los valores del vector.
*/
		int num,multiplos,vMultiplos[];
		Scanner leer= new Scanner(System.in);
			
		System.out.println("Escribe un numero y los multiplos que quieres de el");
		num=leer.nextInt();
		multiplos=leer.nextInt();
		
		vMultiplos=new int[multiplos];
		
		for (int i=0; i<vMultiplos.length;i++) {
			vMultiplos[i]=num*i;	
			System.out.print(vMultiplos[i] + " ");
		} 	

	}

}
