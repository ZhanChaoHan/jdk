package com.jachs.jdk.utill;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

/***
 * 集合操作工具类
 * @author zhanchaohan
 *
 */
public class CollectionsTest {
	//添加数组到集合
	@Test
	public void addAll() {
		List<String>sArr=new ArrayList<String>();
		sArr.add("acs");
		
		
		String[] sList=new String[] {"a","b"};
		
		Collections.addAll(sArr, sList);
		
		System.out.println(sArr.size());
	}
	//二分查询
	@Test
	public void binarySearch() {
		List<String>sList=new ArrayList<String>();
		sList.add("a");
		sList.add("b");
		sList.add("c");
		sList.add("d");
		sList.add("e");
		sList.add("f");
		sList.add("g");
		
		System.out.println(Collections.binarySearch(sList, "g"));
	}
	//集合复制需要提前设置集合空间否则复制不到
	@Test
	public void copy() {
		List<String>sList=new ArrayList<String>();
		sList.add("a");
		sList.add("b");
		sList.add("c");
		sList.add("d");
		sList.add("e");
		sList.add("f");
		sList.add("g");
		
		List<String>nList=new ArrayList(Arrays.asList(new String[sList.size()]));
//		nList.add("c,sla");//会产生报错
		System.out.println(nList.size());
		Collections.copy(sList, nList);
		
		System.out.println(sList.size());
		System.out.println(nList.size());
	}
	//如果两个指定 collection 中没有相同的元素，则返回 true
	@Test
	public void disjoint() {
		List<String>sList=new ArrayList<String>();
		sList.add("hello world");
		sList.add("yam");
		List<String>nList=new ArrayList<String>();
//		nList.add("hello world");
//		nList.add("yam");
		
		nList.add("list sList dont have this");
		System.out.println(Collections.disjoint(sList, nList));
	}
}
