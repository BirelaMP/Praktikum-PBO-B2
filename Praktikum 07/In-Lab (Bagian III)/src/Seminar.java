/* Nama File  : Seminar.java
 * Deskripsi  : Kelas yang merepresentasikan kegiatan seminar dengan atribut array peserta
 *              bertipe Civitasakademika dan jumlah peserta. Kelas ini menyediakan method
 *              untuk registrasi peserta, menghitung jumlah peserta, menampilkan daftar peserta,
 *              serta menghitung jumlah mahasiswa menggunakan konsep polimorfisme.
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 22 April 2026
 */

public class Seminar {
    private Civitasakademika[] pesertas;
    private int banyakPeserta;

    public Seminar() {
        pesertas = new Civitasakademika[100];
        banyakPeserta = 0;
    }

    // d. registrasi
    public void registrasi(Civitasakademika c) {
        if (banyakPeserta < 100) {
            pesertas[banyakPeserta] = c;
            banyakPeserta++;
        } else {
            System.out.println("Peserta penuh!");
        }
    }

    // c. countPeserta
    public int countPeserta() {
        return banyakPeserta;
    }

    // g. tampilPeserta
    public void tampilPeserta() {
        System.out.println("===== DAFTAR PESERTA =====");
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println(pesertas[i].getNomor() + " | " + pesertas[i].nama);
        }
    }

    // h. countMahasiswa
    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof MahasiswaSeminar) {
                count++;
            }
        }
        return count;
    }
}
