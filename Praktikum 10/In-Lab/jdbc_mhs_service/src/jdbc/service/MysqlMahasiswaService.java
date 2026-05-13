// ==========================
// MysqlMahasiswaService.java
// package : jdbc.service
// ==========================

package jdbc.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtilities;

public class MysqlMahasiswaService {

    Connection koneksi = null;

    // constructor
    public MysqlMahasiswaService() {
        koneksi = MysqlUtilities.getConnection();
    }

    // membuat object mahasiswa
    public Mahasiswa makeMhsObject() {
        return new Mahasiswa();
    }

    // insert data
    public void add(Mahasiswa mhs) {

        String sql =
            "INSERT INTO mahasiswa(id,nama) VALUES (?,?)";

        try {

            PreparedStatement ps =
                koneksi.prepareStatement(sql);

            ps.setInt(1, mhs.getId());
            ps.setString(2, mhs.getNama());

            ps.executeUpdate();

            System.out.println("Berhasil insert");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // update data
    public void update(Mahasiswa mhs) {

        String sql =
            "UPDATE mahasiswa SET nama=? WHERE id=?";

        try {

            PreparedStatement ps =
                koneksi.prepareStatement(sql);

            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());

            ps.executeUpdate();

            System.out.println("Berhasil update");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // delete data
    public void delete(int id) {

        String sql =
            "DELETE FROM mahasiswa WHERE id=?";

        try {

            PreparedStatement ps =
                koneksi.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Berhasil delete");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // get by id
    public Mahasiswa getById(int id) {

        Mahasiswa mhs = null;

        String sql =
            "SELECT * FROM mahasiswa WHERE id=?";

        try {

            PreparedStatement ps =
                koneksi.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                mhs = new Mahasiswa(
                    rs.getInt("id"),
                    rs.getString("nama")
                );
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return mhs;
    }

    // get all
    public List<Mahasiswa> getAll() {

        List<Mahasiswa> listMhs =
            new ArrayList<>();

        String sql =
            "SELECT * FROM mahasiswa";

        try {

            Statement s =
                koneksi.createStatement();

            ResultSet rs =
                s.executeQuery(sql);

            while (rs.next()) {

                Mahasiswa mhs =
                    new Mahasiswa(
                        rs.getInt("id"),
                        rs.getString("nama")
                    );

                listMhs.add(mhs);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return listMhs;
    }
}