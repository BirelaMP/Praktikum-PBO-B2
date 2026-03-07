/* Nama File  : Kendaraan.java
 * Deskripsi  : berisi atribut dan method dalam class Kendaraan
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 4 Maret 2026
 */

public class Kendaraan {
    private String noPlat; 
    private String jenis; 

    public Kendaraan() {}

    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public String getNoPlat() {
        return noPlat;
    }

    public String getJenis() {
        return jenis;
    }
}