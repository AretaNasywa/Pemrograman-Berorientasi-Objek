/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum_pbo.praktikumpbo_3;

/**
 *
 * @author acer
 */
public class MainMobil {
    public static void main(String[] args) {
   
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2021, "Hitam");
        Mobil mobil2 = new Mobil("Honda", "Civic", 2023, "Merah");

        System.out.println("=== Menyalakan Mesin ===");
        mobil1.startEngine();
        mobil2.startEngine();
        System.out.println();

        System.out.println("=== Informasi Mobil ===");
        mobil1.displayInfo();
        mobil2.displayInfo();

        System.out.println("=== Mengubah Warna Mobil 1 ===");
        System.out.println("Mengubah warna Toyota Avanza menjadi Putih...");
        mobil1.setWarna("Putih");
        
        System.out.println("\n=== Informasi Mobil 1 Setelah Perubahan Warna ===");
        mobil1.displayInfo();
    }
    
}
