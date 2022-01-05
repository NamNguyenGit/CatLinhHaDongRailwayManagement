/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImplement;
import DAO.TicketDAO;
import Database.Database_Connect;
import Entities.Ticket;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author acer
 */
public class TicketDAOImplement implements TicketDAO{

    @Override
    public boolean insertTicket(Ticket T1) {
        boolean bl = false;

        Connection conn;
        PreparedStatement ps = null;
        ResultSet rs = null;

        conn = Database_Connect.getConnection();
        try {
            ps = conn.prepareStatement("insert into ticket(user_id,buydate,expirationdate,price) values (?,?,?,?)");
            ps.setInt(1,T1.getUser_id()); 
            ps.setDate(2,new Date(T1.getDate_buy().getTime()));
            ps.setDate(3,new Date(T1.getExpire_date().getTime()));
            ps.setDouble(4,30000);
            
          

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
    public boolean insertTicket2(Ticket T1) {
         boolean bl = false;

        Connection conn;
        PreparedStatement ps = null;
        ResultSet rs = null;

        conn = Database_Connect.getConnection();
        try {
            ps = conn.prepareStatement("insert into ticket(user_id,buydate,renewabledate,expirationdate,price) values (?,?,?,?,?)");
            ps.setInt(1,T1.getUser_id()); 
            ps.setDate(2,new Date(T1.getDate_buy().getTime()));
            ps.setDate(3,new Date(T1.getRenew_date().getTime()));
            ps.setDate(4,new Date(T1.getExpire_date().getTime()));
            ps.setDouble(5,200000);
            
          

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
