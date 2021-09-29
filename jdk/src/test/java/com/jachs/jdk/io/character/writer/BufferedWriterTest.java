package com.jachs.jdk.io.character.writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

/***
 * 
 * @author zhanchaohan</br>
 *         将文本写入字符输出流，缓冲各个字符，从而提供单个字符、数组和字符串的高效写入。 </br>
 *         可以指定缓冲区的大小，或者接受默认的大小。在大多数情况下，默认值就足够大了。 </br>
 *         该类提供了 newLine() 方法，它使用平台自己的行分隔符概念，此概念由系统属性 line.separator
 *         定义。并非所有平台都使用新行符 ('\n') 来终止各行。因此调用此方法来终止每个输出行要优于直接写入新行符。 </br>
 *         通常 Writer 将其输出立即发送到基础字符或字节流。除非要求提示输出，否则建议用 BufferedWriter 包装所有其
 *         write() 操作可能开销很高的 Writer（如 FileWriters 和 OutputStreamWriters）。例如，
 *         </br>
 *         PrintWriter out= new PrintWriter(new BufferedWriter(new
 *         FileWriter("foo.out")));</br>
 *         将缓冲 PrintWriter 对文件的输出。如果没有缓冲，则每次调用 print()
 *         方法会导致将字符转换为字节，然后立即写入到文件，而这是极其低效的。 </br>
 */
public class BufferedWriterTest {
	private String filepath=BufferedWriterTest.class.getResource("").getPath()+File.separator+"BufferedWriterTest.txt";
	
	@Test
	public void test1() throws IOException {
		BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(new File(filepath)));
		
		bufferedWriter.write('a');
		bufferedWriter.write("\n");
		bufferedWriter.write(2);
		bufferedWriter.write("\n");
		bufferedWriter.write("a");
		bufferedWriter.write("\n");
		bufferedWriter.write(new char[] {'a','b','c','d','e','f'}, 1, 3);
		bufferedWriter.write("\n");
		bufferedWriter.write("abcdefg", 1, 3);
		bufferedWriter.write("\n");
		bufferedWriter.flush();
		
		bufferedWriter.close();
	}
}
