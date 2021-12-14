package com.jachs.io.characters.writer;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import org.junit.Test;

/***
 * 
 * @author zhanchaohan
 *
 */
public class CharArrayWriterTest {
	
	@Test
	public void test1() throws IOException {
		FileWriter fw=new FileWriter("f:\\wt.txt");
		
		CharArrayWriter writer=new CharArrayWriter();
		
		writer.write("一个没啥用的对象主要缓存一个字符串集合写入到其他writer中");
		writer.flush();
		writer.writeTo(fw);
		
		writer.close();
		fw.close();
	}
	@Test
	public void test2() throws IOException {
		FileWriter fw=new FileWriter("f:\\wt.txt");
		
		CharArrayWriter writer=new CharArrayWriter();
		
		writer.write("一个没啥用的对象主要缓存一个字符串集合写入到其他writer中");
		writer.reset();
		writer.write("输出这句内容上面被重置");
		writer.writeTo(fw);
		
		writer.close();
		fw.close();
	}
	
}
