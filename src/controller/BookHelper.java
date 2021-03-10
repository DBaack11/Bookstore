package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Book;



/**
 * Abutalib Hasan - amhasan
 * 202101 CIS171 12928
 * Mar 6, 2021
 */
public class BookHelper {
	static EntityManagerFactory  emfactory = Persistence.createEntityManagerFactory("BookStore");
	public void insertBook(Book b) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(b);
		em.getTransaction().commit();
		em.close();
		
	}
	
	public List<Book> showAllBooks(){
		EntityManager em = emfactory.createEntityManager();
		List<Book> allBooks = em.createQuery("SELECT b FROM Book b").getResultList();
		return allBooks;
	}
	
	public void deleteBook(Book toDelete) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Book> typedQuery = em.createQuery("select b from Book b where b.isbn = :selectedIsbn", Book.class);

//Substitute parameter with actual data from the toDelete item
		typedQuery.setParameter("selectedIsbn", toDelete.getIsbn());

		//we only want one result
		typedQuery.setMaxResults(1);

		//get the result and save it into a new list item
		Book result = typedQuery.getSingleResult();

		//remove it
		em.remove(result);
		em.getTransaction().commit();
		em.close();
		
	}
	
	public void updateBook(Book toEdit) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				EntityManager em = emfactory.createEntityManager();
				em.getTransaction().begin();
				
				em.merge(toEdit);
				em.getTransaction().commit();
				em.close();

		
	}
	
	public void cleanUp(){
		emfactory.close();
	}


}
