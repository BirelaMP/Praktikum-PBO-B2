/* Nama File  : Anggora.java
 * Deskripsi  : Kelas turunan dari Kucing yang merepresentasikan kucing
 *              jenis Anggora.
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : 06 Mei 2026
 */

class Anggora extends Kucing {

    public Anggora(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public void gerak() {
        System.out.println(getNama() + " berjalan anggun");
    }
}