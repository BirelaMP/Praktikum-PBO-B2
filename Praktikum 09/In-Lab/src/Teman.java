/* Nama File  : Teman.java
 * Deskripsi  : Kelas koleksi nama teman
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : 06 Mei 2026
 */

import java.util.ArrayList;

class Teman {

    private int nbelm;
    private ArrayList<String> Lnama;

    /* KONSTRUKTOR */
    public Teman() {
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    public int getNbelm() {
        return nbelm;
    }

    public String getNama(int indeks) {
        return Lnama.get(indeks);
    }

    public void setNama(int indeks, String nama) {
        Lnama.set(indeks, nama);
    }

    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm++;
    }

    public void delNama(String nama) {
        Lnama.remove(nama);
        nbelm--;
    }

    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    public void gantiNama(String nama, String namaBaru) {
        int i = Lnama.indexOf(nama);

        if (i != -1) {
            Lnama.set(i, namaBaru);
        }
    }

    public int countNama(String nama) {
        int count = 0;

        for (String n : Lnama) {
            if (n.equals(nama)) {
                count++;
            }
        }

        return count;
    }

    public void showTeman() {
        for (String nama : Lnama) {
            System.out.println(nama);
        }
    }
}