/* Nama File  : MGaris.java
 * Deskripsi  : Program utama untuk menguji class Titik
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 25 Februari 2026
 */

public class MGaris {

    public static void main(String[] args) {

        // Membuat beberapa titik
        Titik t1 = new Titik(0, 0);
        Titik t2 = new Titik(4, 4);
        Titik t3 = new Titik(0, 4);
        Titik t4 = new Titik(4, 0);

        // Membuat garis
        Garis g1 = new Garis(t1, t2);
        Garis g2 = new Garis(t3, t4);
    
        // Print garis
        System.out.println("=== Garis 1 ===");
        g1.printGaris();

        System.out.println("Panjang : " + g1.getPanjang());
        System.out.println("Gradien : " + g1.getGradien());

        Titik tengah = g1.getTitikTengah();
        System.out.println("Titik Tengah : (" +
                tengah.getAbsis() + "," +
                tengah.getOrdinat() + ")");

        System.out.println("\n=== Garis 2 ===");
        g2.printGaris();

        System.out.println("\nApakah g1 sejajar g2? " + g1.isSejajar(g2));
        System.out.println("Apakah g1 tegak lurus g2? " + g1.isTegakLurus(g2));

        System.out.println("\nJumlah objek Garis: " + Garis.getCounterGaris());
    }
}