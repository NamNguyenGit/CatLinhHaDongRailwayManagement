/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Entities.Ticket;
import Entities.User;
import java.util.List;
/**
 *
 * @author acer
 */
public interface UserDAO {
    public List<User> getlistUser();
    public List<User> getUserbyUserName(String Name);
    public List<Ticket> getTicketbyUserid(User d1);
    public boolean insertUser(User u1);
    public boolean updateRoleUser(User d1,int id);
    public boolean updateInformationUser(User d1,int id);
    
}
