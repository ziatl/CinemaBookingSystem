/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.uog.dao;

import en.uog.database.PersistenceManager;
import en.uog.entities.BookTicket;
import en.uog.entities.Categorie;
import en.uog.entities.Movie;
import en.uog.entities.OnScreen;
import en.uog.entities.Profile;
import en.uog.entities.Room;
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
    
    //Movies

    @Override
    public Movie addMovie(Movie m) {
        EntityManager em = PersistenceManager.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(m);
		et.commit();
		em.close();
        return m;
    }

    @Override
    public List<Movie> getAllMovies() {
        em = PersistenceManager.getEntityManager();
        Query q;
        q = em.createQuery("SELECT m from Movie m");
        return q.getResultList();
    }

    @Override
    public List<Movie> getAllMovieByCategorie(String categorie) {
        em = PersistenceManager.getEntityManager();
        Query q;
        q = em.createQuery("SELECT m from Movie where m.categorie.name like :X");
        q.setParameter("X",categorie);
        return q.getResultList();
    }
    
    

    @Override
    public Movie findMovieById(Integer id) {
        em = PersistenceManager.getEntityManager();
        return em.find(Movie.class, id);
    }

    @Override
    public void delMovie(Movie movie) {
                EntityManager em = PersistenceManager.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.remove(em.contains(movie) ? movie : em.merge(movie));
		et.commit();
		em.close();
    }
    
    @Override
    public Room addRoom(Room r) {
         EntityManager em = PersistenceManager.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(r);
		et.commit();
		em.close();
        return r;
    }

    @Override
    public List<Room> getAllRoom() {
        em = PersistenceManager.getEntityManager();
        Query q;
        q = em.createQuery("SELECT m from Room m");
        return q.getResultList();
    }

    @Override
    public Room findRoomById(Integer id) {
        em = PersistenceManager.getEntityManager();
        return em.find(Room.class, id);
    }

    @Override
    public void delRoom(Room r) {
        EntityManager em = PersistenceManager.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.remove(em.contains(r) ? r : em.merge(r));
		et.commit();
		em.close();
    }

    @Override
    public OnScreen addOnScreen(OnScreen onScreen) {
        EntityManager em = PersistenceManager.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(onScreen);
		et.commit();
		em.close();
        return onScreen;
    }

    @Override
    public List<OnScreen> getAllOnScreen() {
        em = PersistenceManager.getEntityManager();
        Query q;
        q = em.createQuery("SELECT m from OnScreen m");
        return q.getResultList();
    }

    @Override
    public List<OnScreen> getAllOnScreenByCategorie(int categorie) {
        em = PersistenceManager.getEntityManager();
        Query q;
        q = em.createQuery("SELECT m from OnScreen m where m.movie.categorie.id =:X");
        q.setParameter("X", categorie);
        return q.getResultList();
    }
    
    

    @Override
    public OnScreen findOnScreenById(Integer id) {
         em = PersistenceManager.getEntityManager();
        return em.find(OnScreen.class, id);
    }

    @Override
    public void delonScreen(OnScreen onScreen) {
         EntityManager em = PersistenceManager.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.remove(em.contains(onScreen) ? onScreen : em.merge(onScreen));
		et.commit();
		em.close();
    }

    @Override
    public BookTicket addBookTicket(BookTicket bookTicket) {
        EntityManager em = PersistenceManager.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(bookTicket);
		et.commit();
		em.close();
        return bookTicket;
    }

    @Override
    public List<BookTicket> getBookTicketByUser(User user) {
        em = PersistenceManager.getEntityManager();
        Query q;
        q = em.createQuery("SELECT m from BookTicket m");
        return q.getResultList();
    }

    @Override
    public BookTicket findBookTicketById(Integer id) {
        return em.find(BookTicket.class, id);
    }

    @Override
    public void delBookTicket(BookTicket bookTicket) {
        EntityManager em = PersistenceManager.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.remove(em.contains(bookTicket) ? bookTicket : em.merge(bookTicket));
		et.commit();
		em.close();
    }

    @Override
    public Categorie addCategorie(Categorie categorie) {
        EntityManager em = PersistenceManager.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(categorie);
		et.commit();
		em.close();
        return categorie;
    }

    @Override
    public Categorie findCategorieById(Integer id) {
        return em.find(Categorie.class, id);
    }

    @Override
    public void delCategorie(Categorie categorie) {
        EntityManager em = PersistenceManager.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.remove(em.contains(categorie) ? categorie : em.merge(categorie));
		et.commit();
		em.close();
    }

    @Override
    public List<Categorie> getAllCategorie() {
        em = PersistenceManager.getEntityManager();
        Query q;
        q = em.createQuery("SELECT c from Categorie c");
        return q.getResultList();
    }
    
    
}
