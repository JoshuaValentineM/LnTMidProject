package Main;

public class Motorcycle extends Kendaraan {

	String jenistipeKendaraan;
	int helm;
	
	public Motorcycle(String tipeKendaraan, String brand, String nama, String license, int topSpeed, int gasCapacity,
			int wheel, String jenistipeKendaraan, int helm) {
		super(tipeKendaraan, brand, nama, license, topSpeed, gasCapacity, wheel);
		this.jenistipeKendaraan = jenistipeKendaraan;
		this.helm = helm;
	}
	
}
