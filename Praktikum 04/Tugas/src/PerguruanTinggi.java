/* Nama File  : PerguruanTinngi.java
 * Deskripsi  : berisi atribut dan method dalam class PerguruanTinggi
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 11 Maret 2026
 */

import java.util.ArrayList;
import java.util.List;

public class PerguruanTinggi {

    private String namaPT;

    private List<Pegawai> daftarPegawai;
    private List<Fakultas> daftarFakultas;

    public PerguruanTinggi(String namaPT){

        this.namaPT = namaPT;

        daftarPegawai = new ArrayList<>();
        daftarFakultas = new ArrayList<>();
    }

    // menambah pegawai ke list
    public void tambahPegawai(Pegawai p){
        daftarPegawai.add(p);
    }

    public void tambahFakultas(Fakultas f){
        daftarFakultas.add(f);
    }

    public void tampilkanPegawai(){

        System.out.println("===== DAFTAR PEGAWAI " + namaPT + " =====");

        for(Pegawai p : daftarPegawai){
            p.printInfo();
        }
    }
}