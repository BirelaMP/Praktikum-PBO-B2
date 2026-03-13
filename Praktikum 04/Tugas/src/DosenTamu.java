/* Nama File  : DosenTamu.java
 * Deskripsi  : berisi atribut dan method dalam class DosenTamu
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 11 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Dosen{

    private String nidk;
    private LocalDate tanggalAkhirKontrak;

    public DosenTamu(String nip, String nama, LocalDate tanggalLahir,
                     LocalDate tmt, double gajiPokok,
                     Fakultas fakultas, String nidk,
                     LocalDate tanggalAkhirKontrak){

        super(nip,nama,tanggalLahir,tmt,gajiPokok,fakultas);

        this.nidk = nidk;
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }

    // overriding
    @Override
    public double hitungTunjangan(){

        // 2.5% × gaji pokok
        return 0.025 * gajiPokok;
    }

    public int hitungSisaKontrak(){

        Period p = Period.between(LocalDate.now(), tanggalAkhirKontrak);
        return p.getMonths();
    }

    @Override
    public void printInfo(){

        super.printInfo();

        System.out.println("NIDK : " + nidk);
        System.out.println("Jabatan : Dosen Tamu");
        System.out.println("Fakultas : " + fakultas.getNamaFakultas());
        System.out.println("Akhir Kontrak : " + tanggalAkhirKontrak);
        System.out.println("Tunjangan : Rp " + hitungTunjangan());
        System.out.println("----------------------------------");
    }
}