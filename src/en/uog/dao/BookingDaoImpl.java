/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.uog.dao;

import en.uog.database.PersistenceManager;
import en.uog.entities.Profile;
import en.uog.entities.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 *
 * @author aziz
 */
public class BookingDaoImpl implements IBookingDao{
    EntityManager em = PersistenceManager.getEntityManager();
    public BookingDaoImpl() {
        
    }

    @Override
    public User addUser(User u) {
       EntityManager em = PersistenceManager.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(u);
		et.commit();
		em.close();
        return u;
    }

    @Override
    public User login(String email, String password) {
        em = PersistenceManager.getEntityManager();
        Query q;
        q = em.createQuery("SELECT u from User u where u.email=:x and u.password=:y");
        q.setParameter("x",email);
        q.setParameter("y",password);
        System.out.println(email);
        System.out.println(password);
        try {
            User user = (User) q.getSingleResult();
            System.out.println(user);
            return user;
        } catch (Exception e) {
            System.err.println(e);
            System.out.println("pfffffff");
            return null;
        }
    }

    @Override
    public List<User> getAllUsers() {
        em = PersistenceManager.getEntityManager();
        Query q;
        q = em.createQuery("SELECT u from User u");
        return q.getResultList();
    }

    @Override
    public User findUserById(Integer id) {
        em = PersistenceManager.getEntityManager();
        return em.find(User.class, id);
    }

    @Override
    public User findUserByEmail(String email) {
        em = PersistenceManager.getEntityManager();
        Query q;
        q = em.createQuery("SELECT u from User u where u.email=:x");
        q.setParameter("x", email);
        try {
            return (User) q.getSingleResult();
        } catch (Exception e) {
            return null;
        }
        
    }
    
    

    @Override
    public void delUser(User u) {
         EntityManager em = PersistenceManager.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.remove(em.contains(u) ? u : em.merge(u));
		et.commit();
		em.close();
    }

    @Override
    public Profile findProfileByName(String prof) {
       em = PersistenceManager.getEntityManager();
        Query q;
        q = em.createQuery("SELECT p from Profile p where p.profileName=:x");
        q.setParameter("x", prof);
        try {
            return (Profile) q.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
    
    
    
    
    
    
}
