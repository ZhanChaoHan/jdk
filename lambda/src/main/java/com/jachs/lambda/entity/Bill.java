package com.jachs.lambda.entity;

/***
 * 
 * @author zhanchaohan
 *
 */
public class Bill {
	private String user_name;
	private String book_name;
	private double monery;
	
	public Bill() {
		super();
	}
	public Bill(String user_name, String book_name, double monery) {
		super();
		this.user_name = user_name;
		this.book_name = book_name;
		this.monery = monery;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public double getMonery() {
		return monery;
	}
	public void setMonery(double monery) {
		this.monery = monery;
	}
	
}
