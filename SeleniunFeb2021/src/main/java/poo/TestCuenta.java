package poo;

import java.util.Scanner;

public class TestCuenta {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		String cuenta;
		double interes;
		double saldo;
		
		//crear objeto de clase cuenta usando constructor sin parametros
		
		Cuenta cuenta1= new Cuenta(); 
		//asignar valores a las variables por teclado
		System.out.println("Ingresa el nombre:");
		nombre= teclado.next();
		System.out.println("Ingresa el número de cuenta:");
		cuenta=teclado.next();
		System.out.println("Ingresa el tipo de interes: ");
		interes=teclado.nextDouble();
		System.out.println("Saldo");
		saldo=teclado.nextDouble();
		teclado.close();
		
		//asignar valores con mètodos set
		cuenta1.setnombre(nombre);
		cuenta1.setnumeroCuenta(cuenta);
		cuenta1.settipoInteres(interes);
		cuenta1.setsaldo(saldo);
		System.out.println("Nombre " + cuenta1.getnombre() );
		
		Cuenta cuenta2= new Cuenta("Sakui","147852",10.3,5000);
			System.out.println(cuenta2.getnombre());
			System.out.println(cuenta2.getnumeroCuenta());
			System.out.println(cuenta2.gettipoInteres());
			System.out.println(cuenta2.getsaldo());
			
			
		//utilizar el constructor que recibe el objeto
		Cuenta cuenta3 = new Cuenta(cuenta1);	
		
		//Ingreso en la cuenta1
		cuenta1.ingreso(4000);
		System.out.println("/////////////////////////");
		System.out.println("Cuenta 1 " + cuenta1.getsaldo());
		System.out.println("Cuenta 3 " + cuenta3.getsaldo());
		
		//Mostrar datos de cuenta 2
		System.out.println("*/*/*/**/*/*/*/*/*/*/*/*/*/*/*/*");
		System.out.println("cuenta2  nombre " + cuenta2.getnombre());
		System.out.println("cuenta2 cuenta " + cuenta2.getnumeroCuenta());
		//System.out.println("Tipo interes " + cuenta2.gettipoInteres());
		System.out.println("datos cta2 " + cuenta2.getsaldo());
		
		//Mostrar datos de cuenta 3
		System.out.println("*/*/*/**/*/*/*/*/*/*/*/*/*/*/*/*");
		System.out.println("cuenta3  nombre " + cuenta3.getnombre());
		System.out.println("cuenta3 cuenta " + cuenta3.getnumeroCuenta());
		//System.out.println("Tipo interes " + cuenta3.gettipoInteres());
		System.out.println("datos cta2 " + cuenta3.getsaldo());
		
		
		//Realizar una transferencia de la cuenta 3 a la cuenta 2
		cuenta3.transferencia(cuenta2, 1000);
		//Mostrar datos de cuenta 2
		System.out.println("Cuenta 2*/*/*/**/*/*/*/*/*/*/*/*/*/*/*/*");
		System.out.println("cuenta2  nombre " + cuenta2.getnombre());
		System.out.println("cuenta2 cuenta " + cuenta2.getnumeroCuenta());
		//System.out.println("Tipo interes " + cuenta2.gettipoInteres());
		System.out.println("Saldo 2 " + cuenta2.getsaldo());
		
		//Mostrar datos de cuenta 3
		System.out.println("Cuenta 3*/*/*/**/*/*/*/*/*/*/*/*/*/*/*/*");
		System.out.println("cuenta3  nombre " + cuenta3.getnombre());
		System.out.println("cuenta3 cuenta " + cuenta3.getnumeroCuenta());
		//System.out.println("Tipo interes " + cuenta3.gettipoInteres());
		System.out.println("Saldo 3 " + cuenta3.getsaldo());
	}

}
