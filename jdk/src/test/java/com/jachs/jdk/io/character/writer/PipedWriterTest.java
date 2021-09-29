package com.jachs.jdk.io.character.writer;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

import org.junit.Test;

/***
 * 
 * @author zhanchaohan 传送的字符输出流。
 */
public class PipedWriterTest {
	PipedWriter pipedWriter = new PipedWriter();

	@Test
	public void test1() throws IOException {
		pipedWriter.append('a');
		
		pipedWriter.write('b');
		
		pipedWriter.write(new char[] {'a','b','c','d','e'}, 1, 5);
		
		PipedReader pr=new PipedReader();
		pr.connect(null);
		pipedWriter.connect(null);
	}
}
