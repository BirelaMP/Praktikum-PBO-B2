/* Nama File  : Burung.java
 * Deskripsi  : Kelas turunan (subclass) dari Anabul yang merepresentasikan burung,
 *              serta mengoverride method gerak dan bersuara sesuai karakteristik burung.
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : 22 April 2026
 */

public class Burung extends Anabul {

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " terbang");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: cuit cuit");
    }
}