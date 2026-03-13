/* Nama File  : DosenTetap.java
 * Deskripsi  : berisi atribut dan method dalam class DosenTamu
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 11 Maret 2026
 */

import java.time.LocalDate;

public class DosenTetap extends Dosen{

    private String nidn;

    // static 
    public static final int BUP = 65;

    public DosenTetap(String nip, String nama, LocalDate tanggalLahir,
                      LocalDate tmt, double gajiPokok,
                      Fakultas fakultas, String nidn){

        super(nip,nama,tanggalLahir,tmt,gajiPokok,fakultas);
        this.nidn = nidn;
    }

    // overriding 
    @Override
    public double hitungTunjangan(){

        // 2% × masa kerja × gaji pokok
        return 0.02 * hitungMasaKerja() * gajiPokok;
    }

    public LocalDate hitungTanggalPensiun(){

        // usia pensiun = umur + BUP
        return tanggalLahir.plusYears(BUP).plusMonths(1).withDayOfMonth(1);
    }

    @Override
    public void printInfo(){

        super.printInfo();

        System.out.println("NIDN : " + nidn);
        System.out.println("Jabatan : Dosen Tetap");
        System.out.println("Fakultas : " + fakultas.getNamaFakultas());
        System.out.println("Tanggal Pensiun : " + hitungTanggalPensiun());
        System.out.println("Tunjangan : Rp " + hitungTunjangan());
        System.out.println("----------------------------------");
    }
}