/* Nama File  : Lingkaran.java
 * Deskripsi  : implementasi class Lingkaran turunan BangunDatar
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 18 Maret 2026
 */

public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran() {
        super();
        this.jmlSisi = 1;
    }

    public Lingkaran(double jari) {
        super();
        this.jmlSisi = 1;
        this.jari = jari;
    }

    public Lingkaran(double diameter, String warna, String border) {
        super(1, warna, border);
        this.jari = diameter / 2;
    }

    public double getJari() { return jari; }
    public void setJari(double jari) { this.jari = jari; }

    @Override
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    @Override
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}