/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.uog.entities;

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
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String roomId;
    private int numberOfPlace;
    
    // Database relations
    @OneToMany(mappedBy = "room")
    private List<OnScreem> onScreem;

    public List<OnScreem> getOnScreem() {
        return onScreem;
    }

    public void setOnScreem(List<OnScreem> onScreem) {
        this.onScreem = onScreem;
    }
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public int getNumberOfPlace() {
        return numberOfPlace;
    }

    public void setNumberOfPlace(int numberOfPlace) {
        this.numberOfPlace = numberOfPlace;
    }

    public Room() {
    }

    public Room(String roomId, int numberOfPlace) {
        this.roomId = roomId;
        this.numberOfPlace = numberOfPlace;
    }
    
    
    
}
