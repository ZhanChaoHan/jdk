package com.jachs.jdk.utill.list.bean;

/***
 * 测试对象实体
 * @author zhanchaohan
 *
 */
public class Car implements Comparable<Car>{
	String Name;
	int Monery;
	
	
	public Car(String name, int monery) {
		super();
		Name = name;
		Monery = monery;
	}


	public int compareTo(Car o) {
		return this.Monery-o.Monery;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getMonery() {
		return Monery;
	}
	public void setMonery(int monery) {
		Monery = monery;
	}
	
}
