package Ejer_Tema1;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
/*Realiza un algoritmo que ayude a Cristian a cobrar a los clientes que compran en su
tienda de informática. El algoritmo tiene que:
Una vez introducido el importe de la compra, devolver cuanto paga el cliente
de IVA. Cuanto es el importe total de la compra (tras sumarle el IVA).
Leer con qué dinero paga el cliente y escribir cual es el cambio que tiene que
devolverle Cristian.
 */
		
		float precio,iva;
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Introduce el importe del producto");
		precio=leer.nextFloat();
		iva=(precio*21)/100;
		System.out.println(" Iva a pagar " + iva );
		System.out.println(" Precio total a pagar " + (precio+iva));
		
		
		

	}

}
