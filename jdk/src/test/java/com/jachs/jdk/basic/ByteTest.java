package com.jachs.jdk.basic;

import org.junit.Test;

/**
 * @author zhanchaohan </br>
 *         byte 数据类型是8位、有符号的，以二进制补码表示的整数；</br>
 *         最小值是 -128（-2^7）；</br>
 *         最大值是 127（2^7-1）；</br>
 *         默认值是 0；</br>
 *         byte 类型用在大型数组中节约空间，主要代替整数，因为 byte 变量占用的空间只有 int 类型的四分之一；</br>
 *         例子：byte a = 100，byte b = -50。</br>
 */
public class ByteTest {
    @Test
    public void test1 () {
        System.out.println ( "基本类型：byte 二进制位数：" + Byte.SIZE );
        System.out.println ( "包装类：java.lang.Byte" );
        System.out.println ( "最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE );
        System.out.println ( "最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE );
    }
}
