/* Nama File  : IResize.java
 * Deskripsi  : interface untuk resize objek
 * Pembuat    : Birela Miadeta Purita/24060124120002
 * Tanggal    : Rabu, 18 Maret 2026
 */

public interface IResize {

    // membesar 10%
    public void zoomIn();

    // mengecil 10%
    public void zoomOut();

    // resize sesuai persen
    public void zoom(int percent);
}