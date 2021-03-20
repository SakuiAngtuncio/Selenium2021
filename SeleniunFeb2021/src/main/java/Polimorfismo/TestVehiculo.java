package Polimorfismo;

public class TestVehiculo {

	public static void main(String[] args) {
		Vehiculo misVehiculos[] = new Vehiculo[4];
		misVehiculos[0] = new Vehiculo("GFR1456","Audi","2019");
		misVehiculos[1] = new VehiculoTurismo(8,"LOP4567","Seat","2021");
		misVehiculos[2] = new VehiculoDeportivo("POR1356","Mitsubishi","2018",10);
		misVehiculos[3] = new VehiculoFurgoneta("FVC4785","Ford","2020",300);
		//vehiculos = misVehiculos[0]
		
	
		for(Vehiculo vehiculos: misVehiculos) {
			System.out.println(vehiculos.mostrarDatos());
			System.out.println("");
		}
		
		
		Vehiculo vehiculoDeportivo = new VehiculoDeportivo("POR1356","Mitsubishi","2014",2);
		System.out.println(vehiculoDeportivo.mostrarDatos());
		

	}

}
