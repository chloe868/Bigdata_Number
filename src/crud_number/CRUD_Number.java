/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_number;

//import java.sql.ResultSet;

import java.sql.SQLException;

/**
 *
 * @author herrerach_sd2082
 */
public class CRUD_Number {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        
        Insert insert = new Insert();
        insert.connection();
        insert.noconnection();
        
        Delete delete = new Delete();
        delete.connection();
        delete.noconnection();
        
        
        

    }

}
