package com.jachs.jdk.math;

import java.math.BigInteger;

import org.junit.Test;

/**
 * @author zhanchaohan
 * 
 */
public class BigIntegerTest {
    BigInteger aInt=new BigInteger("2222222222222222");
    BigInteger bInt=new BigInteger("6666666666666666");
    
    @Test
    public void test1() {
        //相加
        System.out.println ( aInt.add ( bInt ).toString () );
        //相减
        System.out.println ( bInt.subtract ( aInt ).toString () );
        //相乘
        System.out.println ( aInt.multiply ( bInt ).toString () );
        //相除
        System.out.println ( bInt.divide ( aInt ).toString () );
    }
    @Test
    public void test2() {
        System.out.println ("abs:\t"+ aInt.abs () );//返回大整数的绝对值
        System.out.println ("and:\t"+ aInt.and ( bInt ) );//返回两个大整数的按位与的结果
        System.out.println ("andNot:\t"+ aInt.andNot ( bInt ));//返回两个大整数与非的结果
        System.out.println ("doubleValue:\t"+ aInt.doubleValue () );//返回大整数的double类型的值
        System.out.println ("floatValue:\t"+ aInt.floatValue());//返回大整数的float类型的值
        System.out.println ("intValue:\t"+ aInt.intValue());
        System.out.println ("longValue:\t"+ aInt.longValue ());
        System.out.println ("gcd:\t"+ aInt.gcd ( bInt ) );//返回大整数的最大公约数
        System.out.println ("max:\t"+ aInt.max ( bInt ) );//比较二个谁大
        System.out.println ("min:\t"+ aInt.min ( bInt )  );//比较二个谁小
        System.out.println ("mod:\t"+ aInt.mod ( bInt )  );//用当前大整数对val求模
        System.out.println ("negate:\t"+ aInt.negate () );//返回当前大整数的相反数
        System.out.println ("not:\t"+ aInt.not () );//返回当前大整数的非
        System.out.println ("or:\t"+aInt.or ( bInt )  );// 返回两个大整数的按位或
        System.out.println ("pow:\t"+ aInt.pow ( 5 ) );//返回当前大整数的exponent次方
        System.out.println ("remainder:\t"+aInt.remainder ( bInt )  );//返回当前大整数除以val的余数
        System.out.println ("shiftLeft:\t"+aInt.shiftLeft ( 2 ) );//将当前大整数左移n位后返回
        System.out.println ("shiftRight:\t"+aInt.shiftRight ( 2 ) );//将当前大整数右移n位后返回
        System.out.println ( aInt.toByteArray () );//将大整数转换成二进制反码保存在byte数组中
        System.out.println ("xor:\t"+ aInt.xor ( bInt ) );//返回两个大整数的异或
    }
}
