package com.jachs.jdk.basic;

import org.junit.Test;

/**
 * @author zhanchaohan
 * 
 */
public class PrintTest {
    String prefix = "hello";
    String suffix = "world";

    @Test
    public void test1 () {
        System.out.println ( prefix + "\n" + suffix );//换行 (0x0a)
        System.out.println ( prefix + "\r" + suffix );//回车 (0x0d)
        System.out.println ( prefix + "\f" + suffix );//换页符(0x0c)
        System.out.println ( prefix + "\b" + suffix );//退格 (0x08)
        System.out.println ( prefix + "\0" + suffix );//空字符 (0x0)
        //        System.out.println (prefix+ "\s" +suffix);//空格 (0x20)
        System.out.println ( prefix + "\t" + suffix );//制表符
        System.out.println ( prefix + "\"" + suffix );//双引号
        //        System.out.println (prefix+ "\ddd" +suffix  );//八进制字符 (ddd)
    }

    /***
     * 自动类型转换</br>
     * 整型、实型（常量）、字符型数据可以混合运算。运算中，不同类型的数据先转化为同一类型，然后进行运算。</br>
     * 转换从低级到高级。</br>
     * 低 ------------------------------------> 高</br>
     * byte,short,char—> int —> long—> float —> double </br>
     */
    @Test
    public void test2 () {
        System.out.println ( (int) 23.7 == 23 );
        System.out.println ( (int) -45.89f == -45 );

        char c1 = 'a';//定义一个char类型
        int i1 = c1;//char自动类型转换为int
        System.out.println ( "char自动类型转换为int后的值等于" + i1 );
        char c2 = 'A';//定义一个char类型
        int i2 = c2 + 1;//char 类型和 int 类型计算
        System.out.println ( "char类型和int计算后的值等于" + i2 );
    }

    /***
     * 1. 条件是转换的数据类型必须是兼容的。</br>
     * 2. 格式：(type)value type是要强制类型转换后的数据类型 实例：</br>
     */
    @Test
    public void test3 () {
        int i1 = 123;
        byte b = (byte) i1;//强制类型转换为byte
        System.out.println ( "int强制类型转换为byte后的值等于" + b );
    }
}
