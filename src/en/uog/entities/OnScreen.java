/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.uog.entities;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author faycal
 */
@Entity
public class OnScreen {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String showNo;
    private Date movieDate;
    private double price;

    //Database relation
    @ManyToOne
    @JoinColumn(name = "idUser")
    private User user;
    @ManyToOne
    @JoinColumn(name = "idRoom")
    private Room room;
    @ManyToOne
    @JoinColumn(name = "idMovie")
    private Movie movie;
    @OneToMany(mappedBy = "onScreem")
    private List<BookTicket> bookTickets;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public List<BookTicket> getBookTickets() {
        return bookTickets;
    }

    public void setBookTickets(List<BookTicket> bookTickets) {
        this.bookTickets = bookTickets;
    }
    
    
    public String getShowNo() {
        return showNo;
    }

    public void setShowNo(String showNo) {
        this.showNo = showNo;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getMovieDate() {
        return movieDate;
    }

    public void setMovieDate(Date movieDate) {
        this.movieDate = movieDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public OnScreen() {
    }

    public OnScreen(Date movieDate, double price) {
        this.movieDate = movieDate;
        this.price = price;
    }
    
    
}
