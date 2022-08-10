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
		
		peo.setBo(true);
		peo.setBt((byte)112);
		peo.setCa('a');
		peo.setDe(1.207);
		peo.setFt(2.98f);
		peo.setIt(22);
		peo.setLg(1765L);
		peo.setSg("不是基本类型看看String对象占用内存空间多少");
		
		System.out.println(ClassLayout.parseInstance(peo).toPrintable());
	}
}
