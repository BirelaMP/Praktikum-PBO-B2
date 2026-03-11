/* Nama File  : Persegi.java
 * Deskripsi  : berisi atribut dan method dalam class Persegi
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 11 Maret 2026
 */

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi() {
        super(); // Memanggil konstruktor kosong superclass
        this.jmlSisi = 4; // Bagian 4: bisa akses langsung karena protected 
    }

    public Persegi(double sisi, String warna, String border) {
        // Bagian 2: memanggil konstruktor superclass 
        super(4, warna, border); 
        this.sisi = sisi;
    }

    // Implementasi method sesuai Gambar 1 [cite: 34-38, 133-145]
    public double getSisi() { return sisi; }
    public void setSisi(double sisi) { this.sisi = sisi; }
    public double getLuas() { return sisi * sisi; }
    public double getKeliling() { return 4 * sisi; }
    public double getDiagonal() { return Math.sqrt(2) * sisi; }

    @Override
    public void printInfo() {
        super.printInfo(); // Bagian 3: memanggil printInfo milik BangunDatar 
        System.out.println("Sisi: " + sisi);
        System.out.println("Luas: " + getLuas());
    }
}