package com.jachs.jdk.utill.list.collection.set;

/***
 * HashSet底层数据结构采用哈希表实现，元素无序且唯一，线程不安全，效率高，可以存储null元素，元素的唯一性是靠所存储元素类型是否重写hashCode()和equals()方法来保证的，如果没有重写这两个方法，则无法保证元素的唯一性。
 * 具体实现唯一性的比较过程：存储元素首先会使用hash()算法函数生成一个int类型hashCode散列值，然后已经的所存储的元素的hashCode值比较，如果hashCode不相等，则所存储的两个对象一定不相等，此时存储当前的新的hashCode值处的元素对象；如果hashCode相等，存储元素的对象还是不一定相等，此时会调用equals()方法判断两个对象的内容是否相等，如果内容相等，那么就是同一个对象，无需存储；如果比较的内容不相等，那么就是不同的对象，就该存储了，此时就要采用哈希的解决地址冲突算法，在当前hashCode值处类似一个新的链表，
 * 在同一个hashCode值的后面存储存储不同的对象，这样就保证了元素的唯一性。
 * @author zhanchaohan
 *
 */
public class HashSetTest {

}
