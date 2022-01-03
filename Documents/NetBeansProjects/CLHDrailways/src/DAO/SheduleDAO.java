/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import Entities.Schedule;
/**
 *
 * @author acer
 */
public interface SheduleDAO {
    public List<Schedule> getlistSchedule();
    public boolean insertSchedule(Schedule S1);
    public boolean deleteSchedule(int IdSchedule);
    public boolean updateSchedule(Schedule d1, int id);
    public List<Schedule> getSchedulesbyTrainID(int TrianID);
}
