package com.jachs.io.bytes.writer;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.junit.Test;

/***
 * 
 * @author zhanchaohan
 *
 */
public class FileOutputStreamTest {
	private final static String FILEPATH="f:\\FileOutputStream.txt";
	
	@Test
	public void test1() throws Exception {
		FileOutputStream fos=new FileOutputStream(FILEPATH);
		
		fos.write(64);
		fos.write("\n".getBytes());
		fos.write("一行白鹭上青天".getBytes());
		fos.close();
	}
	//复制文件
	@Test
	public void test2() throws Exception{
		String fPath="E:\\EclipseWorkSpace\\Eclipse\\eclipse\\spring-roo-2.0.0.RELEASE.zip";
		String tPath="E:\\EclipseWorkSpace\\Eclipse\\eclipse\\copy.zip";
		
		int size=0;
		byte[]buff=new byte[1024];
		
		FileOutputStream fos=new FileOutputStream(tPath);
		FileInputStream fis=new FileInputStream(fPath);
		long sTime=System.currentTimeMillis();
		while(true) {
			size=fis.read(buff);//一次读一个数组
			if(size==-1) {
				break;
			}
			fos.write(buff, 0, size);//写入数组
			fos.flush();//刷新缓存
		}
		fis.close();
		fos.close();
		long eTime=System.currentTimeMillis();
		
		System.out.println("spend time:\t"+(eTime-sTime));
	}
}
