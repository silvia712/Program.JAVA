package Ejer1_0;

public class ejercicio16 {

	/*Teniendo en cuenta que la clave es “eureka”, escribir un algoritmo que nos pida una clave.
Solo tenemos 3 intentos para acertar, si fallamos los 3 intentos nos mostrara un
mensaje indicándonos que hemos agotado esos 3 intentos. (Recomiendo utilizar un interruptor). Si
acertamos la clave, saldremos directamente del programa.
	 */

	String contraseña;
	Scanner leer=new Scanner(System.in);

	i=0;
	
	do{
		System.out.println("Escribe una contraseña");
		contraseña=leer.nextLine();
		i=i+1;
	}while 
		contraseña != ("eureka") || i==3;
	
		
	
	}

}
