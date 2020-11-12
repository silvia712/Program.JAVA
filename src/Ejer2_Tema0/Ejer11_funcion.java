package Ejer2_Tema0;

import java.util.Scanner;

public class Ejer11_funcion {

	
	public static int factorial(int num) { //funcion: recibe un int (num), devuelve un int (factorial)
		int factorial=1; //hay que inicializarlo aqui !!!
			
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i; 
		}
		return factorial; // retorno que llamremos desde el programa pricipal
		}
	
	
	public static void main(String[] args) {
		/*Calcular el factorial de un número (funcion)
		 */

		int num;// factorial ya no se inicializa aqui
		Scanner leer = new Scanner(System.in);
		
	
		System.out.println("Escribe un numero");
		num = leer.nextInt();
	
		System.out.println("El factorial de " + num + " es igual a " + factorial(num));

	}

}
