/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author acer
 */
public class Database_Connect {
     
    
    
    public static Connection getConnection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ooad");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database_Connect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Database_Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
    public static void main(String[] args) {
        System.out.println(getConnection());
    }
    
    public static void closeAll(Connection con, PreparedStatement pstmt, ResultSet rs){
        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Database_Connect.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (pstmt != null) {
            try {
                pstmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(Database_Connect.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(Database_Connect.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
