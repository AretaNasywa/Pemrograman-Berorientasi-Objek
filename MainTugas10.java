/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPraktikum10;

/**
 *
 * @author LENOVO
 */
public class MainTugas10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Objek Elektronik (Pajak 10%)
        Pembayaran elektronik = new Elektronik();
        double hargaElektronik = 5000000.0;
        double pajakElektronik = elektronik.hitungPajak(hargaElektronik);

        // Objek Makanan (Pajak 5%)
        Pembayaran makanan = new Makanan();
        double hargaMakanan = 50000.0;
        double pajakMakanan = makanan.hitungPajak(hargaMakanan);

        // Output
        System.out.println("=== SISTEM PEMBAYARAN TOKO ===");
        System.out.println("Harga Elektronik      : Rp " + hargaElektronik);
        System.out.println("Pajak Elektronik (10%): Rp " + pajakElektronik);
        System.out.println("---------------------------------");
        System.out.println("Harga Makanan         : Rp " + hargaMakanan);
        System.out.println("Pajak Makanan (5%)    : Rp " + pajakMakanan);
    }
}