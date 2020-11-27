package Ejer_Tema1;

import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		/*Realiza un algoritmo para que insertados los salarios de un n�mero indeterminado de
empleados, el algoritmo nos calcule cu�ntos de ellos ganan m�s de 200� y cuantos
ganas m�s de 500�. Datos de entrada: N�mero de empleados, salario de cada uno de ellos.
 Datos de salida: N�mero de empleados que ganan m�s de 200� y cuantos
ganan m�s de 500. 
		 */

		int salario,menos200,entre,mas500;
		Scanner leer=new Scanner(System.in);
		salario=0;
		menos200=0;
		entre=0;
		mas500=0;
		
		do {
			System.out.println("Escribe un salario");
			salario=leer.nextInt();
			
			if (salario!=0) {
				
				if(salario<200) {
					menos200=menos200+1;	
				}else {
					if (salario>=200 && salario<=500) {
						entre=entre+1;
					}else {
						mas500=mas500+1;
					}
					
				}	
			}
			
		} while (salario!=0);
		
		System.out.println("Salarios de menos de 200 eur hay " + menos200);
		System.out.println("Salarios entre 200 y 500 eur hay " + entre);
		System.out.println("Salarios de mas de 500 eur hay " + mas500);
			
		}
		
	}