package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Order;

/**
 * Abutalib Hasan - amhasan
 * 202101 CIS171 12928
 * Mar 9, 2021
 */
public class OrderHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("BookStore");
	
	public void setOrder(Order o) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(o);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<Order> showAllOrders(){
		EntityManager em = emfactory.createEntityManager();
		
		List<Order> allOrders = em.createQuery("SELECT o FROM Order o").getResultList();
		return allOrders;
	}
	

}
