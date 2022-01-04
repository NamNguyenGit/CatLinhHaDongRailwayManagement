/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImplement;
import DAO.TrainDAO;
import Database.Database_Connect;
import Entities.Train;
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
public class TrainDAOImplement implements TrainDAO {

    @Override
    public List<Train> getlistTrain() {
        List<Train> listTrain = new ArrayList<>();
       
        Connection conn;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
         conn = Database_Connect.getConnection();
        try {
            ps = conn.prepareStatement("select * from train ORDER BY train_id ASC ");
            rs = ps.executeQuery();
            while (rs.next()){
                Train T1 = new Train();
                T1.setId(rs.getInt("ID"));
                T1.setTrain_id(rs.getInt("Train_id"));
                T1.setStatus(rs.getInt("Status"));
                listTrain.add(T1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Database_Connect.closeAll(conn,ps,rs);
        }         
         
         return listTrain;
    }

    @Override
    public boolean insertTrain(Train T1) {
        boolean bl = false;

        Connection conn;
        PreparedStatement ps = null;
        ResultSet rs = null;

        conn = Database_Connect.getConnection();
        try {
            ps = conn.prepareStatement("insert into train(train_id) values (?)");
            ps.setInt(1,T1.getTrain_id());
           
          

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
    public boolean deleteTrain(int IdTrain) {
       boolean bl = false;

        Connection conn;
        PreparedStatement ps = null;
        ResultSet rs = null;

        conn = Database_Connect.getConnection();
        try {
            ps = conn.prepareStatement("delete from train where train_id = ?" );
            ps.setInt(1,IdTrain);
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
    public boolean updateTrain(Train T1,int id) {
        boolean bl = false;


        Connection conn;
        PreparedStatement ps = null;
        ResultSet rs = null;

        conn = Database_Connect.getConnection();
        try {
            ps = conn.prepareStatement("UPDATE train SET status = ?  WHERE id = ?");
            ps.setInt(1,T1.getStatus());
            ps.setInt(2, id);
            

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
    public List<Train> getTrainbyTrainID(int TrianID) {
       List<Train> listTrain = new ArrayList<>();


        Connection conn;
        PreparedStatement ps = null;
        ResultSet rs = null;

        conn = Database_Connect.getConnection();
        try {
            ps = conn.prepareStatement("select * from train where train_id = ?");
            ps.setInt(1,TrianID);
            rs = ps.executeQuery();
            while (rs.next()){
                Train T1 = new Train();
                T1.setId(rs.getInt("ID"));
                T1.setTrain_id(rs.getInt("Train_id"));
                T1.setStatus(rs.getInt("Status"));
                listTrain.add(T1);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Database_Connect.closeAll(conn,ps,rs);
        }


        return listTrain;
    }
    
}
