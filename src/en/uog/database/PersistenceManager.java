/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.uog.database;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author aziz
 */
public class PersistenceManager {
    private static EntityManagerFactory emf;
	public static EntityManagerFactory getEntityManagerFactory(){
		  if(emf == null){
			  	emf = Persistence.createEntityManagerFactory("Booking");
		  }
		 return emf;
	 }
	  
	 public static EntityManager getEntityManager(){
		  return getEntityManagerFactory().createEntityManager();
	 }
	  
	 public static void closeEntityManagerFactory() {
			 if(emf != null && emf.isOpen()){
				 emf.close();
			 }
	 }	
    
}
