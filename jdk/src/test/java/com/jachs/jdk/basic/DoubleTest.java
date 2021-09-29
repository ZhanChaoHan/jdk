package com.jachs.jdk.basic;

import org.junit.Test;

/**
 * @author zhanchaohan</br>
 *         double 数据类型是双精度、64 位、符合IEEE 754标准的浮点数；</br>
 *         浮点数的默认类型为double类型；</br>
 *         double类型同样不能表示精确的值，如货币；</br>
 *         默认值是 0.0d；</br>
 *         例子：double d1 = 123.4。</br>
 */
public class DoubleTest {
    @Test
    public void test1 () {
        System.out.println ( "基本类型：double 二进制位数：" + Double.SIZE );
        System.out.println ( "包装类：java.lang.Double" );
        System.out.println ( "最小值：Double.MIN_VALUE=" + Double.MIN_VALUE );
        System.out.println ( "最大值：Double.MAX_VALUE=" + Double.MAX_VALUE );
    }
}
