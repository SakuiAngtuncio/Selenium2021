package poo;
import comun.LeerProperties;
 public class TestProperties {
	public static void main(String[] args) {
		LeerProperties prop = new LeerProperties();
		
		prop.getSystemProperties();
	    
		System.out.println();
		String mensaje= System.getProperty("MENSAJE");
		String mensaje2= System.getProperty("HOLA");
		int numero = Integer.parseInt(System.getProperty("NUMERO"));
		
		System.out.println(mensaje);
		System.out.println(mensaje2);
		System.out.println(numero);
		
		prop.setSystemPropFileName(System.getProperty("user.dir") + "\\src\\main\\resources\\dataFiles\\dataFile2.properties");
		prop.getSystemProperties();
		String archivo = System.getProperty("MENSAJE");
		System.out.println(archivo);
}
}