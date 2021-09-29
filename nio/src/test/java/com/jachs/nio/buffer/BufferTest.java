package com.jachs.nio.buffer;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import org.junit.Test;

/**
 * 1.capacity
 * 作为一个内存块，Buffer有一个固定的大小值，也叫“capacity”.你只能往里写capacity个byte、long，char等类型。一旦Buffer满了，
 * 需要将其清空（通过读数据或者清除数据）才能继续写数据往里写数据。<br>
 * 2.position<br>
 * 当你写数据到Buffer中时，position表示当前的位置。初始的position值为0.当一个byte、long等数据写到Buffer后，<br>
 * position会向前移动到下一个可插入数据的Buffer单元。position最大可为capacity.
 * 当读取数据时，也是从某个特定位置读。当将Buffer从写模式切换到读模式，position会被重置为0.
 * 当从Buffer的position处读取数据时，position向前移动到下一个可读的位置。<br>
 * 3.limit<br>
 * 在写模式下，Buffer的limit表示你最多能往Buffer里写多少数据。 写模式下，limit等于Buffer的capacity。
 * 当切换Buffer到读模式时，
 * limit表示你最多能读到多少数据。因此，当切换Buffer到读模式时，limit会被设置成写模式下的position值。换句话说，你能读到之前写入的所有数据（limit被设置成已写数据的数量，这个值在写模式下就是position）
 * ------------------------------------------------------------------ 主要方法
 * rewind()方法
 * Buffer.rewind()将position设回0，所以你可以重读Buffer中的所有数据。limit保持不变，仍然表示能从Buffer中读取多少个元素（byte、char等）。
 * 
 * flip()方法
 * flip方法将Buffer从写模式切换到读模式。调用flip()方法会将position设回0，并将limit设置成之前position的值。
 * 换句话说，position现在用于标记读的位置，limit表示之前写进了多少个byte、char等 —— 现在能读取多少个byte、char等
 * 
 * clear()与compact()方法 ​
 * 一旦读完Buffer中的数据，需要让Buffer准备好再次被写入。可以通过clear()或compact()方法来完成。
 * 如果调用的是clear()方法，position将被设回0，limit被设置成 capacity的值。换句话说，Buffer
 * 被清空了。Buffer中的数据并未清除，只是这些标记告诉我们可以从哪里开始往Buffer里写数据。
 * 如果Buffer中有一些未读的数据，调用clear()方法，数据将“被遗忘”，意味着不再有任何标记会告诉你哪些数据被读过，哪些还没有。
 * 如果Buffer中仍有未读的数据，且后续还需要这些数据，但是此时想要先写些数据，那么使用compact()方法。
 * 
 * compact()方法将所有未读的数据拷贝到Buffer起始处。然后将position设到最后一个未读元素正后面。limit属性依然像clear()方法一样，设置成capacity。现在Buffer准备好写数据了，但是不会覆盖未读的数据。
 * 
 * mark()与reset()方法
 * 通过调用Buffer.mark()方法，可以标记Buffer中的一个特定position。之后可以通过调用Buffer.reset()方法恢复到这个position。例如：
 * buffer.mark(); //添加标记 buffer.reset();//恢复到标记位置
 * 
 * @author zhanchaohan
 *
 */
public class BufferTest {

	@Test
	public void test1() throws IOException {
		RandomAccessFile aFile = new RandomAccessFile("F:\\assss.txt", "rw");
		FileChannel inChannel = aFile.getChannel();
		// create buffer with capacity of 48 bytes
		ByteBuffer buf = ByteBuffer.allocate(48);
		int bytesRead = inChannel.read(buf); // read into buffer.
		while (bytesRead != -1) {
			buf.flip(); // make buffer ready for read
			while (buf.hasRemaining()) {
				System.out.print((char) buf.get()); // read 1 byte at a time
			}
			buf.clear(); // make buffer ready for writing
			bytesRead = inChannel.read(buf);
		}
		aFile.close();
	}

	@Test
	public void test2() {
		// 1.创建缓冲区指定容量
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		// 2.写入数据
		buffer.put("hello".getBytes());// 缓冲区只能读取字节，将String转换成字节
		// 3.把写入模式换成读取模式
		buffer.flip();
		/*
		 * //单个读取 byte b=buffer.get(); System.out.println((char)b);
		 */
		// 读取
		byte[] date = new byte[buffer.limit()];// 创建一个数组，长度为限制位置即可
		buffer.get(date);// 读取数组中的数据
		System.out.println(new String(date));// 转成字符串输出
		buffer.clear();// 清空缓冲区
	}
}
