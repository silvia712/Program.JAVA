package Ejer2_Tema0;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		/*Imprimir y contar los m�ltiplos de 3 desde la unidad hasta un n�mero que
introducimos por teclado.
		 */
		
		int num,suma;
		Scanner leer=new Scanner(System.in);
		suma=0;
		
		System.out.println("Escribe un numero");
		num=leer.nextInt();
		
		for (int i=3; i < num; i=i+3) {
			suma=suma+1;
			System.out.printint();
		}
		
			
		}
		
	}


