package poo;

public class Cuenta {

	private String nombre;
	private String numeroCuenta;
	private double tipoInteres;
	private double saldo;
	
	/*
	 * @author Sakui
	 * @date 06/03/21
	 * @param N/A
	 * 
	 * **/
	
	public Cuenta() {
			
	}
	/*
	 * @author Sakui
	 * @date 06/03/21
	 * @param String, String, Double, Double
	 * 
	 * **/
	
	public Cuenta(String nombre, String numeroCuenta, double tipoInteres, double saldo) {
		
		this.nombre = nombre;
		this.numeroCuenta = numeroCuenta;
		this.tipoInteres = tipoInteres;
		this.saldo = saldo;
		
	}
	
	/*
	 * @author Sakui
	 * @date 06/03/21
	 * @param Object
	 * 
	 * */
	public Cuenta(Cuenta c) {
		
		nombre = c.nombre;
		numeroCuenta= c.numeroCuenta;
		tipoInteres= c.tipoInteres;
		saldo= c.saldo;
		
		
	}
	
	
	/*
	 * @author Sakui
	 * @date 06/03/21
	 * @param String
	 * 
	 * */
	
	public void setnombre(String nombre) {
		this.nombre = nombre;
	
	}
	
	public void setnumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	public void settipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
	
	public void setsaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/*
	 * @author Sakui
	 * @date 06/03/21
	 * @param String
	 * return String
	 * */
	
	public String getnombre() {
	return this.nombre;
	
	}
	
	public String getnumeroCuenta() {
		return this.numeroCuenta;
	}
	
	public double gettipoInteres() {	
		return this.tipoInteres;
	}
	
	public double getsaldo() {
	return this.saldo;	
	}
	
	public boolean ingreso(double n) {
		boolean ingresoCorrecto = true;
		
		if(n<0) {
			boolean ingresoIncorrecto = false;
		}else {
			
		saldo = saldo +n;
		}
		return ingresoCorrecto;
	}
	
	public boolean reintegro (double n) {
		boolean reintegroCorrecto=true;
		if(n<0) {
			reintegroCorrecto=false;
		}else if (saldo  >= n) {
			saldo = n;
		
		}else {
			reintegroCorrecto = false;
		}
		return reintegroCorrecto;
	}
	
	
	
	public boolean transferencia(Cuenta c, double n) {
		boolean correcto = true;
		if(n<0) {
			
		}else if (saldo >=n) {
			reintegro(n);
			c.ingreso(n);
		}else {
			correcto=false;
		}
		return correcto;
	}
	
}
