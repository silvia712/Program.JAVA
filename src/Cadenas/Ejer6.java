package Cadenas;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		/* Crea un programa que pida al usuario
su nombre y apellidos y los muestre con las may�sculas y min�sculas
correctas (aparecer�n en may�sculas la primera letra y la que haya tras
cada espacio; las dem�s aparecer�n en min�sculas. Por ejemplo, si
introduce "nAcho cabaNes", es escribir� "Nacho Cabanes").
		 */

		String nombre;
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Escribe tu nombre y apellido"); 
		nombre=leer.nextLine();
		nombre=nombre.toLowerCase();//aseguramos que todas las letras estaran en minusculas
		
		for (int i=0; i<nombre.length();i++){
			if (nombre.substring(i,i+1).equalsIgnoreCase(" ")) {
					System.out.print(nombre.substring(i,i+2).toUpperCase());
			}else {
				System.out.print(nombre.substring(i,i+1).toLowerCase());
			}
			
			
			
		}
		
		
		
	}

}
