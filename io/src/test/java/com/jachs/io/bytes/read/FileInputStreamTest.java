package com.jachs.io.bytes.read;

import java.io.FileInputStream;

import org.junit.Test;

/***
 * 
 * @author zhanchaohan
 *
 */
public class FileInputStreamTest {
	private final static String FILEPATH="f:\\FileOutputStream.txt";
	
	@Test
	public void test1() throws Exception {
		FileInputStream fis=new FileInputStream(FILEPATH);
		
	}
}
