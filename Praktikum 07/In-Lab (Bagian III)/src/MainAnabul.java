/* Nama File  : MainAnabul.java
 * Deskripsi  : Program utama untuk mensimulasikan polimorfisme pada kelas Anabul
 *              menggunakan ArrayList dan perulangan untuk memanggil method gerak
 *              dan bersuara pada berbagai jenis hewan.
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : 22 April 2026
 */

import java.util.ArrayList;

public class MainAnabul {
    public static void main(String[] args) {

        // Membuat objek hewan
        Anabul hewan1 = new Kucing("Centang");
        Anabul hewan2 = new Anjing("Blacky");
        Anabul hewan3 = new Burung("Lili");


        ArrayList<Anabul> daftarHewan = new ArrayList<>();
        daftarHewan.add(hewan1);
        daftarHewan.add(hewan2);
        daftarHewan.add(hewan3);

        System.out.println("===== SIMULASI HEWAN PELIHARAAN =====");

        for (Anabul h : daftarHewan) {
            System.out.println("Nama: " + h.nama);
            h.bersuara(); 
            h.gerak();    
            System.out.println("---------------------------");
        }
    }
}

/* Refleksi: Polimorfisme adalah konsep dalam pemrograman berorientasi objek 
yang memungkinkan satu nama method digunakan oleh berbagai objek dengan perilaku yang berbeda.
Pada program ini, polimorfisme terjadi ketika objek bertipe induk (Anabul) dapat mereferensikan 
objek turunan seperti Kucing, Anjing, dan Burung. Meskipun method yang dipanggil sama (gerak dan bersuara),
hasil yang ditampilkan berbeda sesuai dengan jenis objeknya.Hal ini menunjukkan bahwa Java menggunakan 
dynamic binding (runtime polymorphism), di mana pemanggilan method ditentukan saat program dijalankan. 
Dengan adanya polimorfisme, program menjadi lebih fleksibel, mudah dikembangkan, 
dan mengurangi duplikasi kode. */