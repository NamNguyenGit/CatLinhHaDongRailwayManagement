/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImplement;
import DAO.UserDAO;
import Database.Database_Connect;
import Entities.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author acer
 */
public class UserDAOImplement implements UserDAO{

    @Override
    public List<User> getlistUser() {
      List<User> listUser = new ArrayList<>();
       
        Connection conn;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
         conn = Database_Connect.getConnection();
        try {
            ps = conn.prepareStatement("select * from user");
            rs = ps.executeQuery();
            while (rs.next()){
                User U1 = new User();
                U1.setId(rs.getInt("ID"));
                U1.setName(rs.getString("Name"));
                U1.setDob(rs.getString("dob"));
                U1.setGender(rs.getString("gender"));
                U1.setPhone(rs.getString("phone"));
                U1.setRole(rs.getInt("Role"));
                U1.setUsername(rs.getString("Username"));
                listUser.add(U1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Database_Connect.closeAll(conn,ps,rs);
        }         
         
         return listUser;
    }

    @Override
    public List<User> getUserbyUserName(String Name) {
       List<User> listUser = new ArrayList<>();

        if (Name.length()==0){
            Name = "%";
        }
        else Name = "%"+Name+"%";

        Connection conn;
        PreparedStatement ps = null;
        ResultSet rs = null;

        conn = Database_Connect.getConnection();
        try {
            ps = conn.prepareStatement("select * from user where name like ?");
            ps.setString(1,Name);
            rs = ps.executeQuery();
            while (rs.next()){
                User d1 = new User();
                d1.setId(rs.getInt("ID"));
                d1.setName(rs.getString("Name"));
                d1.setDob(rs.getString("dob"));
                d1.setGender(rs.getString("gender"));
                d1.setPhone(rs.getString("phone"));
                d1.setRole(rs.getInt("Role"));
                d1.setUsername(rs.getString("Username"));
                listUser.add(d1);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Database_Connect.closeAll(conn,ps,rs);
        }


        return listUser;
    }

    @Override
    public boolean updateUser(User d1) {
        boolean bl = false;


        Connection conn;
        PreparedStatement ps = null;
        ResultSet rs = null;

        conn = Database_Connect.getConnection();
        try {
            ps = conn.prepareStatement("UPDATE user SET role = ?  WHERE id = ?");
            ps.setInt(1,d1.getRole());
          

            int i = ps.executeUpdate();
            if (i>0){
                bl = true;
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Database_Connect.closeAll(conn,ps,rs);
        }


        return bl;
    }
    
    
}
