/* Nama File  : MainAnabul.java
 * Deskripsi  : Program utama untuk mensimulasikan polimorfisme pada kelas Anabul
 *              menggunakan ArrayList dan perulangan untuk memanggil method gerak
 *              dan bersuara pada berbagai jenis hewan.
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : 22 April 2026
 */

import java.util.ArrayList;

public class MainAnabul {
    public static void main(String[] args) {

        // Membuat objek hewan
        Anabul hewan1 = new Kucing("Centang");
        Anabul hewan2 = new Anjing("Blacky");
        Anabul hewan3 = new Burung("Lili");


        ArrayList<Anabul> daftarHewan = new ArrayList<>();
        daftarHewan.add(hewan1);
        daftarHewan.add(hewan2);
        daftarHewan.add(hewan3);

        System.out.println("===== SIMULASI HEWAN PELIHARAAN =====");

        for (Anabul h : daftarHewan) {
            System.out.println("Nama: " + h.nama);
            h.bersuara(); 
            h.gerak();    
            System.out.println("---------------------------");
        }
    }
}