package Ejer1_0;

public class Ejer18 {

	public static void main(String[] args) {
		/*Algoritmo que visualice la cuenta de los números que son múltiplos de 2 o de 3 que hay entre 1
		y 100.
			 */
		int i, totali, j , totalj;
		totali=0;
		totalj=0;
			
		for (i=1; i<100; i=i+2)	{
			totali=totali+1;
			System.out.print(i + " ");
		}
		System.out.println(" ");
		System.out.println("Un total de " + totali + " numeros impares");
		
		for (j=2; j<=100; j=j+2)	{
			totalj=totalj+1;
			System.out.print(j + " ");
		}
		System.out.println(" ");
		System.out.println("Un total de " + totalj + " numeros pares");

	}

}
