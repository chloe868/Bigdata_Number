/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_number;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

/**
 *
 * @author herrerach_sd2082
 */
public class Insert {

    public void noconnection() {
        Timestamp startconnection = new Timestamp(System.currentTimeMillis());
        System.out.println("Current Time Stamp: " + startconnection);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/number", "root", "");
            Statement stmt = con.createStatement();
            for (int i = 1; i < 1001; i++) {
                String sql = "INSERT INTO `countNoConnect`(`id`, `col1`, `col2`, `col3`, `col4`, `col5`) VALUES (" + i + "," + i + "," + (i + 1) + "," + (i + 2) + "," + (i + 3) + "," + (i + 4) + ")";
                stmt.executeUpdate(sql);
            }
            con.close();
            Timestamp StopConnection = new Timestamp(System.currentTimeMillis());
            System.out.println("Current Time Stamp: " + StopConnection);

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }

    public void connection() {
        Timestamp startnoconnection = new Timestamp(System.currentTimeMillis());
        System.out.println("Current Time Stamp: " + startnoconnection);
        for (int i = 1; i < 201; i++) {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/number", "root", "");
                Statement stmt = con.createStatement();
                String sql = "INSERT INTO `count`(`id`, `col1`, `col2`, `col3`, `col4`, `col5`) VALUES (" + i + "," + i + "," + (i + 1) + "," + (i + 2) + "," + (i + 3) + "," + (i + 4) + ")";
                stmt.executeUpdate(sql);
                con.close();

            } catch (ClassNotFoundException | SQLException e) {
                System.out.println(e);
            }
        }
        Timestamp StopnoConnection = new Timestamp(System.currentTimeMillis());
        System.out.println("Current Time Stamp: " + StopnoConnection);

    }
}
