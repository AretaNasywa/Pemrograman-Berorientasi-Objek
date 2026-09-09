/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum4;

/**
 *
 * @author acer
 */
public class MainPekerjaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Pekerja pekerja1 = new Pekerja("Budi Santoso", 30, "Software Engineer", 12000000);

        // 2. Menampilkan informasi awal dengan toString()
        System.out.println("=== INFORMASI PEKERJA AWAL ===");
        System.out.println(pekerja1.toString());

        System.out.println("\n-----------------------------------\n");

        pekerja1.setNama("Budi Pratama");

        System.out.println("=== INFORMASI PEKERJA SETELAH UBAH NAMA ===");
        System.out.println(pekerja1.toString());

        System.out.println("\n-----------------------------------\n");

        System.out.println("=== UJI COBA AKSES LANGSUNG ATRIBUT ===");

        System.out.println("Akses pekerjaan langsung: " + pekerja1.pekerjaan);

        System.out.println("Akses usia langsung: " + pekerja1.usia);

 
    }
    }
    

