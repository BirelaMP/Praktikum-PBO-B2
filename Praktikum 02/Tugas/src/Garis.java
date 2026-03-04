/* Nama File  : Garis.java
 * Deskripsi  : berisi atribut dan method dalam class Titik
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 25 Februari 2026
 */

public class Garis {

    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    // Konstruktor default
    public Garis() {
        this.titikAwal = new Titik(0, 0);
        this.titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    // Konstruktor dengan parameter
    public Garis(Titik tAwal, Titik tAkhir) {
        this.titikAwal = tAwal;
        this.titikAkhir = tAkhir;
        counterGaris++;
    }

    // Getter & Setter
    public Titik getTitikAwal() {
        return titikAwal;
    }

    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public void setTitikAwal(Titik tAwal) {
        this.titikAwal = tAwal;
    }

    public void setTitikAkhir(Titik tAkhir) {
        this.titikAkhir = tAkhir;
    }

    public static int getCounterGaris() {
        return counterGaris;
    }

    // Panjang garis
    public double getPanjang() {
        return titikAwal.getJarak(titikAkhir);
    }

    // Gradien garis
    public double getGradien() {
        double x1 = titikAwal.getAbsis();
        double y1 = titikAwal.getOrdinat();
        double x2 = titikAkhir.getAbsis();
        double y2 = titikAkhir.getOrdinat();

        if (x2 - x1 == 0) {
            throw new ArithmeticException("Gradien tak terdefinisi (garis vertikal)");
        }

        return (y2 - y1) / (x2 - x1);
    }

    // Titik tengah
    public Titik getTitikTengah() {
        double tengahX = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double tengahY = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;

        return new Titik(tengahX, tengahY);
    }

    // Cek sejajar
    public boolean isSejajar(Garis g) {
        return this.getGradien() == g.getGradien();
    }

    // Cek tegak lurus
    public boolean isTegakLurus(Garis g) {
        return this.getGradien() * g.getGradien() == -1;
    }

    // Print garis
    public void printGaris() {
        System.out.println("Titik Awal : (" +
                titikAwal.getAbsis() + "," +
                titikAwal.getOrdinat() + ")");

        System.out.println("Titik Akhir : (" +
                titikAkhir.getAbsis() + "," +
                titikAkhir.getOrdinat() + ")");
    }
}