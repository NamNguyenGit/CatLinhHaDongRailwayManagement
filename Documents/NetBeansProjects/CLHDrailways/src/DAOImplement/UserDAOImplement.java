/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImplement;
import DAO.UserDAO;
import Database.Database_Connect;
import Entities.Ticket;
import Entities.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
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
    public boolean updateRoleUser(User d1,int id) {
        boolean bl = false;


        Connection conn;
        PreparedStatement ps = null;
        ResultSet rs = null;

        conn = Database_Connect.getConnection();
        try {
            ps = conn.prepareStatement("UPDATE user SET role = ?  WHERE id = ?");
            ps.setInt(1,d1.getRole());
            ps.setInt(2,id);
          

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

    @Override
    public boolean insertUser(User u1) {
        boolean bl = false;

        Connection conn;
        PreparedStatement ps = null;
        ResultSet rs = null;

        conn = Database_Connect.getConnection();
        try {
            ps = conn.prepareStatement("insert into user(name,dob,gender,phone,username,password) values (?,?,?,?,?,?)");
            ps.setString(1,u1.getName());
            ps.setString(2,u1.getDob());
            ps.setString(3,u1.getGender());
            ps.setString(4,u1.getPhone());
            ps.setString(5,u1.getUsername());
            ps.setString(6,u1.getPassword());
          

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

    @Override
    public boolean updateInformationUser(User d1, int id) {
        boolean bl = false;


        Connection conn;
        PreparedStatement ps = null;
        ResultSet rs = null;

        conn = Database_Connect.getConnection();
        try {
            ps = conn.prepareStatement("UPDATE user SET name = ?, dob = ? , gender = ? , phone = ? , username = ?  WHERE id = ?");
            ps.setString(1,d1.getName());
            ps.setString(2,d1.getDob());
            ps.setString(3,d1.getGender());
            ps.setString(4,d1.getPhone());
            ps.setString(5,d1.getUsername());
            
            ps.setInt(6,id);
          

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

    @Override
    public List<Ticket> getTicketbyUserid(User d1) {
        List<Ticket> listTicket = new ArrayList<>();


        Connection conn;
        PreparedStatement ps = null;
        ResultSet rs = null;

        conn = Database_Connect.getConnection();
        ;
        try {
            ps = conn.prepareStatement("select * from ticket where user_id = ?");
            ps.setInt(1,d1.getId());
            rs = ps.executeQuery();
            while (rs.next()){
                SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                Ticket T1 = new Ticket();
                T1.setId(rs.getInt("ID"));
                T1.setUser_id(rs.getInt("User_id"));
                T1.setDate_buy(rs.getDate("Buydate"));
                T1.setRenew_date(rs.getDate("Renewabledate"));
                T1.setExpire_date(rs.getDate("Expirationdate"));
                T1.setPrice(rs.getFloat("Price"));
                listTicket.add(T1);
                
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Database_Connect.closeAll(conn,ps,rs);
        }


        return listTicket;
    }
    

    
    
    
}
