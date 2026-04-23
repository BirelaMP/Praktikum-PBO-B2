/* Nama File  : Anabul.java
 * Deskripsi  : Kelas induk (superclass) yang merepresentasikan hewan peliharaan
 *              dengan atribut nama dan method gerak serta bersuara.
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : 22 April 2026
 */

public class Anabul {
    protected String nama;

    // Konstruktor
    public Anabul(String nama) {
        this.nama = nama;
    }

    // Method default (akan dioverride)
    public void gerak() {
        System.out.println(nama + " bergerak");
    }

    public void bersuara() {
        System.out.println(nama + " bersuara");
    }
}