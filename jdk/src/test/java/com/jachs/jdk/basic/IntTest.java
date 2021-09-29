package com.jachs.jdk.basic;

import org.junit.Test;

/**
 * @author zhanchaohan</br>
 *         int 数据类型是32位、有符号的以二进制补码表示的整数；</br>
 *         最小值是 -2,147,483,648（-2^31）；</br>
 *         最大值是 2,147,483,647（2^31 - 1）；</br>
 *         一般地整型变量默认为 int 类型；</br>
 *         默认值是 0 ；</br>
 *         例子：int a = 100000, int b = -200000。</br>
 */
public class IntTest {
    
    @Test
    public void test1() {
        System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);  
        System.out.println("包装类：java.lang.Integer");  
        System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);//-2147483648
        System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);//2147483647
    }
    @Test
    public void test2() {
        int error=-2147483648-1;
        System.out.println ( error );
        int error1=2147483647+1;
        System.out.println ( error1 );
        
    }
}
