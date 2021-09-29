package com.jachs.jdk.io.character.writer;

import java.io.File;

import org.junit.Test;

/***
 * 
 * @author zhanchaohan
 *写入字符流的抽象类。子类必须实现的方法仅有 write(char[], int, int)、flush() 和 close()。但是，多数子类将重写此处定义的一些方法，以提供更高的效率和/或其他功能。 


 */
public class FilterWriterTest {
	private String filepath=FilterWriterTest.class.getResource("").getPath()+File.separator+"FilterWriter.txt";
	
	@Test
	public void test1() {
		
	}
}
