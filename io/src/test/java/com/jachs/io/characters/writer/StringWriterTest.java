package com.jachs.io.characters.writer;

import java.io.IOException;
import java.io.StringWriter;

import org.junit.Test;

/***
 * 看不出来跟StringBuffer有啥区别
 * @author zhanchaohan
 *
 */
public class StringWriterTest {
	
	@Test
	public void test1() throws IOException {
		StringWriter sw=new StringWriter();
		
		sw.append("啊啊啊啊");
		
		sw.write("噢噢噢噢");
		
		StringBuffer sb=sw.getBuffer();
		System.out.println(sb.toString());
		sw.close();
	}
}
