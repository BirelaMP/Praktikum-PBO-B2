/* Nama File  : MainPiaraan.java
 * Deskripsi  : Aplikasi koleksi objek Anabul.
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : 06 Mei 2026
 */

class MainPiaraan {
    public static void main(String[] args) {

        /* KAMUS */
        Piaraan piaraan;
        Anggora kucing1;
        Kembangtelon kucing2;
        Anggora kucing3;

        /* ALGORITMA */
        piaraan = new Piaraan();

        kucing1 = new Anggora("Rocky", 3.5);
        kucing2 = new Kembangtelon("Centang", 2.5);
        kucing3 = new Anggora("Luna", 5.5);

        // tambah anabul ke antrean
        piaraan.enqueueAnabul(kucing1);
        piaraan.enqueueAnabul(kucing2);
        piaraan.enqueueAnabul(kucing3);

        System.out.println("Daftar Anabul:");
        piaraan.showAnabul();

        System.out.println();

        System.out.println("Jumlah elemen = " + piaraan.getNbelm());

        System.out.println();

        System.out.println("Anabul pertama:");
        System.out.println(piaraan.getAnabul().getNama());

        System.out.println();

        System.out.println("Apakah Milo member?");
        System.out.println(piaraan.isMember(kucing1));

        System.out.println();

        System.out.println("Jumlah keluarga kucing = " + piaraan.countKucing());

        System.out.println();

        System.out.println("Total bobot kucing = " + piaraan.bobotKucing());

        System.out.println();

        System.out.println("Jenis Anabul:");
        piaraan.showJenisAnabul();

        System.out.println();

        System.out.println("Dequeue:");
        System.out.println(piaraan.dequeueAnabul().getNama());

        System.out.println();

        System.out.println("Isi antrean sekarang:");
        piaraan.showAnabul();
    }
}