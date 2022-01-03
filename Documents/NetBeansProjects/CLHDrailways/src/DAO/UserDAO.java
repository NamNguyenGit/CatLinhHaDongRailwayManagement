/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Entities.User;
import java.util.List;
/**
 *
 * @author acer
 */
public interface UserDAO {
    public List<User> getlistUser();
    public List<User> getUserbyUserName(String Name);
    public boolean insertUser(User u1);
    public boolean updateUser(User d1);
    
}
