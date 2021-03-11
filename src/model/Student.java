package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Abutalib Hasan - amhasan
 * 202101 CIS171 12928
 * Mar 9, 2021
 */
@Entity
@Table(name="students")
public class Student {
	@Id
	@Column(name="ST_ID")
	private int stId;
	@Column(name="ST_FNAME")
	private String stFname;
	@Column(name="ST_LNAME")
	private String stLast;
	/**
	 * 
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param stId
	 * @param stFname
	 * @param stLast
	 */
	public Student(int stId, String stFname, String stLast) {
		super();
		this.stId = stId;
		this.stFname = stFname;
		this.stLast = stLast;
	}
	/**
	 * @param stId
	 */
	public Student(int stId) {
		super();
		this.stId = stId;
	}
	/**
	 * @param stFname
	 * @param stLast
	 */
	public Student(String stFname, String stLast) {
		super();
		this.stFname = stFname;
		this.stLast = stLast;
	}
	/**
	 * @return the stId
	 */
	public int getStId() {
		return stId;
	}
	/**
	 * @param stId the stId to set
	 */
	public void setStId(int stId) {
		this.stId = stId;
	}
	/**
	 * @return the stFname
	 */
	public String getStFname() {
		return stFname;
	}
	/**
	 * @param stFname the stFname to set
	 */
	public void setStFname(String stFname) {
		this.stFname = stFname;
	}
	/**
	 * @return the stLast
	 */
	public String getStLast() {
		return stLast;
	}
	/**
	 * @param stLast the stLast to set
	 */
	public void setStLast(String stLast) {
		this.stLast = stLast;
	}
	@Override
	public String toString() {
		return "Student [stId=" + stId + ", stFname=" + stFname + ", stLast=" + stLast + "]";
	}
	
	

}
