package com.jachs.io.characters.writer;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import org.junit.Test;

/***
 * 效果基本等同FileWriter,不过给了个默认缓存空间defaultCharBufferSize=8192。
 * @author zhanchaohan
 *
 */
public class BufferedWriterTest {
	private final static String FILEPATH="f:\\Buffered.txt";
	
	@Test
	public void test1() throws IOException {
		Writer writer=new BufferedWriter(new FileWriter(FILEPATH));
		
		writer.write("AAAAA");
		writer.write("\n");
		writer.append("BBBBBB");
		writer.write("\n");
		writer.write(64);
		writer.write("一段中文汉字差距和国宾宾馆本或我全微分还得百度阿擦擦个人");
		writer.close();
	}
}
