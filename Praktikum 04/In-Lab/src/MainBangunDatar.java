/* Nama File  : MainBangunDatar.java
 * Deskripsi  : berisi program utama dalam class BangunDatar
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 11 Maret 2026
 */

public class MainBangunDatar {
    public static void main(String[] args) {
        Persegi p = new Persegi(10, "Kuning", "Solid");
        Lingkaran l = new Lingkaran(14, "Hijau", "Dotted");
        
        System.out.println("=== INFO PERSEGI ===");
        p.printInfo();
        
        System.out.println("\n=== INFO LINGKARAN ===");
        l.printInfo();

        System.out.println("\n=== STATIK COUNTER ===");
        BangunDatar.printCounterBangunDatar();
    }
}