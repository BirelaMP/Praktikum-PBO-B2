/* Nama File  : Mahasiswa.java
 * Deskripsi  : Program untuk mengilustrasikan konsep polimorfisme ad hoc (overloading)
 *              melalui pembuatan beberapa metode dengan nama yang sama (setProgramStudi)
 *              tetapi memiliki parameter yang berbeda, serta penggunaan berbagai konstruktor.
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 22 April 2026
 */

class Mahasiswa {
    String NIM;
    String nama;
    String programStudi;

    // Konstruktor default
    Mahasiswa() {
        this.NIM = "-999";
        this.nama = "n/a";
        this.programStudi = "n/a";
    }

    // Konstruktor parameter
    Mahasiswa(String NIM, String nama, String programStudi) {
        this.NIM = NIM;
        this.nama = nama;
        this.programStudi = programStudi;
    }

    // Konstruktor cloning
    Mahasiswa(Mahasiswa m) {
        this.NIM = m.NIM;
        this.nama = m.nama;
        this.programStudi = m.programStudi;
    }

    // Overloading method
    void setProgramStudi() {
        this.programStudi = "Kosong";
    }

    void setProgramStudi(String ps) {
        this.programStudi = ps;
    }

    void setProgramStudi(Mahasiswa m) {
        this.programStudi = m.programStudi;
    }

    void tampil() {
        System.out.println(NIM + " | " + nama + " | " + programStudi);
    }
}