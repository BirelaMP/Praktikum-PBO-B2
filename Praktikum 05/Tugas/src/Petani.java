/* Nama File  : Petani.java
 * Deskripsi  : berisi atribut dan method dalam class Petani yang merupakan turunan dari Manusia 
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 18 Maret 2026
 */

import java.time.LocalDate;

public class Petani extends Manusia {
    private String asalKota;
    private static int counterPetani = 0;

    private final int C = 0; //24060124120002

    public Petani(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String asalKota) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.asalKota = asalKota;
        counterPetani++;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public int hitungMasaKerja() {
        return hitungTahunKerja() + C;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + asalKota);
        System.out.println("----------------------");
    }
}