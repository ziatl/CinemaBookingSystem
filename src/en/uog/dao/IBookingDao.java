/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.uog.dao;

import en.uog.entities.Profile;
import en.uog.entities.User;
import java.util.List;

/**
 *
 * @author aziz
 */
public interface IBookingDao {
    
    public User addUser(User u);
    public List<User> getAllUsers();
    public User findUserById(Integer id);
    public User findUserByEmail(String email);
    public User login(String email, String password);
    public void delUser(User u);
    public Profile findProfileByName(String prof);
    
    
}
