package poo;

public class Oficial extends Operario{

	/**
	 * @param nombre
	 */
	public Oficial(String nombre) {
		super(nombre);
		System.out.println("Usando el método operario");
		
	}

	@Override
	public String toString() {
		return super.toString() + "oficial";
	}
	
}
