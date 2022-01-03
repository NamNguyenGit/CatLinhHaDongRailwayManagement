/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImplement;
import DAO.SheduleDAO;
import Database.Database_Connect;
import Entities.Schedule;
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
public class ScheduleDAOimplement implements SheduleDAO {

    @Override
    public List<Schedule> getlistSchedule() {
        List<Schedule> listschedule = new ArrayList<>();
       
        Connection conn;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
         conn = Database_Connect.getConnection();
        try {
            ps = conn.prepareStatement("select * from shedule");
            rs = ps.executeQuery();
            while (rs.next()){
                Schedule S1 = new Schedule();
                S1.setId(rs.getInt("ID"));
                S1.setTrain_id(rs.getInt("Train_id"));
                S1.setTrain_status(rs.getInt("Status"));
                S1.setDeparture(rs.getString("Departure"));
                S1.setDestination(rs.getString("Destination"));
                S1.setDeparture_time(rs.getString("Time"));
                S1.setDeparture_date(rs.getString("Date"));
                listschedule.add(S1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Database_Connect.closeAll(conn,ps,rs);
        }         
         
         return listschedule;
    }

    @Override
    public boolean insertSchedule(Schedule S1) {
       boolean bl = false;

        Connection conn;
        PreparedStatement ps = null;
        ResultSet rs = null;

        conn = Database_Connect.getConnection();
        try {
            ps = conn.prepareStatement("insert into shedule(train_id,departure,destination,departure_time,departure_date) values (?,?,?,?,?)");
            ps.setInt(1,S1.getTrain_id());
            ps.setString(2,S1.getDeparture());
            ps.setString(3,S1.getDestination());
            ps.setString(4,S1.getDeparture_time());
            ps.setString(5,S1.getDeparture_date());
          

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
    public boolean deleteSchedule(int IdSchedule) {
        boolean bl = false;

        Connection conn;
        PreparedStatement ps = null;
        ResultSet rs = null;

        conn = Database_Connect.getConnection();
        try {
            ps = conn.prepareStatement("delete from shedule where id = ?" );
            ps.setInt(1,IdSchedule);
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
    public boolean updateSchedule(Schedule d1) {
       boolean bl = false;


        Connection conn;
        PreparedStatement ps = null;
        ResultSet rs = null;

        conn = Database_Connect.getConnection();
        try {
            ps = conn.prepareStatement("UPDATE shedule SET train_id = ? , departure = ? , destination = ?, departure_time = ?, departure_date = ?  WHERE id = ?");
            ps.setInt(1,d1.getTrain_id());
            ps.setString(2,d1.getDeparture());
            ps.setString(3,d1.getDestination());
            ps.setString(4,d1.getDeparture_time());
            ps.setString(5,d1.getDeparture_date());

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
    public List<Schedule> getDrinksbyTrainID(int TrianID) {
       List<Schedule> listschedule = new ArrayList<>();


        Connection conn;
        PreparedStatement ps = null;
        ResultSet rs = null;

        conn = Database_Connect.getConnection();
        try {
            ps = conn.prepareStatement("select * from schedule where train_id = ?");
            ps.setInt(1,TrianID);
            rs = ps.executeQuery();
            while (rs.next()){
                 Schedule S1 = new Schedule();
                S1.setId(rs.getInt("ID"));
                S1.setTrain_id(rs.getInt("Train_id"));
                S1.setDeparture(rs.getString("Departure"));
                S1.setDestination(rs.getString("Destination"));
                S1.setDeparture_time(rs.getString("Time"));
                S1.setDeparture_date(rs.getString("Date"));
                listschedule.add(S1);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Database_Connect.closeAll(conn,ps,rs);
        }


        return listschedule;
    }
    
}