package com.jachs.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Test;

import com.jachs.lambda.entity.Book;

/***
 * 
 * @author zhanchaohan
 *
 */
public class StreamTest {
	List<Book>lBook=new ArrayList<Book>();
	
	@Before
	public void init() {
		Book b1=new Book();
		b1.setPrice(1.2);
		b1.setName("zbc");
		
		Book b2=new Book();
		b2.setPrice(1.5);
		b2.setName("beq");
		
		Book b3=new Book();
		b3.setPrice(2.6);
		b3.setName("aaa");
		
		Book b4=new Book();
		b4.setPrice(5.6);
		b4.setName("AK47");
		
		Book b5=new Book();
		b5.setPrice(6.666);
		b5.setName("abcd");
		
		lBook.add(b1);
		lBook.add(b2);
		lBook.add(b3);
		lBook.add(b4);
		lBook.add(b5);
	}
	@Test
	public void test1() {
		//参数是一个对象（数组或者类对象）
		Stream.of(new String[]{"新根"});
		//参数是一个Supplier接口对象，该接口用于创建给定类型的对象。
		Stream.generate(() -> Math.random());
		//Stream.iterate(seed, f)方法创建：
		Stream.iterate("新", (params)->{ return params+"根";}).limit(1);
	}
	@Test
	public void test2() {
		String [] s=new String[]{
				"肃肃鸨羽，集于苞栩。王事靡盬，不能蓺稷黍。父母何怙？悠悠苍天，曷其有所？",
				"肃肃鸨翼，集于苞棘。王事靡盬，不能蓺黍稷。父母何食？悠悠苍天，曷其有极？",
				"肃肃鸨行，集于苞桑。王事靡盬，不能蓺稻粱。父母何尝？悠悠苍天，曷其有常？"};
		Arrays.asList(s)
		    .stream();
	}
	@Test
	public void test3() {
		//去重
		Stream.of(new String[]{
				"a",
				"b",
				"c",
				"d",
				"a",
				"e"
				}).distinct().forEach(System.out::print);
	}
	@Test
	public void test5() {
		//过滤统计
		long conut=Stream.of(new String[]{
				"a",
				"b",
				"c",
				"d",
				"A",
				"e"
		}).filter(s->s.equalsIgnoreCase("a")).count();
		System.out.println(conut);
		
		lBook.stream().filter((Book a)-> a.getName().matches("a.*"))
		.forEach(x -> System.out.println(x.getName()));;
	}
	@Test
	public void test6() {
		//限制数量
		Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);
		
		//先跳过，再排序
		Stream.of(88,77,1,2,10,52,65,159,5).skip(2).sorted((a,b)->a.compareTo(b)).forEach(System.out::println);
	}
	@Test
	public void test7() {
		//排序
		Stream.of(1,2,10,52,65,159,5).sorted((a,b)->a.compareTo(b)).forEach(System.out::println);
		System.out.println("-----------------------");
		lBook.stream().sorted((Book a,Book b)-> a.getName().compareTo(b.getName()))
		.forEach(a -> System.out.println(a.getName()));
		System.out.println("-----------------------");
		lBook.stream().sorted((a,b)->{
			if(a.getName().length()>b.getName().length())
				return 1;
			else if(a.getName().length()<b.getName().length())
				return -1;
			else
				return 0;
		}).forEach((a)->{
			System.out.println(a.getName()+"\t"+a.getPrice());
		});;
	}
	@Test
	public void test8() {
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
		
		System.out.println("列表中最大的数 : " + stats.getMax());
		System.out.println("列表中最小的数 : " + stats.getMin());
		System.out.println("所有数之和 : " + stats.getSum());
		System.out.println("平均数 : " + stats.getAverage());
	}
	
	@Test
	public void test9() {
	    List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
	    List<String> upperCaseNames = names.stream()
	                                       .map(String::toUpperCase)//转大写
	                                       .peek(System.out::println)// peek是一个中间操作方法，它接受一个Consumer函数作为参数，对流中的每个元素执行该函数。与forEach不同的是，peek方法会返回一个新的流，该流中的元素和原始流中的元素相同。
	                                       .collect(Collectors.toList());//转换List数组
	    
	    upperCaseNames.forEach (System.out::println);
	}
	
	//累计求和
	@Test
	public void test10() {
	    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
	    Optional<Integer> sum = numbers.stream()
	                                   .reduce((a, b) -> a + b);
	    sum.ifPresent(System.out::println); // 输出结果: 15
	}
}
