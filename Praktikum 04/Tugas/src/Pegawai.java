/* Nama File  : Pegawai,java
 * Deskripsi  : berisi atribut dan method dalam class Pegawai
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 11 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class Pegawai {

    // protected 
    protected String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    // constructor
    public Pegawai(String nip, String nama, LocalDate tanggalLahir,
                   LocalDate tmt, double gajiPokok){
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public int hitungMasaKerja(){
            LocalDate sekarang = LocalDate.of(2025, 1, 1);
    Period p = Period.between(tmt, sekarang);
    return p.getYears();
}

    // method untuk dioverride
    public double hitungTunjangan(){
        return 0;
    }

    public void printInfo(){
        System.out.println("NIP : " + nip);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + tanggalLahir);
        System.out.println("TMT : " + tmt);
        System.out.println("Gaji Pokok : Rp " + gajiPokok);
    }
}