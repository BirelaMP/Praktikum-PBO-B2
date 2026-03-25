/* Nama File  : PNS.java
 * Deskripsi  : berisi atribut dan method dalam class PNS yang merupakan turunan dari Manusia 
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 18 Maret 2026
 */

import java.time.LocalDate;

public class PNS extends Manusia {
    private String nip;
    private static int counterPNS = 0;

    private final int A = 2; //24060124120002

    public PNS(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    @Override
    public double hitungPajak() {
        return 0.10 * pendapatan;
    }

    @Override
    public int hitungMasaKerja() {
        return hitungTahunKerja() + A;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
        System.out.println("----------------------");
    }
}