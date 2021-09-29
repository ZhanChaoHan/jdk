package com.jachs.jdk.lang;

import org.junit.Test;

/**
 * @author zhanchaohan
 * 
 */
public class StringTest {
    String str01="abcdef ABCDEF 一二三四五六 123456  Ⅰ Ⅱ Ⅲ Ⅳ Ⅴ Ⅵ";
    
    @Test
    public void test1() {
        System.out.println ("length:\t"+ str01.length () );//字符串长度
        System.out.println ("charAt:\t"+ str01.charAt ( 2 ) );//取下标的char字符
        System.out.println ("codePointAt:\t"+ str01.codePointAt ( 2 ));//返回指定索引处的字符（Unicode 代码点）。
        System.out.println ("codePointBefore:\t"+str01.codePointBefore ( 2 )  );// 返回指定索引之前的字符（Unicode 代码点）。
        System.out.println ("codePointCount:\t"+ str01.codePointCount ( 2, 5 ) );//返回此 String 的指定文本范围中的 Unicode 代码点数。
        System.out.println ("compareTo:\t"+ str01.compareTo ( "f" ));//按字典顺序比较两个字符串。
        System.out.println ("compareToIgnoreCase:\t"+ str01.compareToIgnoreCase ( "F" ));//按字典顺序比较两个字符串，不考虑大小写。
        
        System.out.println ("concat:\t"+ str01.concat ( "HHHHCHC" ) );//将指定字符串连接到此字符串的结尾。
        
    }
    //常用方法
    @Test
    public void test2() {
        str01.split ( "" );//切分字符串
        str01.trim ();//去除二端空格
        str01.indexOf ( 0 );//匹配字符串
        str01.lastIndexOf ( 0, 1 );//匹配字符串区间
        str01.substring ( 0, 0 );//截取字符串
    }
}
