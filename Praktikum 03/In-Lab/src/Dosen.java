/* Nama File  : Dosen.java
 * Deskripsi  : berisi atribut dan method dalam class Dosen
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 4 Maret 2026
 */

public class Dosen {
    private String nip;
    private String nama;
    private String prodi;

    public Dosen() {}

    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }
}