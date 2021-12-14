package com.jachs.io.characters.writer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.junit.Test;

/***
 * 可以设置编码
 * @author zhanchaohan
 *
 */
public class OutputStreamWriterTest {
	private final static String FILEPATH="f:\\OutputStreamWriter.txt";
	
	@Test
	public void test1() throws IOException {
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream(FILEPATH),"UTF-8");
		osw.write("一段文字");
		osw.close();
	}
	@Test
	public void test2() throws IOException {
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream(FILEPATH),"ISO-8859-7");
		osw.write("一段文字");
		osw.close();
	}
}
