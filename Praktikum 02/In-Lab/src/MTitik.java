/* Nama File  : MTitik.java
 * Deskripsi  : Program utama untuk menguji class Titik
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 25 Februari 2026
 */

public class MTitik {
    public static void main(String[] args) {

        // Membuat titik T1 dengan konstruktor default
        Titik T1 = new Titik();
        System.out.println("Titik T1 awal:");
        T1.printTitik();

        // Set nilai T1
        T1.setAbsis(3);
        T1.setOrdinat(5);
        System.out.println("Setelah diubah:");
        T1.printTitik();

        // Uji getKuadran
        System.out.println("Kuadran T1: " + T1.getKuadran());

        // Uji jarak ke pusat
        System.out.println("Jarak T1 ke pusat: " + T1.getJarakPusat());

        // Geser titik
        T1.geser(2, -3);
        System.out.println("Setelah digeser:");
        T1.printTitik();

        // Membuat titik T2 dengan konstruktor parameter
        Titik T2 = new Titik(-2, 5);
        System.out.println("\nTitik T2:");
        T2.printTitik();

        // Uji jarak antar titik
        System.out.println("Jarak T1 ke T2: " + T1.getJarak(T2));

        // Uji refleksi (mengubah objek)
        T1.refleksiX();
        System.out.println("\nT1 setelah refleksi sumbu X:");
        T1.printTitik();

        // Uji refleksi yang menghasilkan objek baru
        Titik T3 = T2.getRefleksiY();
        System.out.println("\nT3 (hasil refleksi Y dari T2):");
        T3.printTitik();

    }
}