package com.jachs.io.characters.read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.stream.Stream;

import org.junit.Test;

/***
 * 
 * @author zhanchaohan
 *@see com.jachs.io.characters.writer.BufferedWriterTest
 */
public class BufferedReaderTest {
	private final static String FILEPATH="f:\\Buffered.txt";
	
	@Test
	public void test1() throws IOException {
		BufferedReader br=new BufferedReader(new FileReader(FILEPATH));
		
		Stream<String>ss=br.lines();
		Iterator<String>is=ss.iterator();
		
		while(is.hasNext()) {
			System.out.println(is.next());
		}
		
		br.close();
	}
	@Test
	public void test2() throws IOException{
		BufferedReader br=new BufferedReader(new FileReader(FILEPATH));
		
		String str=null;
		while((str=br.readLine())!=null) {
			System.out.println(str);
		}
		br.close();
	}
	//这个mark,reset好使
	@Test
	public void test3() throws IOException{
		BufferedReader br=new BufferedReader(new FileReader(FILEPATH));
		
		br.mark(1);
		int index=0;
		while(true) {
			if(index>=10) {
				break;
			}
			if(index==5) {
				br.reset();
				System.out.println();
			}
			System.out.print((char)br.read());
			index++;
		}
		br.close();
	}
}
