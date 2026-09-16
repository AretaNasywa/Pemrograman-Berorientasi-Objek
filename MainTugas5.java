/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas5;

/**
 *
 * @author acer
 */
public class MainTugas5 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        System.out.println("=== TUGAS 1: HIERARKI KENDARAAN ===");
        
        Mobil mobil = new Mobil();
        mobil.nama = "Toyota Fortuner";
        mobil.kecepatan = 180;
        mobil.jumlahRoda = 4;
        mobil.jumlahPintu = 5;
        mobil.tampilkanInfo();
        
        System.out.println("-----------------------------------");
        
        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Yamaha R15";
        motor.kecepatan = 135;
        motor.jumlahRoda = 2;
        motor.jenisMesin = "4-tak";
        motor.tampilkanInfo();

        System.out.println("\n=== TUGAS 2: PEWARISAN & OVERRIDING HEWAN ===");
        
        Kucing kucing = new Kucing();
        kucing.nama = "Momo";
        kucing.jenis = "Mamalia";
        kucing.warnaBulu = "Oranye";
        kucing.tampilkanInfo();
        
        System.out.println("-----------------------------------");
        
        Anjing anjing = new Anjing();
        anjing.nama = "Milo";
        anjing.jenis = "Mamalia";
        anjing.ras = "Golden Retriever";
        anjing.tampilkanInfo();
    }
}