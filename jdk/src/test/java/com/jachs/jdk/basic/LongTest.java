package com.jachs.jdk.basic;

import org.junit.Test;

/**
 * @author zhanchaohan</br>
 *         long 数据类型是 64 位、有符号的以二进制补码表示的整数；</br>
 *         最小值是 -9,223,372,036,854,775,808（-2^63）；</br>
 *         最大值是 9,223,372,036,854,775,807（2^63 -1）；</br>
 *         这种类型主要使用在需要比较大整数的系统上；</br>
 *         默认值是 0L；</br>
 *         例子： long a = 100000L，Long b = -200000L。</br>
 *         "L"理论上不分大小写，但是若写成"l"容易与数字"1"混淆，不容易分辩。所以最好大写。</br>
 */
public class LongTest {
    @Test
    public void test1 () {
        System.out.println ( "基本类型：long 二进制位数：" + Long.SIZE );
        System.out.println ( "包装类：java.lang.Long" );
        System.out.println ( "最小值：Long.MIN_VALUE=" + Long.MIN_VALUE );
        System.out.println ( "最大值：Long.MAX_VALUE=" + Long.MAX_VALUE );
    }
}
