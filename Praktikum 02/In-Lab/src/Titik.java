/* Nama File  : Titik.java
 * Deskripsi  : berisi atribut dan method dalam class Titik
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 25 Februari 2026
 */

public class Titik {

    /*************** ATRIBUT ***************/
    double absis;
    double ordinat;

    /*************** METHOD ***************/

    // Konstruktor default (0,0)
    public Titik() {
        this.absis = 0;
        this.ordinat = 0;
    }

    // Konstruktor dengan parameter
    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
    }

    // Getter
    public double getAbsis() {
        return this.absis;
    }

    public double getOrdinat() {
        return this.ordinat;
    }

    // Setter
    public void setAbsis(double x) {
        this.absis = x;
    }

    public void setOrdinat(double y) {
        this.ordinat = y;
    }

    // Geser titik
    public void geser(double x, double y) {
        this.absis += x;
        this.ordinat += y;
    }

    // Menentukan kuadran
    public int getKuadran() {
        if (this.absis > 0 && this.ordinat > 0) {
            return 1;
        } else if (this.absis < 0 && this.ordinat > 0) {
            return 2;
        } else if (this.absis < 0 && this.ordinat < 0) {
            return 3;
        } else if (this.absis > 0 && this.ordinat < 0) {
            return 4;
        } else {
            return 0; // jika berada di sumbu
        }
    }

    // Jarak ke titik pusat (0,0)
    public double getJarakPusat() {
        return Math.sqrt(Math.pow(this.absis, 2) + Math.pow(this.ordinat, 2));
    }

    // Jarak antara titik ini dengan titik T lain
    public double getJarak(Titik T) {
        return Math.sqrt(
                Math.pow(this.absis - T.getAbsis(), 2) +
                Math.pow(this.ordinat - T.getOrdinat(), 2)
        );
    }

    // Refleksi 
    public void refleksiX() {
        this.ordinat = this.ordinat * -1;
    }

    public void refleksiY() {
        this.absis = this.absis * -1;
    }

    // Mendapatkan objek Titik baru hasil refleksi
    public Titik getRefleksiX() {
        return new Titik(this.absis, this.ordinat * -1);
    }

    public Titik getRefleksiY() {
        return new Titik(this.absis * -1, this.ordinat);
    }

    // Mencetak koordinat titik
    public void printTitik() {
        System.out.println("Titik (" + this.absis + ", " + this.ordinat + ")");
    }

} 