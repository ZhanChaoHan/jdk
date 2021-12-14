package com.jachs.io;

import java.io.File;
import java.lang.management.ManagementFactory;
import com.sun.management.OperatingSystemMXBean;

import org.junit.Test;

/***
 * 文件操作對象
 * @author zhanchaohan
 *
 */
public class FileTest {
	
	@Test
	public void test1() {
		String filePath=FileTest.class.getResource("/io.jpg").getPath();
		
		File fs=new File(filePath);
		
		System.out.println("是否可執行:\t"+fs.canExecute());
		System.out.println("是否可讀:\t"+fs.canRead());
		System.out.println("文件可写:\t"+fs.canWrite());
		System.out.println("文件名稱:\t"+fs.getName());
		
	}
	//重命名
	@Test
	public void test2() {
		File fs=new File("f:\\assss.txt");
		
		fs.renameTo(new File("f:\\a.txt"));
	}
	//获取磁盘情况
	@Test
	public void getDiskInfo(){
		File[] disks = File.listRoots();
        for(File file : disks)
        {
            System.out.print(file.getPath() + "    ");
            System.out.print("空闲未使用 = " + file.getFreeSpace() / 1024 / 1024 + "M" + "    ");// 空闲空间
            System.out.print("已经使用 = " + file.getUsableSpace() / 1024 / 1024 + "M" + "    ");// 可用空间
            System.out.print("总容量 = " + file.getTotalSpace() / 1024 / 1024 + "M" + "    ");// 总空间
            System.out.println();
        }
	}
	//获取内存情况
	@Test
	public  void getMemInfo()
    {
        OperatingSystemMXBean mem = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
        System.out.println("Total RAM：" + mem.getTotalPhysicalMemorySize() / 1024 / 1024 + "MB");
        System.out.println("Available　RAM：" + mem.getFreePhysicalMemorySize() / 1024 / 1024 + "MB");
    }
}
