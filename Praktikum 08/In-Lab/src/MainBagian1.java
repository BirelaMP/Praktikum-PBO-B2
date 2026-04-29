/* Nama File  : MainBagian1.java
 * Deskripsi  : Kelas utama untuk menguji implementasi generik pada class
 *              menggunakan kelas Datum dan keluarga Anabul.
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : 29 April 2026
 */

public class MainBagian1 {
    public static void main(String[] args) {

        /* KAMUS */
        Anggora kucing1;
        Kembangtelon kucing2;
        Datum<Anabul> anu;

        /* ALGORITMA */
        kucing1 = new Anggora(3.5);
        kucing2 = new Kembangtelon(2.8);
        anu = new Datum<>();

        System.out.println("Kucing1:");
        anu.setIsi(kucing1);
        anu.getIsi().gerak();

        System.out.println();

        System.out.println("Kucing2:");
        anu.setIsi(kucing2);
        anu.getIsi().gerak();
    }
}