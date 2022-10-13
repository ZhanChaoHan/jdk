package com.jachs.thread.threadlocal.part2;

import java.util.List;
import java.util.function.Supplier;

/***
 * 
 * @author zhanchaohan
 *
 */
public class Demo {
	//初始化变量
	static ThreadLocal<List<String>> tl_1 = ThreadLocal.withInitial(new Supplier<List<String>>() {
		@Override
		public List<String> get() {
			return List.of("a", "b","c");
		}
	});
	static ThreadLocal<List<String>> tl_2 = ThreadLocal.withInitial(new Supplier<List<String>>() {
		@Override
		public List<String> get() {
			return List.of("d", "e","f");
		}
	});
	static ThreadLocal<List<String>> tl_3 = ThreadLocal.withInitial(new Supplier<List<String>>() {
		@Override
		public List<String> get() {
			return List.of("g", "h","i");
		}
	});
	public static void main(String[] args) {
		new Thread(new Td1()).start();
		new Thread(new Td2()).start();
		new Thread(new Td3()).start();
	}
}
