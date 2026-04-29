/* Nama File  : Kucing.java
 * Deskripsi  : Kelas turunan dari Anabul yang memiliki atribut bobot
 *              dan perilaku gerak khusus untuk kucing.
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : 29 April 2026
 */

class Kucing extends Anabul {
    double bobot;

    public Kucing(double bobot) {
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    @Override
    public void gerak() {
        System.out.println("Kucing berjalan");
    }
}