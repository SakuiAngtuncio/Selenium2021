package javabasics;

public class MainMetodos {

	public static void main(String[] args) {
		
		Metodos objeto = new Metodos(10, 20);
		Metodos constructor = new Metodos(10, 20,30);
		System.out.println(objeto.sumatoria());
		System.out.println(constructor.sumatoria());
		constructor.mensajeBienvenida();
		objeto.mensajeBienvenida();
		String name=objeto.concatenarNombres("Sakui" , "Angtuncio");
		System.out.println(name);
	}
	
	

}
