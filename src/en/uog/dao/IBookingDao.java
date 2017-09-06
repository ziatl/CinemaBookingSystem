/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.uog.dao;

import en.uog.entities.BookTicket;
import en.uog.entities.Movie;
import en.uog.entities.OnScreen;
import en.uog.entities.Profile;
import en.uog.entities.Room;
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
    
    //Movies
    public Movie addMovie(Movie m);
    public List<Movie> getAllMovies();
    public Movie findMovieById(Integer id);
    public void delMovie(Movie u);
    
    //Room
    public Room addRoom(Room r);
    public List<Room> getAllRoom();
    public Room findRoomById(Integer id);
    public void delRoom(Room r);
    
    //OnScreen
    public OnScreen addOnScreen(OnScreen onScreen);
    public List<OnScreen> getAllOnScreen();
    public OnScreen findOnScreenById(Integer id);
    public void delonScreen(OnScreen onScreen);
    
    
    //BoolTicket
    public BookTicket addBookTicket(BookTicket bookTicket);
    public List<BookTicket> getBookTicketByUser(User user);
    public BookTicket findBookTicketById(Integer id);
    public void delBookTicket(BookTicket bookTicket);
    
    
}
