package com.jachs.jdk.utill;

import java.util.Random;

import org.junit.Test;

/***
 * 随机数生成
 * @author zhanchaohan
 *
 */
public class RandomTest {
	private Random random = new Random();

	@Test
	public void test1() {
		//随机生成一个布尔类型
		System.out.println(random.nextBoolean());
	}
	@Test
	public void test2() {
		//随机生成一个双精度
		System.out.println(random.nextDouble());
	}
	@Test
	public void test3() {
		//随机生成单精度
		System.out.println(random.nextFloat());
	}
	@Test
	public void test4() {
		//返回下一个伪随机数，它是从此随机数生成器的序列中取出的、呈高斯（“正常地”）分布的 double 值，其平均值是 0.0，标准偏差是 1.0。
		System.out.println(random.nextGaussian());
	}
	@Test
	public void test5() {
		//随机生成一个数字
		System.out.println(random.nextInt());
	}
	@Test
	public void test6() {
		//返回一个伪随机数，它是从此随机数生成器的序列中取出的、在 0（包括）和指定值（不包括）之间均匀分布的 int值。
		System.out.println(random.nextInt(6));
	}
	@Test
	public void test7() {
		//返回下一个伪随机数，它是从此随机数生成器的序列中取出的、均匀分布的 long 值。
		System.out.println(random.nextLong());
	}
}
