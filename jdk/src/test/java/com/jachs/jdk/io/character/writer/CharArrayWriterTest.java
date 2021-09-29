package com.jachs.jdk.io.character.writer;

import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

/***
 * 
 * @author zhanchaohan </br>
 *         此类实现一个可用作 Writer 的字符缓冲区。缓冲区会随向流中写入数据而自动增长。可使用 toCharArray() 和
 *         toString() 检索数据。 </br>
 *         注：在此类上调用 close() 无效，并且在关闭该流后可以调用此类中的各个方法，而不会产生任何 IOException。 </br>
 */
public class CharArrayWriterTest {
	private String filepath=CharArrayWriterTest.class.getResource("").getPath()+File.separator+"CharArrayWriterTest.txt";
	CharArrayWriter charArrayWriter=new CharArrayWriter();
	
	@Test
	public void test1() throws IOException {
		charArrayWriter.append('a');// 将指定字符追加到此 writer。
		charArrayWriter.write("\n");
		charArrayWriter.write('b');
		charArrayWriter.write("\n");
//		charArrayWriter.reset();//重置该缓冲区，以便再次使用它而无需丢弃已分配的缓冲区。
		
		charArrayWriter.write(filepath, 5, 12);
		charArrayWriter.write("\n");
		charArrayWriter.flush();
		FileWriter fw=new FileWriter(filepath);
		fw.write(charArrayWriter.toCharArray());
		fw.close();
	}
}
