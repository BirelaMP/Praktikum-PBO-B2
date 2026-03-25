/* Nama File  : Asersi2.java
 * Deskripsi  : Program untuk demo asersi,yang akan menolak input jari-jari lingkaran yang bernilai nol
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 25 Maret 2026
 * Pertanyaan1: Secara konsep, ada yang kurang tepat! Ya (jawaban ada di bawah)
 */

//class Lingkaran
class Lingkaran{
    private double jariJari;
    
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2{
    public static void main(String[] args){
        double jariJari = 0;
        if(jariJari <= 0){
            System.out.println("Error: jari jari tidak boleh nol atau negatif");
            return;
        }
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = "
                           +kelilingLingkaran);
    }
}

//salah karena menggunakan assersi untuk validasi input sehingga program tidak aman, jadi kalau program dijalankan tanpa -enableassertions, nilai negatif tetap diproses, sehingga ganti menggunakan if
// public class Asersi2{
//     public static void main(String[] args){
//         double jariJari = 0;
//         assert(jariJari>0):"jari jari tidak boleh nol!!!";
//         Lingkaran l = new Lingkaran(jariJari);
//         double kelilingLingkaran = l.hitungKeliling();
//         System.out.println("keliling lingkaran = "
//                            +kelilingLingkaran);
//     }
// }


// PS D:\SEMUA TUGAS\Tugas UNCIIP\sem 4\PBO\Praktikum PBO B2\Praktikum 06\In-Lab\src> javac Asersi2.java            
// PS D:\SEMUA TUGAS\Tugas UNCIIP\sem 4\PBO\Praktikum PBO B2\Praktikum 06\In-Lab\src> java Asersi2                  
// Error: jari jari tidak boleh nol atau negatif
// PS D:\SEMUA TUGAS\Tugas UNCIIP\sem 4\PBO\Praktikum PBO B2\Praktikum 06\In-Lab\src> java –enableassertions Asersi2
// Error: Could not find or load main class ?enableassertions
// Caused by: java.lang.ClassNotFoundException: ?enableassertions