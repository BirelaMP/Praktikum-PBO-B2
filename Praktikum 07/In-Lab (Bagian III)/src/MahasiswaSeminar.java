/* Nama File  : Mahasiswa.java
 * Deskripsi  : Kelas turunan (subclass) dari Civitasakademika yang merepresentasikan mahasiswa
 *              dengan atribut NIM dan dosen wali, serta implementasi method getNomor(),
 *              method setWali(), dan tampilDataMahasiswa().
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 22 April 2026
 */

public class MahasiswaSeminar extends Civitasakademika {
    private String NIM;
    private Dosen dosenWali;

    public MahasiswaSeminar(String nama, String NIM) {
        super(nama);
        this.NIM = NIM;
    }

    @Override
    public String getNomor() {
        return NIM;
    }

    public void setWali(Dosen d) {
        this.dosenWali = d;
    }

    public void tampilDataMahasiswa() {
        System.out.println(NIM + " | " + nama + " | Wali: " + dosenWali.nama);
    }
}

/* Refleksi: Polimorfisme memungkinkan satu tipe referensi digunakan untuk berbagai objek yang berbeda.
Dalam kasus seminar, objek bertipe Civitasakademika dapat mereferensikan objek Dosen maupun Mahasiswa. 
Method yang sama seperti getNomor() akan menghasilkan output berbeda tergantung jenis objeknya. 
Dengan demikian, polimorfisme membuat program lebih fleksibel, efisien, dan mudah dikembangkan 
karena tidak perlu membuat kode terpisah untuk setiap jenis objek.*/
