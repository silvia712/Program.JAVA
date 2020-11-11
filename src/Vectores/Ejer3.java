package Vectores;

import java.util.Scanner;

	
	public static void main(String[] args) {
		/*Crea un vector en el que le indiques el tamaño por teclado y crear una función
que rellene el vector con los múltiplos de un número pedido por teclado.
		 */
		int numero,multiplos,vMultiplos[];
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Escribe un numero");
		numero=leer.nextInt();
		System.out.println("Cuantos multiplos quieres?");
		multiplos=leer.nextInt();
		
		vMultiplos=new int[multiplos];
		
		for (int i=0;i<vMultiplos.length;i++) {
			vMultiplos[i]=numero*i;
			System.out.println(vMultiplos[i]);
		}
		
		
	}

}
