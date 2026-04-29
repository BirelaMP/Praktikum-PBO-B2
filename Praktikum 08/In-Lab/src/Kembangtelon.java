/* Nama File  : Kembangtelon.java
 * Deskripsi  : Kelas turunan dari Kucing yang merepresentasikan kucing
 *              jenis Kembangtelon dengan karakteristik gerak tertentu.
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : 29 April 2026
 */

class Kembangtelon extends Kucing {
    public Kembangtelon(double bobot) {
        super(bobot);
    }

    @Override
    public void gerak() {
        System.out.println("Kembangtelon lincah");
    }
}