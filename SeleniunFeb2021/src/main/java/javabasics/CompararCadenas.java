package javabasics;

import java.util.Scanner;

public class CompararCadenas {

	public static void main(String[] args) {
	
		//Creamos Scaner para leer plabras
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Escribe la primera Palabra");
		String palabra1 = leer.next();
		
		
		System.out.println("Escribe la segunda Palabra");
		String palabra2 = leer.next();
		leer.close();
		
		if (palabra1.equals(palabra2)) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}
		
		
		String texto="Un 45 texto";
		String textoSinespacios = texto.replace(" ", "");
		
		System.out.println(textoSinespacios);
		
		System.out.println("El texto tiene [ "+texto.length()+" ]");
	
		
		
		
		
		
		

	}//fin de main

}//fin de la clase
