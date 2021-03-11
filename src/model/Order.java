package model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Abutalib Hasan - amhasan
 * 202101 CIS171 12928
 * Mar 9, 2021
 */
@Entity
@Table(name="orders")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ORD_ID")
	private int orderId;
	@Column(name="ORD_DATE")
	private LocalDate orderDate;
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name = "ISBN")
	private Book book;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name = "ST_ID")
	private Student student;
	/**
	 * 
	 */
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param orderId
	 * @param orderDate
	 * @param book
	 * @param student
	 */
	public Order(int orderId, LocalDate orderDate, Book book, Student student) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.book = book;
		this.student = student;
	}
	
	
	
	/**
	 * @param book
	 * @param student
	 */
	public Order(Book book, Student student) {
		super();
		this.book = book;
		this.student = student;
	}
	/**
	 * @return the orderId
	 */
	public int getOrderId() {
		return orderId;
	}
	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	/**
	 * @return the orderDate
	 */
	public LocalDate getOrderDate() {
		return orderDate;
	}
	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	/**
	 * @return the book
	 */
	public Book getBook() {
		return book;
	}
	/**
	 * @param book the book to set
	 */
	public void setBook(Book book) {
		this.book = book;
	}
	/**
	 * @return the student
	 */
	public Student getStudent() {
		return student;
	}
	/**
	 * @param student the student to set
	 */
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", book=" + book + ", student=" + student
				+ "]";
	}
	
	
	

}
