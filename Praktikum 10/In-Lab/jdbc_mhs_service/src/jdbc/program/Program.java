// ==========================
// Program.java
// package : jdbc.program
// ==========================

package jdbc.program;

import java.util.ArrayList;
import java.util.List;

import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

public class Program {

    static MysqlMahasiswaService service =
        new MysqlMahasiswaService();

    public static void displayAll() {

        List<Mahasiswa> listMhs =
            new ArrayList<>();

        listMhs = service.getAll();

        for (Mahasiswa mhs : listMhs) {
            System.out.println(mhs);
        }
    }

    public static void main(String[] args) {

        // insert
        System.out.println("===insert");

        Mahasiswa mhsAdd =
            new Mahasiswa(5, "Haryo");

        service.add(mhsAdd);

        System.out.println(
            "berhasil insert: " +
            mhsAdd
        );

        displayAll();

        // update
        System.out.println("\n===update");

        Mahasiswa mhsUpdate =
            service.getById(5);

        System.out.println(
            "akan diupdate data lama: " +
            mhsUpdate
        );

        mhsUpdate.setNama("Dinaya");

        System.out.println(
            "dengan data baru: " +
            mhsUpdate
        );

        service.update(mhsUpdate);

        displayAll();

        // delete
        System.out.println("\n===delete");

        System.out.println(
            "akan di delete: " +
            service.getById(5)
        );

        service.delete(5);

        displayAll();
    }
}