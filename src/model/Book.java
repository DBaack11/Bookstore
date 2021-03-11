package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Abutalib Hasan - amhasan
 * 202101 CIS171 12928
 * Mar 6, 2021
 */
@Entity
@Table(name="books")
public class Book {
	@Id
	@Column(name="ISBN")
	private int isbn;
	@Column(name="TITLE")
	private String title;
	@Column(name="CATEGORY")
	private String category;
	@Column(name="COST")
	private int cost;
	@Column(name="PUB_DATE")
	private LocalDate pubDate;
	/**
	 * 
	 */
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param isbn
	 * @param title
	 * @param category
	 * @param cost
	 * @param pubDate
	 */
	public Book(int isbn, String title, String category, LocalDate pubDate, int cost) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.pubDate = pubDate;
	}
	/**
	 * @param isbn
	 * @param title
	 * @param category
	 * @param cost
	 */
	public Book(int isbn, String title, String category, int cost) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	/**
	 * @param isbn
	 */
	public Book(int isbn) {
		super();
		this.isbn = isbn;
	}
	/**
	 * @return the isbn
	 */
	public int getIsbn() {
		return isbn;
	}
	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the cost
	 */
	public int getCost() {
		return cost;
	}
	/**
	 * @param cost the cost to set
	 */
	public void setCost(int cost) {
		this.cost = cost;
	}
	/**
	 * @return the pubDate
	 */
	public LocalDate getPubDate() {
		return pubDate;
	}
	/**
	 * @param pubDate the pubDate to set
	 */
	public void setPubDate(LocalDate pubDate) {
		this.pubDate = pubDate;
	}
	@Override
	public String toString() {
		return "book [isbn=" + isbn + ", title=" + title + ", category=" + category + ", cost=" + cost + ", pubDate="
				+ pubDate + "]";
	}
	

}
