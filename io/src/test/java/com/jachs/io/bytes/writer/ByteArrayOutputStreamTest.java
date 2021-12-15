package com.jachs.io.bytes.writer;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.junit.Test;

/***
 * 緩衝數組,沒啥用byte[]字節集合也能做到只是大小得預知,ByteArrayOutputStream自己擴容還能轉byte[]
 * @author zhanchaohan
 *
 */
public class ByteArrayOutputStreamTest {
	private final static String FILEPATH="f:\\ByteArrayOutputStream.txt";
	
	//簡單寫入
	@Test
	public void test1() throws Exception {
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		
		baos.write("簡單的文字而已\n".getBytes());
		baos.write("ABCDEFGH\n".getBytes());
		for (int kk = 1; kk < 10; kk++) {
			baos.write("\n".getBytes());
			for (int nn = kk; nn < 10; nn++) {
				baos.write((kk+"*"+nn+"="+kk*nn+"\t").getBytes());
			}
		}
		baos.write("\n".getBytes());
		baos.write("************************************************************".getBytes());
		for(int aa=9;aa>0;aa--) {
			baos.write("\n".getBytes());
			for (int bb = aa-1; bb >0; bb--) {
				baos.write((aa+"*"+bb+"="+(aa*bb)+"\t").getBytes());
			}
		}
		baos.writeTo(new FileOutputStream(FILEPATH));
	}
	//作為緩存使用
	@Test
	public void test2() throws Exception{
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		
		FileInputStream fis=new FileInputStream(FILEPATH);
		FileOutputStream fos=new FileOutputStream("f:\\copy1.txt");
		FileOutputStream fos1=new FileOutputStream("f:\\copy2.txt");
		
		int byteCount=fis.available();//多少個字節
		System.out.println("源文件有多少個字節:\t"+byteCount);
		byte[]bList=new byte[byteCount];
		int rSize=fis.read(bList, 0, byteCount);
		System.out.println("讀取了多少個字節:\t"+rSize);
		baos.write(bList,0,byteCount);//讀取到緩存對象種,一次寫完
		
		baos.writeTo(fos);//copy一次
		baos.writeTo(fos1);//copy二次
		
		fis.close();
		fos.close();
		fos1.close();
	}
}
