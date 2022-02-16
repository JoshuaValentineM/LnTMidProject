package Main;

import java.util.ArrayList;

public class Kendaraan {
	String tipeKendaraan;
	String brand;
	String nama;
	String license;
	int topSpeed;
	int gasCapacity;
	int wheel;
	
	public Kendaraan(String tipeKendaraan, String brand, String nama, String license, int topSpeed, int gasCapacity,
			int wheel) {
		super();
		this.tipeKendaraan = tipeKendaraan;
		this.brand = brand;
		this.nama = nama;
		this.license = license;
		this.topSpeed = topSpeed;
		this.gasCapacity = gasCapacity;
		this.wheel = wheel;
	}
//	void display() {
//		System.out.printf("nama mobil: %s \nBrand mobil: %s \nWarna Mobil: %s \n", this.nama, this.brand, this.warna);
//	}
//	
	
}
