package Polimorfismo;

public class VehiculoTurismo extends Vehiculo {

	private int numeroPuertas;
	
	/**
	 * @param matricula
	 * @param marca
	 * @param modelo
	 */
	public VehiculoTurismo(int numeroPertas ,String matricula, String marca, String modelo) {
		super(matricula, marca, modelo);
		this.numeroPuertas= numeroPertas;

	}

	/**
	 * @return the numeroPuertas
	 */
	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	/**
	 * @param numeroPuertas the numeroPuertas to set
	 */
	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}
	
	@Override
	public String mostrarDatos() {
		 return "Matricula " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo + "\nNumero de puertas: " + numeroPuertas;
	}



}
