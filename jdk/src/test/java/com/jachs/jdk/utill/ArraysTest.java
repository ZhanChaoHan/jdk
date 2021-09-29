package com.jachs.jdk.utill;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/***
 * 
 * @author zhanchaohan
 *
 */
public class ArraysTest {
	private int[] Ilist=new int [] {78,655,0,1,2,3,8,8999,845,125,623,154,7874,411};
	private byte[] Blist=new byte[] {0,2,98,78,55,35,12,4,5,98}; 
	
	//数组转换集合
	@Test
	public void asList() {
		List<int[]>iArr=Arrays.asList(Ilist);
		
		List<byte[]>bArr=Arrays.asList(Blist);
		
		for (byte[] bs : bArr) {
			System.out.println(bs[0]);
			System.out.println(bs[1]);
		}
	}
	//二分查找
	@Test
	public void binarySearch() {
		Arrays.sort(Ilist);//先排序
		//1.不存在时由1开始计数； 
		//2.存在时由0开始计数。
		System.out.println(Arrays.binarySearch(Ilist, 3));
	}
	//数组值是否完全一致
	@Test
	public void deepEquals() {
		Object[] oList=new Object[] {"a","b"};
		Object[] tList=new Object[] {"a","b"};
		
		
		System.out.println(Arrays.deepEquals(oList, tList));
	}
	@Test
	public void fill() {
		Arrays.fill(Ilist, 77766);
		System.out.println(Ilist[Ilist.length-1]);
	}
}
