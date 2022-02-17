package com.jachs.lambda;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.jachs.lambda.BaseInterface.NoReturnMultiParam;
import com.jachs.lambda.BaseInterface.NoReturnNoParam;
import com.jachs.lambda.BaseInterface.NoReturnOneParam;
import com.jachs.lambda.BaseInterface.ReturnMultiParam;
import com.jachs.lambda.BaseInterface.ReturnNoParam;
import com.jachs.lambda.BaseInterface.ReturnOneParam;
import com.jachs.lambda.BaseInterface.initList;

/***
 * 实现接口或匿名内部类<br>
 * a -><br>
 * a ->{}<br>
 * () -><br>
 * (a,b) -><br>
 * @author zhanchaohan
 *
 */
public class Base {
	
	@Test
	public void test1() {
		//无参无返回
        NoReturnNoParam noReturnNoParam = () -> {
            System.out.println("NoReturnNoParam");
        };
        noReturnNoParam.method();
        
        //一个参数无返回
        NoReturnOneParam noReturnOneParam = (int a) -> {
            System.out.println("NoReturnOneParam param:" + a);
        };
        noReturnOneParam.method(6);

        //多个参数无返回
        NoReturnMultiParam noReturnMultiParam = (int a, int b) -> {
            System.out.println("NoReturnMultiParam param:" + "{" + a +"," + + b +"}");
        };
        noReturnMultiParam.method(6, 8);

        //无参有返回值
        ReturnNoParam returnNoParam = () -> {
            System.out.print("ReturnNoParam");
            return 1;
        };

        int res = returnNoParam.method();
        System.out.println("return:" + res);

        //一个参数有返回值
        ReturnOneParam returnOneParam = (int a) -> {
            System.out.println("ReturnOneParam param:" + a);
            return 1;
        };

        int res2 = returnOneParam.method(6);
        System.out.println("return:" + res2);

        //多个参数有返回值
        ReturnMultiParam returnMultiParam = (int a, int b) -> {
            System.out.println("ReturnMultiParam param:" + "{" + a + "," + b +"}");
            return 1;
        };

        int res3 = returnMultiParam.method(6, 8);
        System.out.println("return:" + res3);
	}
	//语法简化
	@Test
	public void test2() {
		//1.简化参数类型，可以不写参数类型，但是必须所有参数都不写
        NoReturnMultiParam lamdba1 = (a, b) -> {
            System.out.println("简化参数类型");
        };
        lamdba1.method(1, 2);

        //2.简化参数小括号，如果只有一个参数则可以省略参数小括号
        NoReturnOneParam lambda2 = a -> {
            System.out.println("简化参数小括号");
        };
        lambda2.method(1);

        //3.简化方法体大括号，如果方法条只有一条语句，则可以胜率方法体大括号
        NoReturnNoParam lambda3 = () -> System.out.println("简化方法体大括号");
        lambda3.method();

        //4.如果方法体只有一条语句，并且是 return 语句，则可以省略方法体大括号
        ReturnOneParam lambda4 = a -> a+3;
        System.out.println(lambda4.method(5));

        ReturnMultiParam lambda5 = (a, b) -> a+b;
        System.out.println(lambda5.method(1, 1));
	}
	//方法归属者::方法名 静态方法的归属者为类名，普通方法归属者为对象
	@Test
	public void test3() {
		BaseClass bClass=new BaseClass();
		NoReturnMultiParam noParam=bClass::method;
		NoReturnNoParam noReturn=bClass::method;
		ReturnOneParam returnParam=bClass::method;
		
		
		noParam.method(3, 3);
		noReturn.method();
		System.out.println("传参返回:\t"+returnParam.method(8));
		
		System.out.println("-------不实现接口，一样参数一样返回值方法---------");
		
		NoReturnMultiParam nToParam=bClass::a;
		NoReturnNoParam nToReturn=bClass::a;
		ReturnOneParam reTturnParam=bClass::a;
		nToParam.method(5, 5);
		nToReturn.method();
		System.out.println("传参返回:\t"+reTturnParam.method(6));
	}
	/**
	 * 构造方法的引用<br>
	 * 一般我们需要声明接口，该接口作为对象的生成器，通过 类名::new 的方式来实例化对象，然后调用方法返回对象
	 */
	@Test
	public void test5() {
		initList ll=ArrayList::new;
		
		List<String> sList=ll.sList();
		
		System.out.println(sList.size());
	}
}
