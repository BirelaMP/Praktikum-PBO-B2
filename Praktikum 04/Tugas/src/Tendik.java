/* Nama File  : Tendik.java
 * Deskripsi  : berisi atribut dan method dalam class Tendik
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 11 Maret 2026
 */

import java.time.LocalDate;

public class Tendik extends Pegawai{

    private String bidang;

    // static attribute
    public static final int BUP = 55;

    public Tendik(String nip, String nama, LocalDate tanggalLahir,
                  LocalDate tmt, double gajiPokok, String bidang){

        super(nip,nama,tanggalLahir,tmt,gajiPokok);

        this.bidang = bidang;
    }

    // overriding
    @Override
    public double hitungTunjangan(){

        // 1% × masa kerja × gaji pokok
        return 0.01 * hitungMasaKerja() * gajiPokok;
    }

    public LocalDate hitungTanggalPensiun(){

        return tanggalLahir.plusYears(BUP).plusMonths(1).withDayOfMonth(1);
    }

    @Override
    public void printInfo(){

        super.printInfo();

        System.out.println("Jabatan : Tendik");
        System.out.println("Bidang : " + bidang);
        System.out.println("Tanggal Pensiun : " + hitungTanggalPensiun());
        System.out.println("Tunjangan : Rp " + hitungTunjangan());
        System.out.println("----------------------------------");
    }
}