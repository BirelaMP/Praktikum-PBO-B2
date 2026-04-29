/* Nama File  : Anggora.java
 * Deskripsi  : Kelas turunan dari Kucing yang merepresentasikan kucing
 *              jenis Anggora dengan perilaku gerak spesifik.
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : 29 April 2026
 */

class Anggora extends Kucing {
    public Anggora(double bobot) {
        super(bobot);
    }

    @Override
    public void gerak() {
        System.out.println("Anggora berjalan anggun");
    }
}