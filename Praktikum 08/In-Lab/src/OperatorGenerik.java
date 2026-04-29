/* Nama File  : OperatorGenerik.java
 * Deskripsi  : Kelas yang berisi operasi generik seperti prosedur Tukar
 *              untuk menukar nilai dua objek dan fungsi Bobot2 untuk
 *              menghitung total bobot dua objek Kucing.
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : 29 April 2026
 */

class OperatorGenerik {

    public static <T> void Tukar(Wrapper<T> a, Wrapper<T> b) {
        T temp = a.value;
        a.value = b.value;
        b.value = temp;
    }

    public static <T extends Kucing> double Bobot2(T a, T b) {
        return a.getBobot() + b.getBobot();
    }
}