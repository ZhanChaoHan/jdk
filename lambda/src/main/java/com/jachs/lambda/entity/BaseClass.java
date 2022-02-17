package com.jachs.lambda.entity;

import com.jachs.lambda.entity.BaseInterface.NoReturnMultiParam;
import com.jachs.lambda.entity.BaseInterface.NoReturnNoParam;
import com.jachs.lambda.entity.BaseInterface.ReturnOneParam;

/***
 * 
 * @author zhanchaohan
 *
 */
public class BaseClass implements NoReturnMultiParam,NoReturnNoParam,ReturnOneParam{

	@Override
	public void method() {
		System.out.println("实现接口无参方法");
	}

	@Override
	public void method(int a, int b) {
		System.out.println("实现接口带参方法:\t"+(a+b));
	}
	@Override
	public int method(int a) {
		return a;
	}
	 /**
     * 要求
     * 1.参数数量和类型要与接口中定义的一致
     * 2.返回值类型要与接口中定义的一致
     */
	public void a() {
		System.out.println("无参方法");
	}
	public void a(int ac,int bc) {
		System.out.println("带参方法:\t"+(ac+bc));
	}
	public int a(int a) {
		return a;
	}
	
}
