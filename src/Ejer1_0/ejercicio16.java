package Ejer1_0;

public class ejercicio16 {

	/*Teniendo en cuenta que la clave es �eureka�, escribir un algoritmo que nos pida una clave.
Solo tenemos 3 intentos para acertar, si fallamos los 3 intentos nos mostrara un
mensaje indic�ndonos que hemos agotado esos 3 intentos. (Recomiendo utilizar un interruptor). Si
acertamos la clave, saldremos directamente del programa.
	 */

	String contrase�a;
	Scanner leer=new Scanner(System.in);

	i=0;
	
	do{
		System.out.println("Escribe una contrase�a");
		contrase�a=leer.nextLine();
		i=i+1;
	}while 
		contrase�a != ("eureka") || i==3;
	
		
	
	}

}
