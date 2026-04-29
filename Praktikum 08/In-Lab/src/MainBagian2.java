/* Nama File  : MainBagian2.java
 * Deskripsi  : Kelas utama untuk menguji operasi generik seperti Tukar
 *              dan Bobot2 pada berbagai tipe data termasuk Anabul.
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : 29 April 2026
 */

public class MainBagian2 {
    public static void main(String[] args) {

        /* KAMUS */
        Wrapper<Integer> a;
        Wrapper<Integer> b;

        Wrapper<String> s1;
        Wrapper<String> s2;

        Wrapper<Anabul> x;
        Wrapper<Anabul> y;

        Anggora k1;
        Kembangtelon k2;
        double total;

        /* ALGORITMA */
        a = new Wrapper<>(3);
        b = new Wrapper<>(6);

        OperatorGenerik.Tukar(a, b);
        System.out.println("Tukar integer: " + a.value + " " + b.value);
        System.out.println();

        s1 = new Wrapper<>("A");
        s2 = new Wrapper<>("B");

        OperatorGenerik.Tukar(s1, s2);
        System.out.println("Tukar string: " + s1.value + " " + s2.value);
        System.out.println();

        x = new Wrapper<>(new Anggora(4.0));
        y = new Wrapper<>(new Kembangtelon(2.0));
        OperatorGenerik.Tukar(x, y);
        
        System.out.println("Setelah tukar objek:");
        x.value.gerak();
        y.value.gerak();

        k1 = new Anggora(3.0);
        k2 = new Kembangtelon(2.5);
        total = OperatorGenerik.Bobot2(k1, k2);
        System.out.println();

        System.out.println("Total bobot: " + total);
    }
}