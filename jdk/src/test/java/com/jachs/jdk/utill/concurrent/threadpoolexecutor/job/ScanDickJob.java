package com.jachs.jdk.utill.concurrent.threadpoolexecutor.job;

import java.io.File;
import java.io.PrintWriter;

import com.jachs.jdk.utill.concurrent.threadpoolexecutor.ThreadPoolExecutorTest;

/***
 * 
 * @author zhanchaohan
 *
 */
public class ScanDickJob implements Runnable{
	private File rootPath;
	PrintWriter pw=null;
	
	public ScanDickJob(File rootPath) {
		super();
		this.rootPath = rootPath;
	}

	public void run() {
		String filePath=ThreadPoolExecutorTest.class.getResource("").getPath()+File.separator+Thread.currentThread().getName()+".txt";
		try {
			 pw=new PrintWriter(filePath);
			
			 loopFolder(rootPath.listFiles());
			 pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void loopFolder(File[] fList) {
		for (File file : fList) {
			if(file.isDirectory()) {
				loopFolder(file.listFiles());
			}else {
				pw.write(file.getAbsolutePath());
				pw.write("\n");
			}
		}
	}
}
