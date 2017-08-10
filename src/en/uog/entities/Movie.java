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
import javax.persistence.OneToMany;

/**
 *
 * @author faycal
 */
@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private String movieAbstract;
    private Date dateRelease;
    
    //Database relations
    @OneToMany(mappedBy = "movie")
    private List<OnScreem> onScreems;

    public List<OnScreem> getOnScreems() {
        return onScreems;
    }

    public void setOnScreems(List<OnScreem> onScreems) {
        this.onScreems = onScreems;
    }
   
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMovieAbstract() {
        return movieAbstract;
    }

    public void setMovieAbstract(String movieAbstract) {
        this.movieAbstract = movieAbstract;
    }

    public Date getDateRelease() {
        return dateRelease;
    }

    public void setDateRelease(Date dateRelease) {
        this.dateRelease = dateRelease;
    }

    public Movie() {
    }

    public Movie(String title, String movieAbstract, Date dateRelease) {
        this.title = title;
        this.movieAbstract = movieAbstract;
        this.dateRelease = dateRelease;
    }
    
    
}
