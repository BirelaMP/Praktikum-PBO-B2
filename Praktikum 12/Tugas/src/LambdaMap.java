/* Nama File  : LambdaMap.java
 * Deskripsi  : Menampilkan key dan value Map menggunakan
 *              ekspresi lambda
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : 3 Juni 2026
 */

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {

        /* KAMUS */
        Map<String, String> mahasiswa;

        /* ALGORITMA */
        mahasiswa = new HashMap<>();

        mahasiswa.put(
            "24060124120002",
            "Birela Miadeta Purita"
        );

        mahasiswa.put(
            "24060124120010",
            "Diah"
        );

        mahasiswa.put(
            "24060124120020",
            "Hana"
        );

        mahasiswa.put(
            "24060124120030",
            "Lintang"
        );

        mahasiswa.forEach(
            (nim, nama) ->
                System.out.println(
                    "NIM  : " + nim +
                    "\nNama : " + nama +
                    "\n"
                )
        );
    }
}