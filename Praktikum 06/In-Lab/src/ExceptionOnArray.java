/* Nama File  : ExceptionOnArray.java
 * Deskripsi  : Contoh program penggunaan eksepsi
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 25 Maret 2026
 */

public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer[4];

        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }
    }
}

// PS D:\SEMUA TUGAS\Tugas UNCIIP\sem 4\PBO\Praktikum PBO B2\Praktikum 06\In-Lab\src> javac ExceptionOnArray.java
// PS D:\SEMUA TUGAS\Tugas UNCIIP\sem 4\PBO\Praktikum PBO B2\Praktikum 06\In-Lab\src> java ExceptionOnArray
// java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
//         at ExceptionOnArray.main(ExceptionOnArray.java:13)