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
import java.sql.Date;
import Common.Common;

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
            ps = conn.prepareStatement("select * from schedule");
            rs = ps.executeQuery();
            while (rs.next()){
                Schedule S1 = new Schedule();
                S1.setId(rs.getInt("ID"));
                S1.setTrain_id(rs.getInt("Train_id"));
                S1.setDeparture(rs.getString("Departure"));
                S1.setDestination(rs.getString("Destination"));
                S1.setDeparture_time(rs.getString("Departure_time"));
                S1.setDeparture_date(rs.getDate("Departure_date"));
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
            ps = conn.prepareStatement("insert into schedule(train_id,departure,destination,departure_time,departure_date) values (?,?,?,?,?)");
            ps.setInt(1,S1.getTrain_id());
            ps.setString(2,S1.getDeparture());
            ps.setString(3,S1.getDestination());
            ps.setString(4,S1.getDeparture_time());
            ps.setDate(5, new Date(S1.getDeparture_date().getTime()));
          

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
            ps = conn.prepareStatement("delete from schedule where id = ?" );
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
    public boolean updateSchedule(Schedule d1, int id) {
       boolean bl = false;


        Connection conn;
        PreparedStatement ps = null;
        ResultSet rs = null;

        conn = Database_Connect.getConnection();
        try {
            ps = conn.prepareStatement("UPDATE schedule SET train_id = ? , departure = ? , destination = ?, departure_time = ?, departure_date = ?  WHERE id = ?");
            ps.setInt(1,d1.getTrain_id());
            ps.setString(2,d1.getDeparture());
            ps.setString(3,d1.getDestination());
            ps.setString(4,d1.getDeparture_time());
            ps.setDate(5,  new Date(d1.getDeparture_date().getTime()) );
            ps.setInt(6,id);
            System.out.println(d1.getId());
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
    public List<Schedule> getSchedulesbyTrainID(int TrianID) {
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
                S1.setDeparture_time(rs.getString("Departure_time"));
                S1.setDeparture_date(rs.getDate("Departure_date"));
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
    public int getstatusbyTrainID(int TrainID) {
        int id = 0;

        Connection conn;
        PreparedStatement ps = null;
        ResultSet rs = null;

        conn = Database_Connect.getConnection();
        try {
            ps = conn.prepareStatement("SELECT * FROM train WHERE train_id = ? ");
            ps.setInt(1, TrainID);
            rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt("status");
            }
        } catch (Exception e) {
        }
        return id;
    }

   

    }
