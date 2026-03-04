/* Nama File  : Mahasiswa.java
 * Deskripsi  : berisi atribut dan method dalam class Dosen
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 4 Maret 2026
 */

import java.util.ArrayList;
public class Mahasiswa {

    /************** ATRIBUT **************/
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /************** METHOD **************/

    // konstruktor tanpa parameter
    public Mahasiswa() {
        this.listMatKul = new ArrayList<>();
    }

    // konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
    }

    // setter dosen wali
    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    // setter kendaraan
    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    // tambah mata kuliah
    public void addMatKul(MataKuliah newMatKul) {
        listMatKul.add(newMatKul);
    }

    // jumlah mata kuliah
    public int getJumlahMatKul() {
        return listMatKul.size();
    }

    // jumlah SKS
    public int getJumlahSKS() {
        int total = 0;
        for (int i = 0; i < listMatKul.size(); i++) {
            total += listMatKul.get(i).getSks();
        }
        return total;
    }

    // print detail
    public void printDetailMhs() {
        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("\nDosen Wali:");
        System.out.println(dosenWali.getNama());
        System.out.println("\nDaftar Mata Kuliah:");
        for (int i = 0; i < listMatKul.size(); i++) {
            System.out.println(listMatKul.get(i).getNama());
        }
        System.out.println("\nKendaraan:");
        if (kendaraan != null) {
            System.out.println(kendaraan.getNoPlat() + " - " + kendaraan.getJenis());
        } else {
            System.out.println("Tidak memiliki kendaraan");
        }
    }
}