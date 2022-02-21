package com.jachs.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import org.junit.Test;

import com.jachs.lambda.entity.Book;

/***
	接口名 	Java8新加入的方法<br>
	Collection 	removeIf()、spliterator()、 stream()、 parallelStream() 、forEach()<br>
	List 	replaceAll() 、sort()<br>
	Map 	getOrDefault()、 forEach()、 replaceAll()、 putIfAbsent() 、remove()、 replace() 、computeIfAbsent() 、computeIfPresent()、 compute()、 merge()<br>
 * @author zhanchaohan
 *
 */
public class ListTest {
	
	//removeIf
	@Test
	public void test1() {
		List<String> list = new ArrayList<>(Arrays.asList(
				"hello",
				"world", 
				"你好",
				"世界"
				));
		
		list.removeIf(a->a.length()<3);//根据条件删除
		list.forEach(System.out::println);
		System.out.println("-------------");
		//
		List<String> list_01 = new ArrayList<>(Arrays.asList(
				"凛凛岁云暮，蝼蛄夕鸣悲。",
				"凉风率已厉，游子寒无衣。", 
				"锦衾遗洛浦，同袍与我违。",
				"眄睐以适意，引领遥相睎。",
				"良人惟古欢，枉驾惠前绥。"
				));
		list_01.removeIf(new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return !t.contains("我");
			}
		});//根据条件删除
		list_01.forEach(System.out::println);
	}
	//replaceAll
	@Test
	public void test2() {
		List<String> list = new ArrayList<>(Arrays.asList(
				"a",
				"b",
				"c",
				"aa",
				"bb",
				"cc",
				"aaaaaa"
				));
		
		list.replaceAll(new UnaryOperator<String>() {
			@Override
			public String apply(String t) {
				if(t.contains("a")) {
					return t.replace('a', 'A');//小a变大A
				}
				if(t.contains("b")) {
					return t.replace('b', '+');
				}
				return t;
			}
		});
		
		list.forEach(System.out::println);
	}
	//排序
	@Test
	public void test3() {
		List<String>sList=Arrays.asList(
				"子",
				"一段好多字的文字",
				"一个",
				"一个字",
				"好多个文子",
				"好一个字",
				"一段好多字文字"
				);
		sList.sort((a,b)->{
			if(a.length()>b.length()) {
				return 1;
			}
			if(a.length()<b.length()) {
				return -1;
			}
			if(a.length()==b.length()) {
				return 0;
			}
			return 0;
		});
		sList.forEach(System.out::println);
		System.out.println("￥￥￥￥￥￥￥￥￥￥￥￥￥￥");
		List<Book>bookList=Arrays.asList(
				new Book(0.2, "2毛书"),
				new Book(0.5, "五毛书"),
				new Book(0.3, "三毛书"),
				new Book(60, "这本书好贵"),
				new Book(5, "五个钢镚")
				);
		bookList.sort((Book b1,Book b2)->{
			if(b1.getPrice()>b2.getPrice()) {
				return -1;
			}
			if(b1.getPrice()<b2.getPrice()) {
				return 1;
			}
			return 0;
		});
		
		bookList.forEach(a->{
			System.out.println("书名：\t"+a.getName()+"价钱:\t"+a.getPrice());
		});
	}
}
