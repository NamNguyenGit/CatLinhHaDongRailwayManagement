/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Entities.Train;
import java.util.List;
/**
 *
 * @author acer
 */
public interface TrainDAO {
    public List<Train> getlistTrain();
    public boolean insertTrain(Train T1);
    public boolean deleteTrain(int IdTrain);
    public boolean updateTrain(Train T1,int id);
    public List<Train> getTrainbyTrainID(int TrianID);
}
