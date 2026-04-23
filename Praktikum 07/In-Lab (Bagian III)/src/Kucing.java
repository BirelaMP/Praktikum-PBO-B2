/* Nama File  : Kucing.java
 * Deskripsi  : Kelas turunan (subclass) dari Anabul yang merepresentasikan kucing,
 *              serta mengoverride method gerak dan bersuara sesuai karakteristik kucing.
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : 22 April 2026
 */

public class Kucing extends Anabul {

    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " melata");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: meong meong");
    }
}