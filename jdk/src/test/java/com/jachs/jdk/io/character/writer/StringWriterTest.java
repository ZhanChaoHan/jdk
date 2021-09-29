package com.jachs.jdk.io.character.writer;

import java.io.StringWriter;

import org.junit.Test;

/***
 * 
 * @author zhanchaohan
 *一个字符流，可以用其回收在字符串缓冲区中的输出来构造字符串。 
	关闭 StringWriter 无效。在关闭此流后且没有生成 IOException 时，可以调用此类中的该方法。 
 */
public class StringWriterTest {
	
	@Test
	public void test1() {
		StringWriter stringWriter=new StringWriter();
		
	}
}
