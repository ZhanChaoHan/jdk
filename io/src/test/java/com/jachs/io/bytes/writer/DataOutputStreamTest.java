package com.jachs.io.bytes.writer;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

import org.junit.Test;

/***
 * 
 * @author zhanchaohan
 *
 */
public class DataOutputStreamTest {
	private final static String FILEPATH="f:\\DataOutputStream.txt";
	
	@Test
	public void test1() throws Exception {
		DataOutputStream dos=new DataOutputStream(new FileOutputStream(FILEPATH));
		
		dos.write(new byte[] {'a','b'});
		dos.write("\n".getBytes());
		dos.write(66);
		dos.write("\n".getBytes());
		dos.writeBoolean(false);
		dos.write("\n".getBytes());
		dos.writeByte(66);
		dos.write("\n".getBytes());
		dos.writeBytes("bytes");
		dos.write("\n".getBytes());
		dos.writeChar(65);
		dos.write("\n".getBytes());
		dos.writeChars("aaaa");
		dos.write("\n".getBytes());
		dos.writeDouble(6.32);
		dos.write("\n".getBytes());
		dos.writeFloat(0.6f);
		dos.write("\n".getBytes());
		dos.writeInt(66);
		dos.write("\n".getBytes());
		dos.writeLong(123456L);
		dos.write("\n".getBytes());
		dos.writeShort(2);
		dos.write("\n".getBytes());
		dos.writeUTF("UTF字符串");
		dos.write("\n".getBytes());
		dos.close();
	}
}
