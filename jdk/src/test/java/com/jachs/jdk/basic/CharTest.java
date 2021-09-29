package com.jachs.jdk.basic;

import org.junit.Test;

/**
 * @author zhanchaohan char类型是一个单一的 16 位 Unicode 字符；</br>
 *         最小值是 \u0000（即为 0）；</br>
 *         最大值是 \uffff（即为 65535）；</br>
 *         char 数据类型可以储存任何字符；</br>
 *         例子：char letter = 'A';。</br>
 */
public class CharTest {
    @Test
    public void test1 () {
        System.out.println ( "基本类型：char 二进制位数：" + Character.SIZE );
        System.out.println ( "包装类：java.lang.Character" );
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台  
        System.out.println ( "最小值：Character.MIN_VALUE=" + (int) Character.MIN_VALUE );
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台  
        System.out.println ( "最大值：Character.MAX_VALUE=" + (int) Character.MAX_VALUE );
    }
}
