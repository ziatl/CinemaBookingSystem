/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.uog.test;

import en.uog.database.PersistenceManager;
import en.uog.entities.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author faycal
 */
public class Principale {

    public static void main(String[] arg){ 
        EntityManager em = PersistenceManager.getEntityManager();
        User u = new User();
        u.setLastName("faycal");
        try {
             EntityTransaction et = em.getTransaction();
            et.begin();
            em.persist(u);
            et.commit();
            em.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
