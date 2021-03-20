package poo;

public class TestEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado E1 = new Empleado("Sakui");
		Directivo D1 = new Directivo("Cristian");
		Operario OP1 = new Operario("Danae");
		Oficial OF1 = new Oficial("Pedro");
		Tecnico TC1 = new Tecnico("Omar");
		
		Empleado E2 = new Tecnico("Felipe");
		
		System.out.println(E1);
		System.out.println(D1);
		System.out.println(OP1);
		System.out.println(OF1);
		System.out.println(TC1);
		System.out.println(E2.toString());
	}

}
