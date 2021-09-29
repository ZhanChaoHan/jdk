package com.jachs.jdk.basic;

import org.junit.Test;

/**
 * @author zhanchaohan</br>
 *         short 数据类型是 16 位、有符号的以二进制补码表示的整数</br>
 *         最小值是 -32768（-2^15）；</br>
 *         最大值是 32767（2^15 - 1）；</br>
 *         Short 数据类型也可以像 byte 那样节省空间。一个short变量是int型变量所占空间的二分之一；</br>
 *         默认值是 0；</br>
 *         例子：short s = 1000，short r = -20000。</br>
 */
public class ShortTest {
    @Test
    public void test1 () {
        System.out.println ( "基本类型：short 二进制位数：" + Short.SIZE );
        System.out.println ( "包装类：java.lang.Short" );
        System.out.println ( "最小值：Short.MIN_VALUE=" + Short.MIN_VALUE );
        System.out.println ( "最大值：Short.MAX_VALUE=" + Short.MAX_VALUE );
    }
}
