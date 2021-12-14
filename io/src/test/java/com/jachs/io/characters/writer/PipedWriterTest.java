package com.jachs.io.characters.writer;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

import org.junit.Test;

/***
 * 管道流
 * @author zhanchaohan
 *
 */
public class PipedWriterTest {
	
	@Test
	public void test1() throws IOException {
		char []cList=new char[5];
		PipedWriter pw=new PipedWriter();
		PipedReader pr=new PipedReader();
		pw.connect(pr);
		
		
		pw.write(new char[] {'顶','能','啊','额','超'});
		pr.read(cList);
		
		for (char c : cList) {
			System.out.print(c);
		}
		pw.close();
		pr.close();
	}
}
