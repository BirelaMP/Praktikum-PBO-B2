/* Nama File  : Lingkaran.java
 * Deskripsi  : implementasi class Lingkaran turunan BangunDatar
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 18 Maret 2026
 */

public class Lingkaran extends Asersi1 implements IResize {
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

    // 🔥 IMPLEMENT INTERFACE
    @Override
    public void zoomIn() {
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut() {
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent) {
        jari = jari * percent / 100.0;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
    }
}