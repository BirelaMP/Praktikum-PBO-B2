/* Nama File  : Main.java
 * Deskripsi  : berisi program utama
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 11 Maret 2026
 */ 

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){
        PerguruanTinggi pt = new PerguruanTinggi("UNIVERSITAS DIPONEGORO");
        Fakultas fs = new Fakultas("Fakultas Sains dan Matematika");
        pt.tambahFakultas(fs);

        // Dosen Tetap
        DosenTetap d1 = new DosenTetap(
                "9545647548",
                "Andi",
                LocalDate.of(1990,5,5),
                LocalDate.of(2015,1,1),
                5000000,
                fs,
                "78647324"
        );

        // Dosen Tamu
        DosenTamu d2 = new DosenTamu(
                "123456789",
                "Budi",
                LocalDate.of(1985,3,10),
                LocalDate.of(2022,1,1),
                4000000,
                fs,
                "99887766",
                LocalDate.of(2026,12,31)
        );

        // Tendik
        Tendik t1 = new Tendik(
                "111222333",
                "Siti",
                LocalDate.of(1988,7,20),
                LocalDate.of(2018,2,1),
                3500000,
                "Akademik"
        );

        pt.tambahPegawai(d1);
        pt.tambahPegawai(d2);
        pt.tambahPegawai(t1);
        pt.tampilkanPegawai();
    }
}