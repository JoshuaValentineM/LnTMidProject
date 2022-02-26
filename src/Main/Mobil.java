package Main;

public class Mobil extends Kendaraan {

	String jenistipeKendaraan;
	int entSys;
	
	public Mobil(String tipeKendaraan, String brand, String nama, String license, int topSpeed, int gasCapacity,
			int wheel, String jenistipeKendaraan, int entSys) {
		super(tipeKendaraan, brand, nama, license, topSpeed, gasCapacity, wheel);
		this.jenistipeKendaraan = jenistipeKendaraan;
		this.entSys = entSys;
	}

}
