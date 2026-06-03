/* Nama File  : LambdaList.java
 * Deskripsi  : Implementasi lambda pada collection List
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : 3 Juni 2026
 */

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {

        ArrayList<String> mahasiswaList =
            new ArrayList<>();

        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        mahasiswaList.forEach(
            (nama) -> System.out.println(nama)
        );
    }
}