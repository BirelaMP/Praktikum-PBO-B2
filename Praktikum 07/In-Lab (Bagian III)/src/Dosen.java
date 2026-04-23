/* Nama File  : Dosen.java
 * Deskripsi  : Kelas turunan (subclass) dari Civitasakademika yang merepresentasikan dosen
 *              dengan atribut NIP serta implementasi method getNomor().
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 22 April 2026
 */

public class Dosen extends Civitasakademika {
    private String NIP;

    public Dosen(String nama, String NIP) {
        super(nama);
        this.NIP = NIP;
    }

    @Override
    public String getNomor() {
        return NIP;
    }
}
