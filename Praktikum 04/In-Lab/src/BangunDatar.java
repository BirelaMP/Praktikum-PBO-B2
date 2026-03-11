/* Nama File  : BangunDatar.java
 * Deskripsi  : berisi atribut dan method dalam class BangunDatar
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 11 Maret 2026
 */

public class BangunDatar {
    // Bagian 4: menggunakan protected agar bisa diakses langsung oleh subclass 
    protected int jmlSisi; 
    protected String warna;
    protected String border;
    
    // Bagian 3: atribut static untuk menghitung jumlah objek 
    private static int counterBangunDatar = 0;

    public BangunDatar() {
        counterBangunDatar++; // Menambah counter setiap objek dibuat 
    }

    // Bagian 2: konstruktor berparameter menggunakan keyword super nantinya 
    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    // Getter dan Setter 
    public int getJmlSisi() { return jmlSisi; }
    public void setJmlSisi(int jmlSisi) { this.jmlSisi = jmlSisi; }
    public String getWarna() { return warna; }
    public void setWarna(String warna) { this.warna = warna; }
    public String getBorder() { return border; }
    public void setBorder(String border) { this.border = border; }

    // Bagian 3: method static 
    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }

    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
}