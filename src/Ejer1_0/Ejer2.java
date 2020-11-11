package Ejer1_0;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		/*Algoritmo que lea dos números, calculando y escribiendo el valor de su suma, resta, producto y
división.
		 */
		float num1,num2,suma,resta,producto;
		float division;
		
		Scanner leer = new Scanner(System.in);
				
		System.out.println("dime un numero");
		num1=leer.nextInt();
		
		System.out.println("dime un segundo numero");
		num2=leer.nextInt();
		
		suma=num1+num2;
		resta=num1-num2;
		producto=num1*num2;
		division=num1/num2;
		
		System.out.println("la suma es " + suma);
		System.out.println("la resta es " + resta);
		System.out.println("el producto es " + producto);
		System.out.println("la division es " + division);
		
		
		
	}

}
