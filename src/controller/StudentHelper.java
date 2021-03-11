package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Student;

/**
 * Abutalib Hasan - amhasan
 * 202101 CIS171 12928
 * Mar 9, 2021
 */
public class StudentHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("BookStore");
	
	public void insertStudent(Student s) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		em.close();
		
	}
	
	public List<Student> showAllStudents(){
		EntityManager em = emfactory.createEntityManager();
		List<Student> allStudents = em.createQuery("SELECT s FROM Student s").getResultList();
		return allStudents;
	}
}
