package com.jachs.jdk.basic;

import org.junit.Test;

/**
 * @author zhanchaohan</br>
 *         float 数据类型是单精度、32位、符合IEEE 754标准的浮点数；</br>
 *         float 在储存大型浮点数组的时候可节省内存空间；</br>
 *         默认值是 0.0f；</br>
 *         浮点数不能用来表示精确的值，如货币；</br>
 *         例子：float f1 = 234.5f。</br>
 */
public class FloatTest {
    @Test
    public void test1 () {
        System.out.println ( "基本类型：float 二进制位数：" + Float.SIZE );
        System.out.println ( "包装类：java.lang.Float" );
        System.out.println ( "最小值：Float.MIN_VALUE=" + Float.MIN_VALUE );
        System.out.println ( "最大值：Float.MAX_VALUE=" + Float.MAX_VALUE );
    }
}
