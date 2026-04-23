/* Nama File  : MainSeminar.java
 * Deskripsi  : Program utama untuk menguji dan mensimulasikan penggunaan polimorfisme
 *              pada kelas Civitasakademika, Dosen, dan Mahasiswa dalam sistem seminar,
 *              termasuk proses registrasi, perhitungan peserta, dan penampilan data.
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 22 April 2026
 */

public class MainSeminar {
    public static void main(String[] args) {

        Seminar seminar = new Seminar();

        // e. 2 dosen dan 5 mahasiswa
        Dosen d1 = new Dosen("Pak Ayusta", "D001");
        Dosen d2 = new Dosen("Bu Diana", "D002");

        MahasiswaSeminar m1 = new MahasiswaSeminar("Vio", "M001");
        MahasiswaSeminar m2 = new MahasiswaSeminar("Dinda", "M002");
        MahasiswaSeminar m3 = new MahasiswaSeminar("Najma", "M003");
        MahasiswaSeminar m4 = new MahasiswaSeminar("Zahra", "M004");
        MahasiswaSeminar m5 = new MahasiswaSeminar("Wulan", "M005");

        // i. set dosen wali
        m1.setWali(d1);
        m2.setWali(d1);
        m3.setWali(d2);
        m4.setWali(d2);
        m5.setWali(d1);

        // f. registrasi
        seminar.registrasi(d1);
        seminar.registrasi(d2);
        seminar.registrasi(m1);
        seminar.registrasi(m2);
        seminar.registrasi(m3);
        seminar.registrasi(m4);
        seminar.registrasi(m5);

        // c
        System.out.println("Total peserta: " + seminar.countPeserta());

        // h
        System.out.println("Jumlah mahasiswa: " + seminar.countMahasiswa());

        // g
        seminar.tampilPeserta();

        // j
        System.out.println("===== DATA MAHASISWA =====");
        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
        m3.tampilDataMahasiswa();
        m4.tampilDataMahasiswa();
        m5.tampilDataMahasiswa();
    }
}

/* Refleksi: Polimorfisme memungkinkan satu tipe referensi digunakan untuk berbagai objek yang berbeda.
Dalam kasus seminar, objek bertipe Civitasakademika dapat mereferensikan objek Dosen maupun Mahasiswa. 
Method yang sama seperti getNomor() akan menghasilkan output berbeda tergantung jenis objeknya. 
Dengan demikian, polimorfisme membuat program lebih fleksibel, efisien, dan mudah dikembangkan 
karena tidak perlu membuat kode terpisah untuk setiap jenis objek.*/
