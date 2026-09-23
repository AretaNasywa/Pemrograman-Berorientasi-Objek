/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author acer
 */

import java.util.ArrayList;
import java.util.List;

public class KeranjangBelanja {
    private List<Produk> listProduk;

    public KeranjangBelanja() {
        listProduk = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        listProduk.add(produk);
        System.out.println("Berhasil menambahkan " + produk.getNama() + " ke keranjang.");
    }

    public double hitungTotalHargaSetelahDiskon() {
        double total = 0;
        for (Produk produk : listProduk) {
            total += produk.getHargaSetelahDiskon();
        }
        return total;
    }

    public void tampilkanRincian() {
        System.out.println("\n--- RINCIAN KERANJANG BELANJA ---");
        for (Produk produk : listProduk) {
            System.out.println("- " + produk.getNama() + 
                               " | Harga Asli: Rp " + produk.getHarga() + 
                               " | Diskon: Rp " + produk.hitungDiskon() + 
                               " | Total: Rp " + produk.getHargaSetelahDiskon());
        }
        System.out.println("---------------------------------");
        System.out.println("TOTAL BAYAR: Rp " + hitungTotalHargaSetelahDiskon());
    }
}
