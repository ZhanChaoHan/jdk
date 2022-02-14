package com.jachs.lambda;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.Test;

/***
 * 
 * @author zhanchaohan
 *
 */
public class Test1 {
	private static final String [] s=new String[]{
			"肃肃鸨羽，集于苞栩。王事靡盬，不能蓺稷黍。父母何怙？悠悠苍天，曷其有所？",
			"呦呦鹿鸣，食野之苹。我有嘉宾，鼓瑟吹笙。吹笙鼓簧，承筐是将。人之好我，示我周行。",
			"俟我于著乎而，充耳以素乎而，尚之以琼华乎而。"
			};
	@Test
	public void test1() {
		new Thread(() ->System.out.println("java8 lambda表达式 "+" 当前线程是 "+Thread.currentThread().getName())).start();
	}
	@Test
	public void test2() {
		/**
		 * 利用Arrays(工具类).sort(String[] a, Comparator<? super String> c)
		 * 将String类型数组中的元素按长度进行排序。
		*/
		Arrays.sort(s, (param1,param2) ->Integer.compare(param1.length(), param2.length()));;
		  /**
		   * 利用StreamAPI#forEach()来输出排序后数组元素。
		   */
		Stream.of(s).forEach(parameter ->System.out.println(parameter));
		
	}
	@Test
	public void test3() {
		new Thread(() -> System.out.println(s[0])).start();
	}
}
