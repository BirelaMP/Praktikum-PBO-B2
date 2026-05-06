/* Nama File  : Anabul.java
 * Deskripsi  : Kelas induk (superclass) yang merepresentasikan hewan peliharaan
 *              dengan atribut nama dan method gerak.
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : 06 Mei 2026
 */

class Anabul {

    private String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void gerak() {
        System.out.println("Anabul bergerak");
    }
}