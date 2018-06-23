package test;

import java.time.LocalDateTime;

import org.junit.Test;

import model.Book;
import model.Member;

public class BorrowTest {
@Test
public void test(){
	Book book1 = new Book("001","Java","《Java入门》");
	 Book book2 = new Book("002","Literature","《夏至未至》");
     Book book3 = new Book("003","Science","《时间简史》");
     Book book4 = new Book("004","Fantasy","《Harry Potter》");
     Book book5 = new Book("005","Detective","《福尔摩斯》");

	
	 Member member1 = new Member("01","小白");
	 Member member2 = new Member("02","小明");

	 System.out.println(LocalDateTime.now()+"：小白尝试借book1");
     if (member1.CanLoan(book1)) {
         member1.Loan(book1);
     }
     System.out.println(LocalDateTime.now()+":小白再尝试借book1");
     if (member1.CanLoan(book1)) {
         member1.Loan(book1);
     }
     System.out.println(LocalDateTime.now()+":小白还book1");
     member1.Return(book1);System.out.println(LocalDateTime.now()+":member2借book2");
     if (member2.CanLoan(book2)) {
         member2.Loan(book2);
     }
     System.out.println(LocalDateTime.now()+":小明借book3");
     if (member2.CanLoan(book3)) {
         member2.Loan(book3);
     }
     System.out.println(LocalDateTime.now()+":小明借book4");
     if (member2.CanLoan(book4)) {
         member2.Loan(book4);
     }
     System.out.println(LocalDateTime.now()+":小明借book5");
     if (member2.CanLoan(book5)) {
         member2.Loan(book5);
     }
     System.out.println(LocalDateTime.now()+":小明还book2");
     member2.Return(book2);

     System.out.println(LocalDateTime.now()+":小明再借book5");
     if (member2.CanLoan(book5)) {
         member2.Loan(book5);
     }

     System.out.println(member1.FindCurrentLoanFor(book1));
     System.out.println(member2.FindCurrentLoanFor(book5));
     
	
}
}
