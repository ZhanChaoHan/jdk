package com.jachs.io.characters.read;

import java.io.CharArrayReader;

import org.junit.Test;

/***
 * 没啥用
 * @author zhanchaohan
 *
 */
public class CharArrayReaderTest {
	private final static String FILEPATH="f:\\wt.txt";
	
	@Test
	public void test1() {
		char[] cList=new char[] {'a','b','汉','硬','看','D','e','v','A'};
		CharArrayReader car=new CharArrayReader(cList);
		
	}
}
