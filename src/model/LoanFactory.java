package model;

import java.time.LocalDateTime;

public final class LoanFactory{

	public static  Loan CreatLoan(Book book, Member member) {
		// TODO Auto-generated method stub
		book.setLoanTo(member);
		Loan loan=new Loan();
	    loan.setBook (book);
        loan.setMember (member);
        loan.setLoanData (LocalDateTime.now());
        loan.setDataForReturn (LocalDateTime.now().plusDays(10));
        System.out.println(book.getTitle()+"借书成功！");
        return loan;
	}
	}
