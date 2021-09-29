package com.jachs.jdk.math;

import java.math.BigDecimal;

import org.junit.Test;

/**
 * @author zhanchaohan </br>
 *         1. double 参数的构造方法,不允许使用!!!!因为它不能精确的得到相应的值，值会变大; </br>
 *         2. String 构造方法是完全可预知的: 写入 new BigDecimal("0.1") 将创建一个
 *         BigDecimal,它正好等于预期的0.1; 因此,通常建议优先使用 String 构造方法;</br>
 *         3. 静态方法 valueOf(double val) 内部实现,仍是将 double 类型转为 String 类型; 这通常是将
 *         double(或float)转化为 BigDecimal 的首选方法;
 */
public class BigDecimalTest {
    @Test
    public void test1 () {
        double d1 = 0.10334;
        double d2 = 1234.0;

        System.out.println ( "new BigDecimal(" + d1 + ")=" + new BigDecimal ( d1 ) ); //此种方式绝对不允许!!!!!
        System.out.println ( "new BigDecimal(" + d2 + ")=" + new BigDecimal ( d2 ) ); //此种方式绝对不允许!!!!!
        System.out.println ( "" );

        System.out.println ( "new BigDecimal(String.valueOf(" + d1 + "))=" + new BigDecimal ( String.valueOf ( d1 ) ) );
        System.out.println ( "new BigDecimal(String.valueOf(" + d2 + "))=" + new BigDecimal ( String.valueOf ( d2 ) ) );
        System.out.println ( "" );

        System.out
                .println ( "new BigDecimal(String.valueOf(" + d1 + "))=" + new BigDecimal ( Double.toString ( d1 ) ) );
        System.out
                .println ( "new BigDecimal(String.valueOf(" + d2 + "))=" + new BigDecimal ( Double.toString ( d2 ) ) );
        System.out.println ( "" );

        System.out.println ( "BigDecimal.valueOf(" + d1 + ")=" + BigDecimal.valueOf ( d1 ) );
        System.out.println ( "BigDecimal.valueOf(" + d2 + ")=" + BigDecimal.valueOf ( d2 ) );
        System.out.println ( "" );

        BigDecimal b1 = BigDecimal.valueOf ( 1 );
        BigDecimal b2 = BigDecimal.valueOf ( 1.00000 );
        System.out.println ( b1.equals ( b2 ) );
        System.out.println ( b1.compareTo ( b2 ) );
    }

    /***
     * BigDecimal保留小数位 参数定义
     *  </br>
     * ROUND_CEILING Rounding mode to round towards positive infinity. 向正无穷方向舍入
     *  </br>
     * ROUND_DOWN Rounding mode to round towards zero. 向零方向舍入
     *  </br>
     * ROUND_FLOOR Rounding mode to round towards negative infinity. 向负无穷方向舍入
     *  </br>
     * ROUND_HALF_DOWN Rounding mode to round towards "nearest neighbor" unless
     * both neighbors are equidistant, in which case round down.
     * 向（距离）最近的一边舍入，除非两边（的距离）是相等,如果是这样，向下舍入, 例如1.55 保留一位小数结果为1.5
     *  </br>
     * ROUND_HALF_EVEN Rounding mode to round towards the "nearest neighbor"
     * unless both neighbors are equidistant, in which case, round towards the
     * even neighbor. 向（距离）最近的一边舍入，除非两边（的距离）是相等,如果是这样，如果保留位数是奇数，使用ROUND_HALF_UP
     * ，如果是偶数，使用ROUND_HALF_DOWN
     *  </br>
     * 
     * ROUND_HALF_UP Rounding mode to round towards "nearest neighbor" unless
     * both neighbors are equidistant, in which case round up.
     * 向（距离）最近的一边舍入，除非两边（的距离）是相等,如果是这样，向上舍入, 1.55保留一位小数结果为1.6
     *  </br>
     * 
     * ROUND_UNNECESSARY Rounding mode to assert that the requested operation
     * has an exact result, hence no rounding is necessary. 计算结果是精确的，不需要舍入模式
     *  </br>
     * 
     * ROUND_UP Rounding mode to round away from zero. 向远离0的方向舍入
     */
    @Test
    public void test2 () {
        BigDecimal decimal = new BigDecimal ( "1.12345" );
        System.out.println ( decimal );
        BigDecimal setScale = decimal.setScale ( 4, BigDecimal.ROUND_HALF_DOWN );
        System.out.println ( setScale );

        BigDecimal setScale1 = decimal.setScale ( 4, BigDecimal.ROUND_HALF_UP );
        System.out.println ( setScale1 );
    }
    @Test
    public void test3() throws IllegalAccessException {
        double value1=1.2345678912311;
        double value2=9.1234567890123;
        BigDecimal value3=new BigDecimal(Double.toString(value1));
        BigDecimal value4=new BigDecimal(Double.toString(value2));
        System.out.println("精确加法================="+BigDecimalUtil.add(value1, value2));
        System.out.println("精确减法================="+BigDecimalUtil.sub(value1, value2));
        System.out.println("精确乘法================="+BigDecimalUtil.mul(value1, value2));
        System.out.println("精确除法 使用默认精度 ================="+BigDecimalUtil.div(value1, value2));
        System.out.println("精确除法  设置精度================="+BigDecimalUtil.div(value1, value2,20));
        System.out.println("四舍五入   小数点后保留几位 ================="+BigDecimalUtil.round(value1, 10));
        System.out.println("比较大小 ================="+BigDecimalUtil.equalTo(value3, value4));
    }
}
