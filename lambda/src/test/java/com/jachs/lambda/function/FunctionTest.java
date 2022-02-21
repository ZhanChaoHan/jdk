package com.jachs.lambda.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import org.junit.Test;

import com.jachs.lambda.entity.Bill;
import com.jachs.lambda.entity.Book;

/***
 * 
 * @author zhanchaohan
 *
 */
public class FunctionTest {
	class BillToBook implements Function<Book, Bill>{

		@Override
		public Bill apply(Book t) {
			return new Bill(t.hashCode()+"", t.getName(), (t.getPrice()+0.2));//假设每本书得纳税2毛
		}
	}
	@Test
	public void test1() {
		BillToBook btb=new BillToBook();
		
		Book book=new Book(526.3,"QBC");
		
		Bill bill=btb.apply(book);//类型A转换类型B
		System.out.println(bill.getUser_name()+"\t"+
				bill.getBook_name()+"\t"+bill.getMonery());
	}
	@Test
	public void test2() {
		List<Book>bList=new ArrayList<Book>();
		for (int kk = 0; kk < 10; kk++) {
			Book book=new Book(kk, "循环"+kk);
			bList.add(book);
		}
		FilterName(bList,new BillToBook())
		.forEach(a->{
			System.out.println(a.getUser_name());
			System.out.println(a.getBook_name());
			System.out.println(a.getMonery());
			System.out.println("---------------------");
		});;
	}
	private  List<Bill> FilterName(List<Book>bList,Function<Book,Bill>bFun) {
		List<Bill>sList=new ArrayList<Bill>();
		
		bList.forEach(a->{
			if(a.getPrice()>3.5) {//过滤掉小于3.5
				sList.add(bFun.apply(a));
			}
		});;
		return sList;
	}
}
