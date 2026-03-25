/* Nama File  : Main.java
 * Deskripsi  : Main program untuk uji BangunDatar
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 18 Maret 2026
 */

public class Main {
    public static void main(String[] args) {

        Asersi1 P1 = new Persegi(10);
        Asersi1 L1 = new Lingkaran(7);

        System.out.println("=== SEBELUM RESIZE ===");
        System.out.println("Luas Persegi: " + P1.getLuas());
        System.out.println("Luas Lingkaran: " + L1.getLuas());

        IResize pResize = (IResize) P1;
        IResize lResize = (IResize) L1;

        // zoom in
        pResize.zoomIn();
        lResize.zoomIn();

        System.out.println("\n=== SETELAH ZOOM IN ===");
        System.out.println("Luas Persegi: " + P1.getLuas());
        System.out.println("Luas Lingkaran: " + L1.getLuas());

        // zoom out
        pResize.zoomOut();
        lResize.zoomOut();

        System.out.println("\n=== SETELAH ZOOM OUT ===");
        System.out.println("Luas Persegi: " + P1.getLuas());
        System.out.println("Luas Lingkaran: " + L1.getLuas());

        // zoom custom
        pResize.zoom(200); // jadi 2x
        lResize.zoom(50);  // jadi setengah

        System.out.println("\n=== SETELAH ZOOM CUSTOM ===");
        System.out.println("Luas Persegi: " + P1.getLuas());
        System.out.println("Luas Lingkaran: " + L1.getLuas());
    }
}