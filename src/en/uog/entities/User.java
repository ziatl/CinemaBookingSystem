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
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String firstname;
    private String lastName;
    private String telephone;
    private String address;
    private String email;
    private String password;
    private Date birthday;
    
    //Database Relations
    @OneToMany(mappedBy = "user")
    private List<BookTicket> bookTickets;
    @OneToMany(mappedBy = "user")
    private List<MakePayment> makePayments;
    @OneToMany(mappedBy = "user")
    private List<OnScreen> onScreems;
    @ManyToOne
    @JoinColumn(name = "idProfile")
    private Profile profile;
    
    // Database relations
    @OneToMany(mappedBy = "user")
    private List<Star> stars;

    public List<BookTicket> getBookTickets() {
        return bookTickets;
    }

    public void setBookTickets(List<BookTicket> bookTickets) {
        this.bookTickets = bookTickets;
    }

    public List<MakePayment> getMakePayments() {
        return makePayments;
    }

    public void setMakePayments(List<MakePayment> makePayments) {
        this.makePayments = makePayments;
    }

    public List<OnScreen> getOnScreems() {
        return onScreems;
    }

    public void setOnScreems(List<OnScreen> onScreems) {
        this.onScreems = onScreems;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public User() {
    }

    public User(String firstname, String lastName, String telephone, String address, String email, String password, Date birthday) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.telephone = telephone;
        this.address = address;
        this.email = email;
        this.password = password;
        this.birthday = birthday;
    }
    
      
}
