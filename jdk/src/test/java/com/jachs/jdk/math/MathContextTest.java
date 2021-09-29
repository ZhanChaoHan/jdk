package com.jachs.jdk.math;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import org.junit.Test;

/**
 * @author zhanchaohan
 * 
 */
public class MathContextTest {

    @Test
    public void test1 () {
        System.out.println ( new BigDecimal ( "123.4", new MathContext ( 4, RoundingMode.HALF_UP ) ) );
        System.out.println ( new BigDecimal ( "123.4", new MathContext ( 2, RoundingMode.HALF_UP ) ) );
        System.out.println ( new BigDecimal ( "123.4", new MathContext ( 2, RoundingMode.CEILING ) ) );
        System.out.println ( new BigDecimal ( "123.4", new MathContext ( 1, RoundingMode.CEILING ) ) );
    }
}
