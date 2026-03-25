/* Nama File  : Asersi1.java
 * Deskripsi  : Program untuk menunjukkan asersi
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 25 Maret 2026
 */

public class Asersi1{
    public static void main(String[] args){
        int x=0;
        if(x>0)
            System.out.println("x bilangan positif");
        else{
            assert (x<0):"ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}


// PS D:\SEMUA TUGAS\Tugas UNCIIP\sem 4\PBO\Praktikum PBO B2\Praktikum 06\In-Lab\src> javac Asersi1.java
// PS D:\SEMUA TUGAS\Tugas UNCIIP\sem 4\PBO\Praktikum PBO B2\Praktikum 06\In-Lab\src> java Asersi1
// x bilangan negatif
// PS D:\SEMUA TUGAS\Tugas UNCIIP\sem 4\PBO\Praktikum PBO B2\Praktikum 06\In-Lab\src> java –enableassertions Asersi1  
// Error: Could not find or load main class ?enableassertions
// Caused by: java.lang.ClassNotFoundException: ?enableassertions