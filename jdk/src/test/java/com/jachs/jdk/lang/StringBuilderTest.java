package com.jachs.jdk.lang;

import org.junit.Test;

/**
 * StringBuilder,StringBuffer绝大部分相同，前者非线程安全，后者线程安全。因为线程安全和非安全导致执行效率不同
 * @author zhanchaohan
 * 
 */
public class StringBuilderTest {
    StringBuilder emptySb = new StringBuilder ();
    StringBuilder sizeSb = new StringBuilder ( 100 );//构造一个其中不带字符的字符串生成器，初始容量由 capacity 参数指定。
    static StringBuilder stringSb = new StringBuilder ( "Hello World" );
    static StringBuffer stringSbb = new StringBuffer ( "Hello World" );
    
    
    @Test
    public void test1 () {
        System.out.println ( sizeSb.length () );
        System.out.println ( stringSb.length () );
    }

    @Test
    public void test2 () {
        sizeSb.append ( "add a str" );
        sizeSb.append ( stringSb );
        System.out.println ( sizeSb.toString () );
        System.out.println ( sizeSb.charAt ( 2 ) );
        System.out.println ( sizeSb.codePointAt ( 2 ) );
    }

    //插入字符串
    @Test
    public void test3 () {
        stringSb.insert ( 6, "abc " );
        System.out.println ( stringSb.toString () );
    }

    //删除字符串
    @Test
    public void test4 () {
        stringSb.insert ( 6, "abc " );
        System.out.println ( stringSb.toString () );
        stringSb.delete ( 6, 9 );
        System.out.println ( stringSb.toString () );
    }

    //截取字符串
    @Test
    public void test5 () {
        System.out.println ( stringSb.substring ( 2 ) );
        System.out.println ( stringSb.substring ( 2, 5 ) );
    }
    //反转字符串
    @Test
    public void test6() {
        stringSb.reverse ();
        stringSbb.reverse ();
        System.out.println ( stringSb.toString () );
        System.out.println ( stringSbb.toString () );
    }
    private static int count=0;
    private static void testStringBuilderThread() throws InterruptedException {
        stringSb.delete ( 0, stringSb.length () );
        stringSb.append ( "stringSb:" );
        for ( int kk = 0 ; kk < 50 ; kk++ ) {
            new Thread ( new Runnable () {
                public void run () {
                    stringSb.append ( ++count);
                }
            } ).start ();
        }
        Thread.sleep ( 500 );
        System.out.println (stringSb.toString ()  );
    }
    private static void testStringBufferThread() throws InterruptedException {
        final StringBuffer sb=new StringBuffer();
        sb.append ( "sb:" );        
        for ( int kk = 0 ; kk < 50 ; kk++ ) {
            new Thread ( new Runnable () {
                public void run () {
                    sb.append ( ++count);
                }
            } ).start ();
        }
        Thread.sleep ( 500 );
        
        System.out.println ( sb.toString () );
    }
//    public static void main ( String[] args ) throws InterruptedException {
//        testStringBuilderThread();
//        testStringBufferThread();
//    }
}
