package javabasics;

import java.util.Scanner;

public class TablaDeMultiplicar {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		int tabla3=0;
		int result=0;
		int temp=0;
		
		System.out.println("Ingresa el número a multiplicar " );
		temp = teclado.nextInt();
		
		while(temp <=0) {
			System.out.println("El número debe ser mayor de cero");
			temp = teclado.nextInt();			
		}
		for(int i=1; i<=10; i++) {
			
			
			result=i*temp;
			System.out.println(i + "* " + temp + " =" + result);
		}
		
		teclado.close();

	}

}
