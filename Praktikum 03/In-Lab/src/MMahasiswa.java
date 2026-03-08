/* Nama File  : MMahasiswa.java
 * Deskripsi  : program utama untuk menguji class Mahasiswa
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 4 Maret 2026
 */

public class MMahasiswa {
    public static void main(String[] args) {

        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        Mahasiswa M1 = new Mahasiswa("234", "Citra", "Informatika","H1234AB","Motor");
        Dosen D1 = new Dosen("123", "Andi", "informatika");
        M1.setDosenWali(D1);
        M1.addMatKul(PBO);
        M1.addMatKul(MBD);
        M1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatKul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS());
    }
}