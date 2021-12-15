package com.jachs.io.characters.read;

import java.io.FileReader;
import java.io.LineNumberReader;

import org.junit.Test;

/***
 * 多了个LineNumber记录行数,没啥用
 * @author zhanchaohan
 *
 */
public class LineNumberReaderTest {
	private final static String FILEPATH="f:\\Buffered.txt";
	
	@Test
	public void test1() throws Exception {
		LineNumberReader  inr=new LineNumberReader(new FileReader(FILEPATH));
		
		inr.setLineNumber(2);
		String str=null;
		while((str=inr.readLine())!=null) {
			System.out.println(inr.getLineNumber()+"\t"+str);
		}
		inr.close();
	}
}
