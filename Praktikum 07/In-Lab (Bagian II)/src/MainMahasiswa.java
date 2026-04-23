/* Nama File  : MainMahasiswa.java
 * Deskripsi  : Program utama untuk menguji polimorfisme ad hoc (overloading)
 *              pada kelas Mahasiswa dengan berbagai variasi method dan konstruktor.
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 22 April 2026
 */

public class MainMahasiswa {
    public static void main(String[] args) {

        Mahasiswa m1 = new Mahasiswa();
        Mahasiswa m2 = new Mahasiswa("24060124120002", "Birela", "Informatika");
        Mahasiswa m3 = new Mahasiswa("24060124120034", "Diah", "Gizi");

        m1.setProgramStudi();
        m2.setProgramStudi("Sistem Informasi");
        m3.setProgramStudi(m2);
        
        System.out.println("=== HASIL ===");
        m1.tampil();
        m2.tampil();
        m3.tampil();
    }
}