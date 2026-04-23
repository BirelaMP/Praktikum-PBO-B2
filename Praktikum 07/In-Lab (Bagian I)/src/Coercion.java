/* Nama File  : Coercion.java
 * Deskripsi  : Program untuk mengilustrasikan polimorfisme ad hoc (coercion)
 *              melalui konversi tipe data seperti integer, double, char, dan String.
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 22 April 2026
 */

public class Coercion {
    public static void main(String[] args) {

        // a. Integer ke berbagai tipe
        int nilai = 65;
        System.out.println("Integer: " + nilai);
        System.out.println("Char: " + (char) nilai);
        System.out.println("Double: " + (double) nilai);

        // b. Double kembali ke integer
        double real = (double) nilai;
        int kembali = (int) real;
        System.out.println("Kembali ke integer: " + kembali);

        // c. String ke Integer
        String X = "1234";
        String Y = "5678";
        String S = X + Y; // konkatenasi
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("S (gabung): " + S);
        System.out.println("Z (jumlah): " + Z);

        // d. String ke Double
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("R (gabung): " + R);
        System.out.println("D (jumlah): " + D);

        // e. S ke Integer
        int A = Integer.parseInt(S);
        System.out.println("A: " + A);

        // f. A ke String
        String T = String.valueOf(A);
        System.out.println("T: " + T);
    }
}