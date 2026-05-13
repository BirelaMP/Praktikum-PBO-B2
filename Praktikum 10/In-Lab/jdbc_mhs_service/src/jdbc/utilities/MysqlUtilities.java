// ==========================
// MysqlUtility.java
// package : jdbc.utilities
// ==========================

package jdbc.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlUtilities {

    private static Connection koneksi;

    public static Connection getConnection() {

        if (koneksi == null) {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                // sesuaikan db, username, password
                String url = "jdbc:mysql://localhost:3306/pbo";
                String user = "root";
                String password = "mazmur378";

                koneksi = DriverManager.getConnection(
                    url,
                    user,
                    password
                );

                if (koneksi != null) {
                    System.out.println("Koneksi berhasil");
                }

            } catch (ClassNotFoundException cne) {
                System.out.println(
                    "gagal load driver : " +
                    cne.getMessage()
                );

            } catch (SQLException sqle) {
                System.out.println(
                    "gagal koneksi : " +
                    sqle.getMessage()
                );
            }
        }

        return koneksi;
    }
}