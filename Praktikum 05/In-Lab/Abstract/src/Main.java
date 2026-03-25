/* Nama File  : Main.java
 * Deskripsi  : Main program untuk uji BangunDatar
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 18 Maret 2026
 */

public class Main {
    public static void main(String[] args) {

        // BangunDatar B1 = new BangunDatar(); ERROR (abstract class tidak bisa dibuat objek)

        BangunDatar P1 = new Persegi(10, "Merah", "Hitam");
        Persegi P2 = new Persegi(5, "Biru", "Putih");
        BangunDatar L1 = new Lingkaran(14, "Kuning", "Hijau");
        Lingkaran L2 = new Lingkaran(28, "Ungu", "Hitam");

        System.out.println("=== PERSEGI ===");
        P1.printInfo();
        System.out.println("Luas: " + P1.getLuas());
        System.out.println("Keliling: " + P1.getKeliling());
        System.out.println();
        System.out.println("=== LINGKARAN ===");
        L1.printInfo();
        System.out.println("Luas: " + L1.getLuas());
        System.out.println("Keliling: " + L1.getKeliling());

        // TAMBAHAN
        System.out.println();
        System.out.println("Apakah luas P1 dan P2 sama? " + P1.isEqualLuas(P2));
        System.out.println("Apakah keliling L1 dan L2 sama? " + L1.isEqualKeliling(L2));

        // COUNTER
        System.out.println();
        BangunDatar.printCounterBangunDatar();
    }
}