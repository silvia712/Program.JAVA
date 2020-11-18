package Ejer2_Tema0;

import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {
	/*Hacer un pseudocódigo que imprima el mayor y el menor de una serie de cinco
números que vamos introduciendo por teclado.
	 */
		
		int num,mayor,menor; 
		mayor=0;
		menor=0;
		num=0;
		Scanner leer=new Scanner(System.in);
		mayor=num;
		menor=num;

		System.out.println("Escribe cinco numeros");
		for (int i=0;i<5;i++) {
			num=leer.nextInt();
		}
		if (num<menor) {
			menor=num;
		}
		if(num>mayor) {
			mayor=num;
		}
		
		System.out.println("El numero mayor es " + mayor + " y el menor " + menor);
		
		
		
		
	}

}
