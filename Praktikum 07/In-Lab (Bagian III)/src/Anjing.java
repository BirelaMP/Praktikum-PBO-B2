/* Nama File  : Anjing.java
 * Deskripsi  : Kelas turunan (subclass) dari Anabul yang merepresentasikan anjing,
 *              serta mengoverride method gerak dan bersuara sesuai karakteristik anjing.
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : 22 April 2026
 */

public class Anjing extends Anabul {

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " melata");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: guk-guk");
    }
}