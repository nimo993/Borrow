package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import model.ISpecification;

public class Member {
  private String Id;
  
  public String getId() {
	return Id;
}
public void setId(String id) {
	Id = id;
}
private String name;
  public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
private List<Loan> loans = new ArrayList<>(3);
public List<Loan> getLoans() {
    return loans;
}

public void setLoans(List<Loan> loans) {
    this.loans = loans;
}
private Loan Loan;
  
  public final Loan getLoan() {
	return Loan;
}
public final void setLoan(Loan loan) {
	Loan = loan;
}
public final void Return(Book book){
	 for (Loan loan : loans) {
         Book bookInLoan = loan.getBook();
         if (bookInLoan.getId().equals(book.getId())) {
             bookInLoan.setLoanTo(null);
             System.out.println(LocalDateTime.now() + ":" + getName() + "已归还" + book.getTitle() + "。");
             loan.MarkAsReturned();
         }
	 }
	
  }
  public boolean CanLoan(Book book){
	  if (book.getLoanTo() != null) {
          System.out.println( book.getTitle() + "已经借出去了。");
          return false;
      }
      HasReachMaxSpecification specification = new HasReachMaxSpecification();
      if (!specification.IsSatisfiedBy(this)) {
          return false;
      }
      LoanOnlyOneSpecification loanOnlyOneSpecification = new LoanOnlyOneSpecification(book);
      return loanOnlyOneSpecification.IsSatisfiedBy(this);
	  
  }
  public final Loan Loan(Book book){
	  Loan loan=null;
	  if (CanLoan(book)){
		  loan=LoanFactory.CreatLoan(book,this);
		  getLoans().add(loan);
	  }
	  return loan;
	  
  }
  public Loan FindCurrentLoanFor(Book book){
	  Member loanTo = book.getLoanTo();
	 
      if (loanTo == null || !loanTo.getId().equals(this.getId())) {
          return null;
      }
      for (Loan loan : loans) {
    	 
          if (loan.getBook().getId().equals(book.getId()) && loan.HasNotBeenReturned()) {
              System.out.println(LocalDateTime.now() + ":" + name + "借了" + book.getTitle() + "，书的id:" + book.getId() + "。");
              return loan;
          }
      }
      System.out.println(LocalDateTime.now() + ":" + name + "没有借" + book.getTitle() + "，书的id:" + book.getId() + "。");
      return null;
	  
  }
  public Member(String Id,String name){
	  this.Id=Id;
	  this.name=name;
  }
 
}
