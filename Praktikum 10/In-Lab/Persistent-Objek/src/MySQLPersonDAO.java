import java.sql.*;

/**
 * Nama : Birela Miadeta Purita
 * NIM : 24060124120002
 * File : MySQLPersonDAO.java
 * Deskripsi : implementasi PersonDAO untuk MySQL
 */

public class MySQLPersonDAO implements PersonDAO{
    public void savePerson(Person person) throws Exception{
        String name = person.getName();

        //membuat koneksi, nama db,user,password menyesuaikan
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost/pbo","root","mazmur378"
        );

        //kerjakan mysql query
        String query = "INSERT INTO person(name) VALUES ('"+name+"')";
        System.out.println(query);

        Statement s = con.createStatement();
        s.executeUpdate(query);

        //tutup koneksi database
        con.close();
    }
}