package com.jachs.lambda.function;

import java.util.function.Function;

import org.junit.Test;

/***
name			type					description</br>
Consumer	Consumer< T >			接收T对象，不返回值</br>
Predicate	Predicate< T >			接收T对象并返回boolean</br>
Function	Function< T, R >		接收T对象，返回R对象</br>
Supplier	Supplier< T >			提供T对象（例如工厂），不接收值</br>
UnaryOperator	UnaryOperator		接收T对象，返回T对象</br>
BinaryOperator	BinaryOperator		接收两个T对象，返回T对象</br>
————————————————
 * @author zhanchaohan
 *
 */
public class Demo {

	@Test
	public void test1() {
		Function<String,Integer>fun=a->{return a.hashCode();};
		System.out.println(fun.apply("ABC"));
		
		Function<String,String>fun1=a->{return a.toUpperCase();};
		System.out.println(fun1.apply("abcd"));
	}
}
