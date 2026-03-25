/* Nama File  : Persegi.java
 * Deskripsi  : implementasi class Persegi turunan BangunDatar
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 18 Maret 2026
 */

public class Persegi extends Asersi1 implements IResize {
    private double sisi;

    public Persegi() {
        super();
        this.jmlSisi = 4;
    }

    public Persegi(double sisi) {
        super();
        this.jmlSisi = 4;
        this.sisi = sisi;
    }

    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    public double getSisi() { return sisi; }
    public void setSisi(double sisi) { this.sisi = sisi; }

    @Override
    public double getLuas() {
        return sisi * sisi;
    }

    @Override
    public double getKeliling() {
        return 4 * sisi;
    }

    // 🔥 IMPLEMENT INTERFACE
    @Override
    public void zoomIn() {
        sisi = sisi * 1.1;
    }

    @Override
    public void zoomOut() {
        sisi = sisi * 0.9;
    }

    @Override
    public void zoom(int percent) {
        sisi = sisi * percent / 100.0;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }
}