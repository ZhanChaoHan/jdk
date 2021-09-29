package com.jachs.jdk.io.character.writer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

import org.junit.Test;

/***
 * 
 * @author zhanchaohan OutputStreamWriter 是字符流通向字节流的桥梁：使用指定的 charset
 *         将要向其写入的字符编码为字节。它使用的字符集可以由名称指定或显式给定，否则可能接受平台默认的字符集。
 * 
 *         每次调用 write()
 *         方法都会针对给定的字符（或字符集）调用编码转换器。在写入基础输出流之前，得到的这些字节会在缓冲区累积。可以指定此缓冲区的大小，不过，默认的缓冲区对多数用途来说已足够大。注意，传递到此
 *         write() 方法的字符是未缓冲的。
 * 
 *         为了达到最高效率，可考虑将 OutputStreamWriter 包装到 BufferedWriter 中以避免频繁调用转换器。例如：
 * 
 *         Writer out = new BufferedWriter(new OutputStreamWriter(System.out));
 *         代理对 是一个字符，它由两个 char 值序列表示：高 代理项的范围为 '\uD800' 到 '\uDBFF'，它后面跟着范围为
 *         '\uDC00' 到 '\uDFFF' 的低 代理项。如果由代理项对表示的字符无法由给定的字符集编码，则把依赖于字符集的替代序列
 *         写入输出流。
 * 
 *         错误代理元素
 *         指的是后面不跟低代理项的高代理项，或前面没有高代理项的低代理项。尝试写入包含错误代理元素的字符流是非法的。写入错误代理元素时，此类实例的行为是不确定的。
 * 
 * 
 */
public class OutputStreamWriterTest {
	private String filepath = OutputStreamWriterTest.class.getResource("").getPath() + File.separator
			+ "OutputStreamWriter.txt";

	@Test
	public void test1() throws Exception {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filepath));
		OutputStreamWriter osw1 = new OutputStreamWriter(new FileOutputStream(filepath), "UTF-8");
		OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream(filepath), Charset.defaultCharset());
//		OutputStreamWriter  osw3=new OutputStreamWriter(new FileOutputStream(filepath), new CharsetEncoder());

	}
}
