package javabasics;

import javax.swing.JOptionPane;

public class Divisible {

	public static void main(String[] args) {
		// Calcula el área de un circulo pi por radio al cuadrado

		double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el Radio"));
		
		double area = Math.PI*Math.pow(radio, 2);
		
		System.out.println("El area del circulo es: "+ area);
	}

}
