/* Nama File  : MainTeman.java
 * Deskripsi  : Aplikasi kelas Teman
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : 8 Mei 2026
 */

class MainTeman {
    public static void main(String[] args) {

        /* KAMUS */
        Teman teman;

        /* ALGORITMA */
        teman = new Teman();

        // menambahkan nama teman
        teman.addNama("Birela");
        teman.addNama("Diah");
        teman.addNama("Hana");
        teman.addNama("Lintang");

        System.out.println("Daftar Teman:");
        teman.showTeman();

        System.out.println();

        System.out.println("Jumlah elemen = " + teman.getNbelm());

        System.out.println();

        System.out.println("Nama pada indeks ke-1:");
        System.out.println(teman.getNama(1));

        System.out.println();

        System.out.println("Apakah Hana member?");
        System.out.println(teman.isMember("Hana"));

        System.out.println();

        // mengganti nama
        teman.gantiNama("Lintang", "Nadya");

        System.out.println("Setelah ganti nama:");
        teman.showTeman();

        System.out.println();

        System.out.println("Jumlah nama Hana = " + teman.countNama("Hana"));

        System.out.println();

        // menghapus nama
        teman.delNama("Diah");

        System.out.println("Setelah hapus Diah:");
        teman.showTeman();
    }
}