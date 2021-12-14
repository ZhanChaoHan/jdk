package com.jachs.io.characters.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

/***
 * 最基础的实现类
 * @author zhanchaohan
 *
 */
public class FileWriterTest {
	private final static String FILEPATH="f:\\FileWriter.txt";
	
	@Test
	public void testA() throws IOException {
		FileWriter writer=new FileWriter(new File(""));
		
		FileWriter writer1=new FileWriter("",true);
	}
	@Test
	public void test1() throws IOException {
		FileWriter writer=new FileWriter(FILEPATH);
		
		writer.write(new char[] {'a','b','c'});
		writer.write("\n");
		writer.write(6);
		writer.write("\n");
		writer.write("hello");
		writer.write("\n");
		writer.write("worldAAABBB", 1, 5);
		writer.write("\n");
		writer.write(new char[] {'中','北','南','西','東','M','A'}, 2, 4);
		writer.close();
	}
	@Test
	public void test2() throws IOException{
		//带追加构造方法,默认为false不追加直接覆盖,true为源文件基础上追加内容
		FileWriter writer=new FileWriter(FILEPATH,true);
		
		writer.append("OH 動詞");
		writer.write("\n");
		writer.append("一大行文字只取範圍2-6", 2, 6);
		
		writer.close();
	}
}
