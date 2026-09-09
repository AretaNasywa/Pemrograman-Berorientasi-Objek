/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author acer
 */
public class Pekerja extends Manusia {
    // Atribut tambahan
    private double gaji;

    // Constructor
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan); // Memanggil constructor dari class Manusia
        this.gaji = gaji;
    }

    // Getter dan Setter untuk atribut gaji
    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // Override metode toString()
    @Override
    public String toString() {
        return "Nama      : " + getNama() + "\n" +
               "Usia      : " + usia + " tahun\n" +
               "Pekerjaan : " + pekerjaan + "\n" +
               "Gaji      : Rp" + gaji;
    }
    
}
