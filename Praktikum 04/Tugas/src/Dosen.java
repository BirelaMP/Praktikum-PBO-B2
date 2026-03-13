/* Nama File  : Dosen.java
 * Deskripsi  : berisi atribut dan method dalam class Dosen
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 11 Maret 2026
 */

import java.time.LocalDate;

public class Dosen extends Pegawai{

    // asosiasi
    protected Fakultas fakultas;

    public Dosen(String nip, String nama, LocalDate tanggalLahir,
                 LocalDate tmt, double gajiPokok, Fakultas fakultas){

        // keyword super 
        super(nip,nama,tanggalLahir,tmt,gajiPokok);
        this.fakultas = fakultas;
    }

    public Fakultas getFakultas(){
        return fakultas;
    }
}