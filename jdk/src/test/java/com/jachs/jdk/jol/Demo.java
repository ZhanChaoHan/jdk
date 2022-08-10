package com.jachs.jdk.jol;

import org.openjdk.jol.info.ClassLayout;

/***
 * 
 * @author zhanchaohan
 *
 */
public class Demo {
	public static void main(String[] args) {
		People peo=new People();
		
		peo.setName("jack");
		peo.setAge(12);
		
		System.out.println(ClassLayout.parseInstance(peo).toPrintable());
	}
}
