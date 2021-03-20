package poo;

public class Tecnico extends Operario {

	/**
	 * @param nombre
	 */
	public Tecnico(String nombre) {
		super(nombre);
		System.out.println("Usando el constructor tecnico");
	}
	
	@Override
	public String toString() {
		return super.toString() + "Tecnico";
	}
	

}
