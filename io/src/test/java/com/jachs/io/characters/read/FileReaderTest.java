package com.jachs.io.characters.read;


import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

/***
 * 
 * @author zhanchaohan
 *@see com.jachs.io.characters.writer.FileWriterTest
 */
public class FileReaderTest {
	private final static String FILEPATH="f:\\FileWriter.txt";
	
	//一次读一个字符
	@Test
	public void test1() throws IOException {
		FileReader fr=new FileReader(FILEPATH);
		
		int byT=fr.read();//一次读一个字节
		
		System.out.println(byT);
		System.out.println((char)byT);
		fr.close();
	}
	//读二个字符
	@Test
	public void test2() throws IOException {
		FileReader fr=new FileReader(FILEPATH);
		
		int by1=fr.read();//一次读一个字节
		int by2=fr.read();//再读一个字节
		
		System.out.println(by1+"\t"+(char)by1);
		System.out.println(by2+"\t"+(char)by2);
		fr.close();
	}
	//往缓存数组读字符
	@Test
	public void test3() throws IOException {
		char []bList=new char[20];//读20个字符
		FileReader fr=new FileReader(FILEPATH);
		fr.read(bList);
		
		for (char c : bList) {
			System.out.print(c);
		}
		fr.close();
	}
	//跳过部分字符读
	@Test
	public void test5() throws IOException {
		FileReader fr=new FileReader(FILEPATH);
		fr.skip(20);//跳过20个字符
		char[]bList=new char[1024];//存放剩下的字符
		fr.read(bList);//一次读1024个字符往数组
		for (char c : bList) {//打印
			System.out.print(c);
		}
		fr.close();
	}
	@Test
	public void test6() throws IOException{
		FileReader fr=new FileReader(FILEPATH);
		
		int count=10;
		fr.mark(0);
		while(count>=0) {
			System.out.print((char)fr.read());
			if(count==5) {//读5个字符重置下标从头开始读
				fr.reset();//不支持reset,也不支持mark。貌似字节流支持
			}
			count--;
		}
		
		fr.close();
	}
}
