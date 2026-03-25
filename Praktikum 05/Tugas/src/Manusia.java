/* Nama File  : Manusia.java
 * Deskripsi  : berisi atribut dan method dalam class Manusia (abstract)
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 18 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public abstract class Manusia {
    protected String nama;
    protected LocalDate tglMulaiKerja;
    protected String alamat;
    protected double pendapatan;

    protected static int counterMns = 0;

    public Manusia(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    public abstract double hitungPajak();
    public abstract int hitungMasaKerja();

    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }

    protected int hitungTahunKerja() {
        return Period.between(tglMulaiKerja, LocalDate.now()).getYears();
    }
}