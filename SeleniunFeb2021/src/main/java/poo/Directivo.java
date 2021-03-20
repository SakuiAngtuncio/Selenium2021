package poo;

public class Directivo extends Empleado {

	/**
	 * 
	 */
	public Directivo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 */
	public Directivo(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return super.toString() + " -  es Directivo";
		
	}

}
