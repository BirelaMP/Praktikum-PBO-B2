/* Nama File  : Datum.java
 * Deskripsi  : Kelas generik yang digunakan untuk menyimpan satu objek
 *              bertipe bebas dengan operasi setIsi dan getIsi.
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : 29 April 2026
 */

class Datum<T> {
    private T isi;

    public T getIsi() {
        return isi;
    }

    public void setIsi(T isibaru) {
        this.isi = isibaru;
    }
}