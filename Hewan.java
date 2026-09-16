/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas5;

/**
 *
 * @author acer
 */
public class Hewan {
    String nama;
    String jenis;

    public void bersuara() {
        System.out.println("Hewan ini mengeluarkan suara.");
    }

    public void tampilkanInfo() {
        System.out.println("Nama Hewan : " + nama);
        System.out.println("Jenis      : " + jenis);
    }
}

class Kucing extends Hewan {
    String warnaBulu;

    @Override
    public void bersuara() {
        System.out.println("Suara      : Meow... Meow...");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Warna Bulu : " + warnaBulu);
        bersuara();
    }
}

class Anjing extends Hewan {
    String ras;

    @Override
    public void bersuara() {
        System.out.println("Suara      : Guk... Guk!");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Ras        : " + ras);
        bersuara();
    }
}