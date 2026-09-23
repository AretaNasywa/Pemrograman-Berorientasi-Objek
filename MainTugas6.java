/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas6;

/**
 *
 * @author acer
 */
public class MainTugas6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Objek Keranjang
        KeranjangBelanja keranjang = new KeranjangBelanja();

        // Objek Produk (Polimorfisme)
        Produk buku1 = new Buku("Buku Pemrograman Java", 100000);
        Produk laptop = new Elektronik("Laptop Gaming", 10000000);
        Produk kaos = new Pakaian("Kaos Polos", 50000);

        // Menambahkan produk ke keranjang
        keranjang.tambahProduk(buku1);
        keranjang.tambahProduk(laptop);
        keranjang.tambahProduk(kaos);

        // Menampilkan hasil rincian transaksi
        keranjang.tampilkanRincian();
    }
    }

