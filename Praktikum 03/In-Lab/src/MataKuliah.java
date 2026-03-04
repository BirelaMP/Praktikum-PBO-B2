/* Nama File  : MataKuliah.java
 * Deskripsi  : berisi atribut dan method dalam class MataKuliah
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 4 Maret 2026
 */

public class MataKuliah {
    private String idMatKul;
    private String nama;
    private int sks;

    public MataKuliah() {}

    public MataKuliah(String idMatKul, String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    public String getIdMatKul() {
        return idMatKul;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }
}