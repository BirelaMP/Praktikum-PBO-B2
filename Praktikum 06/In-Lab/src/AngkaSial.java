/* Nama File  : AngkaSial.java
 * Deskripsi  : Program penggunaan exception buatan sendiri
 * Pengenalan klausa 'throw' dan 'throws'
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 25 Maret 2026
 * Pertanyaan1: Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java diatas dieksekusi? Tidak, karena saat cobaAngka(13) dipanggil langsung throw program lompat ke catch dan baris setelahnya didalam try tidak dijalankan
 * Pertanyaan2: Apakah baris 21 pada AngkaSial.java diatas dieksekusi? Ya, karena setelah catch program tetap lanjut jadi "Program Selesai" tetap tampil
 */

public class AngkaSial{

    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13) {
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}


// PS D:\SEMUA TUGAS\Tugas UNCIIP\sem 4\PBO\Praktikum PBO B2\Praktikum 06\In-Lab\src> javac AngkaSialException.java 
// PS D:\SEMUA TUGAS\Tugas UNCIIP\sem 4\PBO\Praktikum PBO B2\Praktikum 06\In-Lab\src> javac AngkaSial.java          
// PS D:\SEMUA TUGAS\Tugas UNCIIP\sem 4\PBO\Praktikum PBO B2\Praktikum 06\In-Lab\src> java AngkaSial
// 10 bukan angka sial
// Jangan memasukkan angka 13 karena angka sial!!!
// hati-hati memasukkan angka!!!