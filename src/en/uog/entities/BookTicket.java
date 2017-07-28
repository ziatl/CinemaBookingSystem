/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.uog.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author aziz
 */
@Entity
public class BookTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String movieName;
    private String showNo;
    private Date datePurchase;
    private Date movieDate;
    private String venue;

    //Database Relations
    @ManyToOne
    @JoinColumn(name = "idUser")
    private User user;

    @ManyToOne
    @JoinColumn(name = "idOnScreem")
    private OnScreem onScreem;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public OnScreem getOnScreem() {
        return onScreem;
    }

    public void setOnScreem(OnScreem onScreem) {
        this.onScreem = onScreem;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getShowNo() {
        return showNo;
    }

    public void setShowNo(String showNo) {
        this.showNo = showNo;
    }

    public Date getDatePurchase() {
        return datePurchase;
    }

    public void setDatePurchase(Date datePurchase) {
        this.datePurchase = datePurchase;
    }

    public Date getMovieDate() {
        return movieDate;
    }

    public void setMovieDate(Date movieDate) {
        this.movieDate = movieDate;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public BookTicket() {
    }

    public BookTicket(String movieName, String showNo, Date datePurchase, Date movieDate, String venue) {
        this.movieName = movieName;
        this.showNo = showNo;
        this.datePurchase = datePurchase;
        this.movieDate = movieDate;
        this.venue = venue;
    }
        
}
