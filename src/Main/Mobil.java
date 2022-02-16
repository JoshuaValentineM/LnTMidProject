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
	

	
	
//	public void display(int i) {
//		System.out.printf("|-----|---------------|---------------|\n");
//		System.out.printf("|No   |Type           |Name           |\n");
//		System.out.printf("|%4d|%14s|%14s|\n", i, this.tipeKendaraan, this.nama);
//	}

}
