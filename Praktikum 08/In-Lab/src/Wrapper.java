/* Nama File  : Wrapper.java
 * Deskripsi  : Kelas pembungkus (wrapper) generik yang digunakan untuk
 *              memungkinkan pertukaran nilai antar objek dalam prosedur
 *              generik Tukar.
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : 29 April 2026
 */

class Wrapper<T> {
    public T value;

    public Wrapper(T value) {
        this.value = value;
    }
}