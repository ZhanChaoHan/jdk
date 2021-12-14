package com.jachs.io.characters.writer;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;

import org.junit.Test;

/***
 * 可以格式化
 * @author zhanchaohan
 *
 */
public class PrintWriterTest {
	private final static String FILEPATH="f:\\PrintWriter.txt";
	
	@Test
	public void test1() throws FileNotFoundException {
		PrintWriter pw=new PrintWriter(FILEPATH);
		
		pw.print("print 一行文字");
		pw.write("\n");
		pw.write("write 一行文字");
		pw.write("\n");
		
		pw.format("%tF", new Date());
		pw.close();
	}
}
