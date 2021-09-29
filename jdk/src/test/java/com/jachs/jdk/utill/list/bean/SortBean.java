package com.jachs.jdk.utill.list.bean;

/***
 * 
 * @author zhanchaohan
 *
 */
public class SortBean {
	private String Name;
	private int Age;
	
	public SortBean() {
		super();
	}
	public SortBean(String name, int age) {
		super();
		Name = name;
		Age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	
}
