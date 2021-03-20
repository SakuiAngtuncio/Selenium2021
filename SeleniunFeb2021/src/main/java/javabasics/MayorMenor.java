package javabasics;

public class MayorMenor {
	
	/**Ejercicio 2
	 * declarar 2 variables numericas, e indicar cual es mayor de las 2, o si son iguales
	 * 
	 */
	
	public static void main(String[] args) {
		
		int var1=10;
		int var2=10;
		
		if (var1 > var2) {
			//if else (var1==var2)
			System.out.println("El valor 1 es mayor");
		}if (var1 == var2) {
			System.out.println("Los valores son iguales");
		}
		else {
			System.out.println("El valor 2 es mayor");
		}
		
	}

}//end main
