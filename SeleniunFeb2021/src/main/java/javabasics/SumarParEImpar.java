package javabasics;

import java.util.Scanner;

public class SumarParEImpar {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double par=0;
		double impar=0;
		double residuo;
		double numeroTemp;
		int repeticiones;
		
		System.out.println("Ingresa n�mero de veces ");
		repeticiones = teclado.nextInt();
		
		for(int i=1; i<=repeticiones;  i++) {
			System.out.println("Ingrese el n�mero:   [ "+i+"]");
			numeroTemp= teclado.nextDouble();
			residuo = numeroTemp%2;
			
			while (numeroTemp==0) {
				System.out.println("El n�mero debe ser mayor que cero");
			if(residuo == 0) {
				//par  = par +numeroTemp
				par+=numeroTemp;
				System.out.println("El n�mero par es : " + numeroTemp);
			}
			}
			if(residuo !=0 && residuo >0) {
				impar+=numeroTemp;
				System.out.println("El n�mero impar es: " +numeroTemp);
			}
			
		}

		teclado.close();
		
		System.out.println("La sumatoria de los pares es:   ["+par+"]");
		System.out.println("La sumatoria de los pares es:   ["+impar+"]");
	}

	
}
