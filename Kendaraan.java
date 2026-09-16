/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas5;

/**
 *
 * @author acer
 */
public class Kendaraan {
      String nama;
    int kecepatan;
    
    public void tampilkanInfo() {
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }
}

// Kelas Turunan Mobil (berdiri sendiri di luar kelas Kendaraan)
class Mobil extends Kendaraan {
    int jumlahPintu;
    int jumlahRoda;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
} // <--- Kurung kurawal penutup kelas Mobil harus di sini

// Kelas Turunan SepedaMotor (berdiri sendiri di luar kelas Mobil)
class SepedaMotor extends Kendaraan {
    String jenisMesin;
    int jumlahRoda;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}

