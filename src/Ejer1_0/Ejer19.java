package Ejer1_0;

import java.util.Scanner;

public class Ejer19 {

	public static void main(String[] args) {
	/*Leer tres números que denoten una fecha (día, mes, año). Comprobar que es una fecha válida.
Si no es válida escribir un mensaje de error. Si es válida escribir la fecha cambiando el número del
mes por su nombre. Ej. si se introduce 1 2 2006, se deberá imprimir “1 de febrero de 2006”. El año
debe ser mayor que 0. (Recuerda la estructura segun sea).
	 */

		int dia,mes,año;
		Scanner leer =new Scanner(System.in);
		
		System.out.println("Escribe una fecha (dd mm aaaa)");
		dia=leer.nextInt();
		mes=leer.nextInt();
		año=leer.nextInt();
		
		if ((dia>=1 && dia<=31) && (mes>=1 && mes<=12) && (año>0)) {
			System.out.print(dia);
			
				switch (mes) {
		case 1:
			System.out.print(" de Enero de ");
			break;
		case 2:
			System.out.print(" de Febrero de ");
			break;
		case 3: 
			System.out.print(" de Marzo de ");
			break;
		case 4:
			System.out.print(" de Abril de ");
			break;
		case 5:
			System.out.print(" de Mayo de ");
			break;
		case 6:
			System.out.print(" de Junio de ");
			break;
		case 7:
			System.out.print(" de Julio de ");
			break;
		case 8:
			System.out.print(" de Agosto de ");
			break;
		case 9:
			System.out.print(" de Septiembre de ");
			break;
		case 10:
			System.out.print(" de Octubre de ");
			break;
		case 11:
			System.out.print(" de Noviembre de ");
			break;
		case 12:
			System.out.print(" de Diciembre de ");
			break;
				}
			System.out.print(año);

		}else {
			System.out.print("error de fecha");
		}
	}
}
