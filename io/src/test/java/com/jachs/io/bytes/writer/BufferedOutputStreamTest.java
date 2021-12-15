package com.jachs.io.bytes.writer;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

import org.junit.Test;

/***
 * 提供了個默認的數組緩存
 * @author zhanchaohan
 *
 */
public class BufferedOutputStreamTest {
	private final static String FILEPATH="f:\\BufferedOutputStream.txt";
	private final static String TOKEN="^$^";
	private final static String TOKEN1="<!>";
	private final static String TOKEN2="△";
	
	@Test
	public void test1() throws Exception {
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(FILEPATH));
		
		bos.write("\n-----------------------打個正方形------------------------------------------\n".getBytes());
		for (int kk = 0; kk < 10; kk++) {
			bos.write("\n".getBytes());
			for (int nn = 0; nn < 10; nn++) {
				bos.write(TOKEN.getBytes());
			}
		}
		bos.write("\n-----------------------打個長方形------------------------------------------\n".getBytes());
		for (int kk = 0; kk < 10; kk++) {
			bos.write("\n".getBytes());
			for (int nn = 0; nn < 20; nn++) {
				bos.write(TOKEN1.getBytes());
			}
		}
		bos.write("\n-----------------------打個三角形------------------------------------------\n".getBytes());
		for (int kk = 0; kk < 20; kk++) {
			bos.write("\n".getBytes());
			for (int nn = 0; nn <kk+1; nn++) {
				bos.write(TOKEN2.getBytes());
			}
		}
		bos.close();
	}
}
