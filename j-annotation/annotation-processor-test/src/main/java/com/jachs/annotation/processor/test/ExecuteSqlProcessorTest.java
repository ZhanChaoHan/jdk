package com.jachs.annotation.processor.test;


import java.io.IOException;

import com.jachs.annotation.part2.ExecuteSQL;
import com.jachs.annotation.part3.CreateClass;

/***
 * 
 * @author zhanchaohan
 *
 */
public class ExecuteSqlProcessorTest {
	@ExecuteSQL(connectURL = "",driverClass = "",excuteSQLText = "",passWorld = "",userName = "")
	public void b(){}
	
	public void cje() {}
	@CreateClass(className = "GuguBird")
	public class d{};
	
	public static void main(String[] args) throws IOException {
		System.out.println("OK");
	}
}
