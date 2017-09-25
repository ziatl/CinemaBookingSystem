/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.uog.entities;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
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
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private String movieAbstract;
    private Date dateRelease;
    private String image;
    
    //Database relations
    @OneToMany(cascade = {CascadeType.REMOVE},mappedBy = "movie")
    private List<OnScreen> onScreems;
    @ManyToOne
    @JoinColumn(name = "idCategorie")
    private Categorie categorie;
    @OneToMany(cascade = {CascadeType.REMOVE},mappedBy = "movie")
    List<Star> stars;

    public List<OnScreen> getOnScreems() {
        return onScreems;
    }

    public void setOnScreems(List<OnScreen> onScreems) {
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

    public String getImage() {
        return image;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public List<Star> getStars() {
        return stars;
    }

    public void setStars(List<Star> stars) {
        this.stars = stars;
    }
    
    

    public void setImage(String image) {
        this.image = image;
    }
    

    public Movie(String title, String movieAbstract, Date dateRelease) {
        this.title = title;
        this.movieAbstract = movieAbstract;
        this.dateRelease = dateRelease;
    }
    
    
}
