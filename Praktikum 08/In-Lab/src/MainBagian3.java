/* Nama File  : MainBagian3.java
 * Deskripsi  : Kelas utama untuk menguji implementasi larik generik
 *              menggunakan kelas Data beserta operasinya.
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : 29 April 2026
 */

public class MainBagian3 {
    public static void main(String[] args) {

        /* KAMUS */
        Data<Anabul> dataHewan;
        Anggora kucing1;
        Kembangtelon kucing2;

        /* ALGORITMA */
        dataHewan = new Data<>();

        kucing1 = new Anggora(3.2);
        kucing2 = new Kembangtelon(2.7);

        // isi data
        dataHewan.setIsi(1, kucing1);
        dataHewan.setIsi(2, kucing2);

        System.out.println("Isi data ke-1:");
        dataHewan.getIsi(1).gerak();
        System.out.println();

        System.out.println("Isi data ke-2:");
        dataHewan.getIsi(2).gerak();
        System.out.println();

        System.out.println("Jumlah elemen = " + dataHewan.getSize());
    }
}