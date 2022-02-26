package Main;

import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Main {

	public Main() {
		
		int lanjut = 1;
		
		ArrayList<Mobil> kendaraans = new ArrayList<Mobil>();
		ArrayList<Motorcycle> kendaraans1 = new ArrayList<Motorcycle>();
//		ArrayList<Kendaraan> kendaraans = new ArrayList<Kendaraan>();
//		ArrayList<Motorcycle> mobils2 = new ArrayList<Motorcycle>();
//		ArrayList<Mobil> mobils1 = new ArrayList<Mobil>();
		
//		int nomor = 0;
		
		do {
			System.out.println("Selamat datang di main menu! (1: Input | 2: View Car | 3: View Motorcyle | 4: Exit)");
			Scanner input = new Scanner(System.in);
			
			int menuPilihanUser = input.nextInt();
//			System.out.println("Menu pilihan: " +menuPilihanUser);
			
			String tipeKendaraanPilihan, brand, nama, lisence, jenisTipeKendaraan;
			int topSpeed, gasCapacity, wheel, entSys, helm, pilihanUntukView;
			
			
			if (menuPilihanUser == 1) {

				System.out.println("Input type [Car | Motorcycle]:");
				tipeKendaraanPilihan = input.next();
	
				if ((tipeKendaraanPilihan.equals("Car") || (tipeKendaraanPilihan.equals("car")))) {
					
					System.out.println("Input brand [>=5]: ");
					brand = input.next();
					System.out.println("Input name [>=5]: ");
					nama = input.next();
					System.out.println("Input lisence: ");
					lisence = input.next();
					lisence += input.nextLine();
					System.out.println("Input top speed [100 <= topSpeed <= 250]: ");
					topSpeed = input.nextInt();
					System.out.println("Input gas capacity [30 <= gasCap <= 60]]: ");
					gasCapacity = input.nextInt();
					System.out.println("Input wheel [4 <= wheel <= 6]]: ");
					wheel = input.nextInt();
					System.out.println("Input type [SUV | Supercar | Minivan]: ");
					jenisTipeKendaraan = input.next();
					System.out.println("Input entertainment system [>= 1]]: ");
					entSys = input.nextInt();
					Mobil mobil1 = new Mobil(tipeKendaraanPilihan, brand, nama, lisence, topSpeed, gasCapacity, wheel, jenisTipeKendaraan, entSys);
					
					kendaraans.add(mobil1);

				}
				
				else if ((tipeKendaraanPilihan.equals("Motorcycle") || (tipeKendaraanPilihan.equals("motorcycle")))) {
					System.out.println("Input brand [>=5]: ");
					brand = input.next();
					System.out.println("Input name [>=5]: ");
					nama = input.next();
					System.out.println("Input lisence: ");
					lisence = input.next();
					lisence += input.nextLine();
					System.out.println("Input top speed [100 <= topSpeed <= 250]: ");
					topSpeed = input.nextInt();
					System.out.println("Input gas capacity [30 <= gasCap <= 60]]: ");
					gasCapacity = input.nextInt();
					System.out.println("Input wheel [2 <= wheel <= 3]]: ");
					wheel = input.nextInt();
					System.out.println("Input type [Automatic | Manual]: ");
					jenisTipeKendaraan = input.next();
					System.out.println("Input helm [>= 1]]: ");
					helm = input.nextInt();
					
					Motorcycle motor1 = new Motorcycle(tipeKendaraanPilihan, brand, nama, lisence, topSpeed, gasCapacity, wheel, jenisTipeKendaraan, helm);
					
					kendaraans1.add(motor1);
				}
				
			}
			
			else if (menuPilihanUser == 2) {
				lanjut = 0;
//				Mobil mobil1 = new Mobil(tipeKendaraanPilihan, brand, nama, lisence, topSpeed, gasCapacity, wheel, jenisTipeKendaraan, entSys);
//				
//				int i = 1;
//				mobil1.display(i);
				System.out.printf("|-----|---------------|---------------|\n");
				System.out.printf("|No   |Type           |Name           |\n");

				for (int i = 0; i < kendaraans.size(); i++) {
					System.out.printf("|-----|---------------|---------------|\n");
					System.out.printf("|%-5d|%-15s|%-15s|\n", i+1, kendaraans.get(i).tipeKendaraan, kendaraans.get(i).nama);
				}
				
//				for (int i = 0; i < kendaraans.size(); i++) {
//					System.out.printf("|-----|---------------|---------------|\n");
//					System.out.printf("|%-5d|%-15s|%-15s|\n", i+1, kendaraans.get(i).tipeKendaraan, kendaraans.get(i).nama);
//				}
				
				System.out.printf("|-----|---------------|---------------|\n");
				
				System.out.println("Pick a vehicle number to test drive [Enter '0' to exit]:");
				pilihanUntukView = input.nextInt();
				
				if (pilihanUntukView == 0) {
					lanjut = 1;
				}
				else {
					System.out.println("");
//					
					System.out.printf("Brand: %s\n", kendaraans.get(pilihanUntukView-1).brand);
					System.out.printf("Name: %s\n", kendaraans.get(pilihanUntukView-1).nama);
					System.out.printf("License Plate: %s\n", kendaraans.get(pilihanUntukView-1).license);
					System.out.printf("Type: %s\n", kendaraans.get(pilihanUntukView-1).jenistipeKendaraan);
					System.out.printf("Gas Capacity: %d\n", kendaraans.get(pilihanUntukView-1).gasCapacity);
					System.out.printf("Top Speed: %d\n", kendaraans.get(pilihanUntukView-1).topSpeed);
					System.out.printf("Wheel(s): %d\n", kendaraans.get(pilihanUntukView-1).wheel);
					System.out.printf("Entertainment System: %d\n", kendaraans.get(pilihanUntukView-1).entSys);
					System.out.printf("\n");
					
					if (kendaraans.get(pilihanUntukView-1).jenistipeKendaraan.equals("Supercar")) {
						System.out.printf("Boosting!\n");
					}
					
					else if (kendaraans.get(pilihanUntukView-1).jenistipeKendaraan.equals("supercar")) {
						System.out.printf("Boosting!\n");
					}
					else {
						System.out.printf("Turning on entertainment system...\n");
					}
					
					lanjut = 1;
				}
				
				
			}
			
			else if (menuPilihanUser == 3) {
				lanjut = 0;
				
				System.out.printf("|-----|---------------|---------------|\n");
				System.out.printf("|No   |Type           |Name           |\n");

				for (int i = 0; i < kendaraans1.size(); i++) {
					System.out.printf("|-----|---------------|---------------|\n");
					System.out.printf("|%-5d|%-15s|%-15s|\n", i+1, kendaraans1.get(i).tipeKendaraan, kendaraans1.get(i).nama);
				}
				
				
				System.out.printf("|-----|---------------|---------------|\n");
				
				System.out.println("Pick a vehicle number to test drive [Enter '0' to exit]:");
				pilihanUntukView = input.nextInt();
				
				if (pilihanUntukView == 0) {
					lanjut = 1;
				}
				else {
					System.out.println("");
					
					System.out.printf("Brand: %s\n", kendaraans1.get(pilihanUntukView-1).brand);
					System.out.printf("Name: %s\n", kendaraans1.get(pilihanUntukView-1).nama);
					System.out.printf("License Plate: %s\n", kendaraans1.get(pilihanUntukView-1).license);
					System.out.printf("Type: %s\n", kendaraans1.get(pilihanUntukView-1).jenistipeKendaraan);
					System.out.printf("Gas Capacity: %d\n", kendaraans1.get(pilihanUntukView-1).gasCapacity);
					System.out.printf("Top Speed: %d\n", kendaraans1.get(pilihanUntukView-1).topSpeed);
					System.out.printf("Wheel(s): %d\n", kendaraans1.get(pilihanUntukView-1).wheel);
					System.out.printf("Helm(s): %d\n", kendaraans1.get(pilihanUntukView-1).helm);
					System.out.printf("\n");
					System.out.printf("%s is standing!\n", kendaraans1.get(pilihanUntukView-1).nama);
					
					lanjut = 1;
					
					System.out.printf("Masukkan harga helm:\n");
					int hargaHelm;
					hargaHelm = input.nextInt();
					System.out.printf("Price: %d\n", hargaHelm);
				}
				
			}
			
			else if (menuPilihanUser == 4) {
				lanjut = 0;
				System.out.println("Terima kasih telah menggunakan program!");
			}
			
			
		}while (lanjut == 1);
		
	} 
		

	public static void main(String[] args) {
		new Main();

	}

}
