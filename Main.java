/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // Deklarasi referensi kelas induk memegang objek dari kelas turunan (Polimorfisme)
        Produk produk1 = new Elektronik("Laptop", 15000000, 2);
        Pegawai pegawai1 = new PegawaiTetap("Budi", 5000000, 1000000);

        Produk produk2 = new Makanan("snack", 15000, "2023-12-30");
        Pegawai pegawai2 = new PegawaiKontrak("Andi", 3000000, 12);

        // 1. Output Produk
        produk1.tampilkanInfo();
        System.out.println();

        // 2. Output Pegawai
        pegawai1.tampilkanInfo();
        System.out.println();

        // 3. Output Polimorfisme (Memanggil metode dari objek turunan lainnya)
        produk2.tampilkanInfo();
        pegawai2.tampilkanInfo();
    }
}