package Cadenas;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
	/*Crea un programa que pida su
nombre al usuario y lo escriba alternando letras may�sculas y min�sculas
(por ejemplo, "nAcho" se mostrar�a como "NaChO".
	 */
		
		String nombre, alterno;
		Scanner leer=new Scanner(System.in);
		alterno="";
		
		System.out.println("Escribe un nombre");
		nombre=leer.nextLine();
		for (int i=0; i<nombre.length();i++) {
			if (i % 2 == 0) {
				alterno = alterno + nombre.toUpperCase();
			}else {
				alterno = alterno + nombre.toLowerCase();
			}			
		}System.out.println(alterno);
	}

}
