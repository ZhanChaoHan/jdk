package com.jachs.jdk.utill.list.collection.list;

import java.util.LinkedList;

import org.junit.Test;

import com.jachs.jdk.utill.list.bean.Car;

/***
 * 底层数据结构是链表，查询慢，增删快，线程不安全，效率高，可以存储重复元素
 * 
 * @author zhanchaohan
 *
 */
public class LinkedListTest {
	LinkedList<String> sList = new LinkedList<String>();
	LinkedList<Integer> iList = new LinkedList<Integer>();
	LinkedList<Car> carList = new LinkedList<Car>();

	@Test
	public void test() {
		for (int kk = 0; kk < 1000; kk++) {
			iList.add(kk);
		}
		System.out.println("链表的第一个元素是 : " + iList.getFirst());
		System.out.println("链表最后一个元素是 : " + iList.getLast());
		
		iList.clear();
		
	}
}
