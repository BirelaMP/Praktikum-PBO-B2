/* Nama File  : Data.java
 * Deskripsi  : Kelas generik yang merepresentasikan larik dengan kapasitas
 *              maksimum 100 elemen beserta operasi pengisian, pengambilan,
 *              dan penghitungan jumlah elemen.
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : 29 April 2026
 */

class Data<T> {
    private T[] ruang;
    private int banyak;

    public Data() {
        ruang = (T[]) new Object[100];
        banyak = 0;
    }

    public void setIsi(int posisi, T nilai) {
        if (posisi >= 1 && posisi <= 100) {
            ruang[posisi - 1] = nilai;
            if (posisi > banyak) {
                banyak = posisi;
            }
        }
    }

    public T getIsi(int posisi) {
        if (posisi >= 1 && posisi <= banyak) {
            return ruang[posisi - 1];
        }
        return null;
    }

    public int getSize() {
        return banyak;
    }
}