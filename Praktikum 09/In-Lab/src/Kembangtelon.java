/* Nama File  : Kembangtelon.java
 * Deskripsi  : Kelas turunan dari Kucing yang merepresentasikan kucing
 *              jenis Kembangtelon.
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : 06 Mei 2026
 */

class Kembangtelon extends Kucing {

    public Kembangtelon(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public void gerak() {
        System.out.println(getNama() + " lincah");
    }
}