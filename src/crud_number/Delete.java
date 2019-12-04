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
public class Delete {

    Statement stmt = null;

    public void connection() throws SQLException {
        Timestamp startconnection = new Timestamp(System.currentTimeMillis());
        System.out.println("Current Time Stamp: " + startconnection);
        for (int i = 1; i < 201; i++) {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/number", "root", "");
                stmt = (Statement) con.createStatement();
                stmt.executeUpdate(String.format("DELETE FROM count WHERE id='%s'", i));

                con.close();

            } catch (ClassNotFoundException | SQLException e) {
                System.out.println(e);
            }
        }
        Timestamp stopconnection = new Timestamp(System.currentTimeMillis());
        System.out.println("Current Time Stamp: " + stopconnection);

    }

    public void noconnection() {
        Timestamp startnoconnection = new Timestamp(System.currentTimeMillis());
        System.out.println("Current Time Stamp: " + startnoconnection);
        for (int i = 1; i < 201; i++) {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/number", "root", "");
                stmt = (Statement) con.createStatement();
                stmt.executeUpdate(String.format("DELETE FROM count WHERE id='%s'", i));

                con.close();

            } catch (ClassNotFoundException | SQLException e) {
                System.out.println(e);
            }
        }
        Timestamp stopnoconnection = new Timestamp(System.currentTimeMillis());
        System.out.println("Current Time Stamp: " + stopnoconnection);

    }
}
