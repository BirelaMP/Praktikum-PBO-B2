/* Nama File  : Pengusaha.java
 * Deskripsi  : berisi atribut dan method dalam class Pengusaha yang merupakan turunan dari Manusia 
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 18 Maret 2026
 */

import java.time.LocalDate;

public class Pengusaha extends Manusia {
    private String npwp;
    private static int counterPengusaha = 0;

    private final int B = 0; //24060124120002

    public Pengusaha(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String npwp) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    @Override
    public int hitungMasaKerja() {
        return hitungTahunKerja() + B;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
        System.out.println("----------------------");
    }
}