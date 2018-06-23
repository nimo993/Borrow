package model;


import java.time.LocalDateTime;


public class Loan {
	private String Id;
	public final String getId() {
		return Id;
	}
	public final void setId(String Id) {
		this.Id = Id;
	}
	
	private LocalDateTime LoanDate; 
	public final LocalDateTime getLoanData() {
		return LoanDate;
	}
	public final void setLoanData(LocalDateTime LoanData) {
		this.LoanDate = LoanData;
	}
	
	private LocalDateTime DateForReturn;
	public final LocalDateTime getDataForReturn() {
		return DateForReturn;
	}
	public final void setDataForReturn(LocalDateTime DateForReturn) {
		this.DateForReturn =DateForReturn;
	}
	
	private LocalDateTime ReturnDate;
	public final LocalDateTime getReturnData() {
		return ReturnDate;
	}
	public final void setReturnData(LocalDateTime ReturnDate) {
		this.ReturnDate = ReturnDate;
	}
	private  Book book;
	public  Book getBook() {
		return book;
	}
	public final void setBook(Book book) {
		this.book = book;
	}
	private Member member;
	public final Member getMember() {
		return member;
	}
	public final void setMember(Member member) {
		this.member = member;
	}
	public void MarkAsReturned(){
		this.ReturnDate=LocalDateTime.now();
	}
	public boolean HasNotBeenReturned(){
		return ReturnDate==null;
	}

}
