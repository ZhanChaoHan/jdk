package com.jachs.jdk.utill.list.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

import com.jachs.jdk.utill.list.bean.Car;
import com.jachs.jdk.utill.list.bean.SortBean;

/***
 * 底层数据结构是数组，查询快，增删慢，线程不安全，效率高，可以存储重复元素
 * @author zhanchaohan
 *
 */
public class ArrayListTest {
	List<String>sList=new ArrayList<String>();
	List<Integer>iList=new ArrayList<Integer>();
	List<Car>carList=new ArrayList<Car>();
	List<SortBean>sortBeanList=new ArrayList<SortBean>();
	
	//对象排序
	@Test
	public void test() {
		carList.add(new Car("A", 1));
		carList.add(new Car("B", 0));
		carList.add(new Car("aCeC", 598));
		carList.add(new Car("CC", 54));
		carList.add(new Car("mkC", 74));
		carList.add(new Car("CDC", 25));
		
		Collections.sort(carList);
		for (Car car : carList) {
			System.out.println(car.getName()+"\t"+car.getMonery());
		}
		System.out.println("-------------------------------------------");
		
		sortBeanList.add(new SortBean("ACCZ", 25));
		sortBeanList.add(new SortBean("EAC", 50));
		sortBeanList.add(new SortBean("EQQA", 30));
		sortBeanList.add(new SortBean("ACA", 50));
		
		Collections.sort(sortBeanList,new Comparator<SortBean>() {
			public int compare(SortBean o1, SortBean o2) {
				int a1=o1.getAge();
				int a2=o2.getAge();
						
				if(a1==a2) {
					return 0;
				}else if(a1>a2) {
					return 1;
				}else {
					return -1;
				}
			}
		});
		
		for (SortBean sb : sortBeanList) {
			System.out.println(sb.getName()+"\t"+sb.getAge());
		}
	}
}
