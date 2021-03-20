package javabasics;

import javax.swing.JOptionPane;

public class Operaciones {
	/**Declarar dos variables numericas ingresando el valor por el teclado , muestra por consola la suma, resta
	 * multiplicación, y divisón
	 **/
	
	
	public static void main(String[] args) {
	
	double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el numero 1"))	;
	
	double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el numero 2"))	;
	
	System.out.println(numero1+numero2 + " Suma");
	System.out.println(numero1-numero2 + " Resta");
	System.out.println(numero1*numero2 + " multiplicacion");
	System.out.println(numero1/numero2 +" divison");
	
	JOptionPane.showMessageDialog(null, numero1+numero2);
	JOptionPane.showMessageDialog(null, numero1-numero2);
	JOptionPane.showMessageDialog(null, numero1*numero2);
	JOptionPane.showMessageDialog(null, numero1/numero2);
	}

}
